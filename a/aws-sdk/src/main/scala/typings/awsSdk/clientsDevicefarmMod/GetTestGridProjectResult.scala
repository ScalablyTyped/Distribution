package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestGridProjectResult extends StObject {
  
  /**
    * A TestGridProject.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.undefined
}
object GetTestGridProjectResult {
  
  inline def apply(): GetTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridProjectResult]
  }
  
  extension [Self <: GetTestGridProjectResult](x: Self) {
    
    inline def setTestGridProject(value: TestGridProject): Self = StObject.set(x, "testGridProject", value.asInstanceOf[js.Any])
    
    inline def setTestGridProjectUndefined: Self = StObject.set(x, "testGridProject", js.undefined)
  }
}
