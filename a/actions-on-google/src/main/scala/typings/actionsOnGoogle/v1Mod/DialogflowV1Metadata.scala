package typings.actionsOnGoogle.v1Mod

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
  
  @scala.inline
  def apply(): DialogflowV1Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Metadata]
  }
  
  @scala.inline
  implicit class DialogflowV1MetadataMutableBuilder[Self <: DialogflowV1Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentId(value: String): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    @scala.inline
    def setIntentName(value: String): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    @scala.inline
    def setNluResponseTime(value: Double): Self = StObject.set(x, "nluResponseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNluResponseTimeUndefined: Self = StObject.set(x, "nluResponseTime", js.undefined)
    
    @scala.inline
    def setWebhookForSlotFillingUsed(value: String): Self = StObject.set(x, "webhookForSlotFillingUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookForSlotFillingUsedUndefined: Self = StObject.set(x, "webhookForSlotFillingUsed", js.undefined)
    
    @scala.inline
    def setWebhookUsed(value: String): Self = StObject.set(x, "webhookUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUsedUndefined: Self = StObject.set(x, "webhookUsed", js.undefined)
  }
}
