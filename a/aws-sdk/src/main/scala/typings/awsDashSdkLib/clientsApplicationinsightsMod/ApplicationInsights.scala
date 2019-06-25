package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInsights
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApplicationInsights: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds an application that is created from a resource group.
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an application that is created from a resource group.
    */
  def createApplication(params: CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom component by grouping similar standalone instances to monitor.
    */
  def createComponent(): awsDashSdkLib.libRequestMod.Request[CreateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComponent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom component by grouping similar standalone instances to monitor.
    */
  def createComponent(params: CreateComponentRequest): awsDashSdkLib.libRequestMod.Request[CreateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createComponent(
    params: CreateComponentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified application from monitoring. Does not delete the application.
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified application from monitoring. Does not delete the application.
    */
  def deleteApplication(params: DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the component are removed and the instances revert to their standalone status.
    */
  def deleteComponent(): awsDashSdkLib.libRequestMod.Request[DeleteComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteComponent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the component are removed and the instances revert to their standalone status.
    */
  def deleteComponent(params: DeleteComponentRequest): awsDashSdkLib.libRequestMod.Request[DeleteComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the application.
    */
  def describeApplication(): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the application.
    */
  def describeApplication(params: DescribeApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeApplication(
    params: DescribeApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a component and lists the resources that are grouped together in a component.
    */
  def describeComponent(): awsDashSdkLib.libRequestMod.Request[DescribeComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComponent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a component and lists the resources that are grouped together in a component.
    */
  def describeComponent(params: DescribeComponentRequest): awsDashSdkLib.libRequestMod.Request[DescribeComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComponent(
    params: DescribeComponentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the monitoring configuration of the component.
    */
  def describeComponentConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComponentConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the monitoring configuration of the component.
    */
  def describeComponentConfiguration(params: DescribeComponentConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeComponentConfiguration(
    params: DescribeComponentConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the recommended monitoring configuration of the component.
    */
  def describeComponentConfigurationRecommendation(): awsDashSdkLib.libRequestMod.Request[
    DescribeComponentConfigurationRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComponentConfigurationRecommendation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentConfigurationRecommendationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeComponentConfigurationRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the recommended monitoring configuration of the component.
    */
  def describeComponentConfigurationRecommendation(params: DescribeComponentConfigurationRecommendationRequest): awsDashSdkLib.libRequestMod.Request[
    DescribeComponentConfigurationRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComponentConfigurationRecommendation(
    params: DescribeComponentConfigurationRecommendationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeComponentConfigurationRecommendationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeComponentConfigurationRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes an anomaly or error with the application.
    */
  def describeObservation(): awsDashSdkLib.libRequestMod.Request[DescribeObservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeObservation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeObservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeObservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an anomaly or error with the application.
    */
  def describeObservation(params: DescribeObservationRequest): awsDashSdkLib.libRequestMod.Request[DescribeObservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeObservation(
    params: DescribeObservationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeObservationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeObservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an application problem.
    */
  def describeProblem(): awsDashSdkLib.libRequestMod.Request[DescribeProblemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProblem(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProblemResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProblemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an application problem.
    */
  def describeProblem(params: DescribeProblemRequest): awsDashSdkLib.libRequestMod.Request[DescribeProblemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProblem(
    params: DescribeProblemRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProblemResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProblemResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the anomalies or errors associated with the problem.
    */
  def describeProblemObservations(): awsDashSdkLib.libRequestMod.Request[DescribeProblemObservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProblemObservations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProblemObservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProblemObservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the anomalies or errors associated with the problem.
    */
  def describeProblemObservations(params: DescribeProblemObservationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeProblemObservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProblemObservations(
    params: DescribeProblemObservationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProblemObservationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProblemObservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the IDs of the applications that you are monitoring. 
    */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the IDs of the applications that you are monitoring. 
    */
  def listApplications(params: ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the auto-grouped, standalone, and custom components of the application.
    */
  def listComponents(): awsDashSdkLib.libRequestMod.Request[ListComponentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComponents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComponentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComponentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the auto-grouped, standalone, and custom components of the application.
    */
  def listComponents(params: ListComponentsRequest): awsDashSdkLib.libRequestMod.Request[ListComponentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComponents(
    params: ListComponentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComponentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComponentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the problems with your application.
    */
  def listProblems(): awsDashSdkLib.libRequestMod.Request[ListProblemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProblems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProblemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProblemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the problems with your application.
    */
  def listProblems(params: ListProblemsRequest): awsDashSdkLib.libRequestMod.Request[ListProblemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProblems(
    params: ListProblemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProblemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProblemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the custom component name and/or the list of resources that make up the component.
    */
  def updateComponent(): awsDashSdkLib.libRequestMod.Request[UpdateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateComponent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the custom component name and/or the list of resources that make up the component.
    */
  def updateComponent(params: UpdateComponentRequest): awsDashSdkLib.libRequestMod.Request[UpdateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateComponent(
    params: UpdateComponentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateComponentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateComponentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of the configuration and should match the schema of what is returned by DescribeComponentConfigurationRecommendation.
    */
  def updateComponentConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateComponentConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateComponentConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of the configuration and should match the schema of what is returned by DescribeComponentConfigurationRecommendation.
    */
  def updateComponentConfiguration(params: UpdateComponentConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateComponentConfiguration(
    params: UpdateComponentConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateComponentConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateComponentConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

