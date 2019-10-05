package typings.asana.asanaMod.resources

import typings.asana.Anon_WorkspaceString
import typings.asana.asanaMod.resources.Tags.FindAllParams
import typings.asana.asanaMod.resources.Tags.Type
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A _tag_ is a label that can be attached to any task in Asana. It exists in a
  * single workspace or organization.
  *
  * Tags have some metadata associated with them, but it is possible that we will
  * simplify them in the future so it is not encouraged to rely too heavily on it.
  * Unlike projects, tags do not provide any ordering on the tasks they
  * are associated with.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@JSName("Tags")
@js.native
trait Tags_ extends Resource {
  /**
    * * Creates a new tag in a workspace or organization.
    * *
    * * Every tag is required to be created in a specific workspace or
    * * organization, and this cannot be changed once set. Note that you can use
    * * the `workspace` parameter regardless of whether or not it is an
    * * organization.
    * *
    * * Returns the full record of the newly created tag.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.workspace The workspace or organization to create the tag in.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(data: Type with Anon_WorkspaceString): ^[Type] = js.native
  def create(data: Type with Anon_WorkspaceString, dispatchOptions: js.Any): ^[Type] = js.native
  /**
    * * Creates a new tag in a workspace or organization.
    * *
    * * Every tag is required to be created in a specific workspace or
    * * organization, and this cannot be changed once set. Note that you can use
    * * the `workspace` parameter regardless of whether or not it is an
    * * organization.
    * *
    * * Returns the full record of the newly created tag.
    *   * @param {Number} workspace The workspace or organization to create the tag in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: Double, data: Type): ^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type, dispatchOptions: js.Any): ^[Type] = js.native
  /**
    * * A specific, existing tag can be deleted by making a DELETE request
    * * on the URL for that tag.
    * *
    * * Returns an empty data record.
    *   * @param {Number} tag The tag to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param dispatchOptions?
    * @return
    */
  def delete(tag: Double): ^[Unit] = js.native
  def delete(tag: Double, dispatchOptions: js.Any): ^[Unit] = js.native
  /**
    * * Returns the compact tag records for some filtered set of tags.
    * * Use one or more of the parameters provided to filter the tags returned.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {String} [params.workspace] The workspace or organization to filter tags on.
    *   * @param {String} [params.team] The team to filter tags on.
    *   * @param {Boolean} [params.archived] Only return tags whose `archived` field takes on the value of
    *   * this parameter.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): ^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): ^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): ^[ResourceList[Type]] = js.native
  /**
    * * Returns the complete tag record for a single tag.
    *   * @param {Number} tag The tag to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(tag: Double): ^[Type] = js.native
  def findById(tag: Double, params: Params): ^[Type] = js.native
  def findById(tag: Double, params: Params, dispatchOptions: js.Any): ^[Type] = js.native
  /**
    * * Returns the compact tag records for all tags in the workspace.
    *   * @param {Number} workspace The workspace or organization to find tags in.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByWorkspace(workspace: Double): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams, dispatchOptions: js.Any): ^[ResourceList[Type]] = js.native
  /**
    * * Returns the compact task records for all tasks with the given tag.
    * * Tasks can have more than one tag at a time.
    *   * @param {Number} tag The tag to fetch tasks from.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def getTasksWithTag(tag: Double): ^[ResourceList[typings.asana.asanaMod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams): ^[ResourceList[typings.asana.asanaMod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): ^[ResourceList[typings.asana.asanaMod.resources.Tasks.Type]] = js.native
  /**
    * * Updates the properties of a tag. Only the fields provided in the `data`
    * * block will be updated; any unspecified fields will remain unchanged.
    * *
    * * When using this method, it is best to specify only those fields you wish
    * * to change, or else you may overwrite changes made by another user since
    * * you last retrieved the task.
    * *
    * * Returns the complete updated tag record.
    *   * @param {Number} tag The tag to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(tag: Double, data: Type): ^[Type] = js.native
  def update(tag: Double, data: Type, dispatchOptions: js.Any): ^[Type] = js.native
}

