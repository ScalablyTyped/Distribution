package typings.awsSdk.clientsResiliencehubMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resiliencehub extends Service {
  
  /**
    * Adds the resource mapping for the draft application version. You can also update an existing resource mapping to a new physical resource.
    */
  def addDraftAppVersionResourceMappings(): Request[AddDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  def addDraftAppVersionResourceMappings(
    callback: js.Function2[/* err */ AWSError, /* data */ AddDraftAppVersionResourceMappingsResponse, Unit]
  ): Request[AddDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  /**
    * Adds the resource mapping for the draft application version. You can also update an existing resource mapping to a new physical resource.
    */
  def addDraftAppVersionResourceMappings(params: AddDraftAppVersionResourceMappingsRequest): Request[AddDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  def addDraftAppVersionResourceMappings(
    params: AddDraftAppVersionResourceMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddDraftAppVersionResourceMappingsResponse, Unit]
  ): Request[AddDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Resiliencehub: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Resilience Hub application. An Resilience Hub application is a collection of Amazon Web Services resources structured to prevent and recover Amazon Web Services application disruptions. To describe an Resilience Hub application, you provide an application name, resources from one or more CloudFormation stacks, Resource Groups, Terraform state files, AppRegistry applications, and an appropriate resiliency policy. For more information about the number of resources supported per application, see Service Quotas. After you create an Resilience Hub application, you publish it so that you can run a resiliency assessment on it. You can then use recommendations from the assessment to improve resiliency by running another assessment, comparing results, and then iterating the process until you achieve your goals for recovery time objective (RTO) and recovery point objective (RPO).
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates an Resilience Hub application. An Resilience Hub application is a collection of Amazon Web Services resources structured to prevent and recover Amazon Web Services application disruptions. To describe an Resilience Hub application, you provide an application name, resources from one or more CloudFormation stacks, Resource Groups, Terraform state files, AppRegistry applications, and an appropriate resiliency policy. For more information about the number of resources supported per application, see Service Quotas. After you create an Resilience Hub application, you publish it so that you can run a resiliency assessment on it. You can then use recommendations from the assessment to improve resiliency by running another assessment, comparing results, and then iterating the process until you achieve your goals for recovery time objective (RTO) and recovery point objective (RPO).
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  
  /**
    * Creates a new Application Component in the Resilience Hub application.  This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def createAppVersionAppComponent(): Request[CreateAppVersionAppComponentResponse, AWSError] = js.native
  def createAppVersionAppComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppVersionAppComponentResponse, Unit]): Request[CreateAppVersionAppComponentResponse, AWSError] = js.native
  /**
    * Creates a new Application Component in the Resilience Hub application.  This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def createAppVersionAppComponent(params: CreateAppVersionAppComponentRequest): Request[CreateAppVersionAppComponentResponse, AWSError] = js.native
  def createAppVersionAppComponent(
    params: CreateAppVersionAppComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppVersionAppComponentResponse, Unit]
  ): Request[CreateAppVersionAppComponentResponse, AWSError] = js.native
  
  /**
    * Adds a resource to the Resilience Hub application and assigns it to the specified Application Components. If you specify a new Application Component, Resilience Hub will automatically create the Application Component.    This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   To update application version with new physicalResourceID, you must call ResolveAppVersionResources API.   
    */
  def createAppVersionResource(): Request[CreateAppVersionResourceResponse, AWSError] = js.native
  def createAppVersionResource(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppVersionResourceResponse, Unit]): Request[CreateAppVersionResourceResponse, AWSError] = js.native
  /**
    * Adds a resource to the Resilience Hub application and assigns it to the specified Application Components. If you specify a new Application Component, Resilience Hub will automatically create the Application Component.    This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   To update application version with new physicalResourceID, you must call ResolveAppVersionResources API.   
    */
  def createAppVersionResource(params: CreateAppVersionResourceRequest): Request[CreateAppVersionResourceResponse, AWSError] = js.native
  def createAppVersionResource(
    params: CreateAppVersionResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppVersionResourceResponse, Unit]
  ): Request[CreateAppVersionResourceResponse, AWSError] = js.native
  
  /**
    * Creates a new recommendation template for the Resilience Hub application.
    */
  def createRecommendationTemplate(): Request[CreateRecommendationTemplateResponse, AWSError] = js.native
  def createRecommendationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecommendationTemplateResponse, Unit]): Request[CreateRecommendationTemplateResponse, AWSError] = js.native
  /**
    * Creates a new recommendation template for the Resilience Hub application.
    */
  def createRecommendationTemplate(params: CreateRecommendationTemplateRequest): Request[CreateRecommendationTemplateResponse, AWSError] = js.native
  def createRecommendationTemplate(
    params: CreateRecommendationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecommendationTemplateResponse, Unit]
  ): Request[CreateRecommendationTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a resiliency policy for an application.
    */
  def createResiliencyPolicy(): Request[CreateResiliencyPolicyResponse, AWSError] = js.native
  def createResiliencyPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateResiliencyPolicyResponse, Unit]): Request[CreateResiliencyPolicyResponse, AWSError] = js.native
  /**
    * Creates a resiliency policy for an application.
    */
  def createResiliencyPolicy(params: CreateResiliencyPolicyRequest): Request[CreateResiliencyPolicyResponse, AWSError] = js.native
  def createResiliencyPolicy(
    params: CreateResiliencyPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResiliencyPolicyResponse, Unit]
  ): Request[CreateResiliencyPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an Resilience Hub application. This is a destructive action that can't be undone.
    */
  def deleteApp(): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Deletes an Resilience Hub application. This is a destructive action that can't be undone.
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]
  ): Request[DeleteAppResponse, AWSError] = js.native
  
  /**
    * Deletes an Resilience Hub application assessment. This is a destructive action that can't be undone.
    */
  def deleteAppAssessment(): Request[DeleteAppAssessmentResponse, AWSError] = js.native
  def deleteAppAssessment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppAssessmentResponse, Unit]): Request[DeleteAppAssessmentResponse, AWSError] = js.native
  /**
    * Deletes an Resilience Hub application assessment. This is a destructive action that can't be undone.
    */
  def deleteAppAssessment(params: DeleteAppAssessmentRequest): Request[DeleteAppAssessmentResponse, AWSError] = js.native
  def deleteAppAssessment(
    params: DeleteAppAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppAssessmentResponse, Unit]
  ): Request[DeleteAppAssessmentResponse, AWSError] = js.native
  
  /**
    * Deletes the input source and all of its imported resources from the Resilience Hub application.
    */
  def deleteAppInputSource(): Request[DeleteAppInputSourceResponse, AWSError] = js.native
  def deleteAppInputSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppInputSourceResponse, Unit]): Request[DeleteAppInputSourceResponse, AWSError] = js.native
  /**
    * Deletes the input source and all of its imported resources from the Resilience Hub application.
    */
  def deleteAppInputSource(params: DeleteAppInputSourceRequest): Request[DeleteAppInputSourceResponse, AWSError] = js.native
  def deleteAppInputSource(
    params: DeleteAppInputSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppInputSourceResponse, Unit]
  ): Request[DeleteAppInputSourceResponse, AWSError] = js.native
  
  /**
    * Deletes an Application Component from the Resilience Hub application.    This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   You will not be able to delete an Application Component if it has resources associated with it.   
    */
  def deleteAppVersionAppComponent(): Request[DeleteAppVersionAppComponentResponse, AWSError] = js.native
  def deleteAppVersionAppComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppVersionAppComponentResponse, Unit]): Request[DeleteAppVersionAppComponentResponse, AWSError] = js.native
  /**
    * Deletes an Application Component from the Resilience Hub application.    This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   You will not be able to delete an Application Component if it has resources associated with it.   
    */
  def deleteAppVersionAppComponent(params: DeleteAppVersionAppComponentRequest): Request[DeleteAppVersionAppComponentResponse, AWSError] = js.native
  def deleteAppVersionAppComponent(
    params: DeleteAppVersionAppComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppVersionAppComponentResponse, Unit]
  ): Request[DeleteAppVersionAppComponentResponse, AWSError] = js.native
  
  /**
    * Deletes a resource from the Resilience Hub application.    You can only delete a manually added resource. To exclude non-manually added resources, use the UpdateAppVersionResource API.   This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   
    */
  def deleteAppVersionResource(): Request[DeleteAppVersionResourceResponse, AWSError] = js.native
  def deleteAppVersionResource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppVersionResourceResponse, Unit]): Request[DeleteAppVersionResourceResponse, AWSError] = js.native
  /**
    * Deletes a resource from the Resilience Hub application.    You can only delete a manually added resource. To exclude non-manually added resources, use the UpdateAppVersionResource API.   This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   
    */
  def deleteAppVersionResource(params: DeleteAppVersionResourceRequest): Request[DeleteAppVersionResourceResponse, AWSError] = js.native
  def deleteAppVersionResource(
    params: DeleteAppVersionResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppVersionResourceResponse, Unit]
  ): Request[DeleteAppVersionResourceResponse, AWSError] = js.native
  
  /**
    * Deletes a recommendation template. This is a destructive action that can't be undone.
    */
  def deleteRecommendationTemplate(): Request[DeleteRecommendationTemplateResponse, AWSError] = js.native
  def deleteRecommendationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecommendationTemplateResponse, Unit]): Request[DeleteRecommendationTemplateResponse, AWSError] = js.native
  /**
    * Deletes a recommendation template. This is a destructive action that can't be undone.
    */
  def deleteRecommendationTemplate(params: DeleteRecommendationTemplateRequest): Request[DeleteRecommendationTemplateResponse, AWSError] = js.native
  def deleteRecommendationTemplate(
    params: DeleteRecommendationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecommendationTemplateResponse, Unit]
  ): Request[DeleteRecommendationTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a resiliency policy. This is a destructive action that can't be undone.
    */
  def deleteResiliencyPolicy(): Request[DeleteResiliencyPolicyResponse, AWSError] = js.native
  def deleteResiliencyPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResiliencyPolicyResponse, Unit]): Request[DeleteResiliencyPolicyResponse, AWSError] = js.native
  /**
    * Deletes a resiliency policy. This is a destructive action that can't be undone.
    */
  def deleteResiliencyPolicy(params: DeleteResiliencyPolicyRequest): Request[DeleteResiliencyPolicyResponse, AWSError] = js.native
  def deleteResiliencyPolicy(
    params: DeleteResiliencyPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResiliencyPolicyResponse, Unit]
  ): Request[DeleteResiliencyPolicyResponse, AWSError] = js.native
  
  /**
    * Describes an Resilience Hub application.
    */
  def describeApp(): Request[DescribeAppResponse, AWSError] = js.native
  def describeApp(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppResponse, Unit]): Request[DescribeAppResponse, AWSError] = js.native
  /**
    * Describes an Resilience Hub application.
    */
  def describeApp(params: DescribeAppRequest): Request[DescribeAppResponse, AWSError] = js.native
  def describeApp(
    params: DescribeAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppResponse, Unit]
  ): Request[DescribeAppResponse, AWSError] = js.native
  
  /**
    * Describes an assessment for an Resilience Hub application.
    */
  def describeAppAssessment(): Request[DescribeAppAssessmentResponse, AWSError] = js.native
  def describeAppAssessment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppAssessmentResponse, Unit]): Request[DescribeAppAssessmentResponse, AWSError] = js.native
  /**
    * Describes an assessment for an Resilience Hub application.
    */
  def describeAppAssessment(params: DescribeAppAssessmentRequest): Request[DescribeAppAssessmentResponse, AWSError] = js.native
  def describeAppAssessment(
    params: DescribeAppAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppAssessmentResponse, Unit]
  ): Request[DescribeAppAssessmentResponse, AWSError] = js.native
  
  /**
    * Describes the Resilience Hub application version.
    */
  def describeAppVersion(): Request[DescribeAppVersionResponse, AWSError] = js.native
  def describeAppVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionResponse, Unit]): Request[DescribeAppVersionResponse, AWSError] = js.native
  /**
    * Describes the Resilience Hub application version.
    */
  def describeAppVersion(params: DescribeAppVersionRequest): Request[DescribeAppVersionResponse, AWSError] = js.native
  def describeAppVersion(
    params: DescribeAppVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionResponse, Unit]
  ): Request[DescribeAppVersionResponse, AWSError] = js.native
  
  /**
    * Describes an Application Component in the Resilience Hub application.
    */
  def describeAppVersionAppComponent(): Request[DescribeAppVersionAppComponentResponse, AWSError] = js.native
  def describeAppVersionAppComponent(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionAppComponentResponse, Unit]
  ): Request[DescribeAppVersionAppComponentResponse, AWSError] = js.native
  /**
    * Describes an Application Component in the Resilience Hub application.
    */
  def describeAppVersionAppComponent(params: DescribeAppVersionAppComponentRequest): Request[DescribeAppVersionAppComponentResponse, AWSError] = js.native
  def describeAppVersionAppComponent(
    params: DescribeAppVersionAppComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionAppComponentResponse, Unit]
  ): Request[DescribeAppVersionAppComponentResponse, AWSError] = js.native
  
  /**
    * Describes a resource of the Resilience Hub application.  This API accepts only one of the following parameters to descibe the resource:    resourceName     logicalResourceId     physicalResourceId (Along with physicalResourceId, you can also provide awsAccountId, and awsRegion)   
    */
  def describeAppVersionResource(): Request[DescribeAppVersionResourceResponse, AWSError] = js.native
  def describeAppVersionResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionResourceResponse, Unit]): Request[DescribeAppVersionResourceResponse, AWSError] = js.native
  /**
    * Describes a resource of the Resilience Hub application.  This API accepts only one of the following parameters to descibe the resource:    resourceName     logicalResourceId     physicalResourceId (Along with physicalResourceId, you can also provide awsAccountId, and awsRegion)   
    */
  def describeAppVersionResource(params: DescribeAppVersionResourceRequest): Request[DescribeAppVersionResourceResponse, AWSError] = js.native
  def describeAppVersionResource(
    params: DescribeAppVersionResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionResourceResponse, Unit]
  ): Request[DescribeAppVersionResourceResponse, AWSError] = js.native
  
  /**
    * Returns the resolution status for the specified resolution identifier for an application version. If resolutionId is not specified, the current resolution status is returned.
    */
  def describeAppVersionResourcesResolutionStatus(): Request[DescribeAppVersionResourcesResolutionStatusResponse, AWSError] = js.native
  def describeAppVersionResourcesResolutionStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAppVersionResourcesResolutionStatusResponse, 
      Unit
    ]
  ): Request[DescribeAppVersionResourcesResolutionStatusResponse, AWSError] = js.native
  /**
    * Returns the resolution status for the specified resolution identifier for an application version. If resolutionId is not specified, the current resolution status is returned.
    */
  def describeAppVersionResourcesResolutionStatus(params: DescribeAppVersionResourcesResolutionStatusRequest): Request[DescribeAppVersionResourcesResolutionStatusResponse, AWSError] = js.native
  def describeAppVersionResourcesResolutionStatus(
    params: DescribeAppVersionResourcesResolutionStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAppVersionResourcesResolutionStatusResponse, 
      Unit
    ]
  ): Request[DescribeAppVersionResourcesResolutionStatusResponse, AWSError] = js.native
  
  /**
    * Describes details about an Resilience Hub application.
    */
  def describeAppVersionTemplate(): Request[DescribeAppVersionTemplateResponse, AWSError] = js.native
  def describeAppVersionTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionTemplateResponse, Unit]): Request[DescribeAppVersionTemplateResponse, AWSError] = js.native
  /**
    * Describes details about an Resilience Hub application.
    */
  def describeAppVersionTemplate(params: DescribeAppVersionTemplateRequest): Request[DescribeAppVersionTemplateResponse, AWSError] = js.native
  def describeAppVersionTemplate(
    params: DescribeAppVersionTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppVersionTemplateResponse, Unit]
  ): Request[DescribeAppVersionTemplateResponse, AWSError] = js.native
  
  /**
    * Describes the status of importing resources to an application version.  If you get a 404 error with ResourceImportStatusNotFoundAppMetadataException, you must call importResourcesToDraftAppVersion after creating the application and before calling describeDraftAppVersionResourcesImportStatus to obtain the status. 
    */
  def describeDraftAppVersionResourcesImportStatus(): Request[DescribeDraftAppVersionResourcesImportStatusResponse, AWSError] = js.native
  def describeDraftAppVersionResourcesImportStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeDraftAppVersionResourcesImportStatusResponse, 
      Unit
    ]
  ): Request[DescribeDraftAppVersionResourcesImportStatusResponse, AWSError] = js.native
  /**
    * Describes the status of importing resources to an application version.  If you get a 404 error with ResourceImportStatusNotFoundAppMetadataException, you must call importResourcesToDraftAppVersion after creating the application and before calling describeDraftAppVersionResourcesImportStatus to obtain the status. 
    */
  def describeDraftAppVersionResourcesImportStatus(params: DescribeDraftAppVersionResourcesImportStatusRequest): Request[DescribeDraftAppVersionResourcesImportStatusResponse, AWSError] = js.native
  def describeDraftAppVersionResourcesImportStatus(
    params: DescribeDraftAppVersionResourcesImportStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeDraftAppVersionResourcesImportStatusResponse, 
      Unit
    ]
  ): Request[DescribeDraftAppVersionResourcesImportStatusResponse, AWSError] = js.native
  
  /**
    * Describes a specified resiliency policy for an Resilience Hub application. The returned policy object includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and more.
    */
  def describeResiliencyPolicy(): Request[DescribeResiliencyPolicyResponse, AWSError] = js.native
  def describeResiliencyPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResiliencyPolicyResponse, Unit]): Request[DescribeResiliencyPolicyResponse, AWSError] = js.native
  /**
    * Describes a specified resiliency policy for an Resilience Hub application. The returned policy object includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and more.
    */
  def describeResiliencyPolicy(params: DescribeResiliencyPolicyRequest): Request[DescribeResiliencyPolicyResponse, AWSError] = js.native
  def describeResiliencyPolicy(
    params: DescribeResiliencyPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResiliencyPolicyResponse, Unit]
  ): Request[DescribeResiliencyPolicyResponse, AWSError] = js.native
  
  /**
    * Imports resources to Resilience Hub application draft version from different input sources. For more information about the input sources supported by Resilience Hub, see Discover the structure and describe your Resilience Hub application.
    */
  def importResourcesToDraftAppVersion(): Request[ImportResourcesToDraftAppVersionResponse, AWSError] = js.native
  def importResourcesToDraftAppVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ ImportResourcesToDraftAppVersionResponse, Unit]
  ): Request[ImportResourcesToDraftAppVersionResponse, AWSError] = js.native
  /**
    * Imports resources to Resilience Hub application draft version from different input sources. For more information about the input sources supported by Resilience Hub, see Discover the structure and describe your Resilience Hub application.
    */
  def importResourcesToDraftAppVersion(params: ImportResourcesToDraftAppVersionRequest): Request[ImportResourcesToDraftAppVersionResponse, AWSError] = js.native
  def importResourcesToDraftAppVersion(
    params: ImportResourcesToDraftAppVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportResourcesToDraftAppVersionResponse, Unit]
  ): Request[ImportResourcesToDraftAppVersionResponse, AWSError] = js.native
  
  /**
    * Lists the alarm recommendations for an Resilience Hub application.
    */
  def listAlarmRecommendations(): Request[ListAlarmRecommendationsResponse, AWSError] = js.native
  def listAlarmRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmRecommendationsResponse, Unit]): Request[ListAlarmRecommendationsResponse, AWSError] = js.native
  /**
    * Lists the alarm recommendations for an Resilience Hub application.
    */
  def listAlarmRecommendations(params: ListAlarmRecommendationsRequest): Request[ListAlarmRecommendationsResponse, AWSError] = js.native
  def listAlarmRecommendations(
    params: ListAlarmRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmRecommendationsResponse, Unit]
  ): Request[ListAlarmRecommendationsResponse, AWSError] = js.native
  
  /**
    * Lists the assessments for an Resilience Hub application. You can use request parameters to refine the results for the response object.
    */
  def listAppAssessments(): Request[ListAppAssessmentsResponse, AWSError] = js.native
  def listAppAssessments(callback: js.Function2[/* err */ AWSError, /* data */ ListAppAssessmentsResponse, Unit]): Request[ListAppAssessmentsResponse, AWSError] = js.native
  /**
    * Lists the assessments for an Resilience Hub application. You can use request parameters to refine the results for the response object.
    */
  def listAppAssessments(params: ListAppAssessmentsRequest): Request[ListAppAssessmentsResponse, AWSError] = js.native
  def listAppAssessments(
    params: ListAppAssessmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppAssessmentsResponse, Unit]
  ): Request[ListAppAssessmentsResponse, AWSError] = js.native
  
  /**
    * Lists the compliances for an Resilience Hub Application Component.
    */
  def listAppComponentCompliances(): Request[ListAppComponentCompliancesResponse, AWSError] = js.native
  def listAppComponentCompliances(callback: js.Function2[/* err */ AWSError, /* data */ ListAppComponentCompliancesResponse, Unit]): Request[ListAppComponentCompliancesResponse, AWSError] = js.native
  /**
    * Lists the compliances for an Resilience Hub Application Component.
    */
  def listAppComponentCompliances(params: ListAppComponentCompliancesRequest): Request[ListAppComponentCompliancesResponse, AWSError] = js.native
  def listAppComponentCompliances(
    params: ListAppComponentCompliancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppComponentCompliancesResponse, Unit]
  ): Request[ListAppComponentCompliancesResponse, AWSError] = js.native
  
  /**
    * Lists the recommendations for an Resilience Hub Application Component.
    */
  def listAppComponentRecommendations(): Request[ListAppComponentRecommendationsResponse, AWSError] = js.native
  def listAppComponentRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppComponentRecommendationsResponse, Unit]
  ): Request[ListAppComponentRecommendationsResponse, AWSError] = js.native
  /**
    * Lists the recommendations for an Resilience Hub Application Component.
    */
  def listAppComponentRecommendations(params: ListAppComponentRecommendationsRequest): Request[ListAppComponentRecommendationsResponse, AWSError] = js.native
  def listAppComponentRecommendations(
    params: ListAppComponentRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppComponentRecommendationsResponse, Unit]
  ): Request[ListAppComponentRecommendationsResponse, AWSError] = js.native
  
  /**
    * Lists all the input sources of the Resilience Hub application. For more information about the input sources supported by Resilience Hub, see Discover the structure and describe your Resilience Hub application.
    */
  def listAppInputSources(): Request[ListAppInputSourcesResponse, AWSError] = js.native
  def listAppInputSources(callback: js.Function2[/* err */ AWSError, /* data */ ListAppInputSourcesResponse, Unit]): Request[ListAppInputSourcesResponse, AWSError] = js.native
  /**
    * Lists all the input sources of the Resilience Hub application. For more information about the input sources supported by Resilience Hub, see Discover the structure and describe your Resilience Hub application.
    */
  def listAppInputSources(params: ListAppInputSourcesRequest): Request[ListAppInputSourcesResponse, AWSError] = js.native
  def listAppInputSources(
    params: ListAppInputSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppInputSourcesResponse, Unit]
  ): Request[ListAppInputSourcesResponse, AWSError] = js.native
  
  /**
    * Lists all the Application Components in the Resilience Hub application.
    */
  def listAppVersionAppComponents(): Request[ListAppVersionAppComponentsResponse, AWSError] = js.native
  def listAppVersionAppComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionAppComponentsResponse, Unit]): Request[ListAppVersionAppComponentsResponse, AWSError] = js.native
  /**
    * Lists all the Application Components in the Resilience Hub application.
    */
  def listAppVersionAppComponents(params: ListAppVersionAppComponentsRequest): Request[ListAppVersionAppComponentsResponse, AWSError] = js.native
  def listAppVersionAppComponents(
    params: ListAppVersionAppComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionAppComponentsResponse, Unit]
  ): Request[ListAppVersionAppComponentsResponse, AWSError] = js.native
  
  /**
    * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource identifiers, CloudFormation stacks, resource-groups, or an application registry app.
    */
  def listAppVersionResourceMappings(): Request[ListAppVersionResourceMappingsResponse, AWSError] = js.native
  def listAppVersionResourceMappings(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionResourceMappingsResponse, Unit]
  ): Request[ListAppVersionResourceMappingsResponse, AWSError] = js.native
  /**
    * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource identifiers, CloudFormation stacks, resource-groups, or an application registry app.
    */
  def listAppVersionResourceMappings(params: ListAppVersionResourceMappingsRequest): Request[ListAppVersionResourceMappingsResponse, AWSError] = js.native
  def listAppVersionResourceMappings(
    params: ListAppVersionResourceMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionResourceMappingsResponse, Unit]
  ): Request[ListAppVersionResourceMappingsResponse, AWSError] = js.native
  
  /**
    * Lists all the resources in an Resilience Hub application.
    */
  def listAppVersionResources(): Request[ListAppVersionResourcesResponse, AWSError] = js.native
  def listAppVersionResources(callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionResourcesResponse, Unit]): Request[ListAppVersionResourcesResponse, AWSError] = js.native
  /**
    * Lists all the resources in an Resilience Hub application.
    */
  def listAppVersionResources(params: ListAppVersionResourcesRequest): Request[ListAppVersionResourcesResponse, AWSError] = js.native
  def listAppVersionResources(
    params: ListAppVersionResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionResourcesResponse, Unit]
  ): Request[ListAppVersionResourcesResponse, AWSError] = js.native
  
  /**
    * Lists the different versions for the Resilience Hub applications.
    */
  def listAppVersions(): Request[ListAppVersionsResponse, AWSError] = js.native
  def listAppVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionsResponse, Unit]): Request[ListAppVersionsResponse, AWSError] = js.native
  /**
    * Lists the different versions for the Resilience Hub applications.
    */
  def listAppVersions(params: ListAppVersionsRequest): Request[ListAppVersionsResponse, AWSError] = js.native
  def listAppVersions(
    params: ListAppVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppVersionsResponse, Unit]
  ): Request[ListAppVersionsResponse, AWSError] = js.native
  
  /**
    * Lists your Resilience Hub applications.  You can filter applications using only one filter at a time or without using any filter. If you try to filter applications using multiple filters, you will get the following error:  An error occurred (ValidationException) when calling the ListApps operation: Only one filter is supported for this operation.  
    */
  def listApps(): Request[ListAppsResponse, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]): Request[ListAppsResponse, AWSError] = js.native
  /**
    * Lists your Resilience Hub applications.  You can filter applications using only one filter at a time or without using any filter. If you try to filter applications using multiple filters, you will get the following error:  An error occurred (ValidationException) when calling the ListApps operation: Only one filter is supported for this operation.  
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResponse, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]
  ): Request[ListAppsResponse, AWSError] = js.native
  
  /**
    * Lists the recommendation templates for the Resilience Hub applications.
    */
  def listRecommendationTemplates(): Request[ListRecommendationTemplatesResponse, AWSError] = js.native
  def listRecommendationTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationTemplatesResponse, Unit]): Request[ListRecommendationTemplatesResponse, AWSError] = js.native
  /**
    * Lists the recommendation templates for the Resilience Hub applications.
    */
  def listRecommendationTemplates(params: ListRecommendationTemplatesRequest): Request[ListRecommendationTemplatesResponse, AWSError] = js.native
  def listRecommendationTemplates(
    params: ListRecommendationTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationTemplatesResponse, Unit]
  ): Request[ListRecommendationTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists the resiliency policies for the Resilience Hub applications.
    */
  def listResiliencyPolicies(): Request[ListResiliencyPoliciesResponse, AWSError] = js.native
  def listResiliencyPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListResiliencyPoliciesResponse, Unit]): Request[ListResiliencyPoliciesResponse, AWSError] = js.native
  /**
    * Lists the resiliency policies for the Resilience Hub applications.
    */
  def listResiliencyPolicies(params: ListResiliencyPoliciesRequest): Request[ListResiliencyPoliciesResponse, AWSError] = js.native
  def listResiliencyPolicies(
    params: ListResiliencyPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResiliencyPoliciesResponse, Unit]
  ): Request[ListResiliencyPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
    */
  def listSopRecommendations(): Request[ListSopRecommendationsResponse, AWSError] = js.native
  def listSopRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListSopRecommendationsResponse, Unit]): Request[ListSopRecommendationsResponse, AWSError] = js.native
  /**
    * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
    */
  def listSopRecommendations(params: ListSopRecommendationsRequest): Request[ListSopRecommendationsResponse, AWSError] = js.native
  def listSopRecommendations(
    params: ListSopRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSopRecommendationsResponse, Unit]
  ): Request[ListSopRecommendationsResponse, AWSError] = js.native
  
  /**
    * Lists the suggested resiliency policies for the Resilience Hub applications.
    */
  def listSuggestedResiliencyPolicies(): Request[ListSuggestedResiliencyPoliciesResponse, AWSError] = js.native
  def listSuggestedResiliencyPolicies(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuggestedResiliencyPoliciesResponse, Unit]
  ): Request[ListSuggestedResiliencyPoliciesResponse, AWSError] = js.native
  /**
    * Lists the suggested resiliency policies for the Resilience Hub applications.
    */
  def listSuggestedResiliencyPolicies(params: ListSuggestedResiliencyPoliciesRequest): Request[ListSuggestedResiliencyPoliciesResponse, AWSError] = js.native
  def listSuggestedResiliencyPolicies(
    params: ListSuggestedResiliencyPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuggestedResiliencyPoliciesResponse, Unit]
  ): Request[ListSuggestedResiliencyPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for your resources in your Resilience Hub applications.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for your resources in your Resilience Hub applications.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the test recommendations for the Resilience Hub application.
    */
  def listTestRecommendations(): Request[ListTestRecommendationsResponse, AWSError] = js.native
  def listTestRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListTestRecommendationsResponse, Unit]): Request[ListTestRecommendationsResponse, AWSError] = js.native
  /**
    * Lists the test recommendations for the Resilience Hub application.
    */
  def listTestRecommendations(params: ListTestRecommendationsRequest): Request[ListTestRecommendationsResponse, AWSError] = js.native
  def listTestRecommendations(
    params: ListTestRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTestRecommendationsResponse, Unit]
  ): Request[ListTestRecommendationsResponse, AWSError] = js.native
  
  /**
    * Lists the resources that are not currently supported in Resilience Hub. An unsupported resource is a resource that exists in the object that was used to create an app, but is not supported by Resilience Hub.
    */
  def listUnsupportedAppVersionResources(): Request[ListUnsupportedAppVersionResourcesResponse, AWSError] = js.native
  def listUnsupportedAppVersionResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListUnsupportedAppVersionResourcesResponse, Unit]
  ): Request[ListUnsupportedAppVersionResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources that are not currently supported in Resilience Hub. An unsupported resource is a resource that exists in the object that was used to create an app, but is not supported by Resilience Hub.
    */
  def listUnsupportedAppVersionResources(params: ListUnsupportedAppVersionResourcesRequest): Request[ListUnsupportedAppVersionResourcesResponse, AWSError] = js.native
  def listUnsupportedAppVersionResources(
    params: ListUnsupportedAppVersionResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUnsupportedAppVersionResourcesResponse, Unit]
  ): Request[ListUnsupportedAppVersionResourcesResponse, AWSError] = js.native
  
  /**
    * Publishes a new version of a specific Resilience Hub application.
    */
  def publishAppVersion(): Request[PublishAppVersionResponse, AWSError] = js.native
  def publishAppVersion(callback: js.Function2[/* err */ AWSError, /* data */ PublishAppVersionResponse, Unit]): Request[PublishAppVersionResponse, AWSError] = js.native
  /**
    * Publishes a new version of a specific Resilience Hub application.
    */
  def publishAppVersion(params: PublishAppVersionRequest): Request[PublishAppVersionResponse, AWSError] = js.native
  def publishAppVersion(
    params: PublishAppVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishAppVersionResponse, Unit]
  ): Request[PublishAppVersionResponse, AWSError] = js.native
  
  /**
    * Adds or updates the app template for an Resilience Hub application draft version.
    */
  def putDraftAppVersionTemplate(): Request[PutDraftAppVersionTemplateResponse, AWSError] = js.native
  def putDraftAppVersionTemplate(callback: js.Function2[/* err */ AWSError, /* data */ PutDraftAppVersionTemplateResponse, Unit]): Request[PutDraftAppVersionTemplateResponse, AWSError] = js.native
  /**
    * Adds or updates the app template for an Resilience Hub application draft version.
    */
  def putDraftAppVersionTemplate(params: PutDraftAppVersionTemplateRequest): Request[PutDraftAppVersionTemplateResponse, AWSError] = js.native
  def putDraftAppVersionTemplate(
    params: PutDraftAppVersionTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDraftAppVersionTemplateResponse, Unit]
  ): Request[PutDraftAppVersionTemplateResponse, AWSError] = js.native
  
  /**
    * Removes resource mappings from a draft application version.
    */
  def removeDraftAppVersionResourceMappings(): Request[RemoveDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  def removeDraftAppVersionResourceMappings(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveDraftAppVersionResourceMappingsResponse, Unit]
  ): Request[RemoveDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  /**
    * Removes resource mappings from a draft application version.
    */
  def removeDraftAppVersionResourceMappings(params: RemoveDraftAppVersionResourceMappingsRequest): Request[RemoveDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  def removeDraftAppVersionResourceMappings(
    params: RemoveDraftAppVersionResourceMappingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveDraftAppVersionResourceMappingsResponse, Unit]
  ): Request[RemoveDraftAppVersionResourceMappingsResponse, AWSError] = js.native
  
  /**
    * Resolves the resources for an application version.
    */
  def resolveAppVersionResources(): Request[ResolveAppVersionResourcesResponse, AWSError] = js.native
  def resolveAppVersionResources(callback: js.Function2[/* err */ AWSError, /* data */ ResolveAppVersionResourcesResponse, Unit]): Request[ResolveAppVersionResourcesResponse, AWSError] = js.native
  /**
    * Resolves the resources for an application version.
    */
  def resolveAppVersionResources(params: ResolveAppVersionResourcesRequest): Request[ResolveAppVersionResourcesResponse, AWSError] = js.native
  def resolveAppVersionResources(
    params: ResolveAppVersionResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResolveAppVersionResourcesResponse, Unit]
  ): Request[ResolveAppVersionResourcesResponse, AWSError] = js.native
  
  /**
    * Creates a new application assessment for an application.
    */
  def startAppAssessment(): Request[StartAppAssessmentResponse, AWSError] = js.native
  def startAppAssessment(callback: js.Function2[/* err */ AWSError, /* data */ StartAppAssessmentResponse, Unit]): Request[StartAppAssessmentResponse, AWSError] = js.native
  /**
    * Creates a new application assessment for an application.
    */
  def startAppAssessment(params: StartAppAssessmentRequest): Request[StartAppAssessmentResponse, AWSError] = js.native
  def startAppAssessment(
    params: StartAppAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAppAssessmentResponse, Unit]
  ): Request[StartAppAssessmentResponse, AWSError] = js.native
  
  /**
    * Applies one or more tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies one or more tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an application.
    */
  def updateApp(): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]): Request[UpdateAppResponse, AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]
  ): Request[UpdateAppResponse, AWSError] = js.native
  
  /**
    * Updates the Resilience Hub application version.  This API updates the Resilience Hub application draft version. To use this information for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def updateAppVersion(): Request[UpdateAppVersionResponse, AWSError] = js.native
  def updateAppVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionResponse, Unit]): Request[UpdateAppVersionResponse, AWSError] = js.native
  /**
    * Updates the Resilience Hub application version.  This API updates the Resilience Hub application draft version. To use this information for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def updateAppVersion(params: UpdateAppVersionRequest): Request[UpdateAppVersionResponse, AWSError] = js.native
  def updateAppVersion(
    params: UpdateAppVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionResponse, Unit]
  ): Request[UpdateAppVersionResponse, AWSError] = js.native
  
  /**
    * Updates an existing Application Component in the Resilience Hub application.  This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def updateAppVersionAppComponent(): Request[UpdateAppVersionAppComponentResponse, AWSError] = js.native
  def updateAppVersionAppComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionAppComponentResponse, Unit]): Request[UpdateAppVersionAppComponentResponse, AWSError] = js.native
  /**
    * Updates an existing Application Component in the Resilience Hub application.  This API updates the Resilience Hub application draft version. To use this Application Component for running assessments, you must publish the Resilience Hub application using the PublishAppVersion API. 
    */
  def updateAppVersionAppComponent(params: UpdateAppVersionAppComponentRequest): Request[UpdateAppVersionAppComponentResponse, AWSError] = js.native
  def updateAppVersionAppComponent(
    params: UpdateAppVersionAppComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionAppComponentResponse, Unit]
  ): Request[UpdateAppVersionAppComponentResponse, AWSError] = js.native
  
  /**
    * Updates the resource details in the Resilience Hub application.    This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   To update application version with new physicalResourceID, you must call ResolveAppVersionResources API.   
    */
  def updateAppVersionResource(): Request[UpdateAppVersionResourceResponse, AWSError] = js.native
  def updateAppVersionResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionResourceResponse, Unit]): Request[UpdateAppVersionResourceResponse, AWSError] = js.native
  /**
    * Updates the resource details in the Resilience Hub application.    This action has no effect outside Resilience Hub.   This API updates the Resilience Hub application draft version. To use this resource for running resiliency assessments, you must publish the Resilience Hub application using the PublishAppVersion API.   To update application version with new physicalResourceID, you must call ResolveAppVersionResources API.   
    */
  def updateAppVersionResource(params: UpdateAppVersionResourceRequest): Request[UpdateAppVersionResourceResponse, AWSError] = js.native
  def updateAppVersionResource(
    params: UpdateAppVersionResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppVersionResourceResponse, Unit]
  ): Request[UpdateAppVersionResourceResponse, AWSError] = js.native
  
  /**
    * Updates a resiliency policy.
    */
  def updateResiliencyPolicy(): Request[UpdateResiliencyPolicyResponse, AWSError] = js.native
  def updateResiliencyPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResiliencyPolicyResponse, Unit]): Request[UpdateResiliencyPolicyResponse, AWSError] = js.native
  /**
    * Updates a resiliency policy.
    */
  def updateResiliencyPolicy(params: UpdateResiliencyPolicyRequest): Request[UpdateResiliencyPolicyResponse, AWSError] = js.native
  def updateResiliencyPolicy(
    params: UpdateResiliencyPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResiliencyPolicyResponse, Unit]
  ): Request[UpdateResiliencyPolicyResponse, AWSError] = js.native
}
