package typings
package awsDashSdkLib.libServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/service", "Service")
@js.native
class Service () extends js.Object {
  /**
       * Creates a new service object with a configuration object.
       */
  def this(config: ServiceConfigurationOptions) = this()
  /**
       * The list of API versions supported by this service.
       */
  var apiVersions: js.Array[java.lang.String] = js.native
  var config: awsDashSdkLib.libConfigMod.ConfigBase with ServiceConfigurationOptions = js.native
  /**
       * An Endpoint object representing the endpoint URL for service requests.
       */
  var endpoint: awsDashSdkLib.libEndpointMod.Endpoint = js.native
  /**
       * Defines a new Service class using a service identifier and list of versions including an optional set of features (functions) to apply to the class prototype.
       * 
       * @param {string} serviceIdentifier - the identifier for the service.
       * @param {string[]} versions - a list of versions that work with this service.
       * @param {Object} features - an object to attach to the prototype.
       */
  def defineService(serviceIdentifier: java.lang.String, versions: js.Array[java.lang.String]): ScalablyTyped.runtime.Instantiable1[/* config */ js.UndefOr[/* config */ ServiceConfigurationOptions], Service] = js.native
  /**
       * Defines a new Service class using a service identifier and list of versions including an optional set of features (functions) to apply to the class prototype.
       * 
       * @param {string} serviceIdentifier - the identifier for the service.
       * @param {string[]} versions - a list of versions that work with this service.
       * @param {Object} features - an object to attach to the prototype.
       */
  def defineService(serviceIdentifier: java.lang.String, versions: js.Array[java.lang.String], features: js.Any): ScalablyTyped.runtime.Instantiable1[/* config */ js.UndefOr[/* config */ ServiceConfigurationOptions], Service] = js.native
  /**
       * Calls an operation on a service with the given input parameters.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeRequest(operation: java.lang.String): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Calls an operation on a service with the given input parameters.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeRequest(operation: java.lang.String, params: ScalablyTyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Calls an operation on a service with the given input parameters.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeRequest(
    operation: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[js.Any],
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Calls an operation on a service with the given input parameters, without any authentication data.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeUnauthenticatedRequest(operation: java.lang.String): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Calls an operation on a service with the given input parameters, without any authentication data.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeUnauthenticatedRequest(operation: java.lang.String, params: ScalablyTyped.runtime.StringDictionary[js.Any]): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Calls an operation on a service with the given input parameters, without any authentication data.
       * 
       * @param {string} operation - the name of the operation to call on the service.
       * @param {map} params - a map of input options for the operation. 
       */
  def makeUnauthenticatedRequest(
    operation: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[js.Any],
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Override this method to setup any custom request listeners for each new request to the service.
       */
  def setupRequestListeners(request: awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError]): scala.Unit = js.native
  /**
       * Waits for a given state.
       */
  def waitFor(state: java.lang.String): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def waitFor(
    state: java.lang.String,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Waits for a given state.
       */
  def waitFor(state: java.lang.String, params: awsDashSdkLib.Anon_Key): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
       * Waits for a given state.
       */
  def waitFor(
    state: java.lang.String,
    params: awsDashSdkLib.Anon_Key,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Any, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[_, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

