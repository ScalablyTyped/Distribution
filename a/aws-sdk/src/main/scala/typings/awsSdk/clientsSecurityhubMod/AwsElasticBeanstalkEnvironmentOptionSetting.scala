package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticBeanstalkEnvironmentOptionSetting extends StObject {
  
  /**
    * The type of resource that the configuration option is associated with.
    */
  var Namespace: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the configuration setting.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticBeanstalkEnvironmentOptionSetting {
  
  inline def apply(): AwsElasticBeanstalkEnvironmentOptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentOptionSetting]
  }
  
  extension [Self <: AwsElasticBeanstalkEnvironmentOptionSetting](x: Self) {
    
    inline def setNamespace(value: NonEmptyString): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOptionName(value: NonEmptyString): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    inline def setResourceName(value: NonEmptyString): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
