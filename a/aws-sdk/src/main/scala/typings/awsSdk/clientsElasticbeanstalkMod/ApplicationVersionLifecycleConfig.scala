package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionLifecycleConfig extends StObject {
  
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.MaxAgeRule] = js.undefined
  
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.MaxCountRule] = js.undefined
}
object ApplicationVersionLifecycleConfig {
  
  inline def apply(): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationVersionLifecycleConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxAgeRule(value: MaxAgeRule): Self = StObject.set(x, "MaxAgeRule", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeRuleUndefined: Self = StObject.set(x, "MaxAgeRule", js.undefined)
    
    inline def setMaxCountRule(value: MaxCountRule): Self = StObject.set(x, "MaxCountRule", value.asInstanceOf[js.Any])
    
    inline def setMaxCountRuleUndefined: Self = StObject.set(x, "MaxCountRule", js.undefined)
  }
}
