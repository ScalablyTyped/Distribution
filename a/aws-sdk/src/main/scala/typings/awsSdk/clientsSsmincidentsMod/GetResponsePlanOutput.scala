package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponsePlanOutput extends StObject {
  
  /**
    * The actions that this response plan takes at the beginning of the incident.
    */
  var actions: js.UndefOr[ActionsList] = js.undefined
  
  /**
    * The ARN of the response plan.
    */
  var arn: Arn
  
  /**
    * The Chatbot chat channel used for collaboration during an incident.
    */
  var chatChannel: js.UndefOr[ChatChannel] = js.undefined
  
  /**
    * The long format name of the response plan. Can contain spaces.
    */
  var displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
    */
  var engagements: js.UndefOr[EngagementSet] = js.undefined
  
  /**
    * Details used to create the incident when using this response plan.
    */
  var incidentTemplate: IncidentTemplate
  
  /**
    * Information about third-party services integrated into the Incident Manager response plan.
    */
  var integrations: js.UndefOr[Integrations] = js.undefined
  
  /**
    * The short format name of the response plan. The name can't contain spaces.
    */
  var name: ResponsePlanName
}
object GetResponsePlanOutput {
  
  inline def apply(arn: Arn, incidentTemplate: IncidentTemplate, name: ResponsePlanName): GetResponsePlanOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], incidentTemplate = incidentTemplate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponsePlanOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponsePlanOutput] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ActionsList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setChatChannel(value: ChatChannel): Self = StObject.set(x, "chatChannel", value.asInstanceOf[js.Any])
    
    inline def setChatChannelUndefined: Self = StObject.set(x, "chatChannel", js.undefined)
    
    inline def setDisplayName(value: ResponsePlanDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEngagements(value: EngagementSet): Self = StObject.set(x, "engagements", value.asInstanceOf[js.Any])
    
    inline def setEngagementsUndefined: Self = StObject.set(x, "engagements", js.undefined)
    
    inline def setEngagementsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "engagements", js.Array(value*))
    
    inline def setIncidentTemplate(value: IncidentTemplate): Self = StObject.set(x, "incidentTemplate", value.asInstanceOf[js.Any])
    
    inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "integrations", js.Array(value*))
    
    inline def setName(value: ResponsePlanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
