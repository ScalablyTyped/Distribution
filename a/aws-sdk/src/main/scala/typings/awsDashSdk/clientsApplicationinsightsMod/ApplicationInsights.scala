package typings.awsDashSdk.clientsApplicationinsightsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInsights extends Service {
  @JSName("config")
  var config_ApplicationInsights: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds an application that is created from a resource group.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, scala.Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Adds an application that is created from a resource group.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, scala.Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates a custom component by grouping similar standalone instances to monitor.
    */
  def createComponent(): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, scala.Unit]): Request[CreateComponentResponse, AWSError] = js.native
  /**
    * Creates a custom component by grouping similar standalone instances to monitor.
    */
  def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(
    params: CreateComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, scala.Unit]
  ): Request[CreateComponentResponse, AWSError] = js.native
  /**
    * Removes the specified application from monitoring. Does not delete the application.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, scala.Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Removes the specified application from monitoring. Does not delete the application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, scala.Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the component are removed and the instances revert to their standalone status.
    */
  def deleteComponent(): Request[DeleteComponentResponse, AWSError] = js.native
  def deleteComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentResponse, scala.Unit]): Request[DeleteComponentResponse, AWSError] = js.native
  /**
    * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the component are removed and the instances revert to their standalone status.
    */
  def deleteComponent(params: DeleteComponentRequest): Request[DeleteComponentResponse, AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentResponse, scala.Unit]
  ): Request[DeleteComponentResponse, AWSError] = js.native
  /**
    * Describes the application.
    */
  def describeApplication(): Request[DescribeApplicationResponse, AWSError] = js.native
  def describeApplication(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationResponse, scala.Unit]): Request[DescribeApplicationResponse, AWSError] = js.native
  /**
    * Describes the application.
    */
  def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse, AWSError] = js.native
  def describeApplication(
    params: DescribeApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationResponse, scala.Unit]
  ): Request[DescribeApplicationResponse, AWSError] = js.native
  /**
    * Describes a component and lists the resources that are grouped together in a component.
    */
  def describeComponent(): Request[DescribeComponentResponse, AWSError] = js.native
  def describeComponent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentResponse, scala.Unit]): Request[DescribeComponentResponse, AWSError] = js.native
  /**
    * Describes a component and lists the resources that are grouped together in a component.
    */
  def describeComponent(params: DescribeComponentRequest): Request[DescribeComponentResponse, AWSError] = js.native
  def describeComponent(
    params: DescribeComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentResponse, scala.Unit]
  ): Request[DescribeComponentResponse, AWSError] = js.native
  /**
    * Describes the monitoring configuration of the component.
    */
  def describeComponentConfiguration(): Request[DescribeComponentConfigurationResponse, AWSError] = js.native
  def describeComponentConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentConfigurationResponse, scala.Unit]
  ): Request[DescribeComponentConfigurationResponse, AWSError] = js.native
  /**
    * Describes the monitoring configuration of the component.
    */
  def describeComponentConfiguration(params: DescribeComponentConfigurationRequest): Request[DescribeComponentConfigurationResponse, AWSError] = js.native
  def describeComponentConfiguration(
    params: DescribeComponentConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentConfigurationResponse, scala.Unit]
  ): Request[DescribeComponentConfigurationResponse, AWSError] = js.native
  /**
    * Describes the recommended monitoring configuration of the component.
    */
  def describeComponentConfigurationRecommendation(): Request[DescribeComponentConfigurationRecommendationResponse, AWSError] = js.native
  def describeComponentConfigurationRecommendation(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeComponentConfigurationRecommendationResponse, 
      scala.Unit
    ]
  ): Request[DescribeComponentConfigurationRecommendationResponse, AWSError] = js.native
  /**
    * Describes the recommended monitoring configuration of the component.
    */
  def describeComponentConfigurationRecommendation(params: DescribeComponentConfigurationRecommendationRequest): Request[DescribeComponentConfigurationRecommendationResponse, AWSError] = js.native
  def describeComponentConfigurationRecommendation(
    params: DescribeComponentConfigurationRecommendationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeComponentConfigurationRecommendationResponse, 
      scala.Unit
    ]
  ): Request[DescribeComponentConfigurationRecommendationResponse, AWSError] = js.native
  /**
    * Describes an anomaly or error with the application.
    */
  def describeObservation(): Request[DescribeObservationResponse, AWSError] = js.native
  def describeObservation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeObservationResponse, scala.Unit]): Request[DescribeObservationResponse, AWSError] = js.native
  /**
    * Describes an anomaly or error with the application.
    */
  def describeObservation(params: DescribeObservationRequest): Request[DescribeObservationResponse, AWSError] = js.native
  def describeObservation(
    params: DescribeObservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeObservationResponse, scala.Unit]
  ): Request[DescribeObservationResponse, AWSError] = js.native
  /**
    * Describes an application problem.
    */
  def describeProblem(): Request[DescribeProblemResponse, AWSError] = js.native
  def describeProblem(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProblemResponse, scala.Unit]): Request[DescribeProblemResponse, AWSError] = js.native
  /**
    * Describes an application problem.
    */
  def describeProblem(params: DescribeProblemRequest): Request[DescribeProblemResponse, AWSError] = js.native
  def describeProblem(
    params: DescribeProblemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProblemResponse, scala.Unit]
  ): Request[DescribeProblemResponse, AWSError] = js.native
  /**
    * Describes the anomalies or errors associated with the problem.
    */
  def describeProblemObservations(): Request[DescribeProblemObservationsResponse, AWSError] = js.native
  def describeProblemObservations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProblemObservationsResponse, scala.Unit]
  ): Request[DescribeProblemObservationsResponse, AWSError] = js.native
  /**
    * Describes the anomalies or errors associated with the problem.
    */
  def describeProblemObservations(params: DescribeProblemObservationsRequest): Request[DescribeProblemObservationsResponse, AWSError] = js.native
  def describeProblemObservations(
    params: DescribeProblemObservationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProblemObservationsResponse, scala.Unit]
  ): Request[DescribeProblemObservationsResponse, AWSError] = js.native
  /**
    * Lists the IDs of the applications that you are monitoring. 
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, scala.Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists the IDs of the applications that you are monitoring. 
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, scala.Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists the auto-grouped, standalone, and custom components of the application.
    */
  def listComponents(): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, scala.Unit]): Request[ListComponentsResponse, AWSError] = js.native
  /**
    * Lists the auto-grouped, standalone, and custom components of the application.
    */
  def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(
    params: ListComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, scala.Unit]
  ): Request[ListComponentsResponse, AWSError] = js.native
  /**
    * Lists the problems with your application.
    */
  def listProblems(): Request[ListProblemsResponse, AWSError] = js.native
  def listProblems(callback: js.Function2[/* err */ AWSError, /* data */ ListProblemsResponse, scala.Unit]): Request[ListProblemsResponse, AWSError] = js.native
  /**
    * Lists the problems with your application.
    */
  def listProblems(params: ListProblemsRequest): Request[ListProblemsResponse, AWSError] = js.native
  def listProblems(
    params: ListProblemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProblemsResponse, scala.Unit]
  ): Request[ListProblemsResponse, AWSError] = js.native
  /**
    * Updates the application.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, scala.Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates the application.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, scala.Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates the custom component name and/or the list of resources that make up the component.
    */
  def updateComponent(): Request[UpdateComponentResponse, AWSError] = js.native
  def updateComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentResponse, scala.Unit]): Request[UpdateComponentResponse, AWSError] = js.native
  /**
    * Updates the custom component name and/or the list of resources that make up the component.
    */
  def updateComponent(params: UpdateComponentRequest): Request[UpdateComponentResponse, AWSError] = js.native
  def updateComponent(
    params: UpdateComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentResponse, scala.Unit]
  ): Request[UpdateComponentResponse, AWSError] = js.native
  /**
    * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of the configuration and should match the schema of what is returned by DescribeComponentConfigurationRecommendation.
    */
  def updateComponentConfiguration(): Request[UpdateComponentConfigurationResponse, AWSError] = js.native
  def updateComponentConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentConfigurationResponse, scala.Unit]
  ): Request[UpdateComponentConfigurationResponse, AWSError] = js.native
  /**
    * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of the configuration and should match the schema of what is returned by DescribeComponentConfigurationRecommendation.
    */
  def updateComponentConfiguration(params: UpdateComponentConfigurationRequest): Request[UpdateComponentConfigurationResponse, AWSError] = js.native
  def updateComponentConfiguration(
    params: UpdateComponentConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentConfigurationResponse, scala.Unit]
  ): Request[UpdateComponentConfigurationResponse, AWSError] = js.native
}

