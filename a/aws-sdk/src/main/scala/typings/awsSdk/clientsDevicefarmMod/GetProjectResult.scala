package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectResult extends StObject {
  
  /**
    * The project to get information about.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object GetProjectResult {
  
  inline def apply(): GetProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProjectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProjectResult] (val x: Self) extends AnyVal {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
