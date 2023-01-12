package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestGridSessionRequest extends StObject {
  
  /**
    * The ARN for the project that this session belongs to. See CreateTestGridProject and ListTestGridProjects.
    */
  var projectArn: js.UndefOr[DeviceFarmArn] = js.undefined
  
  /**
    * An ARN that uniquely identifies a TestGridSession.
    */
  var sessionArn: js.UndefOr[DeviceFarmArn] = js.undefined
  
  /**
    * An ID associated with this session.
    */
  var sessionId: js.UndefOr[ResourceId] = js.undefined
}
object GetTestGridSessionRequest {
  
  inline def apply(): GetTestGridSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTestGridSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "projectArn", js.undefined)
    
    inline def setSessionArn(value: DeviceFarmArn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
    
    inline def setSessionArnUndefined: Self = StObject.set(x, "sessionArn", js.undefined)
    
    inline def setSessionId(value: ResourceId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
