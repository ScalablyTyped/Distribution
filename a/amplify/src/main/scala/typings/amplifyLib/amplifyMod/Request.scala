package typings
package amplifyLib.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var cache: js.Any = js.native
  var decoders: Decoders = js.native
  /***
    * Request a resource.
    * resourceId: Identifier string for the resource.
    * data: A set of key/value pairs of data to be sent to the resource.
    * callback: A function to invoke if the resource is retrieved successfully.
    */
  def apply(resourceId: java.lang.String): scala.Unit = js.native
  def apply(resourceId: java.lang.String, hash: js.Any): scala.Unit = js.native
  def apply(resourceId: java.lang.String, hash: js.Any, callback: js.Function): scala.Unit = js.native
  /***
    * Request a resource.
    * settings: A set of key/value pairs of settings for the request.
    *   resourceId: Identifier string for the resource.
    *   data (optional): Data associated with the request.
    *   success (optional): Function to invoke on success.
    *   error (optional): Function to invoke on error.
    */
  def apply(settings: RequestSettings): js.Any = js.native
  /***
    * Define a resource.
    * resourceId: Identifier string for the resource.
    * requestType: The type of data retrieval method from the server. See the request types sections for more information.
    * settings: A set of key/value pairs that relate to the server communication technology. The following settings are available:
    *   Any settings found in jQuery.ajax().
    *   cache: See the cache section for more details.
    *   decoder: See the decoder section for more details.
    */
  def define(resourceId: java.lang.String, requestType: java.lang.String): scala.Unit = js.native
  def define(resourceId: java.lang.String, requestType: java.lang.String, settings: AjaxSettings): scala.Unit = js.native
  /***
    * Define a custom request.
    * resourceId: Identifier string for the resource.
    * resource: Function to handle requests. Receives a hash with the following properties:
    *   resourceId: Identifier string for the resource.
    *   data: Data provided by the user.
    *   success: Callback to invoke on success.
    *   error: Callback to invoke on error.
    */
  def define(resourceId: java.lang.String, resource: js.Function1[/* settings */ RequestSettings, scala.Unit]): scala.Unit = js.native
}

