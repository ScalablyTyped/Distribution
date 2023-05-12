package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Typeworkspacestring
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Tags.FindAllParams
import typings.asana.mod.resources.Tags.Type
import typings.bluebird.mod.^
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
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Tags
  extends StObject
     with TopLevelResource {
  
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
  def create(data: Typeworkspacestring): ^[Type] = js.native
  def create(data: Typeworkspacestring, dispatchOptions: Any): ^[Type] = js.native
  
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
  def createInWorkspace(workspace: String, data: Type): ^[Type] = js.native
  def createInWorkspace(workspace: String, data: Type, dispatchOptions: Any): ^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type): ^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type, dispatchOptions: Any): ^[Type] = js.native
  
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
  def delete(tag: String): ^[Unit] = js.native
  def delete(tag: String, dispatchOptions: Any): ^[Unit] = js.native
  def delete(tag: Double): ^[Unit] = js.native
  def delete(tag: Double, dispatchOptions: Any): ^[Unit] = js.native
  
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
  def findAll(params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): ^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  
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
  def findById(tag: String): ^[Type] = js.native
  def findById(tag: String, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(tag: String, params: Params): ^[Type] = js.native
  def findById(tag: String, params: Params, dispatchOptions: Any): ^[Type] = js.native
  def findById(tag: Double): ^[Type] = js.native
  def findById(tag: Double, params: Unit, dispatchOptions: Any): ^[Type] = js.native
  def findById(tag: Double, params: Params): ^[Type] = js.native
  def findById(tag: Double, params: Params, dispatchOptions: Any): ^[Type] = js.native
  
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
  def findByWorkspace(workspace: String): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  
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
  def getTasksWithTag(tag: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def update(tag: String, data: Type): ^[Type] = js.native
  def update(tag: String, data: Type, dispatchOptions: Any): ^[Type] = js.native
  def update(tag: Double, data: Type): ^[Type] = js.native
  def update(tag: Double, data: Type, dispatchOptions: Any): ^[Type] = js.native
}
object Tags extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Tags")
  @js.native
  open class ^ protected ()
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
    
    inline def apply(): FindAllParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
      
      inline def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  trait Type
    extends StObject
       with Resource {
    
    var color: String
    
    var created_at: String
    
    var followers: js.Array[Resource]
    
    var notes: String
    
    var workspace: Resource
  }
  object Type {
    
    inline def apply(
      color: String,
      created_at: String,
      followers: js.Array[Resource],
      gid: String,
      name: String,
      notes: String,
      resource_type: String,
      workspace: Resource
    ): Type = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setFollowers(value: js.Array[Resource]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersVarargs(value: Resource*): Self = StObject.set(x, "followers", js.Array(value*))
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setWorkspace(value: Resource): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = TagsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Tags.foo` */
  override def _to: TagsStatic = ^
}
