package typings.asana.asanaMod.resources

import typings.asana.asanaMod.resources.Events.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An _event_ is an object representing a change to a resource that was observed
  * by an event subscription.
  *
  * In general, requesting events on a resource is faster and subject to higher
  * rate limits than requesting the resource itself. Additionally, change events
  * bubble up - listening to events on a project would include when stories are
  * added to tasks in the project, even on subtasks.
  *
  * Establish an initial sync token by making a request with no sync token.
  * The response will be a `412` error - the same as if the sync token had
  * expired.
  *
  * Subsequent requests should always provide the sync token from the immediately
  * preceding call.
  *
  * Sync tokens may not be valid if you attempt to go 'backward' in the history
  * by requesting previous tokens, though re-requesting the current sync token
  * is generally safe, and will always return the same results.
  *
  * When you receive a `412 Precondition Failed` error, it means that the
  * sync token is either invalid or expired. If you are attempting to keep a set
  * of data in sync, this signals you may need to re-crawl the data.
  *
  * Sync tokens always expire after 24 hours, but may expire sooner, depending on
  * load on the service.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@JSName("Events")
@js.native
trait Events_ extends Resource {
  /**
    * Dispatches a GET request to /events of the API to get a set of recent
    * changes to a resource.
    * @param  {Number} resourceId  The id of the resource to get events for
    * @param  {String} [syncToken] Token from a previous sync, if any
    * @return {Promise}            The result of the API call:
    *     {String} sync     The new sync token to use for the next request
    *     {Object[]} [data] The changes on the resource since the last sync,
    *                       may not exist if sync token is new.
    */
  def get(resourceId: String): typings.bluebird.bluebirdMod.^[Type] = js.native
  def get(resourceId: String, syncToken: String): typings.bluebird.bluebirdMod.^[Type] = js.native
  def get(resourceId: String, syncToken: String, params: Params): typings.bluebird.bluebirdMod.^[Type] = js.native
  def get(resourceId: Double): typings.bluebird.bluebirdMod.^[Type] = js.native
  def get(resourceId: Double, syncToken: String): typings.bluebird.bluebirdMod.^[Type] = js.native
  def get(resourceId: Double, syncToken: String, params: Params): typings.bluebird.bluebirdMod.^[Type] = js.native
}

