package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQ
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MQ: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMqMod.MQNs.ClientConfiguration = js.native
  /**
     * Creates a broker. Note: This API is asynchronous.
     */
  def createBroker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a broker. Note: This API is asynchronous.
     */
  def createBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a broker. Note: This API is asynchronous.
     */
  def createBroker(params: awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a broker. Note: This API is asynchronous.
     */
  def createBroker(
    params: awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
     */
  def createConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
     */
  def createConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
     */
  def createConfiguration(params: awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
     */
  def createConfiguration(
    params: awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an ActiveMQ user.
     */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an ActiveMQ user.
     */
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an ActiveMQ user.
     */
  def createUser(params: awsDashSdkLib.clientsMqMod.MQNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an ActiveMQ user.
     */
  def createUser(
    params: awsDashSdkLib.clientsMqMod.MQNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a broker. Note: This API is asynchronous.
     */
  def deleteBroker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a broker. Note: This API is asynchronous.
     */
  def deleteBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a broker. Note: This API is asynchronous.
     */
  def deleteBroker(params: awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a broker. Note: This API is asynchronous.
     */
  def deleteBroker(
    params: awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an ActiveMQ user.
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an ActiveMQ user.
     */
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an ActiveMQ user.
     */
  def deleteUser(params: awsDashSdkLib.clientsMqMod.MQNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an ActiveMQ user.
     */
  def deleteUser(
    params: awsDashSdkLib.clientsMqMod.MQNs.DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified broker.
     */
  def describeBroker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified broker.
     */
  def describeBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified broker.
     */
  def describeBroker(params: awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified broker.
     */
  def describeBroker(
    params: awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified configuration.
     */
  def describeConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified configuration.
     */
  def describeConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified configuration.
     */
  def describeConfiguration(params: awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified configuration.
     */
  def describeConfiguration(
    params: awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified configuration revision for the specified configuration.
     */
  def describeConfigurationRevision(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified configuration revision for the specified configuration.
     */
  def describeConfigurationRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified configuration revision for the specified configuration.
     */
  def describeConfigurationRevision(params: awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the specified configuration revision for the specified configuration.
     */
  def describeConfigurationRevision(
    params: awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeConfigurationRevisionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an ActiveMQ user.
     */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an ActiveMQ user.
     */
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an ActiveMQ user.
     */
  def describeUser(params: awsDashSdkLib.clientsMqMod.MQNs.DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about an ActiveMQ user.
     */
  def describeUser(
    params: awsDashSdkLib.clientsMqMod.MQNs.DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all brokers.
     */
  def listBrokers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all brokers.
     */
  def listBrokers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all brokers.
     */
  def listBrokers(params: awsDashSdkLib.clientsMqMod.MQNs.ListBrokersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all brokers.
     */
  def listBrokers(
    params: awsDashSdkLib.clientsMqMod.MQNs.ListBrokersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all revisions for the specified configuration.
     */
  def listConfigurationRevisions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all revisions for the specified configuration.
     */
  def listConfigurationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all revisions for the specified configuration.
     */
  def listConfigurationRevisions(params: awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all revisions for the specified configuration.
     */
  def listConfigurationRevisions(
    params: awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationRevisionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all configurations.
     */
  def listConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all configurations.
     */
  def listConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all configurations.
     */
  def listConfigurations(params: awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all configurations.
     */
  def listConfigurations(
    params: awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all ActiveMQ users.
     */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all ActiveMQ users.
     */
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all ActiveMQ users.
     */
  def listUsers(params: awsDashSdkLib.clientsMqMod.MQNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all ActiveMQ users.
     */
  def listUsers(
    params: awsDashSdkLib.clientsMqMod.MQNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a broker. Note: This API is asynchronous.
     */
  def rebootBroker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a broker. Note: This API is asynchronous.
     */
  def rebootBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a broker. Note: This API is asynchronous.
     */
  def rebootBroker(params: awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a broker. Note: This API is asynchronous.
     */
  def rebootBroker(
    params: awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.RebootBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a pending configuration change to a broker.
     */
  def updateBroker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a pending configuration change to a broker.
     */
  def updateBroker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a pending configuration change to a broker.
     */
  def updateBroker(params: awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a pending configuration change to a broker.
     */
  def updateBroker(
    params: awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateBrokerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified configuration.
     */
  def updateConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified configuration.
     */
  def updateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified configuration.
     */
  def updateConfiguration(params: awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified configuration.
     */
  def updateConfiguration(
    params: awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the information for an ActiveMQ user.
     */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the information for an ActiveMQ user.
     */
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the information for an ActiveMQ user.
     */
  def updateUser(params: awsDashSdkLib.clientsMqMod.MQNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the information for an ActiveMQ user.
     */
  def updateUser(
    params: awsDashSdkLib.clientsMqMod.MQNs.UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMqMod.MQNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

