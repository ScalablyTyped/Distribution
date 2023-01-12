package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFamilyCreditSpecification extends StObject {
  
  /**
    * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
  
  /**
    * The instance family.
    */
  var InstanceFamily: js.UndefOr[UnlimitedSupportedInstanceFamily] = js.undefined
}
object InstanceFamilyCreditSpecification {
  
  inline def apply(): InstanceFamilyCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFamilyCreditSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFamilyCreditSpecification] (val x: Self) extends AnyVal {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
    
    inline def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
  }
}
