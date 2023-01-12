package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPasswordDataResult extends StObject {
  
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The password of the instance. Returns an empty string if the password is not available.
    */
  var PasswordData: js.UndefOr[String] = js.undefined
  
  /**
    * The time the data was last updated.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object GetPasswordDataResult {
  
  inline def apply(): GetPasswordDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPasswordDataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPasswordDataResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setPasswordData(value: String): Self = StObject.set(x, "PasswordData", value.asInstanceOf[js.Any])
    
    inline def setPasswordDataUndefined: Self = StObject.set(x, "PasswordData", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
