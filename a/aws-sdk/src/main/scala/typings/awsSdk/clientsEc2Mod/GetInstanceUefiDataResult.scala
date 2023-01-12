package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceUefiDataResult extends StObject {
  
  /**
    * The ID of the instance from which to retrieve the UEFI data.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceId] = js.undefined
  
  /**
    * Base64 representation of the non-volatile UEFI variable store.
    */
  var UefiData: js.UndefOr[String] = js.undefined
}
object GetInstanceUefiDataResult {
  
  inline def apply(): GetInstanceUefiDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceUefiDataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceUefiDataResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setUefiData(value: String): Self = StObject.set(x, "UefiData", value.asInstanceOf[js.Any])
    
    inline def setUefiDataUndefined: Self = StObject.set(x, "UefiData", js.undefined)
  }
}
