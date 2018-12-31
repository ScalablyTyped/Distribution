package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "Request")
@js.native
class Request[D, E] protected ()
  extends awsDashSdkLib.libCoreMod.Request[D, E] {
  /**
    * Creates a request for an operation on a given service with a set of input parameters.
    *
    * @param {AWS.Service} service - The service to perform the operation on.
    * @param {string} operation - The operation to perform on the service.
    * @param {object} params - Parameters to send to the operation.
    */
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String) = this()
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String, params: js.Any) = this()
}

