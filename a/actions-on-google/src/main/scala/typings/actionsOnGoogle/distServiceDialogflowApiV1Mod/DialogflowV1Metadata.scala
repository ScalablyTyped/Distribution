package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1Metadata extends StObject {
  
  var intentId: js.UndefOr[String] = js.undefined
  
  var intentName: js.UndefOr[String] = js.undefined
  
  var nluResponseTime: js.UndefOr[Double] = js.undefined
  
  var webhookForSlotFillingUsed: js.UndefOr[String] = js.undefined
  
  var webhookUsed: js.UndefOr[String] = js.undefined
}
object DialogflowV1Metadata {
  
  inline def apply(): DialogflowV1Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Metadata]
  }
  
  extension [Self <: DialogflowV1Metadata](x: Self) {
    
    inline def setIntentId(value: String): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setIntentName(value: String): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setNluResponseTime(value: Double): Self = StObject.set(x, "nluResponseTime", value.asInstanceOf[js.Any])
    
    inline def setNluResponseTimeUndefined: Self = StObject.set(x, "nluResponseTime", js.undefined)
    
    inline def setWebhookForSlotFillingUsed(value: String): Self = StObject.set(x, "webhookForSlotFillingUsed", value.asInstanceOf[js.Any])
    
    inline def setWebhookForSlotFillingUsedUndefined: Self = StObject.set(x, "webhookForSlotFillingUsed", js.undefined)
    
    inline def setWebhookUsed(value: String): Self = StObject.set(x, "webhookUsed", value.asInstanceOf[js.Any])
    
    inline def setWebhookUsedUndefined: Self = StObject.set(x, "webhookUsed", js.undefined)
  }
}
