package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestGridSessionResult extends StObject {
  
  /**
    * The TestGridSession that was requested.
    */
  var testGridSession: js.UndefOr[TestGridSession] = js.undefined
}
object GetTestGridSessionResult {
  
  inline def apply(): GetTestGridSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTestGridSessionResult] (val x: Self) extends AnyVal {
    
    inline def setTestGridSession(value: TestGridSession): Self = StObject.set(x, "testGridSession", value.asInstanceOf[js.Any])
    
    inline def setTestGridSessionUndefined: Self = StObject.set(x, "testGridSession", js.undefined)
  }
}
