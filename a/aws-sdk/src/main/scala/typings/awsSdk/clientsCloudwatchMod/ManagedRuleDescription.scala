package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleDescription extends StObject {
  
  /**
    *  If a managed rule is enabled, this is the ARN for the related Amazon Web Services resource. 
    */
  var ResourceARN: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    *  Describes the state of a managed rule. If present, it contains information about the Contributor Insights rule that contains information about the related Amazon Web Services resource. 
    */
  var RuleState: js.UndefOr[ManagedRuleState] = js.undefined
  
  /**
    *  The template name for the managed rule. Used to enable managed rules using PutManagedInsightRules. 
    */
  var TemplateName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.TemplateName] = js.undefined
}
object ManagedRuleDescription {
  
  inline def apply(): ManagedRuleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleDescription]
  }
  
  extension [Self <: ManagedRuleDescription](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setRuleState(value: ManagedRuleState): Self = StObject.set(x, "RuleState", value.asInstanceOf[js.Any])
    
    inline def setRuleStateUndefined: Self = StObject.set(x, "RuleState", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
