package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorrowConfiguration extends StObject {
  
  /**
    * Indicates whether early check-ins are allowed.
    */
  var AllowEarlyCheckIn: BoxBoolean
  
  /**
    * Maximum time for the borrow configuration, in minutes.
    */
  var MaxTimeToLiveInMinutes: BoxInteger
}
object BorrowConfiguration {
  
  inline def apply(AllowEarlyCheckIn: BoxBoolean, MaxTimeToLiveInMinutes: BoxInteger): BorrowConfiguration = {
    val __obj = js.Dynamic.literal(AllowEarlyCheckIn = AllowEarlyCheckIn.asInstanceOf[js.Any], MaxTimeToLiveInMinutes = MaxTimeToLiveInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorrowConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorrowConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowEarlyCheckIn(value: BoxBoolean): Self = StObject.set(x, "AllowEarlyCheckIn", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeToLiveInMinutes(value: BoxInteger): Self = StObject.set(x, "MaxTimeToLiveInMinutes", value.asInstanceOf[js.Any])
  }
}
