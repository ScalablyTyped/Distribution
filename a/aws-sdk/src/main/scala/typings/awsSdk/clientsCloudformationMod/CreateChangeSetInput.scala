package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChangeSetInput extends StObject {
  
  /**
    * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order for CloudFormation to create the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.   If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.   If you don't specify either of these capabilities, CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we suggest that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group     AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User     AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM resources in CloudFormation templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually creating the stack. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by CloudFormation.  This capacity doesn't apply to creating change sets, and specifying it when creating change sets has no effect. If you want to create a stack from a stack template that contains macros and nested stacks, you must create or update the stack directly from the template using the CreateStack or UpdateStack action, and specifying this capability.  For more information about macros, see Using CloudFormation macros to perform custom processing on templates.  
    */
  var Capabilities: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Capabilities] = js.undefined
  
  /**
    * The name of the change set. The name must be unique among all change sets that are associated with the specified stack. A change set name can contain only alphanumeric, case sensitive characters, and hyphens. It must start with an alphabetical character and can't exceed 128 characters.
    */
  var ChangeSetName: typings.awsSdk.clientsCloudformationMod.ChangeSetName
  
  /**
    * The type of change set operation. To create a change set for a new stack, specify CREATE. To create a change set for an existing stack, specify UPDATE. To create a change set for an import operation, specify IMPORT. If you create a change set for a new stack, CloudFormation creates a stack with a unique stack ID, but no template or resources. The stack will be in the  REVIEW_IN_PROGRESS  state until you execute the change set. By default, CloudFormation specifies UPDATE. You can't use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
    */
  var ChangeSetType: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ChangeSetType] = js.undefined
  
  /**
    * A unique identifier for this CreateChangeSet request. Specify this token if you plan to retry requests so that CloudFormation knows that you're not attempting to create another change set with the same name. You might retry CreateChangeSet requests to ensure that CloudFormation successfully received them.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ClientToken] = js.undefined
  
  /**
    * A description to help you identify this change set.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Creates a change set for the all nested stacks specified in the template. The default behavior of this action is set to False. To include nested sets in a change set, specify True.
    */
  var IncludeNestedStacks: js.UndefOr[typings.awsSdk.clientsCloudformationMod.IncludeNestedStacks] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NotificationARNs] = js.undefined
  
  /**
    * A list of Parameter structures that specify input parameters for the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Parameters] = js.undefined
  
  /**
    * The template resource types that you have permissions to work with if you execute this change set, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this parameter for condition keys in IAM policies for CloudFormation. For more information, see Controlling access with Identity and Access Management in the CloudFormation User Guide.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ResourceTypes] = js.undefined
  
  /**
    * The resources to import into your stack.
    */
  var ResourcesToImport: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ResourcesToImport] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes when executing the change set. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation uses this role for all future operations on the stack. Provided that users have permission to operate on the stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least permission. If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no role is available, CloudFormation uses a temporary session that is generated from your user credentials.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.clientsCloudformationMod.RollbackConfiguration] = js.undefined
  
  /**
    * The name or the unique ID of the stack for which you are creating a change set. CloudFormation generates the change set by comparing this stack's information with the information that you submit, such as a modified template or different parameter input values.
    */
  var StackName: StackNameOrId
  
  /**
    * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to resources in the stack. You can specify a maximum of 50 tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Tags] = js.undefined
  
  /**
    * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length of 51,200 bytes. CloudFormation generates the change set by comparing this template with the template of the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateBody] = js.undefined
  
  /**
    * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3 bucket or a Systems Manager document. CloudFormation generates the change set by comparing this template with the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateURL] = js.undefined
  
  /**
    * Whether to reuse the template that's associated with the stack to create the change set.
    */
  var UsePreviousTemplate: js.UndefOr[typings.awsSdk.clientsCloudformationMod.UsePreviousTemplate] = js.undefined
}
object CreateChangeSetInput {
  
  inline def apply(ChangeSetName: ChangeSetName, StackName: StackNameOrId): CreateChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChangeSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChangeSetInput] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetType(value: ChangeSetType): Self = StObject.set(x, "ChangeSetType", value.asInstanceOf[js.Any])
    
    inline def setChangeSetTypeUndefined: Self = StObject.set(x, "ChangeSetType", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIncludeNestedStacks(value: IncludeNestedStacks): Self = StObject.set(x, "IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    inline def setIncludeNestedStacksUndefined: Self = StObject.set(x, "IncludeNestedStacks", js.undefined)
    
    inline def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    inline def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    inline def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setResourcesToImport(value: ResourcesToImport): Self = StObject.set(x, "ResourcesToImport", value.asInstanceOf[js.Any])
    
    inline def setResourcesToImportUndefined: Self = StObject.set(x, "ResourcesToImport", js.undefined)
    
    inline def setResourcesToImportVarargs(value: ResourceToImport*): Self = StObject.set(x, "ResourcesToImport", js.Array(value*))
    
    inline def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
    
    inline def setUsePreviousTemplate(value: UsePreviousTemplate): Self = StObject.set(x, "UsePreviousTemplate", value.asInstanceOf[js.Any])
    
    inline def setUsePreviousTemplateUndefined: Self = StObject.set(x, "UsePreviousTemplate", js.undefined)
  }
}
