package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActivationRequest extends StObject {
  
  /**
    * The name of the registered, managed node as it will appear in the Amazon Web Services Systems Manager console or when you use the Amazon Web Services command line tools to list Systems Manager resources.  Don't enter personally identifiable information in this field. 
    */
  var DefaultInstanceName: js.UndefOr[typings.awsSdk.clientsSsmMod.DefaultInstanceName] = js.undefined
  
  /**
    * A user-defined description of the resource that you want to register with Systems Manager.   Don't enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ActivationDescription] = js.undefined
  
  /**
    * The date by which this activation request should expire, in timestamp format, such as "2021-07-07T00:00:00". You can specify a date up to 30 days in advance. If you don't provide an expiration date, the activation code expires in 24 hours.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Identity and Access Management (IAM) role that you want to assign to the managed node. This IAM role must provide AssumeRole permissions for the Amazon Web Services Systems Manager service principal ssm.amazonaws.com. For more information, see Create an IAM service role for a hybrid environment in the Amazon Web Services Systems Manager User Guide.
    */
  var IamRole: typings.awsSdk.clientsSsmMod.IamRole
  
  /**
    * Specify the maximum number of managed nodes you want to register. The default value is 1.
    */
  var RegistrationLimit: js.UndefOr[typings.awsSdk.clientsSsmMod.RegistrationLimit] = js.undefined
  
  /**
    * Reserved for internal use.
    */
  var RegistrationMetadata: js.UndefOr[RegistrationMetadataList] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify the following key-value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises servers or VMs.  You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers, edge devices, and VMs after they connect to Systems Manager for the first time and are assigned a managed node ID. This means they are listed in the Amazon Web Services Systems Manager console with an ID that is prefixed with "mi-". For information about how to add tags to your managed nodes, see AddTagsToResource. For information about how to remove tags from your managed nodes, see RemoveTagsFromResource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateActivationRequest {
  
  inline def apply(IamRole: IamRole): CreateActivationRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateActivationRequest] (val x: Self) extends AnyVal {
    
    inline def setDefaultInstanceName(value: DefaultInstanceName): Self = StObject.set(x, "DefaultInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceNameUndefined: Self = StObject.set(x, "DefaultInstanceName", js.undefined)
    
    inline def setDescription(value: ActivationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setRegistrationLimit(value: RegistrationLimit): Self = StObject.set(x, "RegistrationLimit", value.asInstanceOf[js.Any])
    
    inline def setRegistrationLimitUndefined: Self = StObject.set(x, "RegistrationLimit", js.undefined)
    
    inline def setRegistrationMetadata(value: RegistrationMetadataList): Self = StObject.set(x, "RegistrationMetadata", value.asInstanceOf[js.Any])
    
    inline def setRegistrationMetadataUndefined: Self = StObject.set(x, "RegistrationMetadata", js.undefined)
    
    inline def setRegistrationMetadataVarargs(value: RegistrationMetadataItem*): Self = StObject.set(x, "RegistrationMetadata", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
