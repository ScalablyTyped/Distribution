package typings.awsSdk.clientsSsoadminMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSOAdmin extends Service {
  
  /**
    * Attaches the specified customer managed policy to the specified PermissionSet.
    */
  def attachCustomerManagedPolicyReferenceToPermissionSet(): Request[AttachCustomerManagedPolicyReferenceToPermissionSetResponse, AWSError] = js.native
  def attachCustomerManagedPolicyReferenceToPermissionSet(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AttachCustomerManagedPolicyReferenceToPermissionSetResponse, 
      Unit
    ]
  ): Request[AttachCustomerManagedPolicyReferenceToPermissionSetResponse, AWSError] = js.native
  /**
    * Attaches the specified customer managed policy to the specified PermissionSet.
    */
  def attachCustomerManagedPolicyReferenceToPermissionSet(params: AttachCustomerManagedPolicyReferenceToPermissionSetRequest): Request[AttachCustomerManagedPolicyReferenceToPermissionSetResponse, AWSError] = js.native
  def attachCustomerManagedPolicyReferenceToPermissionSet(
    params: AttachCustomerManagedPolicyReferenceToPermissionSetRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AttachCustomerManagedPolicyReferenceToPermissionSetResponse, 
      Unit
    ]
  ): Request[AttachCustomerManagedPolicyReferenceToPermissionSetResponse, AWSError] = js.native
  
  /**
    * Attaches an AWS managed policy ARN to a permission set.  If the permission set is already referenced by one or more account assignments, you will need to call  ProvisionPermissionSet  after this operation. Calling ProvisionPermissionSet applies the corresponding IAM policy updates to all assigned accounts. 
    */
  def attachManagedPolicyToPermissionSet(): Request[AttachManagedPolicyToPermissionSetResponse, AWSError] = js.native
  def attachManagedPolicyToPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ AttachManagedPolicyToPermissionSetResponse, Unit]
  ): Request[AttachManagedPolicyToPermissionSetResponse, AWSError] = js.native
  /**
    * Attaches an AWS managed policy ARN to a permission set.  If the permission set is already referenced by one or more account assignments, you will need to call  ProvisionPermissionSet  after this operation. Calling ProvisionPermissionSet applies the corresponding IAM policy updates to all assigned accounts. 
    */
  def attachManagedPolicyToPermissionSet(params: AttachManagedPolicyToPermissionSetRequest): Request[AttachManagedPolicyToPermissionSetResponse, AWSError] = js.native
  def attachManagedPolicyToPermissionSet(
    params: AttachManagedPolicyToPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachManagedPolicyToPermissionSetResponse, Unit]
  ): Request[AttachManagedPolicyToPermissionSetResponse, AWSError] = js.native
  
  @JSName("config")
  var config_SSOAdmin: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Assigns access to a principal for a specified AWS account using a specified permission set.  The term principal here refers to a user or group that is defined in IAM Identity Center.   As part of a successful CreateAccountAssignment call, the specified permission set will automatically be provisioned to the account in the form of an IAM policy. That policy is attached to the IAM role created in IAM Identity Center. If the permission set is subsequently updated, the corresponding IAM policies attached to roles in your accounts will not be updated automatically. In this case, you must call  ProvisionPermissionSet  to make these updates.    After a successful response, call DescribeAccountAssignmentCreationStatus to describe the status of an assignment creation request.  
    */
  def createAccountAssignment(): Request[CreateAccountAssignmentResponse, AWSError] = js.native
  def createAccountAssignment(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountAssignmentResponse, Unit]): Request[CreateAccountAssignmentResponse, AWSError] = js.native
  /**
    * Assigns access to a principal for a specified AWS account using a specified permission set.  The term principal here refers to a user or group that is defined in IAM Identity Center.   As part of a successful CreateAccountAssignment call, the specified permission set will automatically be provisioned to the account in the form of an IAM policy. That policy is attached to the IAM role created in IAM Identity Center. If the permission set is subsequently updated, the corresponding IAM policies attached to roles in your accounts will not be updated automatically. In this case, you must call  ProvisionPermissionSet  to make these updates.    After a successful response, call DescribeAccountAssignmentCreationStatus to describe the status of an assignment creation request.  
    */
  def createAccountAssignment(params: CreateAccountAssignmentRequest): Request[CreateAccountAssignmentResponse, AWSError] = js.native
  def createAccountAssignment(
    params: CreateAccountAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountAssignmentResponse, Unit]
  ): Request[CreateAccountAssignmentResponse, AWSError] = js.native
  
  /**
    * Enables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance. You can also specify new attributes to add to your ABAC configuration during the enabling process. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.  After a successful response, call DescribeInstanceAccessControlAttributeConfiguration to validate that InstanceAccessControlAttributeConfiguration was created. 
    */
  def createInstanceAccessControlAttributeConfiguration(): Request[CreateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def createInstanceAccessControlAttributeConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[CreateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  /**
    * Enables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance. You can also specify new attributes to add to your ABAC configuration during the enabling process. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.  After a successful response, call DescribeInstanceAccessControlAttributeConfiguration to validate that InstanceAccessControlAttributeConfiguration was created. 
    */
  def createInstanceAccessControlAttributeConfiguration(params: CreateInstanceAccessControlAttributeConfigurationRequest): Request[CreateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def createInstanceAccessControlAttributeConfiguration(
    params: CreateInstanceAccessControlAttributeConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[CreateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a permission set within a specified IAM Identity Center instance.  To grant users and groups access to AWS account resources, use  CreateAccountAssignment . 
    */
  def createPermissionSet(): Request[CreatePermissionSetResponse, AWSError] = js.native
  def createPermissionSet(callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionSetResponse, Unit]): Request[CreatePermissionSetResponse, AWSError] = js.native
  /**
    * Creates a permission set within a specified IAM Identity Center instance.  To grant users and groups access to AWS account resources, use  CreateAccountAssignment . 
    */
  def createPermissionSet(params: CreatePermissionSetRequest): Request[CreatePermissionSetResponse, AWSError] = js.native
  def createPermissionSet(
    params: CreatePermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePermissionSetResponse, Unit]
  ): Request[CreatePermissionSetResponse, AWSError] = js.native
  
  /**
    * Deletes a principal's access from a specified AWS account using a specified permission set.  After a successful response, call DescribeAccountAssignmentCreationStatus to describe the status of an assignment deletion request. 
    */
  def deleteAccountAssignment(): Request[DeleteAccountAssignmentResponse, AWSError] = js.native
  def deleteAccountAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAssignmentResponse, Unit]): Request[DeleteAccountAssignmentResponse, AWSError] = js.native
  /**
    * Deletes a principal's access from a specified AWS account using a specified permission set.  After a successful response, call DescribeAccountAssignmentCreationStatus to describe the status of an assignment deletion request. 
    */
  def deleteAccountAssignment(params: DeleteAccountAssignmentRequest): Request[DeleteAccountAssignmentResponse, AWSError] = js.native
  def deleteAccountAssignment(
    params: DeleteAccountAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAssignmentResponse, Unit]
  ): Request[DeleteAccountAssignmentResponse, AWSError] = js.native
  
  /**
    * Deletes the inline policy from a specified permission set.
    */
  def deleteInlinePolicyFromPermissionSet(): Request[DeleteInlinePolicyFromPermissionSetResponse, AWSError] = js.native
  def deleteInlinePolicyFromPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInlinePolicyFromPermissionSetResponse, Unit]
  ): Request[DeleteInlinePolicyFromPermissionSetResponse, AWSError] = js.native
  /**
    * Deletes the inline policy from a specified permission set.
    */
  def deleteInlinePolicyFromPermissionSet(params: DeleteInlinePolicyFromPermissionSetRequest): Request[DeleteInlinePolicyFromPermissionSetResponse, AWSError] = js.native
  def deleteInlinePolicyFromPermissionSet(
    params: DeleteInlinePolicyFromPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInlinePolicyFromPermissionSetResponse, Unit]
  ): Request[DeleteInlinePolicyFromPermissionSetResponse, AWSError] = js.native
  
  /**
    * Disables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance and deletes all of the attribute mappings that have been configured. Once deleted, any attributes that are received from an identity source and any custom attributes you have previously configured will not be passed. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def deleteInstanceAccessControlAttributeConfiguration(): Request[DeleteInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def deleteInstanceAccessControlAttributeConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  /**
    * Disables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance and deletes all of the attribute mappings that have been configured. Once deleted, any attributes that are received from an identity source and any custom attributes you have previously configured will not be passed. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def deleteInstanceAccessControlAttributeConfiguration(params: DeleteInstanceAccessControlAttributeConfigurationRequest): Request[DeleteInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def deleteInstanceAccessControlAttributeConfiguration(
    params: DeleteInstanceAccessControlAttributeConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified permission set.
    */
  def deletePermissionSet(): Request[DeletePermissionSetResponse, AWSError] = js.native
  def deletePermissionSet(callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionSetResponse, Unit]): Request[DeletePermissionSetResponse, AWSError] = js.native
  /**
    * Deletes the specified permission set.
    */
  def deletePermissionSet(params: DeletePermissionSetRequest): Request[DeletePermissionSetResponse, AWSError] = js.native
  def deletePermissionSet(
    params: DeletePermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePermissionSetResponse, Unit]
  ): Request[DeletePermissionSetResponse, AWSError] = js.native
  
  /**
    * Deletes the permissions boundary from a specified PermissionSet.
    */
  def deletePermissionsBoundaryFromPermissionSet(): Request[DeletePermissionsBoundaryFromPermissionSetResponse, AWSError] = js.native
  def deletePermissionsBoundaryFromPermissionSet(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeletePermissionsBoundaryFromPermissionSetResponse, 
      Unit
    ]
  ): Request[DeletePermissionsBoundaryFromPermissionSetResponse, AWSError] = js.native
  /**
    * Deletes the permissions boundary from a specified PermissionSet.
    */
  def deletePermissionsBoundaryFromPermissionSet(params: DeletePermissionsBoundaryFromPermissionSetRequest): Request[DeletePermissionsBoundaryFromPermissionSetResponse, AWSError] = js.native
  def deletePermissionsBoundaryFromPermissionSet(
    params: DeletePermissionsBoundaryFromPermissionSetRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeletePermissionsBoundaryFromPermissionSetResponse, 
      Unit
    ]
  ): Request[DeletePermissionsBoundaryFromPermissionSetResponse, AWSError] = js.native
  
  /**
    * Describes the status of the assignment creation request.
    */
  def describeAccountAssignmentCreationStatus(): Request[DescribeAccountAssignmentCreationStatusResponse, AWSError] = js.native
  def describeAccountAssignmentCreationStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAssignmentCreationStatusResponse, Unit]
  ): Request[DescribeAccountAssignmentCreationStatusResponse, AWSError] = js.native
  /**
    * Describes the status of the assignment creation request.
    */
  def describeAccountAssignmentCreationStatus(params: DescribeAccountAssignmentCreationStatusRequest): Request[DescribeAccountAssignmentCreationStatusResponse, AWSError] = js.native
  def describeAccountAssignmentCreationStatus(
    params: DescribeAccountAssignmentCreationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAssignmentCreationStatusResponse, Unit]
  ): Request[DescribeAccountAssignmentCreationStatusResponse, AWSError] = js.native
  
  /**
    * Describes the status of the assignment deletion request.
    */
  def describeAccountAssignmentDeletionStatus(): Request[DescribeAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  def describeAccountAssignmentDeletionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAssignmentDeletionStatusResponse, Unit]
  ): Request[DescribeAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  /**
    * Describes the status of the assignment deletion request.
    */
  def describeAccountAssignmentDeletionStatus(params: DescribeAccountAssignmentDeletionStatusRequest): Request[DescribeAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  def describeAccountAssignmentDeletionStatus(
    params: DescribeAccountAssignmentDeletionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAssignmentDeletionStatusResponse, Unit]
  ): Request[DescribeAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  
  /**
    * Returns the list of IAM Identity Center identity store attributes that have been configured to work with attributes-based access control (ABAC) for the specified IAM Identity Center instance. This will not return attributes configured and sent by an external identity provider. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def describeInstanceAccessControlAttributeConfiguration(): Request[DescribeInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def describeInstanceAccessControlAttributeConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[DescribeInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  /**
    * Returns the list of IAM Identity Center identity store attributes that have been configured to work with attributes-based access control (ABAC) for the specified IAM Identity Center instance. This will not return attributes configured and sent by an external identity provider. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def describeInstanceAccessControlAttributeConfiguration(params: DescribeInstanceAccessControlAttributeConfigurationRequest): Request[DescribeInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def describeInstanceAccessControlAttributeConfiguration(
    params: DescribeInstanceAccessControlAttributeConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[DescribeInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets the details of the permission set.
    */
  def describePermissionSet(): Request[DescribePermissionSetResponse, AWSError] = js.native
  def describePermissionSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionSetResponse, Unit]): Request[DescribePermissionSetResponse, AWSError] = js.native
  /**
    * Gets the details of the permission set.
    */
  def describePermissionSet(params: DescribePermissionSetRequest): Request[DescribePermissionSetResponse, AWSError] = js.native
  def describePermissionSet(
    params: DescribePermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionSetResponse, Unit]
  ): Request[DescribePermissionSetResponse, AWSError] = js.native
  
  /**
    * Describes the status for the given permission set provisioning request.
    */
  def describePermissionSetProvisioningStatus(): Request[DescribePermissionSetProvisioningStatusResponse, AWSError] = js.native
  def describePermissionSetProvisioningStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionSetProvisioningStatusResponse, Unit]
  ): Request[DescribePermissionSetProvisioningStatusResponse, AWSError] = js.native
  /**
    * Describes the status for the given permission set provisioning request.
    */
  def describePermissionSetProvisioningStatus(params: DescribePermissionSetProvisioningStatusRequest): Request[DescribePermissionSetProvisioningStatusResponse, AWSError] = js.native
  def describePermissionSetProvisioningStatus(
    params: DescribePermissionSetProvisioningStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionSetProvisioningStatusResponse, Unit]
  ): Request[DescribePermissionSetProvisioningStatusResponse, AWSError] = js.native
  
  /**
    * Detaches the specified customer managed policy from the specified PermissionSet.
    */
  def detachCustomerManagedPolicyReferenceFromPermissionSet(): Request[DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, AWSError] = js.native
  def detachCustomerManagedPolicyReferenceFromPermissionSet(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, 
      Unit
    ]
  ): Request[DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, AWSError] = js.native
  /**
    * Detaches the specified customer managed policy from the specified PermissionSet.
    */
  def detachCustomerManagedPolicyReferenceFromPermissionSet(params: DetachCustomerManagedPolicyReferenceFromPermissionSetRequest): Request[DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, AWSError] = js.native
  def detachCustomerManagedPolicyReferenceFromPermissionSet(
    params: DetachCustomerManagedPolicyReferenceFromPermissionSetRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, 
      Unit
    ]
  ): Request[DetachCustomerManagedPolicyReferenceFromPermissionSetResponse, AWSError] = js.native
  
  /**
    * Detaches the attached AWS managed policy ARN from the specified permission set.
    */
  def detachManagedPolicyFromPermissionSet(): Request[DetachManagedPolicyFromPermissionSetResponse, AWSError] = js.native
  def detachManagedPolicyFromPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ DetachManagedPolicyFromPermissionSetResponse, Unit]
  ): Request[DetachManagedPolicyFromPermissionSetResponse, AWSError] = js.native
  /**
    * Detaches the attached AWS managed policy ARN from the specified permission set.
    */
  def detachManagedPolicyFromPermissionSet(params: DetachManagedPolicyFromPermissionSetRequest): Request[DetachManagedPolicyFromPermissionSetResponse, AWSError] = js.native
  def detachManagedPolicyFromPermissionSet(
    params: DetachManagedPolicyFromPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachManagedPolicyFromPermissionSetResponse, Unit]
  ): Request[DetachManagedPolicyFromPermissionSetResponse, AWSError] = js.native
  
  /**
    * Obtains the inline policy assigned to the permission set.
    */
  def getInlinePolicyForPermissionSet(): Request[GetInlinePolicyForPermissionSetResponse, AWSError] = js.native
  def getInlinePolicyForPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ GetInlinePolicyForPermissionSetResponse, Unit]
  ): Request[GetInlinePolicyForPermissionSetResponse, AWSError] = js.native
  /**
    * Obtains the inline policy assigned to the permission set.
    */
  def getInlinePolicyForPermissionSet(params: GetInlinePolicyForPermissionSetRequest): Request[GetInlinePolicyForPermissionSetResponse, AWSError] = js.native
  def getInlinePolicyForPermissionSet(
    params: GetInlinePolicyForPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInlinePolicyForPermissionSetResponse, Unit]
  ): Request[GetInlinePolicyForPermissionSetResponse, AWSError] = js.native
  
  /**
    * Obtains the permissions boundary for a specified PermissionSet.
    */
  def getPermissionsBoundaryForPermissionSet(): Request[GetPermissionsBoundaryForPermissionSetResponse, AWSError] = js.native
  def getPermissionsBoundaryForPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionsBoundaryForPermissionSetResponse, Unit]
  ): Request[GetPermissionsBoundaryForPermissionSetResponse, AWSError] = js.native
  /**
    * Obtains the permissions boundary for a specified PermissionSet.
    */
  def getPermissionsBoundaryForPermissionSet(params: GetPermissionsBoundaryForPermissionSetRequest): Request[GetPermissionsBoundaryForPermissionSetResponse, AWSError] = js.native
  def getPermissionsBoundaryForPermissionSet(
    params: GetPermissionsBoundaryForPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPermissionsBoundaryForPermissionSetResponse, Unit]
  ): Request[GetPermissionsBoundaryForPermissionSetResponse, AWSError] = js.native
  
  /**
    * Lists the status of the AWS account assignment creation requests for a specified IAM Identity Center instance.
    */
  def listAccountAssignmentCreationStatus(): Request[ListAccountAssignmentCreationStatusResponse, AWSError] = js.native
  def listAccountAssignmentCreationStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentCreationStatusResponse, Unit]
  ): Request[ListAccountAssignmentCreationStatusResponse, AWSError] = js.native
  /**
    * Lists the status of the AWS account assignment creation requests for a specified IAM Identity Center instance.
    */
  def listAccountAssignmentCreationStatus(params: ListAccountAssignmentCreationStatusRequest): Request[ListAccountAssignmentCreationStatusResponse, AWSError] = js.native
  def listAccountAssignmentCreationStatus(
    params: ListAccountAssignmentCreationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentCreationStatusResponse, Unit]
  ): Request[ListAccountAssignmentCreationStatusResponse, AWSError] = js.native
  
  /**
    * Lists the status of the AWS account assignment deletion requests for a specified IAM Identity Center instance.
    */
  def listAccountAssignmentDeletionStatus(): Request[ListAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  def listAccountAssignmentDeletionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentDeletionStatusResponse, Unit]
  ): Request[ListAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  /**
    * Lists the status of the AWS account assignment deletion requests for a specified IAM Identity Center instance.
    */
  def listAccountAssignmentDeletionStatus(params: ListAccountAssignmentDeletionStatusRequest): Request[ListAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  def listAccountAssignmentDeletionStatus(
    params: ListAccountAssignmentDeletionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentDeletionStatusResponse, Unit]
  ): Request[ListAccountAssignmentDeletionStatusResponse, AWSError] = js.native
  
  /**
    * Lists the assignee of the specified AWS account with the specified permission set.
    */
  def listAccountAssignments(): Request[ListAccountAssignmentsResponse, AWSError] = js.native
  def listAccountAssignments(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentsResponse, Unit]): Request[ListAccountAssignmentsResponse, AWSError] = js.native
  /**
    * Lists the assignee of the specified AWS account with the specified permission set.
    */
  def listAccountAssignments(params: ListAccountAssignmentsRequest): Request[ListAccountAssignmentsResponse, AWSError] = js.native
  def listAccountAssignments(
    params: ListAccountAssignmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssignmentsResponse, Unit]
  ): Request[ListAccountAssignmentsResponse, AWSError] = js.native
  
  /**
    * Lists all the AWS accounts where the specified permission set is provisioned.
    */
  def listAccountsForProvisionedPermissionSet(): Request[ListAccountsForProvisionedPermissionSetResponse, AWSError] = js.native
  def listAccountsForProvisionedPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsForProvisionedPermissionSetResponse, Unit]
  ): Request[ListAccountsForProvisionedPermissionSetResponse, AWSError] = js.native
  /**
    * Lists all the AWS accounts where the specified permission set is provisioned.
    */
  def listAccountsForProvisionedPermissionSet(params: ListAccountsForProvisionedPermissionSetRequest): Request[ListAccountsForProvisionedPermissionSetResponse, AWSError] = js.native
  def listAccountsForProvisionedPermissionSet(
    params: ListAccountsForProvisionedPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsForProvisionedPermissionSetResponse, Unit]
  ): Request[ListAccountsForProvisionedPermissionSetResponse, AWSError] = js.native
  
  /**
    * Lists all customer managed policies attached to a specified PermissionSet.
    */
  def listCustomerManagedPolicyReferencesInPermissionSet(): Request[ListCustomerManagedPolicyReferencesInPermissionSetResponse, AWSError] = js.native
  def listCustomerManagedPolicyReferencesInPermissionSet(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListCustomerManagedPolicyReferencesInPermissionSetResponse, 
      Unit
    ]
  ): Request[ListCustomerManagedPolicyReferencesInPermissionSetResponse, AWSError] = js.native
  /**
    * Lists all customer managed policies attached to a specified PermissionSet.
    */
  def listCustomerManagedPolicyReferencesInPermissionSet(params: ListCustomerManagedPolicyReferencesInPermissionSetRequest): Request[ListCustomerManagedPolicyReferencesInPermissionSetResponse, AWSError] = js.native
  def listCustomerManagedPolicyReferencesInPermissionSet(
    params: ListCustomerManagedPolicyReferencesInPermissionSetRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListCustomerManagedPolicyReferencesInPermissionSetResponse, 
      Unit
    ]
  ): Request[ListCustomerManagedPolicyReferencesInPermissionSetResponse, AWSError] = js.native
  
  /**
    * Lists the IAM Identity Center instances that the caller has access to.
    */
  def listInstances(): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]): Request[ListInstancesResponse, AWSError] = js.native
  /**
    * Lists the IAM Identity Center instances that the caller has access to.
    */
  def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]
  ): Request[ListInstancesResponse, AWSError] = js.native
  
  /**
    * Lists the AWS managed policy that is attached to a specified permission set.
    */
  def listManagedPoliciesInPermissionSet(): Request[ListManagedPoliciesInPermissionSetResponse, AWSError] = js.native
  def listManagedPoliciesInPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedPoliciesInPermissionSetResponse, Unit]
  ): Request[ListManagedPoliciesInPermissionSetResponse, AWSError] = js.native
  /**
    * Lists the AWS managed policy that is attached to a specified permission set.
    */
  def listManagedPoliciesInPermissionSet(params: ListManagedPoliciesInPermissionSetRequest): Request[ListManagedPoliciesInPermissionSetResponse, AWSError] = js.native
  def listManagedPoliciesInPermissionSet(
    params: ListManagedPoliciesInPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedPoliciesInPermissionSetResponse, Unit]
  ): Request[ListManagedPoliciesInPermissionSetResponse, AWSError] = js.native
  
  /**
    * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
    */
  def listPermissionSetProvisioningStatus(): Request[ListPermissionSetProvisioningStatusResponse, AWSError] = js.native
  def listPermissionSetProvisioningStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetProvisioningStatusResponse, Unit]
  ): Request[ListPermissionSetProvisioningStatusResponse, AWSError] = js.native
  /**
    * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
    */
  def listPermissionSetProvisioningStatus(params: ListPermissionSetProvisioningStatusRequest): Request[ListPermissionSetProvisioningStatusResponse, AWSError] = js.native
  def listPermissionSetProvisioningStatus(
    params: ListPermissionSetProvisioningStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetProvisioningStatusResponse, Unit]
  ): Request[ListPermissionSetProvisioningStatusResponse, AWSError] = js.native
  
  /**
    * Lists the PermissionSets in an IAM Identity Center instance.
    */
  def listPermissionSets(): Request[ListPermissionSetsResponse, AWSError] = js.native
  def listPermissionSets(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetsResponse, Unit]): Request[ListPermissionSetsResponse, AWSError] = js.native
  /**
    * Lists the PermissionSets in an IAM Identity Center instance.
    */
  def listPermissionSets(params: ListPermissionSetsRequest): Request[ListPermissionSetsResponse, AWSError] = js.native
  def listPermissionSets(
    params: ListPermissionSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetsResponse, Unit]
  ): Request[ListPermissionSetsResponse, AWSError] = js.native
  
  /**
    * Lists all the permission sets that are provisioned to a specified AWS account.
    */
  def listPermissionSetsProvisionedToAccount(): Request[ListPermissionSetsProvisionedToAccountResponse, AWSError] = js.native
  def listPermissionSetsProvisionedToAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetsProvisionedToAccountResponse, Unit]
  ): Request[ListPermissionSetsProvisionedToAccountResponse, AWSError] = js.native
  /**
    * Lists all the permission sets that are provisioned to a specified AWS account.
    */
  def listPermissionSetsProvisionedToAccount(params: ListPermissionSetsProvisionedToAccountRequest): Request[ListPermissionSetsProvisionedToAccountResponse, AWSError] = js.native
  def listPermissionSetsProvisionedToAccount(
    params: ListPermissionSetsProvisionedToAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionSetsProvisionedToAccountResponse, Unit]
  ): Request[ListPermissionSetsProvisionedToAccountResponse, AWSError] = js.native
  
  /**
    * Lists the tags that are attached to a specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags that are attached to a specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * The process by which a specified permission set is provisioned to the specified target.
    */
  def provisionPermissionSet(): Request[ProvisionPermissionSetResponse, AWSError] = js.native
  def provisionPermissionSet(callback: js.Function2[/* err */ AWSError, /* data */ ProvisionPermissionSetResponse, Unit]): Request[ProvisionPermissionSetResponse, AWSError] = js.native
  /**
    * The process by which a specified permission set is provisioned to the specified target.
    */
  def provisionPermissionSet(params: ProvisionPermissionSetRequest): Request[ProvisionPermissionSetResponse, AWSError] = js.native
  def provisionPermissionSet(
    params: ProvisionPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvisionPermissionSetResponse, Unit]
  ): Request[ProvisionPermissionSetResponse, AWSError] = js.native
  
  /**
    * Attaches an inline policy to a permission set.  If the permission set is already referenced by one or more account assignments, you will need to call  ProvisionPermissionSet  after this action to apply the corresponding IAM policy updates to all assigned accounts. 
    */
  def putInlinePolicyToPermissionSet(): Request[PutInlinePolicyToPermissionSetResponse, AWSError] = js.native
  def putInlinePolicyToPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ PutInlinePolicyToPermissionSetResponse, Unit]
  ): Request[PutInlinePolicyToPermissionSetResponse, AWSError] = js.native
  /**
    * Attaches an inline policy to a permission set.  If the permission set is already referenced by one or more account assignments, you will need to call  ProvisionPermissionSet  after this action to apply the corresponding IAM policy updates to all assigned accounts. 
    */
  def putInlinePolicyToPermissionSet(params: PutInlinePolicyToPermissionSetRequest): Request[PutInlinePolicyToPermissionSetResponse, AWSError] = js.native
  def putInlinePolicyToPermissionSet(
    params: PutInlinePolicyToPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInlinePolicyToPermissionSetResponse, Unit]
  ): Request[PutInlinePolicyToPermissionSetResponse, AWSError] = js.native
  
  /**
    * Attaches an AWS managed or customer managed policy to the specified PermissionSet as a permissions boundary.
    */
  def putPermissionsBoundaryToPermissionSet(): Request[PutPermissionsBoundaryToPermissionSetResponse, AWSError] = js.native
  def putPermissionsBoundaryToPermissionSet(
    callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionsBoundaryToPermissionSetResponse, Unit]
  ): Request[PutPermissionsBoundaryToPermissionSetResponse, AWSError] = js.native
  /**
    * Attaches an AWS managed or customer managed policy to the specified PermissionSet as a permissions boundary.
    */
  def putPermissionsBoundaryToPermissionSet(params: PutPermissionsBoundaryToPermissionSetRequest): Request[PutPermissionsBoundaryToPermissionSetResponse, AWSError] = js.native
  def putPermissionsBoundaryToPermissionSet(
    params: PutPermissionsBoundaryToPermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPermissionsBoundaryToPermissionSetResponse, Unit]
  ): Request[PutPermissionsBoundaryToPermissionSetResponse, AWSError] = js.native
  
  /**
    * Associates a set of tags with a specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates a set of tags with a specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Disassociates a set of tags from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Disassociates a set of tags from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the IAM Identity Center identity store attributes that you can use with the IAM Identity Center instance for attributes-based access control (ABAC). When using an external identity provider as an identity source, you can pass attributes through the SAML assertion as an alternative to configuring attributes from the IAM Identity Center identity store. If a SAML assertion passes any of these attributes, IAM Identity Center replaces the attribute value with the value from the IAM Identity Center identity store. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def updateInstanceAccessControlAttributeConfiguration(): Request[UpdateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def updateInstanceAccessControlAttributeConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  /**
    * Updates the IAM Identity Center identity store attributes that you can use with the IAM Identity Center instance for attributes-based access control (ABAC). When using an external identity provider as an identity source, you can pass attributes through the SAML assertion as an alternative to configuring attributes from the IAM Identity Center identity store. If a SAML assertion passes any of these attributes, IAM Identity Center replaces the attribute value with the value from the IAM Identity Center identity store. For more information about ABAC, see Attribute-Based Access Control in the IAM Identity Center User Guide.
    */
  def updateInstanceAccessControlAttributeConfiguration(params: UpdateInstanceAccessControlAttributeConfigurationRequest): Request[UpdateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  def updateInstanceAccessControlAttributeConfiguration(
    params: UpdateInstanceAccessControlAttributeConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateInstanceAccessControlAttributeConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateInstanceAccessControlAttributeConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates an existing permission set.
    */
  def updatePermissionSet(): Request[UpdatePermissionSetResponse, AWSError] = js.native
  def updatePermissionSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionSetResponse, Unit]): Request[UpdatePermissionSetResponse, AWSError] = js.native
  /**
    * Updates an existing permission set.
    */
  def updatePermissionSet(params: UpdatePermissionSetRequest): Request[UpdatePermissionSetResponse, AWSError] = js.native
  def updatePermissionSet(
    params: UpdatePermissionSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePermissionSetResponse, Unit]
  ): Request[UpdatePermissionSetResponse, AWSError] = js.native
}
