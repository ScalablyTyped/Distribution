package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredWeightAndCapacity extends StObject {
  
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
  
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  
  /**
    * Specifies the serverless update concurrency configuration for an endpoint variant.
    */
  var ServerlessUpdateConfig: js.UndefOr[ProductionVariantServerlessUpdateConfig] = js.undefined
  
  /**
    * The name of the variant to update.
    */
  var VariantName: typings.awsSdk.clientsSagemakerMod.VariantName
}
object DesiredWeightAndCapacity {
  
  inline def apply(VariantName: VariantName): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesiredWeightAndCapacity] (val x: Self) extends AnyVal {
    
    inline def setDesiredInstanceCount(value: TaskCount): Self = StObject.set(x, "DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstanceCountUndefined: Self = StObject.set(x, "DesiredInstanceCount", js.undefined)
    
    inline def setDesiredWeight(value: VariantWeight): Self = StObject.set(x, "DesiredWeight", value.asInstanceOf[js.Any])
    
    inline def setDesiredWeightUndefined: Self = StObject.set(x, "DesiredWeight", js.undefined)
    
    inline def setServerlessUpdateConfig(value: ProductionVariantServerlessUpdateConfig): Self = StObject.set(x, "ServerlessUpdateConfig", value.asInstanceOf[js.Any])
    
    inline def setServerlessUpdateConfigUndefined: Self = StObject.set(x, "ServerlessUpdateConfig", js.undefined)
    
    inline def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
