package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLinkInput extends StObject {
  
  /**
    * Specify a friendly human-readable name to use to identify this source account when you are viewing data from it in the monitoring account. You can use a custom label or use the following variables:    $AccountName is the name of the account    $AccountEmail is the globally unique email address of the account    $AccountEmailNoDomain is the email address of the account without the domain name  
    */
  var LabelTemplate: typings.awsSdk.clientsOamMod.LabelTemplate
  
  /**
    * An array of strings that define which types of data that the source account shares with the monitoring account.
    */
  var ResourceTypes: ResourceTypesInput
  
  /**
    * The ARN of the sink to use to create this link. You can use ListSinks to find the ARNs of sinks. For more information about sinks, see CreateSink.
    */
  var SinkIdentifier: ResourceIdentifier
  
  /**
    * Assigns one or more tags (key-value pairs) to the link.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags.
    */
  var Tags: js.UndefOr[TagMapInput] = js.undefined
}
object CreateLinkInput {
  
  inline def apply(
    LabelTemplate: LabelTemplate,
    ResourceTypes: ResourceTypesInput,
    SinkIdentifier: ResourceIdentifier
  ): CreateLinkInput = {
    val __obj = js.Dynamic.literal(LabelTemplate = LabelTemplate.asInstanceOf[js.Any], ResourceTypes = ResourceTypes.asInstanceOf[js.Any], SinkIdentifier = SinkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLinkInput] (val x: Self) extends AnyVal {
    
    inline def setLabelTemplate(value: LabelTemplate): Self = StObject.set(x, "LabelTemplate", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: ResourceTypesInput): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setSinkIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "SinkIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMapInput): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
