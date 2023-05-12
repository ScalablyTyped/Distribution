package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResponsePlanInput extends StObject {
  
  /**
    * The actions that this response plan takes at the beginning of an incident.
    */
  var actions: js.UndefOr[ActionsList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the response plan.
    */
  var arn: Arn
  
  /**
    * The Chatbot chat channel used for collaboration during an incident. Use the empty structure to remove the chat channel from the response plan.
    */
  var chatChannel: js.UndefOr[ChatChannel] = js.undefined
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The long format name of the response plan. The display name can't contain spaces.
    */
  var displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
    */
  var engagements: js.UndefOr[EngagementSet] = js.undefined
  
  /**
    * The string Incident Manager uses to prevent duplicate incidents from being created by the same incident in the same account.
    */
  var incidentTemplateDedupeString: js.UndefOr[DedupeString] = js.undefined
  
  /**
    * Defines the impact to the customers. Providing an impact overwrites the impact provided by a response plan.  Possible impacts:     5 - Severe impact    4 - High impact    3 - Medium impact    2 - Low impact    1 - No impact  
    */
  var incidentTemplateImpact: js.UndefOr[Impact] = js.undefined
  
  /**
    * The Amazon SNS targets that are notified when updates are made to an incident.
    */
  var incidentTemplateNotificationTargets: js.UndefOr[NotificationTargetSet] = js.undefined
  
  /**
    * A brief summary of the incident. This typically contains what has happened, what's currently happening, and next steps.
    */
  var incidentTemplateSummary: js.UndefOr[IncidentSummary] = js.undefined
  
  /**
    * Tags to assign to the template. When the StartIncident API action is called, Incident Manager assigns the tags specified in the template to the incident. To call this action, you must also have permission to call the TagResource API action for the incident record resource.
    */
  var incidentTemplateTags: js.UndefOr[TagMapUpdate] = js.undefined
  
  /**
    * The short format name of the incident. The title can't contain spaces.
    */
  var incidentTemplateTitle: js.UndefOr[IncidentTitle] = js.undefined
  
  /**
    * Information about third-party services integrated into the response plan.
    */
  var integrations: js.UndefOr[Integrations] = js.undefined
}
object UpdateResponsePlanInput {
  
  inline def apply(arn: Arn): UpdateResponsePlanInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResponsePlanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResponsePlanInput] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ActionsList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setChatChannel(value: ChatChannel): Self = StObject.set(x, "chatChannel", value.asInstanceOf[js.Any])
    
    inline def setChatChannelUndefined: Self = StObject.set(x, "chatChannel", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDisplayName(value: ResponsePlanDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEngagements(value: EngagementSet): Self = StObject.set(x, "engagements", value.asInstanceOf[js.Any])
    
    inline def setEngagementsUndefined: Self = StObject.set(x, "engagements", js.undefined)
    
    inline def setEngagementsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "engagements", js.Array(value*))
    
    inline def setIncidentTemplateDedupeString(value: DedupeString): Self = StObject.set(x, "incidentTemplateDedupeString", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateDedupeStringUndefined: Self = StObject.set(x, "incidentTemplateDedupeString", js.undefined)
    
    inline def setIncidentTemplateImpact(value: Impact): Self = StObject.set(x, "incidentTemplateImpact", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateImpactUndefined: Self = StObject.set(x, "incidentTemplateImpact", js.undefined)
    
    inline def setIncidentTemplateNotificationTargets(value: NotificationTargetSet): Self = StObject.set(x, "incidentTemplateNotificationTargets", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateNotificationTargetsUndefined: Self = StObject.set(x, "incidentTemplateNotificationTargets", js.undefined)
    
    inline def setIncidentTemplateNotificationTargetsVarargs(value: NotificationTargetItem*): Self = StObject.set(x, "incidentTemplateNotificationTargets", js.Array(value*))
    
    inline def setIncidentTemplateSummary(value: IncidentSummary): Self = StObject.set(x, "incidentTemplateSummary", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateSummaryUndefined: Self = StObject.set(x, "incidentTemplateSummary", js.undefined)
    
    inline def setIncidentTemplateTags(value: TagMapUpdate): Self = StObject.set(x, "incidentTemplateTags", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateTagsUndefined: Self = StObject.set(x, "incidentTemplateTags", js.undefined)
    
    inline def setIncidentTemplateTitle(value: IncidentTitle): Self = StObject.set(x, "incidentTemplateTitle", value.asInstanceOf[js.Any])
    
    inline def setIncidentTemplateTitleUndefined: Self = StObject.set(x, "incidentTemplateTitle", js.undefined)
    
    inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "integrations", js.Array(value*))
  }
}
