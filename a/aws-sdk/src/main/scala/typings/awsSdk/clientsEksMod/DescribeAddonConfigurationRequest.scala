package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddonConfigurationRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names that  DescribeAddonVersions  returns.
    */
  var addonName: String
  
  /**
    * The version of the add-on. The version must match one of the versions returned by  DescribeAddonVersions .
    */
  var addonVersion: String
}
object DescribeAddonConfigurationRequest {
  
  inline def apply(addonName: String, addonVersion: String): DescribeAddonConfigurationRequest = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], addonVersion = addonVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddonConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddonConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
  }
}
