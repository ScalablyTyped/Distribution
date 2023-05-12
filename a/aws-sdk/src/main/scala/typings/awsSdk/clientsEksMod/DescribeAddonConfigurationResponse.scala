package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddonConfigurationResponse extends StObject {
  
  /**
    * The name of the add-on.
    */
  var addonName: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the add-on. The version must match one of the versions returned by  DescribeAddonVersions .
    */
  var addonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON schema that's used to validate the configuration values that you provide when an addon is created or updated.
    */
  var configurationSchema: js.UndefOr[String] = js.undefined
}
object DescribeAddonConfigurationResponse {
  
  inline def apply(): DescribeAddonConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddonConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddonConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonNameUndefined: Self = StObject.set(x, "addonName", js.undefined)
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "addonVersion", js.undefined)
    
    inline def setConfigurationSchema(value: String): Self = StObject.set(x, "configurationSchema", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSchemaUndefined: Self = StObject.set(x, "configurationSchema", js.undefined)
  }
}
