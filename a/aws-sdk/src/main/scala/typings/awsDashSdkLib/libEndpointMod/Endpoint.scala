package typings
package awsDashSdkLib.libEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/endpoint", "Endpoint")
@js.native
class Endpoint protected () extends js.Object {
  /**
    * Constructs a new endpoint given an endpoint URL.
    */
  def this(url: java.lang.String) = this()
  /**
    * The host portion of the endpoint including the port, e.g., example.com:80.
    */
  var host: java.lang.String = js.native
  /**
    * The host portion of the endpoint, e.g., example.com.
    */
  var hostname: java.lang.String = js.native
  /**
    * The full URL of the endpoint.
    */
  var href: java.lang.String = js.native
  /**
    * The port of the endpoint.
    */
  var port: scala.Double = js.native
  /**
    * The protocol (http or https) of the endpoint URL.
    */
  var protocol: java.lang.String = js.native
}

