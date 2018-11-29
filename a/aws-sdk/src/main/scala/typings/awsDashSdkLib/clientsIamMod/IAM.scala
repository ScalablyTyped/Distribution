package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IAM: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIamMod.IAMNs.ClientConfiguration = js.native
  /**
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     */
  def addClientIDToOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     */
  def addClientIDToOpenIDConnectProvider(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     */
  def addClientIDToOpenIDConnectProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.AddClientIDToOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM OpenID Connect (OIDC) provider resource. This operation is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     */
  def addClientIDToOpenIDConnectProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AddClientIDToOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permission policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def addRoleToInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permission policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def addRoleToInstanceProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permission policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def addRoleToInstanceProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.AddRoleToInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and this limit cannot be increased. You can remove the existing role and then add a different role to an instance profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must disassociate the instance profile and then associate the instance profile, or you can stop your instance and then restart it.  The caller of this API must be granted the PassRole permission on the IAM role by a permission policy.  For more information about roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def addRoleToInstanceProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AddRoleToInstanceProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified user to the specified group.
     */
  def addUserToGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified user to the specified group.
     */
  def addUserToGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified user to the specified group.
     */
  def addUserToGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.AddUserToGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds the specified user to the specified group.
     */
  def addUserToGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AddUserToGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachGroupPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachGroupPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.AttachGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM group. You use this API to attach a managed policy to a group. To embed an inline policy in a group, use PutGroupPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachGroupPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AttachGroupPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachRolePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.AttachRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access) policy.  You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.  Use this API to attach a managed policy to a role. To embed an inline policy in a role, use PutRolePolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AttachRolePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachUserPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachUserPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.AttachUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches the specified managed policy to the specified user. You use this API to attach a managed policy to a user. To embed an inline policy in a user, use PutUserPolicy. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def attachUserPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.AttachUserPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def changePassword(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def changePassword(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def changePassword(params: awsDashSdkLib.clientsIamMod.IAMNs.ChangePasswordRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password of the IAM user who is calling this operation. The AWS account root user password is not affected by this operation. To change the password for a different user, see UpdateLoginProfile. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def changePassword(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ChangePasswordRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
     */
  def createAccessKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
     */
  def createAccessKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
     */
  def createAccessKey(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is Active. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials. This is true even if the AWS account has no associated users.  For information about limits on the number of keys you can create, see Limitations on IAM Entities in the IAM User Guide.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the associated user and then create new keys. 
     */
  def createAccessKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateAccessKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def createAccountAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def createAccountAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def createAccountAlias(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateAccountAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def createAccountAlias(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateAccountAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new group.  For information about the number of groups you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createInstanceProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.  For information about the number of instance profiles you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createInstanceProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
     */
  def createLoginProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
     */
  def createLoginProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
     */
  def createLoginProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a password for the specified user, giving the user the ability to access AWS services through the AWS Management Console. For more information about managing passwords, see Managing Passwords in the IAM User Guide.
     */
  def createLoginProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
     */
  def createOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
     */
  def createOpenIDConnectProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
     */
  def createOpenIDConnectProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC). The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider. When you create the IAM OIDC provider, you specify the following:   The URL of the OIDC identity provider (IdP) to trust   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to authenticate using the OIDC provider   A list of thumbprints of the server certificate(s) that the IdP uses.   You get all of this information from the OIDC IdP that you want to use to access AWS.  Because trust for the OIDC provider is derived from the IAM provider that this operation creates, it is best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users. 
     */
  def createOpenIDConnectProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def createPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def createPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def createPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new managed policy for your AWS account. This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's default version. For more information about policy versions, see Versioning for Managed Policies in the IAM User Guide. For more information about managed policies in general, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def createPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def createPolicyVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def createPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def createPolicyVersion(params: awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy version. A managed policy can have up to five versions. If the policy has five versions, you must delete an existing version using DeletePolicyVersion before you create a new version. Optionally, you can set the new version as the policy's default version. The default version is the version that is in effect for the IAM users, groups, and roles to which the policy is attached. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def createPolicyVersion(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreatePolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
     */
  def createRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
     */
  def createRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
     */
  def createRole(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information about limitations on role names and the number of roles you can create, go to Limitations on IAM Entities in the IAM User Guide.
     */
  def createRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
     */
  def createSAMLProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
     */
  def createSAMLProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
     */
  def createSAMLProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0. The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to AWS. When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.   This operation requires Signature Version 4.   For more information, see Enabling SAML 2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based Federation in the IAM User Guide.
     */
  def createSAMLProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
     */
  def createServiceLinkedRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
     */
  def createServiceLinkedRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
     */
  def createServiceLinkedRole(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps improve service stability and proper cleanup when a service and its role are no longer needed. For more information, see Using Service-Linked Roles in the IAM User Guide.  To attach a policy to this service-linked role, you must make the request using the AWS service that depends on this role.
     */
  def createServiceLinkedRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
     */
  def createServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
     */
  def createServiceSpecificCredential(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
     */
  def createServiceSpecificCredential(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a set of credentials consisting of a user name and password that can be used to access the service specified in the request. These credentials are generated by IAM, and can be used only for the specified service.  You can have a maximum of two sets of service-specific credentials for each supported service per user. The only supported service at this time is AWS CodeCommit. You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential. For more information about service-specific credentials, see Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.
     */
  def createServiceSpecificCredential(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createUser(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IAM user for your AWS account.  For information about limitations on the number of IAM users you can create, see Limitations on IAM Entities in the IAM User Guide.
     */
  def createUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
     */
  def createVirtualMFADevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
     */
  def createVirtualMFADevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
     */
  def createVirtualMFADevice(params: awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide. For information about limits on the number of MFA devices you can create, see Limitations on Entities in the IAM User Guide.  The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following secure procedures. 
     */
  def createVirtualMFADevice(
    params: awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.CreateVirtualMFADeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def deactivateMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def deactivateMFADevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def deactivateMFADevice(params: awsDashSdkLib.clientsIamMod.IAMNs.DeactivateMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def deactivateMFADevice(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeactivateMFADeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def deleteAccessKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def deleteAccessKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def deleteAccessKey(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the access key pair associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def deleteAccessKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteAccessKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def deleteAccountAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def deleteAccountAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def deleteAccountAlias(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteAccountAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def deleteAccountAlias(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteAccountAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password policy for the AWS account. There are no parameters.
     */
  def deleteAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password policy for the AWS account. There are no parameters.
     */
  def deleteAccountPasswordPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     */
  def deleteGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     */
  def deleteGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     */
  def deleteGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteGroupPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteGroupPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM group. A group can also have managed policies attached to it. To detach a managed policy from a group, use DetachGroupPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteGroupPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteGroupPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
     */
  def deleteInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
     */
  def deleteInstanceProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
     */
  def deleteInstanceProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified instance profile. The instance profile must not have an associated role.  Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.  For more information about instance profiles, go to About Instance Profiles.
     */
  def deleteInstanceProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteInstanceProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
     */
  def deleteLoginProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
     */
  def deleteLoginProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
     */
  def deleteLoginProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services through the AWS Management Console.   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the API. To prevent all user access you must also either make any access keys inactive or delete them. For more information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.  
     */
  def deleteLoginProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteLoginProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
     */
  def deleteOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
     */
  def deleteOpenIDConnectProvider(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
     */
  def deleteOpenIDConnectProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM. Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in their trust policies. Any attempt to assume a role that references a deleted provider fails. This operation is idempotent; it does not fail or return an error if you call the operation for a provider that does not exist.
     */
  def deleteOpenIDConnectProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deletePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DeletePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified managed policy. Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that it is attached to. In addition you must delete all the policy's versions. The following steps describe the process for deleting a managed policy:   Detach the policy from all users, groups, and roles that the policy is attached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the default version. You delete the policy's default version in the next step of the process.   Delete the policy (this automatically deletes the policy's default version) using this API.   For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deletePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeletePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
     */
  def deletePolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
     */
  def deletePolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
     */
  def deletePolicyVersion(params: awsDashSdkLib.clientsIamMod.IAMNs.DeletePolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified version from the specified managed policy. You cannot delete the default version from a policy using this API. To delete the default version from a policy, use DeletePolicy. To find out which version of a policy is marked as the default version, use ListPolicyVersions. For information about versions for managed policies, see Versioning for Managed Policies in the IAM User Guide.
     */
  def deletePolicyVersion(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeletePolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
     */
  def deleteRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
     */
  def deleteRole(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
     */
  def deleteRole(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to Working with Roles.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance. 
     */
  def deleteRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRoleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
     */
  def deleteRolePermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
     */
  def deleteRolePermissionsBoundary(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
     */
  def deleteRolePermissionsBoundary(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRolePermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM role.   Deleting the permissions boundary for a role might increase its permissions by allowing anyone who assumes the role to perform all the actions granted in its permissions policies.  
     */
  def deleteRolePermissionsBoundary(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRolePermissionsBoundaryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteRolePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM role. A role can also have managed policies attached to it. To detach a managed policy from a role, use DetachRolePolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteRolePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
     */
  def deleteSAMLProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
     */
  def deleteSAMLProvider(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
     */
  def deleteSAMLProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a SAML provider resource in IAM. Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider resource ARN fails.   This operation requires Signature Version 4. 
     */
  def deleteSAMLProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSAMLProviderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def deleteSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def deleteSSHPublicKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def deleteSSHPublicKey(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified SSH public key. The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def deleteSSHPublicKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSSHPublicKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
     */
  def deleteServerCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
     */
  def deleteServerCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
     */
  def deleteServerCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified server certificate. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates, it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference. 
     */
  def deleteServerCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServerCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
     */
  def deleteServiceLinkedRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
     */
  def deleteServiceLinkedRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
     */
  def deleteServiceLinkedRole(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion. Before you call this operation, confirm that the role has no active sessions and that any resources used by the role in the linked service are deleted. If you call this operation more than once for the same service-linked role and an earlier deletion task is not complete, then the DeletionTaskId of the earlier request is returned. If you submit a deletion request for a service-linked role whose linked service is still accessing a resource, then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns the reason for the failure, usually including the resources that must be deleted. To delete the service-linked role, you must first remove those resources from the linked service and then submit the deletion request again. Resources are specific to the service that is linked to the role. For more information about removing resources from a service, see the AWS documentation for your service. For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.
     */
  def deleteServiceLinkedRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceLinkedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified service-specific credential.
     */
  def deleteServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified service-specific credential.
     */
  def deleteServiceSpecificCredential(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified service-specific credential.
     */
  def deleteServiceSpecificCredential(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified service-specific credential.
     */
  def deleteServiceSpecificCredential(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
     */
  def deleteSigningCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
     */
  def deleteSigningCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
     */
  def deleteSigningCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a signing certificate associated with the specified IAM user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated IAM users.
     */
  def deleteSigningCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteSigningCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, or attached policies.
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, or attached policies.
     */
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, or attached policies.
     */
  def deleteUser(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing certificates, or attached policies.
     */
  def deleteUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
     */
  def deleteUserPermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
     */
  def deleteUserPermissionsBoundary(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
     */
  def deleteUserPermissionsBoundary(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserPermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the permissions boundary for the specified IAM user.  Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all the actions granted in its permissions policies.  
     */
  def deleteUserPermissionsBoundary(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserPermissionsBoundaryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteUserPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteUserPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified inline policy that is embedded in the specified IAM user. A user can also have managed policies attached to it. To detach a managed policy from a user, use DetachUserPolicy. For more information about policies, refer to Managed Policies and Inline Policies in the IAM User Guide.
     */
  def deleteUserPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteUserPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
     */
  def deleteVirtualMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
     */
  def deleteVirtualMFADevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
     */
  def deleteVirtualMFADevice(params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteVirtualMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a virtual MFA device.   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA devices, see DeactivateMFADevice.  
     */
  def deleteVirtualMFADevice(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DeleteVirtualMFADeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachGroupPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachGroupPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DetachGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified IAM group. A group can also have inline policies embedded with it. To delete an inline policy, use the DeleteGroupPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachGroupPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DetachGroupPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachRolePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DetachRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified role. A role can also have inline policies embedded with it. To delete an inline policy, use the DeleteRolePolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DetachRolePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachUserPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachUserPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.DetachUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified managed policy from the specified user. A user can also have inline policies embedded with it. To delete an inline policy, use the DeleteUserPolicy API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def detachUserPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.DetachUserPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
     */
  def enableMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
     */
  def enableMFADevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
     */
  def enableMFADevice(params: awsDashSdkLib.clientsIamMod.IAMNs.EnableMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is required for every subsequent login by the IAM user associated with the device.
     */
  def enableMFADevice(
    params: awsDashSdkLib.clientsIamMod.IAMNs.EnableMFADeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     *  Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
     */
  def generateCredentialReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GenerateCredentialReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
     */
  def generateCredentialReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GenerateCredentialReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GenerateCredentialReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
     */
  def getAccessKeyLastUsed(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
     */
  def getAccessKeyLastUsed(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
     */
  def getAccessKeyLastUsed(params: awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about when the specified access key was last used. The information includes the date and time of last use, along with the AWS service and region that were specified in the last request made with that key.
     */
  def getAccessKeyLastUsed(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccessKeyLastUsedResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getAccountAuthorizationDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getAccountAuthorizationDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getAccountAuthorizationDetails(params: awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users, groups, roles, and policies) in your account.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  You can optionally filter the results using the Filter parameter. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getAccountAuthorizationDetails(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountAuthorizationDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM Password Policy.
     */
  def getAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountPasswordPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM Password Policy.
     */
  def getAccountPasswordPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccountPasswordPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountPasswordPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about IAM entity usage and IAM quotas in the AWS account.  For information about limitations on IAM entities, see Limitations on IAM Entities in the IAM User Guide.
     */
  def getAccountSummary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about IAM entity usage and IAM quotas in the AWS account.  For information about limitations on IAM entities, see Limitations on IAM Entities in the IAM User Guide.
     */
  def getAccountSummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetAccountSummaryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetAccountSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
     */
  def getContextKeysForCustomPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
     */
  def getContextKeysForCustomPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
     */
  def getContextKeysForCustomPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForCustomPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use GetContextKeysForPrincipalPolicy. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be URL encoded to be included as a part of a real HTML request.
     */
  def getContextKeysForCustomPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForCustomPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
     */
  def getContextKeysForPrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
     */
  def getContextKeysForPrincipalPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
     */
  def getContextKeysForPrincipalPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of. You can optionally include a list of one or more additional policies, specified as strings. If you want to include only a list of policies by string, use GetContextKeysForCustomPolicy instead.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call SimulatePrincipalPolicy.
     */
  def getContextKeysForPrincipalPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPrincipalPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetContextKeysForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
     */
  def getCredentialReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetCredentialReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in the IAM User Guide.
     */
  def getCredentialReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetCredentialReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetCredentialReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.GetGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the MaxItems and Marker parameters.
     */
  def getGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getGroupPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getGroupPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getGroupPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is attached to a group, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getGroupPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetGroupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
     */
  def getInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
     */
  def getInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
     */
  def getInstanceProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and role. For more information about instance profiles, see About Instance Profiles in the IAM User Guide.
     */
  def getInstanceProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
     */
  def getLoginProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
     */
  def getLoginProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
     */
  def getLoginProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned a password, the operation returns a 404 (NoSuchEntity) error.
     */
  def getLoginProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetLoginProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     */
  def getOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     */
  def getOpenIDConnectProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     */
  def getOpenIDConnectProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     */
  def getOpenIDConnectProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetOpenIDConnectProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified managed policy, including the policy's default version and the total number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy, use GetPolicyVersion. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def getPolicyVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def getPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def getPolicyVersion(params: awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified version of the specified managed policy, including the policy document.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  To list the available versions for a policy, use ListPolicyVersions. This API retrieves information about managed policies. To retrieve information about an inline policy that is embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy API. For more information about the types of policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
     */
  def getPolicyVersion(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetPolicyVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
     */
  def getRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
     */
  def getRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
     */
  def getRole(params: awsDashSdkLib.clientsIamMod.IAMNs.GetRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy that grants permission to assume the role. For more information about roles, see Working with Roles.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality. 
     */
  def getRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
     */
  def getRolePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
     */
  def getRolePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
     */
  def getRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For more information about roles, see Using Roles to Delegate Permissions and Federate Identities.
     */
  def getRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetRolePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
     */
  def getSAMLProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
     */
  def getSAMLProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
     */
  def getSAMLProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created or updated.  This operation requires Signature Version 4. 
     */
  def getSAMLProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def getSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def getSSHPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def getSSHPublicKey(params: awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified SSH public key, including metadata about the key. The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def getSSHPublicKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def getServerCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def getServerCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def getServerCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def getServerCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
     */
  def getServiceLinkedRoleDeletionStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
     */
  def getServiceLinkedRoleDeletionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
     */
  def getServiceLinkedRoleDeletionStatus(params: awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this operation returns the reason that it failed, if that information is returned by the service.
     */
  def getServiceLinkedRoleDeletionStatus(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetServiceLinkedRoleDeletionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
     */
  def getUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
     */
  def getUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
     */
  def getUser(params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to sign the request to this API.
     */
  def getUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getUserPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getUserPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getUserPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.  Policies returned by this API are URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.  An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached to a user, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to retrieve the policy document. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def getUserPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
     */
  def listAccessKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
     */
  def listAccessKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
     */
  def listAccessKeys(params: awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. 
     */
  def listAccessKeys(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccessKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def listAccountAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def listAccountAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def listAccountAliases(params: awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about using an AWS account alias, see Using an Alias for Your AWS Account ID in the IAM User Guide.
     */
  def listAccountAliases(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAccountAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedGroupPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedGroupPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedGroupPolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM group. An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the ListGroupPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedGroupPolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedRolePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedRolePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedRolePolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM role. An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the ListRolePolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified role (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedRolePolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedUserPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedUserPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedUserPolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all managed policies that are attached to the specified IAM user. An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the ListUserPolicies API. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. You can use the PathPrefix parameter to limit the list of policies to only those matching the specified path prefix. If there are no policies attached to the specified group (or none that match the specified path prefix), the operation returns an empty list.
     */
  def listAttachedUserPolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListAttachedUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listEntitiesForPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listEntitiesForPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listEntitiesForPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to. You can use the optional EntityFilter parameter to limit the results to a particular type of entity (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set EntityFilter to Role. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listEntitiesForPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListEntitiesForPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
     */
  def listGroupPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
     */
  def listGroupPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
     */
  def listGroupPolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM group. An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified group, the operation returns an empty list.
     */
  def listGroupPolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroups(params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that have the specified path prefix.  You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroups(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroupsForUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroupsForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroupsForUser(params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM groups that the specified IAM user belongs to. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listGroupsForUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfiles(params: awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfiles(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfilesForRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfilesForRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfilesForRole(params: awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns an empty list. For more information about instance profiles, go to About Instance Profiles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listInstanceProfilesForRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListInstanceProfilesForRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listMFADevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listMFADevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listMFADevices(params: awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request for this API. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listMFADevices(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     */
  def listOpenIDConnectProviders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     */
  def listOpenIDConnectProviders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     */
  def listOpenIDConnectProviders(params: awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     */
  def listOpenIDConnectProviders(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListOpenIDConnectProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined managed policies and all AWS managed policies. You can filter the list of policies that is returned using the optional OnlyAttached, Scope, and PathPrefix parameters. For example, to list only the customer managed policies in your AWS account, set Scope to Local. To list only AWS managed policies, set Scope to AWS. You can paginate the results using the MaxItems and Marker parameters. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicyVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicyVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicyVersions(params: awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version. For more information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def listPolicyVersions(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListPolicyVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
     */
  def listRolePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
     */
  def listRolePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
     */
  def listRolePolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies that are embedded in the specified IAM role. An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified role, the operation returns an empty list.
     */
  def listRolePolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listRoleTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listRoleTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listRoleTags(params: awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listRoleTags(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRoleTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listRoles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listRoles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listRoles(params: awsDashSdkLib.clientsIamMod.IAMNs.ListRolesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list. For more information about roles, go to Working with Roles. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listRoles(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListRolesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListRolesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
     */
  def listSAMLProviders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
     */
  def listSAMLProviders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
     */
  def listSAMLProviders(params: awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the SAML provider resource objects defined in IAM in the account.   This operation requires Signature Version 4. 
     */
  def listSAMLProviders(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSAMLProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
     */
  def listSSHPublicKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
     */
  def listSSHPublicKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
     */
  def listSSHPublicKeys(params: awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the operation returns an empty list. The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide. Although each user is limited to a small number of keys, you can still paginate the results using the MaxItems and Marker parameters.
     */
  def listSSHPublicKeys(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSSHPublicKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def listServerCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def listServerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def listServerCertificates(params: awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation returns an empty list.  You can paginate the results using the MaxItems and Marker parameters. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.
     */
  def listServerCertificates(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServerCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the service-specific credentials associated with the specified IAM user. If there are none, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
     */
  def listServiceSpecificCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the service-specific credentials associated with the specified IAM user. If there are none, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
     */
  def listServiceSpecificCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the service-specific credentials associated with the specified IAM user. If there are none, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
     */
  def listServiceSpecificCredentials(params: awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the service-specific credentials associated with the specified IAM user. If there are none, the operation returns an empty list. The service-specific credentials returned by this operation are used only for authenticating the IAM user to a specific service. For more information about using service-specific credentials to authenticate to an AWS service, see Set Up service-specific credentials in the AWS CodeCommit User Guide.
     */
  def listServiceSpecificCredentials(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListServiceSpecificCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def listSigningCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def listSigningCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def listSigningCertificates(params: awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the operation returns an empty list. Although each user is limited to a small number of signing certificates, you can still paginate the results using the MaxItems and Marker parameters. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request for this API. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def listSigningCertificates(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListSigningCertificatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
     */
  def listUserPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
     */
  def listUserPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
     */
  def listUserPolicies(params: awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of the inline policies embedded in the specified IAM user. An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and Inline Policies in the IAM User Guide. You can paginate the results using the MaxItems and Marker parameters. If there are no inline policies embedded with the specified user, the operation returns an empty list.
     */
  def listUserPolicies(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listUserTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listUserTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listUserTags(params: awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def listUserTags(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUserTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listUsers(params: awsDashSdkLib.clientsIamMod.IAMNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns all users in the AWS account. If there are none, the operation returns an empty list. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listUsers(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listVirtualMFADevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listVirtualMFADevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listVirtualMFADevices(params: awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be Assigned, Unassigned, or Any. You can paginate the results using the MaxItems and Marker parameters.
     */
  def listVirtualMFADevices(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ListVirtualMFADevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putGroupPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putGroupPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putGroupPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.PutGroupPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM group. A user can also have managed policies attached to it. To attach a managed policy to a group, use AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putGroupPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.PutGroupPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putRolePermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putRolePermissionsBoundary(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putRolePermissionsBoundary(params: awsDashSdkLib.clientsIamMod.IAMNs.PutRolePermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the role. You cannot set the boundary for a service-linked role.   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putRolePermissionsBoundary(
    params: awsDashSdkLib.clientsIamMod.IAMNs.PutRolePermissionsBoundaryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putRolePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.PutRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role. When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions) policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions and Federate Identities. A role can also have a managed policy attached to it. To attach a managed policy to a role, use AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.PutRolePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putUserPermissionsBoundary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putUserPermissionsBoundary(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putUserPermissionsBoundary(params: awsDashSdkLib.clientsIamMod.IAMNs.PutUserPermissionsBoundaryRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the permissions for the user.  Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy Evaluation Logic in the IAM User Guide.  
     */
  def putUserPermissionsBoundary(
    params: awsDashSdkLib.clientsIamMod.IAMNs.PutUserPermissionsBoundaryRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putUserPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putUserPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putUserPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.PutUserPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user. An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies, see Managed Policies and Inline Policies in the IAM User Guide. For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM Entities in the IAM User Guide.  Because policy documents can be large, you should use POST rather than GET when calling PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def putUserPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.PutUserPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
     */
  def removeClientIDFromOpenIDConnectProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
     */
  def removeClientIDFromOpenIDConnectProvider(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
     */
  def removeClientIDFromOpenIDConnectProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveClientIDFromOpenIDConnectProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified IAM OpenID Connect (OIDC) provider resource object. This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not exist.
     */
  def removeClientIDFromOpenIDConnectProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveClientIDFromOpenIDConnectProviderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def removeRoleFromInstanceProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def removeRoleFromInstanceProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def removeRoleFromInstanceProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveRoleFromInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified IAM role from the specified EC2 instance profile.  Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing a role from an instance profile that is associated with a running instance might break any applications running on the instance.   For more information about IAM roles, go to Working with Roles. For more information about instance profiles, go to About Instance Profiles.
     */
  def removeRoleFromInstanceProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveRoleFromInstanceProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified user from the specified group.
     */
  def removeUserFromGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified user from the specified group.
     */
  def removeUserFromGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified user from the specified group.
     */
  def removeUserFromGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveUserFromGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified user from the specified group.
     */
  def removeUserFromGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.RemoveUserFromGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
     */
  def resetServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
     */
  def resetServiceSpecificCredential(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
     */
  def resetServiceSpecificCredential(params: awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets the password for a service-specific credential. The new password is AWS generated and cryptographically strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password associated with this user.
     */
  def resetServiceSpecificCredential(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.ResetServiceSpecificCredentialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def resyncMFADevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def resyncMFADevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def resyncMFADevice(params: awsDashSdkLib.clientsIamMod.IAMNs.ResyncMFADeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers. For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in the IAM User Guide.
     */
  def resyncMFADevice(
    params: awsDashSdkLib.clientsIamMod.IAMNs.ResyncMFADeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def setDefaultPolicyVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def setDefaultPolicyVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def setDefaultPolicyVersion(params: awsDashSdkLib.clientsIamMod.IAMNs.SetDefaultPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the specified version of the specified policy as the policy's default (operative) version. This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. For information about managed policies, see Managed Policies and Inline Policies in the IAM User Guide.
     */
  def setDefaultPolicyVersion(
    params: awsDashSdkLib.clientsIamMod.IAMNs.SetDefaultPolicyVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
     */
  def simulateCustomPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
     */
  def simulateCustomPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
     */
  def simulateCustomPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.SimulateCustomPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and AWS resources to determine the policies' effective permissions. The policies are provided as strings. The simulation does not perform the API operations; it only checks the authorization to determine if the simulated policies allow or deny the operations. If you want to simulate existing policies attached to an IAM user, group, or role, use SimulatePrincipalPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForCustomPolicy. If the output is long, you can use MaxItems and Marker parameters to paginate the results.
     */
  def simulateCustomPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.SimulateCustomPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
     */
  def simulatePrincipalPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
     */
  def simulatePrincipalPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
     */
  def simulatePrincipalPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.SimulatePrincipalPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a user, then the simulation also includes all of the policies that are attached to groups that the user belongs to. You can optionally include a list of one or more additional policies specified as strings to include in the simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead. You can also optionally include one resource-based policy to be evaluated with each of the resources included in the simulation. The simulation does not perform the API operations, it only checks the authorization to determine if the simulated policies allow or deny the operations.  Note: This API discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead. Context keys are variables maintained by AWS and its services that provide details about the context of an API query request. You can use the Condition element of an IAM policy to evaluate context keys. To get the list of context keys that the policies require for correct simulation, use GetContextKeysForPrincipalPolicy. If the output is long, you can use the MaxItems and Marker parameters to paginate the results.
     */
  def simulatePrincipalPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.SimulatePrincipalPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.SimulatePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagRole(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagRole(params: awsDashSdkLib.clientsIamMod.IAMNs.TagRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.TagRoleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagUser(params: awsDashSdkLib.clientsIamMod.IAMNs.TagUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is overwritten with the new value. A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:    Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name Project and the value MyImportantProject. Or search for all resources with the key name Cost Center and the value 41200.     Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also restrict access to only those resources that have a certain tag attached. For examples of policies that show how to use tags to control access, see Control Access Using IAM Tags in the IAM User Guide.    Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.      Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either case, the entire request fails and no tags are added to the role.   AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.    For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def tagUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.TagUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagRole(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagRole(params: awsDashSdkLib.clientsIamMod.IAMNs.UntagRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UntagRoleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagUser(params: awsDashSdkLib.clientsIamMod.IAMNs.UntagUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
     */
  def untagUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UntagUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
     */
  def updateAccessKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
     */
  def updateAccessKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
     */
  def updateAccessKey(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAccessKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used to disable a user's key as part of a key rotation workflow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users. For information about rotating keys, see Managing Keys and Certificates in the IAM User Guide.
     */
  def updateAccessKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAccessKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
     */
  def updateAccountPasswordPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
     */
  def updateAccountPasswordPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
     */
  def updateAccountPasswordPolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAccountPasswordPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the password policy settings for the AWS account.    This operation does not support partial updates. No parameters are required, but if you do not specify a parameter, that parameter's value reverts to its default value. See the Request Parameters section for each parameter's default value. Also note that some parameters do not allow the default parameter to be explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the operation.     For more information about using a password policy, see Managing an IAM Password Policy in the IAM User Guide.
     */
  def updateAccountPasswordPolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAccountPasswordPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
     */
  def updateAssumeRolePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
     */
  def updateAssumeRolePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
     */
  def updateAssumeRolePolicy(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAssumeRolePolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the "role trust policy". For more information about roles, go to Using Roles to Delegate Permissions and Federate Identities.
     */
  def updateAssumeRolePolicy(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateAssumeRolePolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
     */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
     */
  def updateGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
     */
  def updateGroup(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM group.   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and Groups in the IAM User Guide.   The person making the request (the principal), must have permission to change the role group with the old name and the new name. For example, to change the group named Managers to MGRs, the principal must have a policy that allows them to update both groups. If the principal has permission to update the Managers group, but not the MGRs group, then the update fails. For more information about permissions, see Access Management.  
     */
  def updateGroup(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def updateLoginProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def updateLoginProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def updateLoginProfile(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateLoginProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the password for the specified IAM user. IAM users can change their own passwords by calling ChangePassword. For more information about modifying passwords, see Managing Passwords in the IAM User Guide.
     */
  def updateLoginProfile(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateLoginProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Because trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
     */
  def updateOpenIDConnectProviderThumbprint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Because trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
     */
  def updateOpenIDConnectProviderThumbprint(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Because trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
     */
  def updateOpenIDConnectProviderThumbprint(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateOpenIDConnectProviderThumbprintRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider resource object with a new list of thumbprints. The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are not merged.) Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.  Because trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to highly privileged users. 
     */
  def updateOpenIDConnectProviderThumbprint(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateOpenIDConnectProviderThumbprintRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the description or maximum session duration setting of a role.
     */
  def updateRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the description or maximum session duration setting of a role.
     */
  def updateRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the description or maximum session duration setting of a role.
     */
  def updateRole(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the description or maximum session duration setting of a role.
     */
  def updateRole(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
     */
  def updateRoleDescription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
     */
  def updateRoleDescription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
     */
  def updateRoleDescription(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use instead. Modifies only the description of a role. This operation performs the same function as the Description parameter in the UpdateRole operation.
     */
  def updateRoleDescription(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateRoleDescriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
     */
  def updateSAMLProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
     */
  def updateSAMLProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
     */
  def updateSAMLProvider(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the metadata document for an existing SAML provider resource object.  This operation requires Signature Version 4. 
     */
  def updateSAMLProvider(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UpdateSAMLProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def updateSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def updateSSHPublicKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def updateSSHPublicKey(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot be used for authentication. This operation can be used to disable a user's SSH public key as part of a key rotation work flow. The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def updateSSHPublicKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSSHPublicKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
     */
  def updateServerCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
     */
  def updateServerCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
     */
  def updateServerCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified server certificate stored in IAM. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the server certificates that you manage with IAM.  You should understand the implications of changing a server certificate's path or name. For more information, see Renaming a Server Certificate in the IAM User Guide.   The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named ProductionCert to ProdCert, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the ProductionCert group, but not the ProdCert certificate, then the update fails. For more information about permissions, see Access Management in the IAM User Guide. 
     */
  def updateServerCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateServerCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
     */
  def updateServiceSpecificCredential(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
     */
  def updateServiceSpecificCredential(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
     */
  def updateServiceSpecificCredential(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateServiceSpecificCredentialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the status of a service-specific credential to Active or Inactive. Service-specific credentials that are inactive cannot be used for authentication to the service. This operation can be used to disable a user's service-specific credential as part of a credential rotation work flow.
     */
  def updateServiceSpecificCredential(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateServiceSpecificCredentialRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def updateSigningCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def updateSigningCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def updateSigningCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow. If the UserName field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.
     */
  def updateSigningCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateSigningCertificateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
     */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
     */
  def updateUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
     */
  def updateUser(params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the name and/or the path of the specified IAM user.   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM User and Renaming an IAM Group in the IAM User Guide.    To change a user name, the requester must have appropriate permissions on both the source object and the target object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.  
     */
  def updateUser(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UpdateUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def uploadSSHPublicKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def uploadSSHPublicKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def uploadSSHPublicKey(params: awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an SSH public key and associates it with the specified IAM user. The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS CodeCommit for SSH Connections in the AWS CodeCommit User Guide.
     */
  def uploadSSHPublicKey(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSSHPublicKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
     */
  def uploadServerCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
     */
  def uploadServerCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
     */
  def uploadServerCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key certificate, a private key, and an optional certificate chain, which should all be PEM-encoded. We recommend that you use AWS Certificate Manager to provision, manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information about using ACM, see the AWS Certificate Manager User Guide. For more information about working with server certificates, see Working with Server Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server certificates that you manage with IAM. For information about the number of server certificates you can upload, see Limitations on IAM Entities and Objects in the IAM User Guide.  Because the body of the public key certificate, private key, and the certificate chain can be large, you should use POST rather than GET when calling UploadServerCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query Requests in the IAM User Guide. 
     */
  def uploadServerCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadServerCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def uploadSigningCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def uploadSigningCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def uploadSigningCertificate(params: awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509 signing certificates to validate requests that are signed with a corresponding private key. When you upload the certificate, its default status is Active. If the UserName field is not specified, the IAM user name is determined implicitly based on the AWS access key ID used to sign the request. Because this operation works for access keys under the AWS account, you can use this operation to manage AWS account root user credentials even if the AWS account has no associated users.  Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling UploadSigningCertificate. For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in the AWS General Reference. For general information about using the Query API with IAM, go to Making Query Requests in the IAM User Guide. 
     */
  def uploadSigningCertificate(
    params: awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.UploadSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceProfileExists state by periodically calling the underlying IAM.getInstanceProfileoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_instanceProfileExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceProfileExists,
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetInstanceProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_userExists(state: awsDashSdkLib.awsDashSdkLibStrings.userExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_userExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_userExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the userExists state by periodically calling the underlying IAM.getUseroperation every 1 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_userExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.userExists,
    params: awsDashSdkLib.clientsIamMod.IAMNs.GetUserRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIamMod.IAMNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

