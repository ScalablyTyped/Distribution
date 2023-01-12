package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestGridSessionAction extends StObject {
  
  /**
    * The action taken by the session.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The time, in milliseconds, that the action took to complete in the browser.
    */
  var duration: js.UndefOr[Long] = js.undefined
  
  /**
    * HTTP method that the browser used to make the request.
    */
  var requestMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the session invoked the action.
    */
  var started: js.UndefOr[js.Date] = js.undefined
  
  /**
    * HTTP status code returned to the browser when the action was taken.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object TestGridSessionAction {
  
  inline def apply(): TestGridSessionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestGridSessionAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDuration(value: Long): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    inline def setStarted(value: js.Date): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
