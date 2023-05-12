package typings.awsSdk.clientsQuicksightMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickSight extends Service {
  
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]): Request[CancelIngestionResponse, AWSError] = js.native
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(params: CancelIngestionRequest): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(
    params: CancelIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]
  ): Request[CancelIngestionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_QuickSight: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, you can add a custom default theme by using the CreateAccountCustomization or UpdateAccountCustomization API operation. To further customize Amazon QuickSight by removing Amazon QuickSight sample assets and videos for all new users, see Customizing Amazon QuickSight in the Amazon QuickSight User Guide.  You can create customizations for your Amazon Web Services account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply to an Amazon Web Services account. To find out which customizations apply, use the DescribeAccountCustomization API operation. Before you use the CreateAccountCustomization API operation to add a theme as the namespace default, make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the current permissions by using the  DescribeThemePermissions  API operation. To share the theme, grant permissions by using the  UpdateThemePermissions  API operation. 
    */
  def createAccountCustomization(): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  def createAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountCustomizationResponse, Unit]): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  /**
    * Creates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, you can add a custom default theme by using the CreateAccountCustomization or UpdateAccountCustomization API operation. To further customize Amazon QuickSight by removing Amazon QuickSight sample assets and videos for all new users, see Customizing Amazon QuickSight in the Amazon QuickSight User Guide.  You can create customizations for your Amazon Web Services account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply to an Amazon Web Services account. To find out which customizations apply, use the DescribeAccountCustomization API operation. Before you use the CreateAccountCustomization API operation to add a theme as the namespace default, make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the current permissions by using the  DescribeThemePermissions  API operation. To share the theme, grant permissions by using the  UpdateThemePermissions  API operation. 
    */
  def createAccountCustomization(params: CreateAccountCustomizationRequest): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  def createAccountCustomization(
    params: CreateAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountCustomizationResponse, Unit]
  ): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon QuickSight account, or subscribes to Amazon QuickSight Q. The Amazon Web Services Region for the account is derived from what is configured in the CLI or SDK. This operation isn't supported in the US East (Ohio) Region, South America (Sao Paulo) Region, or Asia Pacific (Singapore) Region.  Before you use this operation, make sure that you can connect to an existing Amazon Web Services account. If you don't have an Amazon Web Services account, see Sign up for Amazon Web Services in the Amazon QuickSight User Guide. The person who signs up for Amazon QuickSight needs to have the correct Identity and Access Management (IAM) permissions. For more information, see IAM Policy Examples for Amazon QuickSight in the Amazon QuickSight User Guide. If your IAM policy includes both the Subscribe and CreateAccountSubscription actions, make sure that both actions are set to Allow. If either action is set to Deny, the Deny action prevails and your API call fails. You can't pass an existing IAM role to access other Amazon Web Services services using this API operation. To pass your existing IAM role to Amazon QuickSight, see Passing IAM roles to Amazon QuickSight in the Amazon QuickSight User Guide. You can't set default resource access on the new account from the Amazon QuickSight API. Instead, add default resource access from the Amazon QuickSight console. For more information about setting default resource access to Amazon Web Services services, see Setting default resource access to Amazon Web Services services in the Amazon QuickSight User Guide.
    */
  def createAccountSubscription(): Request[CreateAccountSubscriptionResponse, AWSError] = js.native
  def createAccountSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountSubscriptionResponse, Unit]): Request[CreateAccountSubscriptionResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight account, or subscribes to Amazon QuickSight Q. The Amazon Web Services Region for the account is derived from what is configured in the CLI or SDK. This operation isn't supported in the US East (Ohio) Region, South America (Sao Paulo) Region, or Asia Pacific (Singapore) Region.  Before you use this operation, make sure that you can connect to an existing Amazon Web Services account. If you don't have an Amazon Web Services account, see Sign up for Amazon Web Services in the Amazon QuickSight User Guide. The person who signs up for Amazon QuickSight needs to have the correct Identity and Access Management (IAM) permissions. For more information, see IAM Policy Examples for Amazon QuickSight in the Amazon QuickSight User Guide. If your IAM policy includes both the Subscribe and CreateAccountSubscription actions, make sure that both actions are set to Allow. If either action is set to Deny, the Deny action prevails and your API call fails. You can't pass an existing IAM role to access other Amazon Web Services services using this API operation. To pass your existing IAM role to Amazon QuickSight, see Passing IAM roles to Amazon QuickSight in the Amazon QuickSight User Guide. You can't set default resource access on the new account from the Amazon QuickSight API. Instead, add default resource access from the Amazon QuickSight console. For more information about setting default resource access to Amazon Web Services services, see Setting default resource access to Amazon Web Services services in the Amazon QuickSight User Guide.
    */
  def createAccountSubscription(params: CreateAccountSubscriptionRequest): Request[CreateAccountSubscriptionResponse, AWSError] = js.native
  def createAccountSubscription(
    params: CreateAccountSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountSubscriptionResponse, Unit]
  ): Request[CreateAccountSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates an analysis in Amazon QuickSight. Analyses can be created either from a template or from an AnalysisDefinition.
    */
  def createAnalysis(): Request[CreateAnalysisResponse, AWSError] = js.native
  def createAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalysisResponse, Unit]): Request[CreateAnalysisResponse, AWSError] = js.native
  /**
    * Creates an analysis in Amazon QuickSight. Analyses can be created either from a template or from an AnalysisDefinition.
    */
  def createAnalysis(params: CreateAnalysisRequest): Request[CreateAnalysisResponse, AWSError] = js.native
  def createAnalysis(
    params: CreateAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalysisResponse, Unit]
  ): Request[CreateAnalysisResponse, AWSError] = js.native
  
  /**
    * Creates a dashboard from either a template or directly with a DashboardDefinition. To first create a template, see the  CreateTemplate  API operation. A dashboard is an entity in Amazon QuickSight that identifies Amazon QuickSight reports, created from analyses. You can share Amazon QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have the correct permissions, you can create a dashboard from a template that exists in a different Amazon Web Services account.
    */
  def createDashboard(): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]): Request[CreateDashboardResponse, AWSError] = js.native
  /**
    * Creates a dashboard from either a template or directly with a DashboardDefinition. To first create a template, see the  CreateTemplate  API operation. A dashboard is an entity in Amazon QuickSight that identifies Amazon QuickSight reports, created from analyses. You can share Amazon QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have the correct permissions, you can create a dashboard from a template that exists in a different Amazon Web Services account.
    */
  def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(
    params: CreateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]
  ): Request[CreateDashboardResponse, AWSError] = js.native
  
  /**
    * Creates a dataset. This operation doesn't support datasets that include uploaded files as a source.
    */
  def createDataSet(): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * Creates a dataset. This operation doesn't support datasets that include uploaded files as a source.
    */
  def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(
    params: CreateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]
  ): Request[CreateDataSetResponse, AWSError] = js.native
  
  /**
    * Creates a data source.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a data source.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  
  /**
    * Creates an empty shared folder.
    */
  def createFolder(): Request[CreateFolderResponse, AWSError] = js.native
  def createFolder(callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderResponse, Unit]): Request[CreateFolderResponse, AWSError] = js.native
  /**
    * Creates an empty shared folder.
    */
  def createFolder(params: CreateFolderRequest): Request[CreateFolderResponse, AWSError] = js.native
  def createFolder(
    params: CreateFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderResponse, Unit]
  ): Request[CreateFolderResponse, AWSError] = js.native
  
  /**
    * Adds an asset, such as a dashboard, analysis, or dataset into a folder.
    */
  def createFolderMembership(): Request[CreateFolderMembershipResponse, AWSError] = js.native
  def createFolderMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderMembershipResponse, Unit]): Request[CreateFolderMembershipResponse, AWSError] = js.native
  /**
    * Adds an asset, such as a dashboard, analysis, or dataset into a folder.
    */
  def createFolderMembership(params: CreateFolderMembershipRequest): Request[CreateFolderMembershipResponse, AWSError] = js.native
  def createFolderMembership(
    params: CreateFolderMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFolderMembershipResponse, Unit]
  ): Request[CreateFolderMembershipResponse, AWSError] = js.native
  
  /**
    * Use the CreateGroup operation to create a group in Amazon QuickSight. You can create up to 10,000 groups in a namespace. If you want to create more than 10,000 groups in a namespace, contact AWS Support. The permissions resource is arn:aws:quicksight:&lt;your-region&gt;:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Use the CreateGroup operation to create a group in Amazon QuickSight. You can create up to 10,000 groups in a namespace. If you want to create more than 10,000 groups in a namespace, contact AWS Support. The permissions resource is arn:aws:quicksight:&lt;your-region&gt;:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(
    params: CreateGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]
  ): Request[CreateGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per Amazon Web Services account. To avoid overwriting rules in other namespaces, use assignment names that are unique.
    */
  def createIAMPolicyAssignment(): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per Amazon Web Services account. To avoid overwriting rules in other namespaces, use assignment names that are unique.
    */
  def createIAMPolicyAssignment(params: CreateIAMPolicyAssignmentRequest): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(
    params: CreateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]
  ): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Creates and starts a new SPICE ingestion for a dataset. You can manually refresh datasets in an Enterprise edition account 32 times in a 24-hour period. You can manually refresh datasets in a Standard edition account 8 times in a 24-hour period. Each 24-hour period is measured starting 24 hours before the current date and time. Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the Amazon Web Services Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]): Request[CreateIngestionResponse, AWSError] = js.native
  /**
    * Creates and starts a new SPICE ingestion for a dataset. You can manually refresh datasets in an Enterprise edition account 32 times in a 24-hour period. You can manually refresh datasets in a Standard edition account 8 times in a 24-hour period. Each 24-hour period is measured starting 24 hours before the current date and time. Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the Amazon Web Services Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(params: CreateIngestionRequest): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(
    params: CreateIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]
  ): Request[CreateIngestionResponse, AWSError] = js.native
  
  /**
    * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight. A namespace allows you to isolate the Amazon QuickSight users and groups that are registered for that namespace. Users that access the namespace can share assets only with other users or groups in the same namespace. They can't see users and groups in other namespaces. You can create a namespace after your Amazon Web Services account is subscribed to Amazon QuickSight. The namespace must be unique within the Amazon Web Services account. By default, there is a limit of 100 namespaces per Amazon Web Services account. To increase your limit, create a ticket with Amazon Web Services Support. 
    */
  def createNamespace(): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]): Request[CreateNamespaceResponse, AWSError] = js.native
  /**
    * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight. A namespace allows you to isolate the Amazon QuickSight users and groups that are registered for that namespace. Users that access the namespace can share assets only with other users or groups in the same namespace. They can't see users and groups in other namespaces. You can create a namespace after your Amazon Web Services account is subscribed to Amazon QuickSight. The namespace must be unique within the Amazon Web Services account. By default, there is a limit of 100 namespaces per Amazon Web Services account. To increase your limit, create a ticket with Amazon Web Services Support. 
    */
  def createNamespace(params: CreateNamespaceRequest): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(
    params: CreateNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]
  ): Request[CreateNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a refresh schedule for a dataset. You can create up to 5 different schedules for a single dataset.
    */
  def createRefreshSchedule(): Request[CreateRefreshScheduleResponse, AWSError] = js.native
  def createRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRefreshScheduleResponse, Unit]): Request[CreateRefreshScheduleResponse, AWSError] = js.native
  /**
    * Creates a refresh schedule for a dataset. You can create up to 5 different schedules for a single dataset.
    */
  def createRefreshSchedule(params: CreateRefreshScheduleRequest): Request[CreateRefreshScheduleResponse, AWSError] = js.native
  def createRefreshSchedule(
    params: CreateRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRefreshScheduleResponse, Unit]
  ): Request[CreateRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Creates a template either from a TemplateDefinition or from an existing Amazon QuickSight analysis or template. You can use the resulting template to create additional dashboards, templates, or analyses. A template is an entity in Amazon QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates a template either from a TemplateDefinition or from an existing Amazon QuickSight analysis or template. You can use the resulting template to create additional dashboards, templates, or analyses. A template is an entity in Amazon QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(
    params: CreateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]
  ): Request[CreateTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]): Request[CreateTemplateAliasResponse, AWSError] = js.native
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(params: CreateTemplateAliasRequest): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(
    params: CreateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]
  ): Request[CreateTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Creates a theme. A theme is set of configuration options for color and layout. Themes apply to analyses and dashboards. For more information, see Using Themes in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  def createTheme(): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]): Request[CreateThemeResponse, AWSError] = js.native
  /**
    * Creates a theme. A theme is set of configuration options for color and layout. Themes apply to analyses and dashboards. For more information, see Using Themes in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  def createTheme(params: CreateThemeRequest): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(
    params: CreateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]
  ): Request[CreateThemeResponse, AWSError] = js.native
  
  /**
    * Creates a theme alias for a theme.
    */
  def createThemeAlias(): Request[CreateThemeAliasResponse, AWSError] = js.native
  def createThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeAliasResponse, Unit]): Request[CreateThemeAliasResponse, AWSError] = js.native
  /**
    * Creates a theme alias for a theme.
    */
  def createThemeAlias(params: CreateThemeAliasRequest): Request[CreateThemeAliasResponse, AWSError] = js.native
  def createThemeAlias(
    params: CreateThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeAliasResponse, Unit]
  ): Request[CreateThemeAliasResponse, AWSError] = js.native
  
  /**
    * Creates a new Q topic.
    */
  def createTopic(): Request[CreateTopicResponse, AWSError] = js.native
  def createTopic(callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicResponse, Unit]): Request[CreateTopicResponse, AWSError] = js.native
  /**
    * Creates a new Q topic.
    */
  def createTopic(params: CreateTopicRequest): Request[CreateTopicResponse, AWSError] = js.native
  def createTopic(
    params: CreateTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicResponse, Unit]
  ): Request[CreateTopicResponse, AWSError] = js.native
  
  /**
    * Creates a topic refresh schedule.
    */
  def createTopicRefreshSchedule(): Request[CreateTopicRefreshScheduleResponse, AWSError] = js.native
  def createTopicRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicRefreshScheduleResponse, Unit]): Request[CreateTopicRefreshScheduleResponse, AWSError] = js.native
  /**
    * Creates a topic refresh schedule.
    */
  def createTopicRefreshSchedule(params: CreateTopicRefreshScheduleRequest): Request[CreateTopicRefreshScheduleResponse, AWSError] = js.native
  def createTopicRefreshSchedule(
    params: CreateTopicRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTopicRefreshScheduleResponse, Unit]
  ): Request[CreateTopicRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Creates a new VPC connection.
    */
  def createVPCConnection(): Request[CreateVPCConnectionResponse, AWSError] = js.native
  def createVPCConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCConnectionResponse, Unit]): Request[CreateVPCConnectionResponse, AWSError] = js.native
  /**
    * Creates a new VPC connection.
    */
  def createVPCConnection(params: CreateVPCConnectionRequest): Request[CreateVPCConnectionResponse, AWSError] = js.native
  def createVPCConnection(
    params: CreateVPCConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVPCConnectionResponse, Unit]
  ): Request[CreateVPCConnectionResponse, AWSError] = js.native
  
  /**
    * Deletes all Amazon QuickSight customizations in this Amazon Web Services Region for the specified Amazon Web Services account and Amazon QuickSight namespace.
    */
  def deleteAccountCustomization(): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  def deleteAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountCustomizationResponse, Unit]): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  /**
    * Deletes all Amazon QuickSight customizations in this Amazon Web Services Region for the specified Amazon Web Services account and Amazon QuickSight namespace.
    */
  def deleteAccountCustomization(params: DeleteAccountCustomizationRequest): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  def deleteAccountCustomization(
    params: DeleteAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountCustomizationResponse, Unit]
  ): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Use the DeleteAccountSubscription operation to delete an Amazon QuickSight account. This operation will result in an error message if you have configured your account termination protection settings to True. To change this setting and delete your account, call the UpdateAccountSettings API and set the value of the TerminationProtectionEnabled parameter to False, then make another call to the DeleteAccountSubscription API.
    */
  def deleteAccountSubscription(): Request[DeleteAccountSubscriptionResponse, AWSError] = js.native
  def deleteAccountSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountSubscriptionResponse, Unit]): Request[DeleteAccountSubscriptionResponse, AWSError] = js.native
  /**
    * Use the DeleteAccountSubscription operation to delete an Amazon QuickSight account. This operation will result in an error message if you have configured your account termination protection settings to True. To change this setting and delete your account, call the UpdateAccountSettings API and set the value of the TerminationProtectionEnabled parameter to False, then make another call to the DeleteAccountSubscription API.
    */
  def deleteAccountSubscription(params: DeleteAccountSubscriptionRequest): Request[DeleteAccountSubscriptionResponse, AWSError] = js.native
  def deleteAccountSubscription(
    params: DeleteAccountSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountSubscriptionResponse, Unit]
  ): Request[DeleteAccountSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. Amazon QuickSight attaches a DeletionTime stamp to the response that specifies the end of the recovery window. At the end of the recovery window, Amazon QuickSight deletes the analysis permanently. At any time before recovery window ends, you can use the RestoreAnalysis API operation to remove the DeletionTime stamp and cancel the deletion of the analysis. The analysis remains visible in the API until it's deleted, so you can describe it but you can't make a template from it. An analysis that's scheduled for deletion isn't accessible in the Amazon QuickSight console. To access it in the console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
    */
  def deleteAnalysis(): Request[DeleteAnalysisResponse, AWSError] = js.native
  def deleteAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisResponse, Unit]): Request[DeleteAnalysisResponse, AWSError] = js.native
  /**
    * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. Amazon QuickSight attaches a DeletionTime stamp to the response that specifies the end of the recovery window. At the end of the recovery window, Amazon QuickSight deletes the analysis permanently. At any time before recovery window ends, you can use the RestoreAnalysis API operation to remove the DeletionTime stamp and cancel the deletion of the analysis. The analysis remains visible in the API until it's deleted, so you can describe it but you can't make a template from it. An analysis that's scheduled for deletion isn't accessible in the Amazon QuickSight console. To access it in the console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
    */
  def deleteAnalysis(params: DeleteAnalysisRequest): Request[DeleteAnalysisResponse, AWSError] = js.native
  def deleteAnalysis(
    params: DeleteAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisResponse, Unit]
  ): Request[DeleteAnalysisResponse, AWSError] = js.native
  
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]): Request[DeleteDashboardResponse, AWSError] = js.native
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(
    params: DeleteDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]
  ): Request[DeleteDashboardResponse, AWSError] = js.native
  
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]): Request[DeleteDataSetResponse, AWSError] = js.native
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(params: DeleteDataSetRequest): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(
    params: DeleteDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]
  ): Request[DeleteDataSetResponse, AWSError] = js.native
  
  /**
    * Deletes the dataset refresh properties of the dataset.
    */
  def deleteDataSetRefreshProperties(): Request[DeleteDataSetRefreshPropertiesResponse, AWSError] = js.native
  def deleteDataSetRefreshProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetRefreshPropertiesResponse, Unit]
  ): Request[DeleteDataSetRefreshPropertiesResponse, AWSError] = js.native
  /**
    * Deletes the dataset refresh properties of the dataset.
    */
  def deleteDataSetRefreshProperties(params: DeleteDataSetRefreshPropertiesRequest): Request[DeleteDataSetRefreshPropertiesResponse, AWSError] = js.native
  def deleteDataSetRefreshProperties(
    params: DeleteDataSetRefreshPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetRefreshPropertiesResponse, Unit]
  ): Request[DeleteDataSetRefreshPropertiesResponse, AWSError] = js.native
  
  /**
    * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]
  ): Request[DeleteDataSourceResponse, AWSError] = js.native
  
  /**
    * Deletes an empty folder.
    */
  def deleteFolder(): Request[DeleteFolderResponse, AWSError] = js.native
  def deleteFolder(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFolderResponse, Unit]): Request[DeleteFolderResponse, AWSError] = js.native
  /**
    * Deletes an empty folder.
    */
  def deleteFolder(params: DeleteFolderRequest): Request[DeleteFolderResponse, AWSError] = js.native
  def deleteFolder(
    params: DeleteFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFolderResponse, Unit]
  ): Request[DeleteFolderResponse, AWSError] = js.native
  
  /**
    * Removes an asset, such as a dashboard, analysis, or dataset, from a folder.
    */
  def deleteFolderMembership(): Request[DeleteFolderMembershipResponse, AWSError] = js.native
  def deleteFolderMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFolderMembershipResponse, Unit]): Request[DeleteFolderMembershipResponse, AWSError] = js.native
  /**
    * Removes an asset, such as a dashboard, analysis, or dataset, from a folder.
    */
  def deleteFolderMembership(params: DeleteFolderMembershipRequest): Request[DeleteFolderMembershipResponse, AWSError] = js.native
  def deleteFolderMembership(
    params: DeleteFolderMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFolderMembershipResponse, Unit]
  ): Request[DeleteFolderMembershipResponse, AWSError] = js.native
  
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(
    params: DeleteGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]
  ): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(params: DeleteIAMPolicyAssignmentRequest): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(
    params: DeleteIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]
  ): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these assets, you use the API operations for the relevant asset. 
    */
  def deleteNamespace(): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]): Request[DeleteNamespaceResponse, AWSError] = js.native
  /**
    * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these assets, you use the API operations for the relevant asset. 
    */
  def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]
  ): Request[DeleteNamespaceResponse, AWSError] = js.native
  
  /**
    * Deletes a refresh schedule from a dataset.
    */
  def deleteRefreshSchedule(): Request[DeleteRefreshScheduleResponse, AWSError] = js.native
  def deleteRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRefreshScheduleResponse, Unit]): Request[DeleteRefreshScheduleResponse, AWSError] = js.native
  /**
    * Deletes a refresh schedule from a dataset.
    */
  def deleteRefreshSchedule(params: DeleteRefreshScheduleRequest): Request[DeleteRefreshScheduleResponse, AWSError] = js.native
  def deleteRefreshSchedule(
    params: DeleteRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRefreshScheduleResponse, Unit]
  ): Request[DeleteRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a template.
    */
  def deleteTemplate(): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deletes a template.
    */
  def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(
    params: DeleteTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]
  ): Request[DeleteTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(params: DeleteTemplateAliasRequest): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(
    params: DeleteTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]
  ): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Deletes a theme.
    */
  def deleteTheme(): Request[DeleteThemeResponse, AWSError] = js.native
  def deleteTheme(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeResponse, Unit]): Request[DeleteThemeResponse, AWSError] = js.native
  /**
    * Deletes a theme.
    */
  def deleteTheme(params: DeleteThemeRequest): Request[DeleteThemeResponse, AWSError] = js.native
  def deleteTheme(
    params: DeleteThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeResponse, Unit]
  ): Request[DeleteThemeResponse, AWSError] = js.native
  
  /**
    * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you delete the version of the theme that the alias points to.
    */
  def deleteThemeAlias(): Request[DeleteThemeAliasResponse, AWSError] = js.native
  def deleteThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeAliasResponse, Unit]): Request[DeleteThemeAliasResponse, AWSError] = js.native
  /**
    * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you delete the version of the theme that the alias points to.
    */
  def deleteThemeAlias(params: DeleteThemeAliasRequest): Request[DeleteThemeAliasResponse, AWSError] = js.native
  def deleteThemeAlias(
    params: DeleteThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeAliasResponse, Unit]
  ): Request[DeleteThemeAliasResponse, AWSError] = js.native
  
  /**
    * Deletes a topic.
    */
  def deleteTopic(): Request[DeleteTopicResponse, AWSError] = js.native
  def deleteTopic(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicResponse, Unit]): Request[DeleteTopicResponse, AWSError] = js.native
  /**
    * Deletes a topic.
    */
  def deleteTopic(params: DeleteTopicRequest): Request[DeleteTopicResponse, AWSError] = js.native
  def deleteTopic(
    params: DeleteTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicResponse, Unit]
  ): Request[DeleteTopicResponse, AWSError] = js.native
  
  /**
    * Deletes a topic refresh schedule.
    */
  def deleteTopicRefreshSchedule(): Request[DeleteTopicRefreshScheduleResponse, AWSError] = js.native
  def deleteTopicRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicRefreshScheduleResponse, Unit]): Request[DeleteTopicRefreshScheduleResponse, AWSError] = js.native
  /**
    * Deletes a topic refresh schedule.
    */
  def deleteTopicRefreshSchedule(params: DeleteTopicRefreshScheduleRequest): Request[DeleteTopicRefreshScheduleResponse, AWSError] = js.native
  def deleteTopicRefreshSchedule(
    params: DeleteTopicRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTopicRefreshScheduleResponse, Unit]
  ): Request[DeleteTopicRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the IAM user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the IAM user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(
    params: DeleteUserByPrincipalIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]
  ): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  
  /**
    * Deletes a VPC connection.
    */
  def deleteVPCConnection(): Request[DeleteVPCConnectionResponse, AWSError] = js.native
  def deleteVPCConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCConnectionResponse, Unit]): Request[DeleteVPCConnectionResponse, AWSError] = js.native
  /**
    * Deletes a VPC connection.
    */
  def deleteVPCConnection(params: DeleteVPCConnectionRequest): Request[DeleteVPCConnectionResponse, AWSError] = js.native
  def deleteVPCConnection(
    params: DeleteVPCConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVPCConnectionResponse, Unit]
  ): Request[DeleteVPCConnectionResponse, AWSError] = js.native
  
  /**
    * Describes the customizations associated with the provided Amazon Web Services account and Amazon Amazon QuickSight namespace in an Amazon Web Services Region. The Amazon QuickSight console evaluates which customizations to apply by running this API operation with the Resolved flag included.  To determine what customizations display when you run this command, it can help to visualize the relationship of the entities involved.     Amazon Web Services account - The Amazon Web Services account exists at the top of the hierarchy. It has the potential to use all of the Amazon Web Services Regions and Amazon Web Services Services. When you subscribe to Amazon QuickSight, you choose one Amazon Web Services Region to use as your home Region. That's where your free SPICE capacity is located. You can use Amazon QuickSight in any supported Amazon Web Services Region.     Amazon Web Services Region - In each Amazon Web Services Region where you sign in to Amazon QuickSight at least once, Amazon QuickSight acts as a separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have access to Amazon QuickSight in any Amazon Web Services Region, unless they are constrained to a namespace.  To run the command in a different Amazon Web Services Region, you change your Region settings. If you're using the CLI, you can use one of the following options:   Use command line options.    Use named profiles.    Run aws configure to change your default Amazon Web Services Region. Use Enter to key the same settings for your keys. For more information, see Configuring the CLI.      Namespace - A QuickSight namespace is a partition that contains users and assets (data sources, datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also be part of the same namespace. People who share a namespace are completely isolated from users and assets in other namespaces, even if they are in the same Amazon Web Services account and Amazon Web Services Region.    Applied customizations - Within an Amazon Web Services Region, a set of Amazon QuickSight customizations can apply to an Amazon Web Services account or to a namespace. Settings that you apply to a namespace override settings that you apply to an Amazon Web Services account. All settings are isolated to a single Amazon Web Services Region. To apply them in other Amazon Web Services Regions, run the CreateAccountCustomization command in each Amazon Web Services Region where you want to apply the same customizations.   
    */
  def describeAccountCustomization(): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  def describeAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountCustomizationResponse, Unit]): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  /**
    * Describes the customizations associated with the provided Amazon Web Services account and Amazon Amazon QuickSight namespace in an Amazon Web Services Region. The Amazon QuickSight console evaluates which customizations to apply by running this API operation with the Resolved flag included.  To determine what customizations display when you run this command, it can help to visualize the relationship of the entities involved.     Amazon Web Services account - The Amazon Web Services account exists at the top of the hierarchy. It has the potential to use all of the Amazon Web Services Regions and Amazon Web Services Services. When you subscribe to Amazon QuickSight, you choose one Amazon Web Services Region to use as your home Region. That's where your free SPICE capacity is located. You can use Amazon QuickSight in any supported Amazon Web Services Region.     Amazon Web Services Region - In each Amazon Web Services Region where you sign in to Amazon QuickSight at least once, Amazon QuickSight acts as a separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have access to Amazon QuickSight in any Amazon Web Services Region, unless they are constrained to a namespace.  To run the command in a different Amazon Web Services Region, you change your Region settings. If you're using the CLI, you can use one of the following options:   Use command line options.    Use named profiles.    Run aws configure to change your default Amazon Web Services Region. Use Enter to key the same settings for your keys. For more information, see Configuring the CLI.      Namespace - A QuickSight namespace is a partition that contains users and assets (data sources, datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also be part of the same namespace. People who share a namespace are completely isolated from users and assets in other namespaces, even if they are in the same Amazon Web Services account and Amazon Web Services Region.    Applied customizations - Within an Amazon Web Services Region, a set of Amazon QuickSight customizations can apply to an Amazon Web Services account or to a namespace. Settings that you apply to a namespace override settings that you apply to an Amazon Web Services account. All settings are isolated to a single Amazon Web Services Region. To apply them in other Amazon Web Services Regions, run the CreateAccountCustomization command in each Amazon Web Services Region where you want to apply the same customizations.   
    */
  def describeAccountCustomization(params: DescribeAccountCustomizationRequest): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  def describeAccountCustomization(
    params: DescribeAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountCustomizationResponse, Unit]
  ): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Describes the settings that were used when your Amazon QuickSight subscription was first created in this Amazon Web Services account.
    */
  def describeAccountSettings(): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  def describeAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSettingsResponse, Unit]): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  /**
    * Describes the settings that were used when your Amazon QuickSight subscription was first created in this Amazon Web Services account.
    */
  def describeAccountSettings(params: DescribeAccountSettingsRequest): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  def describeAccountSettings(
    params: DescribeAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSettingsResponse, Unit]
  ): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Use the DescribeAccountSubscription operation to receive a description of an Amazon QuickSight account's subscription. A successful API call returns an AccountInfo object that includes an account's name, subscription status, authentication type, edition, and notification email address.
    */
  def describeAccountSubscription(): Request[DescribeAccountSubscriptionResponse, AWSError] = js.native
  def describeAccountSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSubscriptionResponse, Unit]): Request[DescribeAccountSubscriptionResponse, AWSError] = js.native
  /**
    * Use the DescribeAccountSubscription operation to receive a description of an Amazon QuickSight account's subscription. A successful API call returns an AccountInfo object that includes an account's name, subscription status, authentication type, edition, and notification email address.
    */
  def describeAccountSubscription(params: DescribeAccountSubscriptionRequest): Request[DescribeAccountSubscriptionResponse, AWSError] = js.native
  def describeAccountSubscription(
    params: DescribeAccountSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSubscriptionResponse, Unit]
  ): Request[DescribeAccountSubscriptionResponse, AWSError] = js.native
  
  /**
    * Provides a summary of the metadata for an analysis.
    */
  def describeAnalysis(): Request[DescribeAnalysisResponse, AWSError] = js.native
  def describeAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisResponse, Unit]): Request[DescribeAnalysisResponse, AWSError] = js.native
  /**
    * Provides a summary of the metadata for an analysis.
    */
  def describeAnalysis(params: DescribeAnalysisRequest): Request[DescribeAnalysisResponse, AWSError] = js.native
  def describeAnalysis(
    params: DescribeAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisResponse, Unit]
  ): Request[DescribeAnalysisResponse, AWSError] = js.native
  
  /**
    * Provides a detailed description of the definition of an analysis.  If you do not need to know details about the content of an Analysis, for instance if you are trying to check the status of a recently created or updated Analysis, use the  DescribeAnalysis  instead.  
    */
  def describeAnalysisDefinition(): Request[DescribeAnalysisDefinitionResponse, AWSError] = js.native
  def describeAnalysisDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisDefinitionResponse, Unit]): Request[DescribeAnalysisDefinitionResponse, AWSError] = js.native
  /**
    * Provides a detailed description of the definition of an analysis.  If you do not need to know details about the content of an Analysis, for instance if you are trying to check the status of a recently created or updated Analysis, use the  DescribeAnalysis  instead.  
    */
  def describeAnalysisDefinition(params: DescribeAnalysisDefinitionRequest): Request[DescribeAnalysisDefinitionResponse, AWSError] = js.native
  def describeAnalysisDefinition(
    params: DescribeAnalysisDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisDefinitionResponse, Unit]
  ): Request[DescribeAnalysisDefinitionResponse, AWSError] = js.native
  
  /**
    * Provides the read and write permissions for an analysis.
    */
  def describeAnalysisPermissions(): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  def describeAnalysisPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisPermissionsResponse, Unit]): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  /**
    * Provides the read and write permissions for an analysis.
    */
  def describeAnalysisPermissions(params: DescribeAnalysisPermissionsRequest): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  def describeAnalysisPermissions(
    params: DescribeAnalysisPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisPermissionsResponse, Unit]
  ): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]): Request[DescribeDashboardResponse, AWSError] = js.native
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(
    params: DescribeDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]
  ): Request[DescribeDashboardResponse, AWSError] = js.native
  
  /**
    * Provides a detailed description of the definition of a dashboard.  If you do not need to know details about the content of a dashboard, for instance if you are trying to check the status of a recently created or updated dashboard, use the  DescribeDashboard  instead.  
    */
  def describeDashboardDefinition(): Request[DescribeDashboardDefinitionResponse, AWSError] = js.native
  def describeDashboardDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardDefinitionResponse, Unit]): Request[DescribeDashboardDefinitionResponse, AWSError] = js.native
  /**
    * Provides a detailed description of the definition of a dashboard.  If you do not need to know details about the content of a dashboard, for instance if you are trying to check the status of a recently created or updated dashboard, use the  DescribeDashboard  instead.  
    */
  def describeDashboardDefinition(params: DescribeDashboardDefinitionRequest): Request[DescribeDashboardDefinitionResponse, AWSError] = js.native
  def describeDashboardDefinition(
    params: DescribeDashboardDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardDefinitionResponse, Unit]
  ): Request[DescribeDashboardDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(params: DescribeDashboardPermissionsRequest): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(
    params: DescribeDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]
  ): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a dataset. This operation doesn't support datasets that include uploaded files as a source.
    */
  def describeDataSet(): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]): Request[DescribeDataSetResponse, AWSError] = js.native
  /**
    * Describes a dataset. This operation doesn't support datasets that include uploaded files as a source.
    */
  def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(
    params: DescribeDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]
  ): Request[DescribeDataSetResponse, AWSError] = js.native
  
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(params: DescribeDataSetPermissionsRequest): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(
    params: DescribeDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]
  ): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes the refresh properties of a dataset.
    */
  def describeDataSetRefreshProperties(): Request[DescribeDataSetRefreshPropertiesResponse, AWSError] = js.native
  def describeDataSetRefreshProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetRefreshPropertiesResponse, Unit]
  ): Request[DescribeDataSetRefreshPropertiesResponse, AWSError] = js.native
  /**
    * Describes the refresh properties of a dataset.
    */
  def describeDataSetRefreshProperties(params: DescribeDataSetRefreshPropertiesRequest): Request[DescribeDataSetRefreshPropertiesResponse, AWSError] = js.native
  def describeDataSetRefreshProperties(
    params: DescribeDataSetRefreshPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetRefreshPropertiesResponse, Unit]
  ): Request[DescribeDataSetRefreshPropertiesResponse, AWSError] = js.native
  
  /**
    * Describes a data source.
    */
  def describeDataSource(): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Describes a data source.
    */
  def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(
    params: DescribeDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]
  ): Request[DescribeDataSourceResponse, AWSError] = js.native
  
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(
    params: DescribeDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]
  ): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a folder.
    */
  def describeFolder(): Request[DescribeFolderResponse, AWSError] = js.native
  def describeFolder(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderResponse, Unit]): Request[DescribeFolderResponse, AWSError] = js.native
  /**
    * Describes a folder.
    */
  def describeFolder(params: DescribeFolderRequest): Request[DescribeFolderResponse, AWSError] = js.native
  def describeFolder(
    params: DescribeFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderResponse, Unit]
  ): Request[DescribeFolderResponse, AWSError] = js.native
  
  /**
    * Describes permissions for a folder.
    */
  def describeFolderPermissions(): Request[DescribeFolderPermissionsResponse, AWSError] = js.native
  def describeFolderPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderPermissionsResponse, Unit]): Request[DescribeFolderPermissionsResponse, AWSError] = js.native
  /**
    * Describes permissions for a folder.
    */
  def describeFolderPermissions(params: DescribeFolderPermissionsRequest): Request[DescribeFolderPermissionsResponse, AWSError] = js.native
  def describeFolderPermissions(
    params: DescribeFolderPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderPermissionsResponse, Unit]
  ): Request[DescribeFolderPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes the folder resolved permissions. Permissions consists of both folder direct permissions and the inherited permissions from the ancestor folders.
    */
  def describeFolderResolvedPermissions(): Request[DescribeFolderResolvedPermissionsResponse, AWSError] = js.native
  def describeFolderResolvedPermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderResolvedPermissionsResponse, Unit]
  ): Request[DescribeFolderResolvedPermissionsResponse, AWSError] = js.native
  /**
    * Describes the folder resolved permissions. Permissions consists of both folder direct permissions and the inherited permissions from the ancestor folders.
    */
  def describeFolderResolvedPermissions(params: DescribeFolderResolvedPermissionsRequest): Request[DescribeFolderResolvedPermissionsResponse, AWSError] = js.native
  def describeFolderResolvedPermissions(
    params: DescribeFolderResolvedPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFolderResolvedPermissionsResponse, Unit]
  ): Request[DescribeFolderResolvedPermissionsResponse, AWSError] = js.native
  
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  
  /**
    * Use the DescribeGroupMembership operation to determine if a user is a member of the specified group. If the user exists and is a member of the specified group, an associated GroupMember object is returned.
    */
  def describeGroupMembership(): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  def describeGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupMembershipResponse, Unit]): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  /**
    * Use the DescribeGroupMembership operation to determine if a user is a member of the specified group. If the user exists and is a member of the specified group, an associated GroupMember object is returned.
    */
  def describeGroupMembership(params: DescribeGroupMembershipRequest): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  def describeGroupMembership(
    params: DescribeGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupMembershipResponse, Unit]
  ): Request[DescribeGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(
    params: DescribeIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]
  ): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]): Request[DescribeIngestionResponse, AWSError] = js.native
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(
    params: DescribeIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]
  ): Request[DescribeIngestionResponse, AWSError] = js.native
  
  /**
    * Provides a summary and status of IP rules.
    */
  def describeIpRestriction(): Request[DescribeIpRestrictionResponse, AWSError] = js.native
  def describeIpRestriction(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpRestrictionResponse, Unit]): Request[DescribeIpRestrictionResponse, AWSError] = js.native
  /**
    * Provides a summary and status of IP rules.
    */
  def describeIpRestriction(params: DescribeIpRestrictionRequest): Request[DescribeIpRestrictionResponse, AWSError] = js.native
  def describeIpRestriction(
    params: DescribeIpRestrictionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpRestrictionResponse, Unit]
  ): Request[DescribeIpRestrictionResponse, AWSError] = js.native
  
  /**
    * Describes the current namespace.
    */
  def describeNamespace(): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]): Request[DescribeNamespaceResponse, AWSError] = js.native
  /**
    * Describes the current namespace.
    */
  def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(
    params: DescribeNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]
  ): Request[DescribeNamespaceResponse, AWSError] = js.native
  
  /**
    * Provides a summary of a refresh schedule.
    */
  def describeRefreshSchedule(): Request[DescribeRefreshScheduleResponse, AWSError] = js.native
  def describeRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshScheduleResponse, Unit]): Request[DescribeRefreshScheduleResponse, AWSError] = js.native
  /**
    * Provides a summary of a refresh schedule.
    */
  def describeRefreshSchedule(params: DescribeRefreshScheduleRequest): Request[DescribeRefreshScheduleResponse, AWSError] = js.native
  def describeRefreshSchedule(
    params: DescribeRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRefreshScheduleResponse, Unit]
  ): Request[DescribeRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]): Request[DescribeTemplateResponse, AWSError] = js.native
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(
    params: DescribeTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]
  ): Request[DescribeTemplateResponse, AWSError] = js.native
  
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(
    params: DescribeTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]
  ): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Provides a detailed description of the definition of a template.  If you do not need to know details about the content of a template, for instance if you are trying to check the status of a recently created or updated template, use the  DescribeTemplate  instead.  
    */
  def describeTemplateDefinition(): Request[DescribeTemplateDefinitionResponse, AWSError] = js.native
  def describeTemplateDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateDefinitionResponse, Unit]): Request[DescribeTemplateDefinitionResponse, AWSError] = js.native
  /**
    * Provides a detailed description of the definition of a template.  If you do not need to know details about the content of a template, for instance if you are trying to check the status of a recently created or updated template, use the  DescribeTemplate  instead.  
    */
  def describeTemplateDefinition(params: DescribeTemplateDefinitionRequest): Request[DescribeTemplateDefinitionResponse, AWSError] = js.native
  def describeTemplateDefinition(
    params: DescribeTemplateDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateDefinitionResponse, Unit]
  ): Request[DescribeTemplateDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(params: DescribeTemplatePermissionsRequest): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(
    params: DescribeTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]
  ): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a theme.
    */
  def describeTheme(): Request[DescribeThemeResponse, AWSError] = js.native
  def describeTheme(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeResponse, Unit]): Request[DescribeThemeResponse, AWSError] = js.native
  /**
    * Describes a theme.
    */
  def describeTheme(params: DescribeThemeRequest): Request[DescribeThemeResponse, AWSError] = js.native
  def describeTheme(
    params: DescribeThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeResponse, Unit]
  ): Request[DescribeThemeResponse, AWSError] = js.native
  
  /**
    * Describes the alias for a theme.
    */
  def describeThemeAlias(): Request[DescribeThemeAliasResponse, AWSError] = js.native
  def describeThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeAliasResponse, Unit]): Request[DescribeThemeAliasResponse, AWSError] = js.native
  /**
    * Describes the alias for a theme.
    */
  def describeThemeAlias(params: DescribeThemeAliasRequest): Request[DescribeThemeAliasResponse, AWSError] = js.native
  def describeThemeAlias(
    params: DescribeThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeAliasResponse, Unit]
  ): Request[DescribeThemeAliasResponse, AWSError] = js.native
  
  /**
    * Describes the read and write permissions for a theme.
    */
  def describeThemePermissions(): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  def describeThemePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemePermissionsResponse, Unit]): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  /**
    * Describes the read and write permissions for a theme.
    */
  def describeThemePermissions(params: DescribeThemePermissionsRequest): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  def describeThemePermissions(
    params: DescribeThemePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemePermissionsResponse, Unit]
  ): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a topic.
    */
  def describeTopic(): Request[DescribeTopicResponse, AWSError] = js.native
  def describeTopic(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicResponse, Unit]): Request[DescribeTopicResponse, AWSError] = js.native
  /**
    * Describes a topic.
    */
  def describeTopic(params: DescribeTopicRequest): Request[DescribeTopicResponse, AWSError] = js.native
  def describeTopic(
    params: DescribeTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicResponse, Unit]
  ): Request[DescribeTopicResponse, AWSError] = js.native
  
  /**
    * Describes the permissions of a topic.
    */
  def describeTopicPermissions(): Request[DescribeTopicPermissionsResponse, AWSError] = js.native
  def describeTopicPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicPermissionsResponse, Unit]): Request[DescribeTopicPermissionsResponse, AWSError] = js.native
  /**
    * Describes the permissions of a topic.
    */
  def describeTopicPermissions(params: DescribeTopicPermissionsRequest): Request[DescribeTopicPermissionsResponse, AWSError] = js.native
  def describeTopicPermissions(
    params: DescribeTopicPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicPermissionsResponse, Unit]
  ): Request[DescribeTopicPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes the status of a topic refresh.
    */
  def describeTopicRefresh(): Request[DescribeTopicRefreshResponse, AWSError] = js.native
  def describeTopicRefresh(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicRefreshResponse, Unit]): Request[DescribeTopicRefreshResponse, AWSError] = js.native
  /**
    * Describes the status of a topic refresh.
    */
  def describeTopicRefresh(params: DescribeTopicRefreshRequest): Request[DescribeTopicRefreshResponse, AWSError] = js.native
  def describeTopicRefresh(
    params: DescribeTopicRefreshRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicRefreshResponse, Unit]
  ): Request[DescribeTopicRefreshResponse, AWSError] = js.native
  
  /**
    * Deletes a topic refresh schedule.
    */
  def describeTopicRefreshSchedule(): Request[DescribeTopicRefreshScheduleResponse, AWSError] = js.native
  def describeTopicRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicRefreshScheduleResponse, Unit]): Request[DescribeTopicRefreshScheduleResponse, AWSError] = js.native
  /**
    * Deletes a topic refresh schedule.
    */
  def describeTopicRefreshSchedule(params: DescribeTopicRefreshScheduleRequest): Request[DescribeTopicRefreshScheduleResponse, AWSError] = js.native
  def describeTopicRefreshSchedule(
    params: DescribeTopicRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTopicRefreshScheduleResponse, Unit]
  ): Request[DescribeTopicRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Describes a VPC connection.
    */
  def describeVPCConnection(): Request[DescribeVPCConnectionResponse, AWSError] = js.native
  def describeVPCConnection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVPCConnectionResponse, Unit]): Request[DescribeVPCConnectionResponse, AWSError] = js.native
  /**
    * Describes a VPC connection.
    */
  def describeVPCConnection(params: DescribeVPCConnectionRequest): Request[DescribeVPCConnectionResponse, AWSError] = js.native
  def describeVPCConnection(
    params: DescribeVPCConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVPCConnectionResponse, Unit]
  ): Request[DescribeVPCConnectionResponse, AWSError] = js.native
  
  /**
    * Generates an embed URL that you can use to embed an Amazon QuickSight dashboard or visual in your website, without having to register any reader users. Before you use this action, make sure that you have configured the dashboards and permissions. The following rules apply to the generated URL:   It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this period, it cannot be re-used again.   The URL validity period should not be confused with the actual session lifetime that can be customized using the  SessionLifetimeInMinutes  parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration is 10 hours.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   For more information, see Embedded Analytics in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def generateEmbedUrlForAnonymousUser(): Request[GenerateEmbedUrlForAnonymousUserResponse, AWSError] = js.native
  def generateEmbedUrlForAnonymousUser(
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateEmbedUrlForAnonymousUserResponse, Unit]
  ): Request[GenerateEmbedUrlForAnonymousUserResponse, AWSError] = js.native
  /**
    * Generates an embed URL that you can use to embed an Amazon QuickSight dashboard or visual in your website, without having to register any reader users. Before you use this action, make sure that you have configured the dashboards and permissions. The following rules apply to the generated URL:   It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this period, it cannot be re-used again.   The URL validity period should not be confused with the actual session lifetime that can be customized using the  SessionLifetimeInMinutes  parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration is 10 hours.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   For more information, see Embedded Analytics in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def generateEmbedUrlForAnonymousUser(params: GenerateEmbedUrlForAnonymousUserRequest): Request[GenerateEmbedUrlForAnonymousUserResponse, AWSError] = js.native
  def generateEmbedUrlForAnonymousUser(
    params: GenerateEmbedUrlForAnonymousUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateEmbedUrlForAnonymousUserResponse, Unit]
  ): Request[GenerateEmbedUrlForAnonymousUserResponse, AWSError] = js.native
  
  /**
    * Generates an embed URL that you can use to embed an Amazon QuickSight experience in your website. This action can be used for any type of user registered in an Amazon QuickSight account. Before you use this action, make sure that you have configured the relevant Amazon QuickSight resource and permissions. The following rules apply to the generated URL:   It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this period, it cannot be re-used again.   The URL validity period should not be confused with the actual session lifetime that can be customized using the  SessionLifetimeInMinutes  parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration is 10 hours.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   For more information, see Embedded Analytics in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def generateEmbedUrlForRegisteredUser(): Request[GenerateEmbedUrlForRegisteredUserResponse, AWSError] = js.native
  def generateEmbedUrlForRegisteredUser(
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateEmbedUrlForRegisteredUserResponse, Unit]
  ): Request[GenerateEmbedUrlForRegisteredUserResponse, AWSError] = js.native
  /**
    * Generates an embed URL that you can use to embed an Amazon QuickSight experience in your website. This action can be used for any type of user registered in an Amazon QuickSight account. Before you use this action, make sure that you have configured the relevant Amazon QuickSight resource and permissions. The following rules apply to the generated URL:   It contains a temporary bearer token. It is valid for 5 minutes after it is generated. Once redeemed within this period, it cannot be re-used again.   The URL validity period should not be confused with the actual session lifetime that can be customized using the  SessionLifetimeInMinutes  parameter. The resulting user session is valid for 15 minutes (minimum) to 10 hours (maximum). The default session duration is 10 hours.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   For more information, see Embedded Analytics in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def generateEmbedUrlForRegisteredUser(params: GenerateEmbedUrlForRegisteredUserRequest): Request[GenerateEmbedUrlForRegisteredUserResponse, AWSError] = js.native
  def generateEmbedUrlForRegisteredUser(
    params: GenerateEmbedUrlForRegisteredUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateEmbedUrlForRegisteredUserResponse, Unit]
  ): Request[GenerateEmbedUrlForRegisteredUserResponse, AWSError] = js.native
  
  /**
    * Generates a temporary session URL and authorization code(bearer token) that you can use to embed an Amazon QuickSight read-only dashboard in your website or application. Before you use this command, make sure that you have configured the dashboards and permissions.  Currently, you can use GetDashboardEmbedURL only from the server, not from the user's browser. The following rules apply to the generated URL:   They must be used together.   They can be used one time only.   They are valid for 5 minutes after you run this command.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   The resulting user session is valid for 15 minutes (default) up to 10 hours (maximum). You can use the optional SessionLifetimeInMinutes parameter to customize session duration.   For more information, see Embedding Analytics Using GetDashboardEmbedUrl in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def getDashboardEmbedUrl(): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a temporary session URL and authorization code(bearer token) that you can use to embed an Amazon QuickSight read-only dashboard in your website or application. Before you use this command, make sure that you have configured the dashboards and permissions.  Currently, you can use GetDashboardEmbedURL only from the server, not from the user's browser. The following rules apply to the generated URL:   They must be used together.   They can be used one time only.   They are valid for 5 minutes after you run this command.   You are charged only when the URL is used or there is interaction with Amazon QuickSight.   The resulting user session is valid for 15 minutes (default) up to 10 hours (maximum). You can use the optional SessionLifetimeInMinutes parameter to customize session duration.   For more information, see Embedding Analytics Using GetDashboardEmbedUrl in the Amazon QuickSight User Guide. For more information about the high-level steps for embedding and for an interactive demo of the ways you can customize embedding, visit the Amazon QuickSight Developer Portal.
    */
  def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(
    params: GetDashboardEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]
  ): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  
  /**
    * Generates a session URL and authorization code that you can use to embed the Amazon Amazon QuickSight console in your web server code. Use GetSessionEmbedUrl where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded Amazon QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile to the user with the  UpdateUser  API operation. Use  RegisterUser  API operation to add a new user with a custom permission profile attached. For more information, see the following sections in the Amazon QuickSight User Guide:    Embedding Analytics     Customizing Access to the Amazon QuickSight Console   
    */
  def getSessionEmbedUrl(): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  def getSessionEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionEmbedUrlResponse, Unit]): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a session URL and authorization code that you can use to embed the Amazon Amazon QuickSight console in your web server code. Use GetSessionEmbedUrl where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded Amazon QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile to the user with the  UpdateUser  API operation. Use  RegisterUser  API operation to add a new user with a custom permission profile attached. For more information, see the following sections in the Amazon QuickSight User Guide:    Embedding Analytics     Customizing Access to the Amazon QuickSight Console   
    */
  def getSessionEmbedUrl(params: GetSessionEmbedUrlRequest): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  def getSessionEmbedUrl(
    params: GetSessionEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionEmbedUrlResponse, Unit]
  ): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  
  /**
    * Lists Amazon QuickSight analyses that exist in the specified Amazon Web Services account.
    */
  def listAnalyses(): Request[ListAnalysesResponse, AWSError] = js.native
  def listAnalyses(callback: js.Function2[/* err */ AWSError, /* data */ ListAnalysesResponse, Unit]): Request[ListAnalysesResponse, AWSError] = js.native
  /**
    * Lists Amazon QuickSight analyses that exist in the specified Amazon Web Services account.
    */
  def listAnalyses(params: ListAnalysesRequest): Request[ListAnalysesResponse, AWSError] = js.native
  def listAnalyses(
    params: ListAnalysesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnalysesResponse, Unit]
  ): Request[ListAnalysesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the dashboards in the Amazon QuickSight subscription.
    */
  def listDashboardVersions(): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]): Request[ListDashboardVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the dashboards in the Amazon QuickSight subscription.
    */
  def listDashboardVersions(params: ListDashboardVersionsRequest): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(
    params: ListDashboardVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]
  ): Request[ListDashboardVersionsResponse, AWSError] = js.native
  
  /**
    * Lists dashboards in an Amazon Web Services account.
    */
  def listDashboards(): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]): Request[ListDashboardsResponse, AWSError] = js.native
  /**
    * Lists dashboards in an Amazon Web Services account.
    */
  def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(
    params: ListDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]
  ): Request[ListDashboardsResponse, AWSError] = js.native
  
  /**
    * Lists all of the datasets belonging to the current Amazon Web Services account in an Amazon Web Services Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * Lists all of the datasets belonging to the current Amazon Web Services account in an Amazon Web Services Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(
    params: ListDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]
  ): Request[ListDataSetsResponse, AWSError] = js.native
  
  /**
    * Lists data sources in current Amazon Web Services Region that belong to this Amazon Web Services account.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists data sources in current Amazon Web Services Region that belong to this Amazon Web Services account.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  
  /**
    * List all assets (DASHBOARD, ANALYSIS, and DATASET) in a folder. 
    */
  def listFolderMembers(): Request[ListFolderMembersResponse, AWSError] = js.native
  def listFolderMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListFolderMembersResponse, Unit]): Request[ListFolderMembersResponse, AWSError] = js.native
  /**
    * List all assets (DASHBOARD, ANALYSIS, and DATASET) in a folder. 
    */
  def listFolderMembers(params: ListFolderMembersRequest): Request[ListFolderMembersResponse, AWSError] = js.native
  def listFolderMembers(
    params: ListFolderMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFolderMembersResponse, Unit]
  ): Request[ListFolderMembersResponse, AWSError] = js.native
  
  /**
    * Lists all folders in an account.
    */
  def listFolders(): Request[ListFoldersResponse, AWSError] = js.native
  def listFolders(callback: js.Function2[/* err */ AWSError, /* data */ ListFoldersResponse, Unit]): Request[ListFoldersResponse, AWSError] = js.native
  /**
    * Lists all folders in an account.
    */
  def listFolders(params: ListFoldersRequest): Request[ListFoldersResponse, AWSError] = js.native
  def listFolders(
    params: ListFoldersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFoldersResponse, Unit]
  ): Request[ListFoldersResponse, AWSError] = js.native
  
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(
    params: ListGroupMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]
  ): Request[ListGroupMembershipsResponse, AWSError] = js.native
  
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  /**
    * Lists the IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(
    params: ListIAMPolicyAssignmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  
  /**
    * Lists all of the IAM policy assignments, including the Amazon Resource Names (ARNs), for the IAM policies assigned to the specified user and group, or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  /**
    * Lists all of the IAM policy assignments, including the Amazon Resource Names (ARNs), for the IAM policies assigned to the specified user and group, or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(params: ListIAMPolicyAssignmentsForUserRequest): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    params: ListIAMPolicyAssignmentsForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]): Request[ListIngestionsResponse, AWSError] = js.native
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(params: ListIngestionsRequest): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(
    params: ListIngestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]
  ): Request[ListIngestionsResponse, AWSError] = js.native
  
  /**
    * Lists the namespaces for the specified Amazon Web Services account. This operation doesn't list deleted namespaces.
    */
  def listNamespaces(): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]): Request[ListNamespacesResponse, AWSError] = js.native
  /**
    * Lists the namespaces for the specified Amazon Web Services account. This operation doesn't list deleted namespaces.
    */
  def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(
    params: ListNamespacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]
  ): Request[ListNamespacesResponse, AWSError] = js.native
  
  /**
    * Lists the refresh schedules of a dataset. Each dataset can have up to 5 schedules. 
    */
  def listRefreshSchedules(): Request[ListRefreshSchedulesResponse, AWSError] = js.native
  def listRefreshSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListRefreshSchedulesResponse, Unit]): Request[ListRefreshSchedulesResponse, AWSError] = js.native
  /**
    * Lists the refresh schedules of a dataset. Each dataset can have up to 5 schedules. 
    */
  def listRefreshSchedules(params: ListRefreshSchedulesRequest): Request[ListRefreshSchedulesResponse, AWSError] = js.native
  def listRefreshSchedules(
    params: ListRefreshSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRefreshSchedulesResponse, Unit]
  ): Request[ListRefreshSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]): Request[ListTemplateAliasesResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(params: ListTemplateAliasesRequest): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(
    params: ListTemplateAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]
  ): Request[ListTemplateAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]): Request[ListTemplateVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(
    params: ListTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]
  ): Request[ListTemplateVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]
  ): Request[ListTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all the aliases of a theme.
    */
  def listThemeAliases(): Request[ListThemeAliasesResponse, AWSError] = js.native
  def listThemeAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListThemeAliasesResponse, Unit]): Request[ListThemeAliasesResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a theme.
    */
  def listThemeAliases(params: ListThemeAliasesRequest): Request[ListThemeAliasesResponse, AWSError] = js.native
  def listThemeAliases(
    params: ListThemeAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemeAliasesResponse, Unit]
  ): Request[ListThemeAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the themes in the current Amazon Web Services account.
    */
  def listThemeVersions(): Request[ListThemeVersionsResponse, AWSError] = js.native
  def listThemeVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListThemeVersionsResponse, Unit]): Request[ListThemeVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the themes in the current Amazon Web Services account.
    */
  def listThemeVersions(params: ListThemeVersionsRequest): Request[ListThemeVersionsResponse, AWSError] = js.native
  def listThemeVersions(
    params: ListThemeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemeVersionsResponse, Unit]
  ): Request[ListThemeVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all the themes in the current Amazon Web Services account.
    */
  def listThemes(): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]): Request[ListThemesResponse, AWSError] = js.native
  /**
    * Lists all the themes in the current Amazon Web Services account.
    */
  def listThemes(params: ListThemesRequest): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(
    params: ListThemesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]
  ): Request[ListThemesResponse, AWSError] = js.native
  
  /**
    * Lists all of the refresh schedules for a topic.
    */
  def listTopicRefreshSchedules(): Request[ListTopicRefreshSchedulesResponse, AWSError] = js.native
  def listTopicRefreshSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRefreshSchedulesResponse, Unit]): Request[ListTopicRefreshSchedulesResponse, AWSError] = js.native
  /**
    * Lists all of the refresh schedules for a topic.
    */
  def listTopicRefreshSchedules(params: ListTopicRefreshSchedulesRequest): Request[ListTopicRefreshSchedulesResponse, AWSError] = js.native
  def listTopicRefreshSchedules(
    params: ListTopicRefreshSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicRefreshSchedulesResponse, Unit]
  ): Request[ListTopicRefreshSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists all of the topics within an account.
    */
  def listTopics(): Request[ListTopicsResponse, AWSError] = js.native
  def listTopics(callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsResponse, Unit]): Request[ListTopicsResponse, AWSError] = js.native
  /**
    * Lists all of the topics within an account.
    */
  def listTopics(params: ListTopicsRequest): Request[ListTopicsResponse, AWSError] = js.native
  def listTopics(
    params: ListTopicsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTopicsResponse, Unit]
  ): Request[ListTopicsResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(
    params: ListUserGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]
  ): Request[ListUserGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Lists all of the VPC connections in the current set Amazon Web Services Region of an Amazon Web Services account.
    */
  def listVPCConnections(): Request[ListVPCConnectionsResponse, AWSError] = js.native
  def listVPCConnections(callback: js.Function2[/* err */ AWSError, /* data */ ListVPCConnectionsResponse, Unit]): Request[ListVPCConnectionsResponse, AWSError] = js.native
  /**
    * Lists all of the VPC connections in the current set Amazon Web Services Region of an Amazon Web Services account.
    */
  def listVPCConnections(params: ListVPCConnectionsRequest): Request[ListVPCConnectionsResponse, AWSError] = js.native
  def listVPCConnections(
    params: ListVPCConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVPCConnectionsResponse, Unit]
  ): Request[ListVPCConnectionsResponse, AWSError] = js.native
  
  /**
    * Creates or updates the dataset refresh properties for the dataset.
    */
  def putDataSetRefreshProperties(): Request[PutDataSetRefreshPropertiesResponse, AWSError] = js.native
  def putDataSetRefreshProperties(callback: js.Function2[/* err */ AWSError, /* data */ PutDataSetRefreshPropertiesResponse, Unit]): Request[PutDataSetRefreshPropertiesResponse, AWSError] = js.native
  /**
    * Creates or updates the dataset refresh properties for the dataset.
    */
  def putDataSetRefreshProperties(params: PutDataSetRefreshPropertiesRequest): Request[PutDataSetRefreshPropertiesResponse, AWSError] = js.native
  def putDataSetRefreshProperties(
    params: PutDataSetRefreshPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataSetRefreshPropertiesResponse, Unit]
  ): Request[PutDataSetRefreshPropertiesResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon QuickSight user whose identity is associated with the Identity and Access Management (IAM) identity or role specified in the request. When you register a new user from the Amazon QuickSight API, Amazon QuickSight generates a registration URL. The user accesses this registration URL to create their account. Amazon QuickSight doesn't send a registration email to users who are registered from the Amazon QuickSight API. If you want new users to receive a registration email, then add those users in the Amazon QuickSight console. For more information on registering a new user in the Amazon QuickSight console, see  Inviting users to access Amazon QuickSight.
    */
  def registerUser(): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user whose identity is associated with the Identity and Access Management (IAM) identity or role specified in the request. When you register a new user from the Amazon QuickSight API, Amazon QuickSight generates a registration URL. The user accesses this registration URL to create their account. Amazon QuickSight doesn't send a registration email to users who are registered from the Amazon QuickSight API. If you want new users to receive a registration email, then add those users in the Amazon QuickSight console. For more information on registering a new user in the Amazon QuickSight console, see  Inviting users to access Amazon QuickSight.
    */
  def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(
    params: RegisterUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]
  ): Request[RegisterUserResponse, AWSError] = js.native
  
  /**
    * Restores an analysis.
    */
  def restoreAnalysis(): Request[RestoreAnalysisResponse, AWSError] = js.native
  def restoreAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ RestoreAnalysisResponse, Unit]): Request[RestoreAnalysisResponse, AWSError] = js.native
  /**
    * Restores an analysis.
    */
  def restoreAnalysis(params: RestoreAnalysisRequest): Request[RestoreAnalysisResponse, AWSError] = js.native
  def restoreAnalysis(
    params: RestoreAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreAnalysisResponse, Unit]
  ): Request[RestoreAnalysisResponse, AWSError] = js.native
  
  /**
    * Searches for analyses that belong to the user specified in the filter.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def searchAnalyses(): Request[SearchAnalysesResponse, AWSError] = js.native
  def searchAnalyses(callback: js.Function2[/* err */ AWSError, /* data */ SearchAnalysesResponse, Unit]): Request[SearchAnalysesResponse, AWSError] = js.native
  /**
    * Searches for analyses that belong to the user specified in the filter.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def searchAnalyses(params: SearchAnalysesRequest): Request[SearchAnalysesResponse, AWSError] = js.native
  def searchAnalyses(
    params: SearchAnalysesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAnalysesResponse, Unit]
  ): Request[SearchAnalysesResponse, AWSError] = js.native
  
  /**
    * Searches for dashboards that belong to a user.   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def searchDashboards(): Request[SearchDashboardsResponse, AWSError] = js.native
  def searchDashboards(callback: js.Function2[/* err */ AWSError, /* data */ SearchDashboardsResponse, Unit]): Request[SearchDashboardsResponse, AWSError] = js.native
  /**
    * Searches for dashboards that belong to a user.   This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def searchDashboards(params: SearchDashboardsRequest): Request[SearchDashboardsResponse, AWSError] = js.native
  def searchDashboards(
    params: SearchDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDashboardsResponse, Unit]
  ): Request[SearchDashboardsResponse, AWSError] = js.native
  
  /**
    * Use the SearchDataSets operation to search for datasets that belong to an account.
    */
  def searchDataSets(): Request[SearchDataSetsResponse, AWSError] = js.native
  def searchDataSets(callback: js.Function2[/* err */ AWSError, /* data */ SearchDataSetsResponse, Unit]): Request[SearchDataSetsResponse, AWSError] = js.native
  /**
    * Use the SearchDataSets operation to search for datasets that belong to an account.
    */
  def searchDataSets(params: SearchDataSetsRequest): Request[SearchDataSetsResponse, AWSError] = js.native
  def searchDataSets(
    params: SearchDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDataSetsResponse, Unit]
  ): Request[SearchDataSetsResponse, AWSError] = js.native
  
  /**
    * Use the SearchDataSources operation to search for data sources that belong to an account.
    */
  def searchDataSources(): Request[SearchDataSourcesResponse, AWSError] = js.native
  def searchDataSources(callback: js.Function2[/* err */ AWSError, /* data */ SearchDataSourcesResponse, Unit]): Request[SearchDataSourcesResponse, AWSError] = js.native
  /**
    * Use the SearchDataSources operation to search for data sources that belong to an account.
    */
  def searchDataSources(params: SearchDataSourcesRequest): Request[SearchDataSourcesResponse, AWSError] = js.native
  def searchDataSources(
    params: SearchDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDataSourcesResponse, Unit]
  ): Request[SearchDataSourcesResponse, AWSError] = js.native
  
  /**
    * Searches the subfolders in a folder.
    */
  def searchFolders(): Request[SearchFoldersResponse, AWSError] = js.native
  def searchFolders(callback: js.Function2[/* err */ AWSError, /* data */ SearchFoldersResponse, Unit]): Request[SearchFoldersResponse, AWSError] = js.native
  /**
    * Searches the subfolders in a folder.
    */
  def searchFolders(params: SearchFoldersRequest): Request[SearchFoldersResponse, AWSError] = js.native
  def searchFolders(
    params: SearchFoldersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFoldersResponse, Unit]
  ): Request[SearchFoldersResponse, AWSError] = js.native
  
  /**
    * Use the SearchGroups operation to search groups in a specified Amazon QuickSight namespace using the supplied filters.
    */
  def searchGroups(): Request[SearchGroupsResponse, AWSError] = js.native
  def searchGroups(callback: js.Function2[/* err */ AWSError, /* data */ SearchGroupsResponse, Unit]): Request[SearchGroupsResponse, AWSError] = js.native
  /**
    * Use the SearchGroups operation to search groups in a specified Amazon QuickSight namespace using the supplied filters.
    */
  def searchGroups(params: SearchGroupsRequest): Request[SearchGroupsResponse, AWSError] = js.native
  def searchGroups(
    params: SearchGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchGroupsResponse, Unit]
  ): Request[SearchGroupsResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. Amazon QuickSight supports tagging on data set, data source, dashboard, template, and topic.  Tagging for Amazon QuickSight works in a similar way to tagging for other Amazon Web Services services, except for the following:   You can't use tags to track costs for Amazon QuickSight. This isn't possible because you can't tag the resources that Amazon QuickSight costs are based on, for example Amazon QuickSight storage capacity (SPICE), number of users, type of users, and usage metrics.   Amazon QuickSight doesn't currently support the tag editor for Resource Groups.  
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified Amazon QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. Amazon QuickSight supports tagging on data set, data source, dashboard, template, and topic.  Tagging for Amazon QuickSight works in a similar way to tagging for other Amazon Web Services services, except for the following:   You can't use tags to track costs for Amazon QuickSight. This isn't possible because you can't tag the resources that Amazon QuickSight costs are based on, for example Amazon QuickSight storage capacity (SPICE), number of users, type of users, and usage metrics.   Amazon QuickSight doesn't currently support the tag editor for Resource Groups.  
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, the only customization that you can use is a theme. You can use customizations for your Amazon Web Services account or, if you specify a namespace, for a Amazon QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an Amazon Web Services account. To find out which customizations apply, use the DescribeAccountCustomization API operation. 
    */
  def updateAccountCustomization(): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  def updateAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountCustomizationResponse, Unit]): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  /**
    * Updates Amazon QuickSight customizations for the current Amazon Web Services Region. Currently, the only customization that you can use is a theme. You can use customizations for your Amazon Web Services account or, if you specify a namespace, for a Amazon QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an Amazon Web Services account. To find out which customizations apply, use the DescribeAccountCustomization API operation. 
    */
  def updateAccountCustomization(params: UpdateAccountCustomizationRequest): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  def updateAccountCustomization(
    params: UpdateAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountCustomizationResponse, Unit]
  ): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Updates the Amazon QuickSight settings in your Amazon Web Services account.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  /**
    * Updates the Amazon QuickSight settings in your Amazon Web Services account.
    */
  def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]
  ): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Updates an analysis in Amazon QuickSight
    */
  def updateAnalysis(): Request[UpdateAnalysisResponse, AWSError] = js.native
  def updateAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisResponse, Unit]): Request[UpdateAnalysisResponse, AWSError] = js.native
  /**
    * Updates an analysis in Amazon QuickSight
    */
  def updateAnalysis(params: UpdateAnalysisRequest): Request[UpdateAnalysisResponse, AWSError] = js.native
  def updateAnalysis(
    params: UpdateAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisResponse, Unit]
  ): Request[UpdateAnalysisResponse, AWSError] = js.native
  
  /**
    * Updates the read and write permissions for an analysis.
    */
  def updateAnalysisPermissions(): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  def updateAnalysisPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisPermissionsResponse, Unit]): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  /**
    * Updates the read and write permissions for an analysis.
    */
  def updateAnalysisPermissions(params: UpdateAnalysisPermissionsRequest): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  def updateAnalysisPermissions(
    params: UpdateAnalysisPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisPermissionsResponse, Unit]
  ): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a dashboard in an Amazon Web Services account.  Updating a Dashboard creates a new dashboard version but does not immediately publish the new version. You can update the published version of a dashboard by using the  UpdateDashboardPublishedVersion  API operation. 
    */
  def updateDashboard(): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]): Request[UpdateDashboardResponse, AWSError] = js.native
  /**
    * Updates a dashboard in an Amazon Web Services account.  Updating a Dashboard creates a new dashboard version but does not immediately publish the new version. You can update the published version of a dashboard by using the  UpdateDashboardPublishedVersion  API operation. 
    */
  def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(
    params: UpdateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]
  ): Request[UpdateDashboardResponse, AWSError] = js.native
  
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(params: UpdateDashboardPermissionsRequest): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(
    params: UpdateDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]
  ): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(params: UpdateDashboardPublishedVersionRequest): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    params: UpdateDashboardPublishedVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  
  /**
    * Updates a dataset. This operation doesn't support datasets that include uploaded files as a source. Partial updates are not supported by this operation.
    */
  def updateDataSet(): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * Updates a dataset. This operation doesn't support datasets that include uploaded files as a source. Partial updates are not supported by this operation.
    */
  def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(
    params: UpdateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]
  ): Request[UpdateDataSetResponse, AWSError] = js.native
  
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(params: UpdateDataSetPermissionsRequest): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(
    params: UpdateDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]
  ): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a data source.
    */
  def updateDataSource(): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates a data source.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]
  ): Request[UpdateDataSourceResponse, AWSError] = js.native
  
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(params: UpdateDataSourcePermissionsRequest): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(
    params: UpdateDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]
  ): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates the name of a folder.
    */
  def updateFolder(): Request[UpdateFolderResponse, AWSError] = js.native
  def updateFolder(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFolderResponse, Unit]): Request[UpdateFolderResponse, AWSError] = js.native
  /**
    * Updates the name of a folder.
    */
  def updateFolder(params: UpdateFolderRequest): Request[UpdateFolderResponse, AWSError] = js.native
  def updateFolder(
    params: UpdateFolderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFolderResponse, Unit]
  ): Request[UpdateFolderResponse, AWSError] = js.native
  
  /**
    * Updates permissions of a folder.
    */
  def updateFolderPermissions(): Request[UpdateFolderPermissionsResponse, AWSError] = js.native
  def updateFolderPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFolderPermissionsResponse, Unit]): Request[UpdateFolderPermissionsResponse, AWSError] = js.native
  /**
    * Updates permissions of a folder.
    */
  def updateFolderPermissions(params: UpdateFolderPermissionsRequest): Request[UpdateFolderPermissionsResponse, AWSError] = js.native
  def updateFolderPermissions(
    params: UpdateFolderPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFolderPermissionsResponse, Unit]
  ): Request[UpdateFolderPermissionsResponse, AWSError] = js.native
  
  /**
    * Changes a group description. 
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Changes a group description. 
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request. This overwrites all of the users included in Identities. 
    */
  def updateIAMPolicyAssignment(): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request. This overwrites all of the users included in Identities. 
    */
  def updateIAMPolicyAssignment(params: UpdateIAMPolicyAssignmentRequest): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(
    params: UpdateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]
  ): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Updates the content and status of IP rules. To use this operation, you must provide the entire map of rules. You can use the DescribeIpRestriction operation to get the current rule map.
    */
  def updateIpRestriction(): Request[UpdateIpRestrictionResponse, AWSError] = js.native
  def updateIpRestriction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIpRestrictionResponse, Unit]): Request[UpdateIpRestrictionResponse, AWSError] = js.native
  /**
    * Updates the content and status of IP rules. To use this operation, you must provide the entire map of rules. You can use the DescribeIpRestriction operation to get the current rule map.
    */
  def updateIpRestriction(params: UpdateIpRestrictionRequest): Request[UpdateIpRestrictionResponse, AWSError] = js.native
  def updateIpRestriction(
    params: UpdateIpRestrictionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIpRestrictionResponse, Unit]
  ): Request[UpdateIpRestrictionResponse, AWSError] = js.native
  
  /**
    * Use the UpdatePublicSharingSettings operation to turn on or turn off the public sharing settings of an Amazon QuickSight dashboard. To use this operation, turn on session capacity pricing for your Amazon QuickSight account. Before you can turn on public sharing on your account, make sure to give public sharing permissions to an administrative user in the Identity and Access Management (IAM) console. For more information on using IAM with Amazon QuickSight, see Using Amazon QuickSight with IAM in the Amazon QuickSight User Guide.
    */
  def updatePublicSharingSettings(): Request[UpdatePublicSharingSettingsResponse, AWSError] = js.native
  def updatePublicSharingSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicSharingSettingsResponse, Unit]): Request[UpdatePublicSharingSettingsResponse, AWSError] = js.native
  /**
    * Use the UpdatePublicSharingSettings operation to turn on or turn off the public sharing settings of an Amazon QuickSight dashboard. To use this operation, turn on session capacity pricing for your Amazon QuickSight account. Before you can turn on public sharing on your account, make sure to give public sharing permissions to an administrative user in the Identity and Access Management (IAM) console. For more information on using IAM with Amazon QuickSight, see Using Amazon QuickSight with IAM in the Amazon QuickSight User Guide.
    */
  def updatePublicSharingSettings(params: UpdatePublicSharingSettingsRequest): Request[UpdatePublicSharingSettingsResponse, AWSError] = js.native
  def updatePublicSharingSettings(
    params: UpdatePublicSharingSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicSharingSettingsResponse, Unit]
  ): Request[UpdatePublicSharingSettingsResponse, AWSError] = js.native
  
  /**
    * Updates a refresh schedule for a dataset.
    */
  def updateRefreshSchedule(): Request[UpdateRefreshScheduleResponse, AWSError] = js.native
  def updateRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRefreshScheduleResponse, Unit]): Request[UpdateRefreshScheduleResponse, AWSError] = js.native
  /**
    * Updates a refresh schedule for a dataset.
    */
  def updateRefreshSchedule(params: UpdateRefreshScheduleRequest): Request[UpdateRefreshScheduleResponse, AWSError] = js.native
  def updateRefreshSchedule(
    params: UpdateRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRefreshScheduleResponse, Unit]
  ): Request[UpdateRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(
    params: UpdateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]
  ): Request[UpdateTemplateResponse, AWSError] = js.native
  
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(params: UpdateTemplateAliasRequest): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(
    params: UpdateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]
  ): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(params: UpdateTemplatePermissionsRequest): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(
    params: UpdateTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]
  ): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a theme.
    */
  def updateTheme(): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]): Request[UpdateThemeResponse, AWSError] = js.native
  /**
    * Updates a theme.
    */
  def updateTheme(params: UpdateThemeRequest): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(
    params: UpdateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]
  ): Request[UpdateThemeResponse, AWSError] = js.native
  
  /**
    * Updates an alias of a theme.
    */
  def updateThemeAlias(): Request[UpdateThemeAliasResponse, AWSError] = js.native
  def updateThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeAliasResponse, Unit]): Request[UpdateThemeAliasResponse, AWSError] = js.native
  /**
    * Updates an alias of a theme.
    */
  def updateThemeAlias(params: UpdateThemeAliasRequest): Request[UpdateThemeAliasResponse, AWSError] = js.native
  def updateThemeAlias(
    params: UpdateThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeAliasResponse, Unit]
  ): Request[UpdateThemeAliasResponse, AWSError] = js.native
  
  /**
    * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on, for example "quicksight:DescribeTheme". Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions, which are user, owner, or no permissions:    User    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"      Owner    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"     "quicksight:DeleteTheme"     "quicksight:UpdateTheme"     "quicksight:CreateThemeAlias"     "quicksight:DeleteThemeAlias"     "quicksight:UpdateThemeAlias"     "quicksight:UpdateThemePermissions"     "quicksight:DescribeThemePermissions"      To specify no permissions, omit the permissions list.  
    */
  def updateThemePermissions(): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  def updateThemePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemePermissionsResponse, Unit]): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on, for example "quicksight:DescribeTheme". Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions, which are user, owner, or no permissions:    User    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"      Owner    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"     "quicksight:DeleteTheme"     "quicksight:UpdateTheme"     "quicksight:CreateThemeAlias"     "quicksight:DeleteThemeAlias"     "quicksight:UpdateThemeAlias"     "quicksight:UpdateThemePermissions"     "quicksight:DescribeThemePermissions"      To specify no permissions, omit the permissions list.  
    */
  def updateThemePermissions(params: UpdateThemePermissionsRequest): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  def updateThemePermissions(
    params: UpdateThemePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemePermissionsResponse, Unit]
  ): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a topic.
    */
  def updateTopic(): Request[UpdateTopicResponse, AWSError] = js.native
  def updateTopic(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicResponse, Unit]): Request[UpdateTopicResponse, AWSError] = js.native
  /**
    * Updates a topic.
    */
  def updateTopic(params: UpdateTopicRequest): Request[UpdateTopicResponse, AWSError] = js.native
  def updateTopic(
    params: UpdateTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicResponse, Unit]
  ): Request[UpdateTopicResponse, AWSError] = js.native
  
  /**
    * Updates the permissions of a topic.
    */
  def updateTopicPermissions(): Request[UpdateTopicPermissionsResponse, AWSError] = js.native
  def updateTopicPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicPermissionsResponse, Unit]): Request[UpdateTopicPermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions of a topic.
    */
  def updateTopicPermissions(params: UpdateTopicPermissionsRequest): Request[UpdateTopicPermissionsResponse, AWSError] = js.native
  def updateTopicPermissions(
    params: UpdateTopicPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicPermissionsResponse, Unit]
  ): Request[UpdateTopicPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a topic refresh schedule.
    */
  def updateTopicRefreshSchedule(): Request[UpdateTopicRefreshScheduleResponse, AWSError] = js.native
  def updateTopicRefreshSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicRefreshScheduleResponse, Unit]): Request[UpdateTopicRefreshScheduleResponse, AWSError] = js.native
  /**
    * Updates a topic refresh schedule.
    */
  def updateTopicRefreshSchedule(params: UpdateTopicRefreshScheduleRequest): Request[UpdateTopicRefreshScheduleResponse, AWSError] = js.native
  def updateTopicRefreshSchedule(
    params: UpdateTopicRefreshScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTopicRefreshScheduleResponse, Unit]
  ): Request[UpdateTopicRefreshScheduleResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
  
  /**
    * Updates a VPC connection.
    */
  def updateVPCConnection(): Request[UpdateVPCConnectionResponse, AWSError] = js.native
  def updateVPCConnection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVPCConnectionResponse, Unit]): Request[UpdateVPCConnectionResponse, AWSError] = js.native
  /**
    * Updates a VPC connection.
    */
  def updateVPCConnection(params: UpdateVPCConnectionRequest): Request[UpdateVPCConnectionResponse, AWSError] = js.native
  def updateVPCConnection(
    params: UpdateVPCConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVPCConnectionResponse, Unit]
  ): Request[UpdateVPCConnectionResponse, AWSError] = js.native
}
