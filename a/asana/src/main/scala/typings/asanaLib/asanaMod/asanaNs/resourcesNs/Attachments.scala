package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

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
@js.native
trait Attachments extends Resource {
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
  def findById(attachment: scala.Double): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type] = js.native
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
  def findById(attachment: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type] = js.native
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
  def findById(attachment: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type] = js.native
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
  def findByTask(task: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type]] = js.native
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
  def findByTask(task: scala.Double, params: PaginationParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type]] = js.native
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
  def findByTask(task: scala.Double, params: PaginationParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.AttachmentsNs.Type]] = js.native
}

