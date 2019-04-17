package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQ
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MQ: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a broker. Note: This API is asynchronous.
    */
  def createBroker(): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a broker. Note: This API is asynchronous.
    */
  def createBroker(params: CreateBrokerRequest): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBroker(
    params: CreateBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  def createConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  def createConfiguration(params: CreateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfiguration(
    params: CreateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a tag to a resource.
    */
  def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a tag to a resource.
    */
  def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTags(
    params: CreateTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an ActiveMQ user.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an ActiveMQ user.
    */
  def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a broker. Note: This API is asynchronous.
    */
  def deleteBroker(): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a broker. Note: This API is asynchronous.
    */
  def deleteBroker(params: DeleteBrokerRequest): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBroker(
    params: DeleteBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: DeleteTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an ActiveMQ user.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an ActiveMQ user.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified broker.
    */
  def describeBroker(): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified broker.
    */
  def describeBroker(params: DescribeBrokerRequest): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBroker(
    params: DescribeBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe available engine types and versions.
    */
  def describeBrokerEngineTypes(): awsDashSdkLib.libRequestMod.Request[DescribeBrokerEngineTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBrokerEngineTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerEngineTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerEngineTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe available engine types and versions.
    */
  def describeBrokerEngineTypes(params: DescribeBrokerEngineTypesRequest): awsDashSdkLib.libRequestMod.Request[DescribeBrokerEngineTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBrokerEngineTypes(
    params: DescribeBrokerEngineTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerEngineTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerEngineTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe available broker instance options.
    */
  def describeBrokerInstanceOptions(): awsDashSdkLib.libRequestMod.Request[DescribeBrokerInstanceOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBrokerInstanceOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerInstanceOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerInstanceOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe available broker instance options.
    */
  def describeBrokerInstanceOptions(params: DescribeBrokerInstanceOptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeBrokerInstanceOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeBrokerInstanceOptions(
    params: DescribeBrokerInstanceOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeBrokerInstanceOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerInstanceOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified configuration.
    */
  def describeConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified configuration.
    */
  def describeConfiguration(params: DescribeConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfiguration(
    params: DescribeConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the specified configuration revision for the specified configuration.
    */
  def describeConfigurationRevision(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfigurationRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the specified configuration revision for the specified configuration.
    */
  def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfigurationRevision(
    params: DescribeConfigurationRevisionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about an ActiveMQ user.
    */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about an ActiveMQ user.
    */
  def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all brokers.
    */
  def listBrokers(): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBrokers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all brokers.
    */
  def listBrokers(params: ListBrokersRequest): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBrokers(
    params: ListBrokersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all revisions for the specified configuration.
    */
  def listConfigurationRevisions(): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all revisions for the specified configuration.
    */
  def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurationRevisions(
    params: ListConfigurationRevisionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all configurations.
    */
  def listConfigurations(): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all configurations.
    */
  def listConfigurations(params: ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurations(
    params: ListConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for a resource.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for a resource.
    */
  def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all ActiveMQ users.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all ActiveMQ users.
    */
  def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a broker. Note: This API is asynchronous.
    */
  def rebootBroker(): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a broker. Note: This API is asynchronous.
    */
  def rebootBroker(params: RebootBrokerRequest): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootBroker(
    params: RebootBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a pending configuration change to a broker.
    */
  def updateBroker(): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a pending configuration change to a broker.
    */
  def updateBroker(params: UpdateBrokerRequest): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBroker(
    params: UpdateBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified configuration.
    */
  def updateConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified configuration.
    */
  def updateConfiguration(params: UpdateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfiguration(
    params: UpdateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the information for an ActiveMQ user.
    */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the information for an ActiveMQ user.
    */
  def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

