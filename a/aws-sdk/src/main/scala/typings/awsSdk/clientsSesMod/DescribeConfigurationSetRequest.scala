package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationSetRequest extends StObject {
  
  /**
    * A list of configuration set attributes to return.
    */
  var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.undefined
  
  /**
    * The name of the configuration set to describe.
    */
  var ConfigurationSetName: typings.awsSdk.clientsSesMod.ConfigurationSetName
}
object DescribeConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): DescribeConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSetRequest]
  }
  
  extension [Self <: DescribeConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetAttributeNames(value: ConfigurationSetAttributeList): Self = StObject.set(x, "ConfigurationSetAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetAttributeNamesUndefined: Self = StObject.set(x, "ConfigurationSetAttributeNames", js.undefined)
    
    inline def setConfigurationSetAttributeNamesVarargs(value: ConfigurationSetAttribute*): Self = StObject.set(x, "ConfigurationSetAttributeNames", js.Array(value*))
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
