package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIncidentInput extends StObject {
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.  Possible impacts:     1 - Critical impact, this typically relates to full application failure that impacts many to all customers.     2 - High impact, partial application failure with impact to many customers.    3 - Medium impact, the application is providing reduced service to customers.    4 - Low impact, customer might aren't impacted by the problem yet.    5 - No impact, customers aren't currently impacted but urgent action is needed to avoid impact.  
    */
  var impact: js.UndefOr[Impact] = js.undefined
  
  /**
    * Add related items to the incident for other responders to use. Related items are Amazon Web Services resources, external links, or files uploaded to an Amazon S3 bucket. 
    */
  var relatedItems: js.UndefOr[RelatedItemList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the response plan that pre-defines summary, chat channels, Amazon SNS topics, runbooks, title, and impact of the incident. 
    */
  var responsePlanArn: Arn
  
  /**
    * Provide a title for the incident. Providing a title overwrites the title provided by the response plan. 
    */
  var title: js.UndefOr[IncidentTitle] = js.undefined
  
  /**
    * Details of what created the incident record in Incident Manager.
    */
  var triggerDetails: js.UndefOr[TriggerDetails] = js.undefined
}
object StartIncidentInput {
  
  inline def apply(responsePlanArn: Arn): StartIncidentInput = {
    val __obj = js.Dynamic.literal(responsePlanArn = responsePlanArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIncidentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartIncidentInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setImpact(value: Impact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setImpactUndefined: Self = StObject.set(x, "impact", js.undefined)
    
    inline def setRelatedItems(value: RelatedItemList): Self = StObject.set(x, "relatedItems", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemsUndefined: Self = StObject.set(x, "relatedItems", js.undefined)
    
    inline def setRelatedItemsVarargs(value: RelatedItem*): Self = StObject.set(x, "relatedItems", js.Array(value*))
    
    inline def setResponsePlanArn(value: Arn): Self = StObject.set(x, "responsePlanArn", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: IncidentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTriggerDetails(value: TriggerDetails): Self = StObject.set(x, "triggerDetails", value.asInstanceOf[js.Any])
    
    inline def setTriggerDetailsUndefined: Self = StObject.set(x, "triggerDetails", js.undefined)
  }
}
