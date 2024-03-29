package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResultQualifier extends StObject {
  
  /**
    * The name of the Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleName] = js.undefined
  
  /**
    * The mode of an evaluation. The valid values are Detective or Proactive.
    */
  var EvaluationMode: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationMode] = js.undefined
  
  /**
    * The ID of the evaluated Amazon Web Services resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  
  /**
    * The type of Amazon Web Services resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object EvaluationResultQualifier {
  
  inline def apply(): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationResultQualifier] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "EvaluationMode", js.undefined)
    
    inline def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
