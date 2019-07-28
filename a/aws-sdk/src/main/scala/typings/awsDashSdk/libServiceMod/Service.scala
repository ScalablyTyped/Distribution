package typings.awsDashSdk.libServiceMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.Anon_Key
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libEndpointMod.Endpoint
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/service", "Service")
@js.native
/**
  * Creates a new service object with a configuration object.
  */
class Service () extends js.Object {
  def this(config: ServiceConfigurationOptions) = this()
  /**
    * The list of API versions supported by this service.
    */
  var apiVersions: js.Array[String] = js.native
  var config: ConfigBase with ServiceConfigurationOptions = js.native
  /**
    * An Endpoint object representing the endpoint URL for service requests.
    */
  var endpoint: Endpoint = js.native
  /**
    * Defines a new Service class using a service identifier and list of versions including an optional set of features (functions) to apply to the class prototype.
    * 
    * @param {string} serviceIdentifier - the identifier for the service.
    * @param {string[]} versions - a list of versions that work with this service.
    * @param {Object} features - an object to attach to the prototype.
    */
  def defineService(serviceIdentifier: String, versions: js.Array[String]): Instantiable1[js.UndefOr[/* config */ ServiceConfigurationOptions], Service] = js.native
  def defineService(serviceIdentifier: String, versions: js.Array[String], features: js.Any): Instantiable1[js.UndefOr[/* config */ ServiceConfigurationOptions], Service] = js.native
  /**
    * Calls an operation on a service with the given input parameters.
    * 
    * @param {string} operation - the name of the operation to call on the service.
    * @param {map} params - a map of input options for the operation. 
    */
  def makeRequest(operation: String): Request[_, AWSError] = js.native
  def makeRequest(operation: String, params: StringDictionary[js.Any]): Request[_, AWSError] = js.native
  def makeRequest(
    operation: String,
    params: StringDictionary[js.Any],
    callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
  ): Request[_, AWSError] = js.native
  /**
    * Calls an operation on a service with the given input parameters, without any authentication data.
    * 
    * @param {string} operation - the name of the operation to call on the service.
    * @param {map} params - a map of input options for the operation. 
    */
  def makeUnauthenticatedRequest(operation: String): Request[_, AWSError] = js.native
  def makeUnauthenticatedRequest(operation: String, params: StringDictionary[js.Any]): Request[_, AWSError] = js.native
  def makeUnauthenticatedRequest(
    operation: String,
    params: StringDictionary[js.Any],
    callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
  ): Request[_, AWSError] = js.native
  /**
    * Override this method to setup any custom request listeners for each new request to the service.
    */
  def setupRequestListeners(request: Request[_, AWSError]): Unit = js.native
  /**
    * Waits for a given state.
    */
  def waitFor(state: String): Request[_, AWSError] = js.native
  def waitFor(state: String, callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]): Request[_, AWSError] = js.native
  def waitFor(state: String, params: Anon_Key): Request[_, AWSError] = js.native
  def waitFor(
    state: String,
    params: Anon_Key,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
  ): Request[_, AWSError] = js.native
}

