package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Typeworkspacestring
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Tags.FindAllParams
import typings.asana.mod.resources.Tags.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Tags
  extends StObject
     with Resource {
  
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
  def create(data: Typeworkspacestring): typings.bluebird.mod.^[Type] = js.native
  def create(data: Typeworkspacestring, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * Creates a new tag in a workspace or organization.
    * *
    * * Every tag is required to be created in a specific workspace or
    * * organization, and this cannot be changed once set. Note that you can use
    * * the `workspace` parameter regardless of whether or not it is an
    * * organization.
    * *
    * * Returns the full record of the newly created tag.
    *   * @param {String|Number} workspace The workspace or organization to create the tag in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: String, data: Type): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: String, data: Type, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * A specific, existing tag can be deleted by making a DELETE request
    * * on the URL for that tag.
    * *
    * * Returns an empty data record.
    *   * @param {String|Number} tag The tag to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param dispatchOptions?
    * @return
    */
  def delete(tag: String): typings.bluebird.mod.^[Unit] = js.native
  def delete(tag: String, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
  def delete(tag: Double): typings.bluebird.mod.^[Unit] = js.native
  def delete(tag: Double, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
  
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
  def findAll(): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the complete tag record for a single tag.
    *   * @param {String|Number} tag The tag to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(tag: String): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: Double): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact tag records for all tags in the workspace.
    *   * @param {String|Number} workspace The workspace or organization to find tags in.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByWorkspace(workspace: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the compact task records for all tasks with the given tag.
    * * Tasks can have more than one tag at a time.
    *   * @param {String|Number} tag The tag to fetch tasks from.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def getTasksWithTag(tag: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Updates the properties of a tag. Only the fields provided in the `data`
    * * block will be updated; any unspecified fields will remain unchanged.
    * *
    * * When using this method, it is best to specify only those fields you wish
    * * to change, or else you may overwrite changes made by another user since
    * * you last retrieved the task.
    * *
    * * Returns the complete updated tag record.
    *   * @param {String|Number} tag The tag to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(tag: String, data: Type): typings.bluebird.mod.^[Type] = js.native
  def update(tag: String, data: Type, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def update(tag: Double, data: Type): typings.bluebird.mod.^[Type] = js.native
  def update(tag: Double, data: Type, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
}
object Tags extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Tags")
  @js.native
  class ^ protected ()
    extends StObject
       with Tags {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Tags")
  @js.native
  val ^ : TagsStatic = js.native
  
  trait FindAllParams
    extends StObject
       with PaginationParams {
    
    var archived: js.UndefOr[Boolean] = js.undefined
    
    var team: js.UndefOr[String | Double] = js.undefined
  }
  object FindAllParams {
    
    @scala.inline
    def apply(): FindAllParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit class FindAllParamsMutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
      
      @scala.inline
      def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  @js.native
  trait Type
    extends StObject
       with Resource {
    
    var color: String = js.native
    
    var created_at: String = js.native
    
    var followers: js.Array[Resource] = js.native
    
    var notes: String = js.native
    
    var workspace: Resource = js.native
  }
  
  type _To = TagsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Tags.foo` */
  override def _to: TagsStatic = ^
}
