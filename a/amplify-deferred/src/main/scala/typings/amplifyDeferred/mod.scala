package typings.amplifyDeferred

import typings.amplify.mod.RequestSettings
import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("amplify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Request extends js.Object {
    /***
      * Request a resource.
      * resourceId: Identifier string for the resource.
      * data: A set of key/value pairs of data to be sent to the resource.
      * callback: A function to invoke if the resource is retrieved successfully.
      */
    def apply(resourceId: String): JQueryPromise[_] = js.native
    def apply(resourceId: String, hash: js.UndefOr[scala.Nothing], callback: js.Function): JQueryPromise[_] = js.native
    def apply(resourceId: String, hash: js.Any): JQueryPromise[_] = js.native
    def apply(resourceId: String, hash: js.Any, callback: js.Function): JQueryPromise[_] = js.native
    /***
      * Request a resource.
      * settings: A set of key/value pairs of settings for the request.
      *   resourceId: Identifier string for the resource.
      *   data (optional): Data associated with the request.
      *   success (optional): Function to invoke on success.
      *   error (optional): Function to invoke on error.
      */
    def apply(settings: RequestSettings): JQueryPromise[_] = js.native
  }
  
}

