package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFADevice extends StObject {
  
  /**
    * The date when the MFA device was enabled for the user.
    */
  var EnableDate: js.Date
  
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.
    */
  var SerialNumber: serialNumberType
  
  /**
    * The user with whom the MFA device is associated.
    */
  var UserName: userNameType
}
object MFADevice {
  
  inline def apply(EnableDate: js.Date, SerialNumber: serialNumberType, UserName: userNameType): MFADevice = {
    val __obj = js.Dynamic.literal(EnableDate = EnableDate.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFADevice]
  }
  
  extension [Self <: MFADevice](x: Self) {
    
    inline def setEnableDate(value: js.Date): Self = StObject.set(x, "EnableDate", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
