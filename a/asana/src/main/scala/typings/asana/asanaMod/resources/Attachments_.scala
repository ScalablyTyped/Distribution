package typings.asana.asanaMod.resources

import typings.asana.asanaMod.resources.Attachments.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An _attachment_ object represents any file attached to a task in Asana,
  * whether it's an uploaded file or one associated via a third-party service
  * such as Dropbox or Google Drive.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@JSName("Attachments")
@js.native
trait Attachments_ extends Resource {
  /**
    * * Returns the full record for a single attachment.
    *   * @param {Number} attachment Globally unique identifier for the attachment.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param attachment
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(attachment: Double): typings.bluebird.bluebirdMod.^[Type] = js.native
  def findById(attachment: Double, params: Params): typings.bluebird.bluebirdMod.^[Type] = js.native
  def findById(attachment: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[Type] = js.native
  /**
    * * Returns the compact records for all attachments on the task.
    *   * @param {Number} task Globally unique identifier for the task.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTask(task: String): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
}

