package typings.awsSdk.clientsEvidentlyMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Evidently extends Service {
  
  /**
    * This operation assigns feature variation to user sessions. For each user session, you pass in an entityID that represents the user. Evidently then checks the evaluation rules and assigns the variation. The first rules that are evaluated are the override rules. If the user's entityID matches an override rule, the user is served the variation specified by that rule. Next, if there is a launch of the feature, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch. If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment. If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment.  If the user is not assigned to a launch or experiment, they are served the default variation.
    */
  def batchEvaluateFeature(): Request[BatchEvaluateFeatureResponse, AWSError] = js.native
  def batchEvaluateFeature(callback: js.Function2[/* err */ AWSError, /* data */ BatchEvaluateFeatureResponse, Unit]): Request[BatchEvaluateFeatureResponse, AWSError] = js.native
  /**
    * This operation assigns feature variation to user sessions. For each user session, you pass in an entityID that represents the user. Evidently then checks the evaluation rules and assigns the variation. The first rules that are evaluated are the override rules. If the user's entityID matches an override rule, the user is served the variation specified by that rule. Next, if there is a launch of the feature, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch. If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment. If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment.  If the user is not assigned to a launch or experiment, they are served the default variation.
    */
  def batchEvaluateFeature(params: BatchEvaluateFeatureRequest): Request[BatchEvaluateFeatureResponse, AWSError] = js.native
  def batchEvaluateFeature(
    params: BatchEvaluateFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchEvaluateFeatureResponse, Unit]
  ): Request[BatchEvaluateFeatureResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Evidently: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Evidently experiment. Before you create an experiment, you must create the feature to use for the experiment. An experiment helps you make feature design decisions based on evidence and data. An experiment can test as many as five variations at once. Evidently collects experiment data and analyzes it by statistical methods, and provides clear recommendations about which variations perform better. You can optionally specify a segment to have the experiment consider only certain audience types in the experiment, such as using only user sessions from a certain location or who use a certain internet browser. Don't use this operation to update an existing experiment. Instead, use UpdateExperiment. 
    */
  def createExperiment(): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]): Request[CreateExperimentResponse, AWSError] = js.native
  /**
    * Creates an Evidently experiment. Before you create an experiment, you must create the feature to use for the experiment. An experiment helps you make feature design decisions based on evidence and data. An experiment can test as many as five variations at once. Evidently collects experiment data and analyzes it by statistical methods, and provides clear recommendations about which variations perform better. You can optionally specify a segment to have the experiment consider only certain audience types in the experiment, such as using only user sessions from a certain location or who use a certain internet browser. Don't use this operation to update an existing experiment. Instead, use UpdateExperiment. 
    */
  def createExperiment(params: CreateExperimentRequest): Request[CreateExperimentResponse, AWSError] = js.native
  def createExperiment(
    params: CreateExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentResponse, Unit]
  ): Request[CreateExperimentResponse, AWSError] = js.native
  
  /**
    * Creates an Evidently feature that you want to launch or test. You can define up to five variations of a feature, and use these variations in your launches and experiments. A feature must be created in a project. For information about creating a project, see CreateProject. Don't use this operation to update an existing feature. Instead, use UpdateFeature. 
    */
  def createFeature(): Request[CreateFeatureResponse, AWSError] = js.native
  def createFeature(callback: js.Function2[/* err */ AWSError, /* data */ CreateFeatureResponse, Unit]): Request[CreateFeatureResponse, AWSError] = js.native
  /**
    * Creates an Evidently feature that you want to launch or test. You can define up to five variations of a feature, and use these variations in your launches and experiments. A feature must be created in a project. For information about creating a project, see CreateProject. Don't use this operation to update an existing feature. Instead, use UpdateFeature. 
    */
  def createFeature(params: CreateFeatureRequest): Request[CreateFeatureResponse, AWSError] = js.native
  def createFeature(
    params: CreateFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFeatureResponse, Unit]
  ): Request[CreateFeatureResponse, AWSError] = js.native
  
  /**
    * Creates a launch of a given feature. Before you create a launch, you must create the feature to use for the launch. You can use a launch to safely validate new features by serving them to a specified percentage of your users while you roll out the feature. You can monitor the performance of the new feature to help you decide when to ramp up traffic to more users. This helps you reduce risk and identify unintended consequences before you fully launch the feature. Don't use this operation to update an existing launch. Instead, use UpdateLaunch. 
    */
  def createLaunch(): Request[CreateLaunchResponse, AWSError] = js.native
  def createLaunch(callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchResponse, Unit]): Request[CreateLaunchResponse, AWSError] = js.native
  /**
    * Creates a launch of a given feature. Before you create a launch, you must create the feature to use for the launch. You can use a launch to safely validate new features by serving them to a specified percentage of your users while you roll out the feature. You can monitor the performance of the new feature to help you decide when to ramp up traffic to more users. This helps you reduce risk and identify unintended consequences before you fully launch the feature. Don't use this operation to update an existing launch. Instead, use UpdateLaunch. 
    */
  def createLaunch(params: CreateLaunchRequest): Request[CreateLaunchResponse, AWSError] = js.native
  def createLaunch(
    params: CreateLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchResponse, Unit]
  ): Request[CreateLaunchResponse, AWSError] = js.native
  
  /**
    * Creates a project, which is the logical object in Evidently that can contain features, launches, and experiments. Use projects to group similar features together. To update an existing project, use UpdateProject.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a project, which is the logical object in Evidently that can contain features, launches, and experiments. Use projects to group similar features together. To update an existing project, use UpdateProject.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Use this operation to define a segment of your audience. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. Using a segment in an experiment limits that experiment to evaluate only the users who match the segment criteria. Using one or more segments in a launch allows you to define different traffic splits for the different audience segments. For more information about segment pattern syntax, see  Segment rule pattern syntax. The pattern that you define for a segment is matched against the value of evaluationContext, which is passed into Evidently in the EvaluateFeature operation, when Evidently assigns a feature variation to a user.
    */
  def createSegment(): Request[CreateSegmentResponse, AWSError] = js.native
  def createSegment(callback: js.Function2[/* err */ AWSError, /* data */ CreateSegmentResponse, Unit]): Request[CreateSegmentResponse, AWSError] = js.native
  /**
    * Use this operation to define a segment of your audience. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. Using a segment in an experiment limits that experiment to evaluate only the users who match the segment criteria. Using one or more segments in a launch allows you to define different traffic splits for the different audience segments. For more information about segment pattern syntax, see  Segment rule pattern syntax. The pattern that you define for a segment is matched against the value of evaluationContext, which is passed into Evidently in the EvaluateFeature operation, when Evidently assigns a feature variation to a user.
    */
  def createSegment(params: CreateSegmentRequest): Request[CreateSegmentResponse, AWSError] = js.native
  def createSegment(
    params: CreateSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSegmentResponse, Unit]
  ): Request[CreateSegmentResponse, AWSError] = js.native
  
  /**
    * Deletes an Evidently experiment. The feature used for the experiment is not deleted. To stop an experiment without deleting it, use StopExperiment. 
    */
  def deleteExperiment(): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]): Request[DeleteExperimentResponse, AWSError] = js.native
  /**
    * Deletes an Evidently experiment. The feature used for the experiment is not deleted. To stop an experiment without deleting it, use StopExperiment. 
    */
  def deleteExperiment(params: DeleteExperimentRequest): Request[DeleteExperimentResponse, AWSError] = js.native
  def deleteExperiment(
    params: DeleteExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentResponse, Unit]
  ): Request[DeleteExperimentResponse, AWSError] = js.native
  
  /**
    * Deletes an Evidently feature.
    */
  def deleteFeature(): Request[DeleteFeatureResponse, AWSError] = js.native
  def deleteFeature(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFeatureResponse, Unit]): Request[DeleteFeatureResponse, AWSError] = js.native
  /**
    * Deletes an Evidently feature.
    */
  def deleteFeature(params: DeleteFeatureRequest): Request[DeleteFeatureResponse, AWSError] = js.native
  def deleteFeature(
    params: DeleteFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFeatureResponse, Unit]
  ): Request[DeleteFeatureResponse, AWSError] = js.native
  
  /**
    * Deletes an Evidently launch. The feature used for the launch is not deleted. To stop a launch without deleting it, use StopLaunch. 
    */
  def deleteLaunch(): Request[DeleteLaunchResponse, AWSError] = js.native
  def deleteLaunch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchResponse, Unit]): Request[DeleteLaunchResponse, AWSError] = js.native
  /**
    * Deletes an Evidently launch. The feature used for the launch is not deleted. To stop a launch without deleting it, use StopLaunch. 
    */
  def deleteLaunch(params: DeleteLaunchRequest): Request[DeleteLaunchResponse, AWSError] = js.native
  def deleteLaunch(
    params: DeleteLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchResponse, Unit]
  ): Request[DeleteLaunchResponse, AWSError] = js.native
  
  /**
    * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project contains. To delete a feature, use DeleteFeature.
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an Evidently project. Before you can delete a project, you must delete all the features that the project contains. To delete a feature, use DeleteFeature.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch or experiment is not currently running.
    */
  def deleteSegment(): Request[DeleteSegmentResponse, AWSError] = js.native
  def deleteSegment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSegmentResponse, Unit]): Request[DeleteSegmentResponse, AWSError] = js.native
  /**
    * Deletes a segment. You can't delete a segment that is being used in a launch or experiment, even if that launch or experiment is not currently running.
    */
  def deleteSegment(params: DeleteSegmentRequest): Request[DeleteSegmentResponse, AWSError] = js.native
  def deleteSegment(
    params: DeleteSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSegmentResponse, Unit]
  ): Request[DeleteSegmentResponse, AWSError] = js.native
  
  /**
    * This operation assigns a feature variation to one given user session. You pass in an entityID that represents the user. Evidently then checks the evaluation rules and assigns the variation. The first rules that are evaluated are the override rules. If the user's entityID matches an override rule, the user is served the variation specified by that rule. If there is a current launch with this feature that uses segment overrides, and if the user session's evaluationContext matches a segment rule defined in a segment override, the configuration in the segment overrides is used. For more information about segments, see CreateSegment and Use segments to focus your audience. If there is a launch with no segment overrides, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch. If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment. If the experiment uses a segment, then only user sessions with evaluationContext values that match the segment rule are used in the experiment. If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment.  If the user is not assigned to a launch or experiment, they are served the default variation.
    */
  def evaluateFeature(): Request[EvaluateFeatureResponse, AWSError] = js.native
  def evaluateFeature(callback: js.Function2[/* err */ AWSError, /* data */ EvaluateFeatureResponse, Unit]): Request[EvaluateFeatureResponse, AWSError] = js.native
  /**
    * This operation assigns a feature variation to one given user session. You pass in an entityID that represents the user. Evidently then checks the evaluation rules and assigns the variation. The first rules that are evaluated are the override rules. If the user's entityID matches an override rule, the user is served the variation specified by that rule. If there is a current launch with this feature that uses segment overrides, and if the user session's evaluationContext matches a segment rule defined in a segment override, the configuration in the segment overrides is used. For more information about segments, see CreateSegment and Use segments to focus your audience. If there is a launch with no segment overrides, the user might be assigned to a variation in the launch. The chance of this depends on the percentage of users that are allocated to that launch. If the user is enrolled in the launch, the variation they are served depends on the allocation of the various feature variations used for the launch. If the user is not assigned to a launch, and there is an ongoing experiment for this feature, the user might be assigned to a variation in the experiment. The chance of this depends on the percentage of users that are allocated to that experiment. If the experiment uses a segment, then only user sessions with evaluationContext values that match the segment rule are used in the experiment. If the user is enrolled in the experiment, the variation they are served depends on the allocation of the various feature variations used for the experiment.  If the user is not assigned to a launch or experiment, they are served the default variation.
    */
  def evaluateFeature(params: EvaluateFeatureRequest): Request[EvaluateFeatureResponse, AWSError] = js.native
  def evaluateFeature(
    params: EvaluateFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EvaluateFeatureResponse, Unit]
  ): Request[EvaluateFeatureResponse, AWSError] = js.native
  
  /**
    * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of experiments in your account, use ListExperiments.
    */
  def getExperiment(): Request[GetExperimentResponse, AWSError] = js.native
  def getExperiment(callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResponse, Unit]): Request[GetExperimentResponse, AWSError] = js.native
  /**
    * Returns the details about one experiment. You must already know the experiment name. To retrieve a list of experiments in your account, use ListExperiments.
    */
  def getExperiment(params: GetExperimentRequest): Request[GetExperimentResponse, AWSError] = js.native
  def getExperiment(
    params: GetExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResponse, Unit]
  ): Request[GetExperimentResponse, AWSError] = js.native
  
  /**
    * Retrieves the results of a running or completed experiment. No results are available until there have been 100 events for each variation and at least 10 minutes have passed since the start of the experiment. To increase the statistical power, Evidently performs an additional offline p-value analysis at the end of the experiment. Offline p-value analysis can detect statistical significance in some cases where the anytime p-values used during the experiment do not find statistical significance. Experiment results are available up to 63 days after the start of the experiment. They are not available after that because of CloudWatch data retention policies.
    */
  def getExperimentResults(): Request[GetExperimentResultsResponse, AWSError] = js.native
  def getExperimentResults(callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResultsResponse, Unit]): Request[GetExperimentResultsResponse, AWSError] = js.native
  /**
    * Retrieves the results of a running or completed experiment. No results are available until there have been 100 events for each variation and at least 10 minutes have passed since the start of the experiment. To increase the statistical power, Evidently performs an additional offline p-value analysis at the end of the experiment. Offline p-value analysis can detect statistical significance in some cases where the anytime p-values used during the experiment do not find statistical significance. Experiment results are available up to 63 days after the start of the experiment. They are not available after that because of CloudWatch data retention policies.
    */
  def getExperimentResults(params: GetExperimentResultsRequest): Request[GetExperimentResultsResponse, AWSError] = js.native
  def getExperimentResults(
    params: GetExperimentResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResultsResponse, Unit]
  ): Request[GetExperimentResultsResponse, AWSError] = js.native
  
  /**
    * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in your account, use ListFeatures.
    */
  def getFeature(): Request[GetFeatureResponse, AWSError] = js.native
  def getFeature(callback: js.Function2[/* err */ AWSError, /* data */ GetFeatureResponse, Unit]): Request[GetFeatureResponse, AWSError] = js.native
  /**
    * Returns the details about one feature. You must already know the feature name. To retrieve a list of features in your account, use ListFeatures.
    */
  def getFeature(params: GetFeatureRequest): Request[GetFeatureResponse, AWSError] = js.native
  def getFeature(
    params: GetFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFeatureResponse, Unit]
  ): Request[GetFeatureResponse, AWSError] = js.native
  
  /**
    * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in your account, use ListLaunches.
    */
  def getLaunch(): Request[GetLaunchResponse, AWSError] = js.native
  def getLaunch(callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchResponse, Unit]): Request[GetLaunchResponse, AWSError] = js.native
  /**
    * Returns the details about one launch. You must already know the launch name. To retrieve a list of launches in your account, use ListLaunches.
    */
  def getLaunch(params: GetLaunchRequest): Request[GetLaunchResponse, AWSError] = js.native
  def getLaunch(
    params: GetLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchResponse, Unit]
  ): Request[GetLaunchResponse, AWSError] = js.native
  
  /**
    * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in your account, use ListProjects.
    */
  def getProject(): Request[GetProjectResponse, AWSError] = js.native
  def getProject(callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResponse, Unit]): Request[GetProjectResponse, AWSError] = js.native
  /**
    * Returns the details about one launch. You must already know the project name. To retrieve a list of projects in your account, use ListProjects.
    */
  def getProject(params: GetProjectRequest): Request[GetProjectResponse, AWSError] = js.native
  def getProject(
    params: GetProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResponse, Unit]
  ): Request[GetProjectResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
    */
  def getSegment(): Request[GetSegmentResponse, AWSError] = js.native
  def getSegment(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentResponse, Unit]): Request[GetSegmentResponse, AWSError] = js.native
  /**
    * Returns information about the specified segment. Specify the segment you want to view by specifying its ARN.
    */
  def getSegment(params: GetSegmentRequest): Request[GetSegmentResponse, AWSError] = js.native
  def getSegment(
    params: GetSegmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentResponse, Unit]
  ): Request[GetSegmentResponse, AWSError] = js.native
  
  /**
    * Returns configuration details about all the experiments in the specified project.
    */
  def listExperiments(): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]): Request[ListExperimentsResponse, AWSError] = js.native
  /**
    * Returns configuration details about all the experiments in the specified project.
    */
  def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(
    params: ListExperimentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]
  ): Request[ListExperimentsResponse, AWSError] = js.native
  
  /**
    * Returns configuration details about all the features in the specified project.
    */
  def listFeatures(): Request[ListFeaturesResponse, AWSError] = js.native
  def listFeatures(callback: js.Function2[/* err */ AWSError, /* data */ ListFeaturesResponse, Unit]): Request[ListFeaturesResponse, AWSError] = js.native
  /**
    * Returns configuration details about all the features in the specified project.
    */
  def listFeatures(params: ListFeaturesRequest): Request[ListFeaturesResponse, AWSError] = js.native
  def listFeatures(
    params: ListFeaturesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFeaturesResponse, Unit]
  ): Request[ListFeaturesResponse, AWSError] = js.native
  
  /**
    * Returns configuration details about all the launches in the specified project.
    */
  def listLaunches(): Request[ListLaunchesResponse, AWSError] = js.native
  def listLaunches(callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchesResponse, Unit]): Request[ListLaunchesResponse, AWSError] = js.native
  /**
    * Returns configuration details about all the launches in the specified project.
    */
  def listLaunches(params: ListLaunchesRequest): Request[ListLaunchesResponse, AWSError] = js.native
  def listLaunches(
    params: ListLaunchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchesResponse, Unit]
  ): Request[ListLaunchesResponse, AWSError] = js.native
  
  /**
    * Returns configuration details about all the projects in the current Region in your account.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Returns configuration details about all the projects in the current Region in your account.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Use this operation to find which experiments or launches are using a specified segment.
    */
  def listSegmentReferences(): Request[ListSegmentReferencesResponse, AWSError] = js.native
  def listSegmentReferences(callback: js.Function2[/* err */ AWSError, /* data */ ListSegmentReferencesResponse, Unit]): Request[ListSegmentReferencesResponse, AWSError] = js.native
  /**
    * Use this operation to find which experiments or launches are using a specified segment.
    */
  def listSegmentReferences(params: ListSegmentReferencesRequest): Request[ListSegmentReferencesResponse, AWSError] = js.native
  def listSegmentReferences(
    params: ListSegmentReferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSegmentReferencesResponse, Unit]
  ): Request[ListSegmentReferencesResponse, AWSError] = js.native
  
  /**
    * Returns a list of audience segments that you have created in your account in this Region.
    */
  def listSegments(): Request[ListSegmentsResponse, AWSError] = js.native
  def listSegments(callback: js.Function2[/* err */ AWSError, /* data */ ListSegmentsResponse, Unit]): Request[ListSegmentsResponse, AWSError] = js.native
  /**
    * Returns a list of audience segments that you have created in your account in this Region.
    */
  def listSegments(params: ListSegmentsRequest): Request[ListSegmentsResponse, AWSError] = js.native
  def listSegments(
    params: ListSegmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSegmentsResponse, Unit]
  ): Request[ListSegmentsResponse, AWSError] = js.native
  
  /**
    * Displays the tags associated with an Evidently resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Displays the tags associated with an Evidently resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
    */
  def putProjectEvents(): Request[PutProjectEventsResponse, AWSError] = js.native
  def putProjectEvents(callback: js.Function2[/* err */ AWSError, /* data */ PutProjectEventsResponse, Unit]): Request[PutProjectEventsResponse, AWSError] = js.native
  /**
    * Sends performance events to Evidently. These events can be used to evaluate a launch or an experiment.
    */
  def putProjectEvents(params: PutProjectEventsRequest): Request[PutProjectEventsResponse, AWSError] = js.native
  def putProjectEvents(
    params: PutProjectEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutProjectEventsResponse, Unit]
  ): Request[PutProjectEventsResponse, AWSError] = js.native
  
  /**
    * Starts an existing experiment. To create an experiment, use CreateExperiment.
    */
  def startExperiment(): Request[StartExperimentResponse, AWSError] = js.native
  def startExperiment(callback: js.Function2[/* err */ AWSError, /* data */ StartExperimentResponse, Unit]): Request[StartExperimentResponse, AWSError] = js.native
  /**
    * Starts an existing experiment. To create an experiment, use CreateExperiment.
    */
  def startExperiment(params: StartExperimentRequest): Request[StartExperimentResponse, AWSError] = js.native
  def startExperiment(
    params: StartExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartExperimentResponse, Unit]
  ): Request[StartExperimentResponse, AWSError] = js.native
  
  /**
    * Starts an existing launch. To create a launch, use CreateLaunch.
    */
  def startLaunch(): Request[StartLaunchResponse, AWSError] = js.native
  def startLaunch(callback: js.Function2[/* err */ AWSError, /* data */ StartLaunchResponse, Unit]): Request[StartLaunchResponse, AWSError] = js.native
  /**
    * Starts an existing launch. To create a launch, use CreateLaunch.
    */
  def startLaunch(params: StartLaunchRequest): Request[StartLaunchResponse, AWSError] = js.native
  def startLaunch(
    params: StartLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLaunchResponse, Unit]
  ): Request[StartLaunchResponse, AWSError] = js.native
  
  /**
    * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
    */
  def stopExperiment(): Request[StopExperimentResponse, AWSError] = js.native
  def stopExperiment(callback: js.Function2[/* err */ AWSError, /* data */ StopExperimentResponse, Unit]): Request[StopExperimentResponse, AWSError] = js.native
  /**
    * Stops an experiment that is currently running. If you stop an experiment, you can't resume it or restart it.
    */
  def stopExperiment(params: StopExperimentRequest): Request[StopExperimentResponse, AWSError] = js.native
  def stopExperiment(
    params: StopExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopExperimentResponse, Unit]
  ): Request[StopExperimentResponse, AWSError] = js.native
  
  /**
    * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be served the default variation after the launch is stopped.
    */
  def stopLaunch(): Request[StopLaunchResponse, AWSError] = js.native
  def stopLaunch(callback: js.Function2[/* err */ AWSError, /* data */ StopLaunchResponse, Unit]): Request[StopLaunchResponse, AWSError] = js.native
  /**
    * Stops a launch that is currently running. After you stop a launch, you will not be able to resume it or restart it. Also, it will not be evaluated as a rule for traffic allocation, and the traffic that was allocated to the launch will instead be available to the feature's experiment, if there is one. Otherwise, all traffic will be served the default variation after the launch is stopped.
    */
  def stopLaunch(params: StopLaunchRequest): Request[StopLaunchResponse, AWSError] = js.native
  def stopLaunch(
    params: StopLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopLaunchResponse, Unit]
  ): Request[StopLaunchResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch Evidently resource. Projects, features, launches, and experiments can be tagged. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. For more information, see Tagging Amazon Web Services resources.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified CloudWatch Evidently resource. Projects, features, launches, and experiments can be tagged. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters. You can use the TagResource action with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. For more information, see Tagging Amazon Web Services resources.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more information about segments, see CreateSegment.
    */
  def testSegmentPattern(): Request[TestSegmentPatternResponse, AWSError] = js.native
  def testSegmentPattern(callback: js.Function2[/* err */ AWSError, /* data */ TestSegmentPatternResponse, Unit]): Request[TestSegmentPatternResponse, AWSError] = js.native
  /**
    * Use this operation to test a rules pattern that you plan to use to create an audience segment. For more information about segments, see CreateSegment.
    */
  def testSegmentPattern(params: TestSegmentPatternRequest): Request[TestSegmentPatternResponse, AWSError] = js.native
  def testSegmentPattern(
    params: TestSegmentPatternRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestSegmentPatternResponse, Unit]
  ): Request[TestSegmentPatternResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an Evidently experiment.  Don't use this operation to update an experiment's tag. Instead, use TagResource. 
    */
  def updateExperiment(): Request[UpdateExperimentResponse, AWSError] = js.native
  def updateExperiment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentResponse, Unit]): Request[UpdateExperimentResponse, AWSError] = js.native
  /**
    * Updates an Evidently experiment.  Don't use this operation to update an experiment's tag. Instead, use TagResource. 
    */
  def updateExperiment(params: UpdateExperimentRequest): Request[UpdateExperimentResponse, AWSError] = js.native
  def updateExperiment(
    params: UpdateExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentResponse, Unit]
  ): Request[UpdateExperimentResponse, AWSError] = js.native
  
  /**
    * Updates an existing feature. You can't use this operation to update the tags of an existing feature. Instead, use TagResource. 
    */
  def updateFeature(): Request[UpdateFeatureResponse, AWSError] = js.native
  def updateFeature(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFeatureResponse, Unit]): Request[UpdateFeatureResponse, AWSError] = js.native
  /**
    * Updates an existing feature. You can't use this operation to update the tags of an existing feature. Instead, use TagResource. 
    */
  def updateFeature(params: UpdateFeatureRequest): Request[UpdateFeatureResponse, AWSError] = js.native
  def updateFeature(
    params: UpdateFeatureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFeatureResponse, Unit]
  ): Request[UpdateFeatureResponse, AWSError] = js.native
  
  /**
    * Updates a launch of a given feature.  Don't use this operation to update the tags of an existing launch. Instead, use TagResource. 
    */
  def updateLaunch(): Request[UpdateLaunchResponse, AWSError] = js.native
  def updateLaunch(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchResponse, Unit]): Request[UpdateLaunchResponse, AWSError] = js.native
  /**
    * Updates a launch of a given feature.  Don't use this operation to update the tags of an existing launch. Instead, use TagResource. 
    */
  def updateLaunch(params: UpdateLaunchRequest): Request[UpdateLaunchResponse, AWSError] = js.native
  def updateLaunch(
    params: UpdateLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchResponse, Unit]
  ): Request[UpdateLaunchResponse, AWSError] = js.native
  
  /**
    * Updates the description of an existing project. To create a new project, use CreateProject. Don't use this operation to update the data storage options of a project. Instead, use UpdateProjectDataDelivery.  Don't use this operation to update the tags of a project. Instead, use TagResource. 
    */
  def updateProject(): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]): Request[UpdateProjectResponse, AWSError] = js.native
  /**
    * Updates the description of an existing project. To create a new project, use CreateProject. Don't use this operation to update the data storage options of a project. Instead, use UpdateProjectDataDelivery.  Don't use this operation to update the tags of a project. Instead, use TagResource. 
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]
  ): Request[UpdateProjectResponse, AWSError] = js.native
  
  /**
    * Updates the data storage options for this project. If you store evaluation events, you an keep them and analyze them on your own. If you choose not to store evaluation events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. You can't specify both cloudWatchLogs and s3Destination in the same operation.
    */
  def updateProjectDataDelivery(): Request[UpdateProjectDataDeliveryResponse, AWSError] = js.native
  def updateProjectDataDelivery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectDataDeliveryResponse, Unit]): Request[UpdateProjectDataDeliveryResponse, AWSError] = js.native
  /**
    * Updates the data storage options for this project. If you store evaluation events, you an keep them and analyze them on your own. If you choose not to store evaluation events, Evidently deletes them after using them to produce metrics and other experiment results that you can view. You can't specify both cloudWatchLogs and s3Destination in the same operation.
    */
  def updateProjectDataDelivery(params: UpdateProjectDataDeliveryRequest): Request[UpdateProjectDataDeliveryResponse, AWSError] = js.native
  def updateProjectDataDelivery(
    params: UpdateProjectDataDeliveryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectDataDeliveryResponse, Unit]
  ): Request[UpdateProjectDataDeliveryResponse, AWSError] = js.native
}
