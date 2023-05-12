package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOnRequest extends StObject {
  
  /**
    * The add-on type.
    */
  var addOnType: AddOnType
  
  /**
    * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
    */
  var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.undefined
  
  /**
    * An object that represents additional parameters when enabling or modifying the StopInstanceOnIdle add-on.  This object only applies to Lightsail for Research resources. 
    */
  var stopInstanceOnIdleRequest: js.UndefOr[StopInstanceOnIdleRequest] = js.undefined
}
object AddOnRequest {
  
  inline def apply(addOnType: AddOnType): AddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOnRequest] (val x: Self) extends AnyVal {
    
    inline def setAddOnType(value: AddOnType): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    inline def setAutoSnapshotAddOnRequest(value: AutoSnapshotAddOnRequest): Self = StObject.set(x, "autoSnapshotAddOnRequest", value.asInstanceOf[js.Any])
    
    inline def setAutoSnapshotAddOnRequestUndefined: Self = StObject.set(x, "autoSnapshotAddOnRequest", js.undefined)
    
    inline def setStopInstanceOnIdleRequest(value: StopInstanceOnIdleRequest): Self = StObject.set(x, "stopInstanceOnIdleRequest", value.asInstanceOf[js.Any])
    
    inline def setStopInstanceOnIdleRequestUndefined: Self = StObject.set(x, "stopInstanceOnIdleRequest", js.undefined)
  }
}
