package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConversionContext extends StObject {
  
  /**
    * The Usage operation value that corresponds to the license type you are converting your resource from. For more information about which platforms correspond to which usage operation values see Sample data: usage operation by platform  
    */
  var UsageOperation: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.UsageOperation] = js.undefined
}
object LicenseConversionContext {
  
  inline def apply(): LicenseConversionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConversionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseConversionContext] (val x: Self) extends AnyVal {
    
    inline def setUsageOperation(value: UsageOperation): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    inline def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
  }
}
