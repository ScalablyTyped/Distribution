package typings
package amplifyDashDeferredLib.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def apply(resourceId: java.lang.String): jqueryLib.JQueryPromise[_] = js.native
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def apply(resourceId: java.lang.String, hash: js.Any): jqueryLib.JQueryPromise[_] = js.native
  /***
          * Request a resource.
          * resourceId: Identifier string for the resource.
          * data: A set of key/value pairs of data to be sent to the resource.
          * callback: A function to invoke if the resource is retrieved successfully.
          */
  def apply(resourceId: java.lang.String, hash: js.Any, callback: js.Function): jqueryLib.JQueryPromise[_] = js.native
  /***
          * Request a resource.
          * settings: A set of key/value pairs of settings for the request.
          *   resourceId: Identifier string for the resource.
          *   data (optional): Data associated with the request.
          *   success (optional): Function to invoke on success.
          *   error (optional): Function to invoke on error.
          */
  def apply(settings: amplifyLib.amplifyMod.amplifyNs.RequestSettings): jqueryLib.JQueryPromise[_] = js.native
}

