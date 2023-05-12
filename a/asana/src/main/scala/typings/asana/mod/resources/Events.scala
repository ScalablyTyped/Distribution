package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Color
import typings.asana.anon.Data
import typings.asana.anon.Dueat
import typings.asana.anon.Fallback
import typings.asana.anon.Gid
import typings.asana.anon.Resourcecolorstringenable
import typings.asana.anon.User
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Events.Type
import typings.asana.mod.resources.Users.ShortType
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Events
  extends StObject
     with TopLevelResource {
  
  /**
    * Dispatches a GET request to /events of the API to get a set of recent
    * changes to a resource.
    * @param  {String|Number} resourceId  The id of the resource to get events for
    * @param  {String} [syncToken] Token from a previous sync, if any
    * @return {Promise}            The result of the API call:
    *     {String} sync     The new sync token to use for the next request
    *     {Object[]} [data] The changes on the resource since the last sync,
    *                       may not exist if sync token is new.
    */
  def get(resourceId: String): ^[Type] = js.native
  def get(resourceId: String, syncToken: String): ^[Type] = js.native
  def get(resourceId: String, syncToken: String, params: Params): ^[Type] = js.native
  def get(resourceId: String, syncToken: Unit, params: Params): ^[Type] = js.native
  def get(resourceId: Double): ^[Type] = js.native
  def get(resourceId: Double, syncToken: String): ^[Type] = js.native
  def get(resourceId: Double, syncToken: String, params: Params): ^[Type] = js.native
  def get(resourceId: Double, syncToken: Unit, params: Params): ^[Type] = js.native
}
object Events extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Events")
  @js.native
  open class ^ protected ()
    extends StObject
       with Events {
    /**
      * @param dispatcher
      * @return
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Events")
  @js.native
  val ^ : EventsStatic = js.native
  
  trait EventDataEntity extends StObject {
    
    var action: String
    
    var created_at: String
    
    var parent: EventTask | EventProject | EventSection | Null
    
    var resource: EventTask | EventProject | EventSection | EventStory
    
    var `type`: String
    
    var user: ShortType | Null
  }
  object EventDataEntity {
    
    inline def apply(
      action: String,
      created_at: String,
      resource: EventTask | EventProject | EventSection | EventStory,
      `type`: String
    ): EventDataEntity = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], parent = null, user = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDataEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventDataEntity] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setParent(value: EventTask | EventProject | EventSection): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setResource(value: EventTask | EventProject | EventSection | EventStory): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: ShortType): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  trait EventError extends StObject {
    
    var message: String
  }
  object EventError {
    
    inline def apply(message: String): EventError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Tasks.Type> */
  trait EventProject extends StObject {
    
    var approval_status: js.UndefOr[String] = js.undefined
    
    var assignee: js.UndefOr[Assignee | Null] = js.undefined
    
    var assignee_section: js.UndefOr[Resource] = js.undefined
    
    var assignee_status: js.UndefOr[String] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var completed_at: js.UndefOr[String | Null] = js.undefined
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var custom_fields: js.UndefOr[js.Array[CustomField]] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var dependents: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var due_at: js.UndefOr[String | Null] = js.undefined
    
    var due_on: js.UndefOr[String | Null] = js.undefined
    
    var external: js.UndefOr[Data] = js.undefined
    
    var followers: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var gid: String
    
    var hearted: js.UndefOr[Boolean] = js.undefined
    
    var hearts: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var html_notes: js.UndefOr[String] = js.undefined
    
    var is_rendered_as_separator: js.UndefOr[Boolean] = js.undefined
    
    var liked: js.UndefOr[Boolean] = js.undefined
    
    var likes: js.UndefOr[js.Array[User]] = js.undefined
    
    var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
    
    var modified_at: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var notes: js.UndefOr[String] = js.undefined
    
    var num_hearts: js.UndefOr[Double] = js.undefined
    
    var num_likes: js.UndefOr[Double] = js.undefined
    
    var num_subtasks: js.UndefOr[Double] = js.undefined
    
    var parent: js.UndefOr[Resource | Null] = js.undefined
    
    var permalink_url: js.UndefOr[String] = js.undefined
    
    var projects: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var resource_subtype: String
    
    var resource_type: String
    
    var start_at: js.UndefOr[String | Null] = js.undefined
    
    var start_on: js.UndefOr[String | Null] = js.undefined
    
    var tags: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var workspace: js.UndefOr[Resource] = js.undefined
  }
  object EventProject {
    
    inline def apply(gid: String, name: String, resource_subtype: String, resource_type: String): EventProject = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventProject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventProject] (val x: Self) extends AnyVal {
      
      inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
      
      inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
      
      inline def setAssignee(value: Assignee): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setAssignee_section(value: Resource): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
      
      inline def setAssignee_sectionUndefined: Self = StObject.set(x, "assignee_section", js.undefined)
      
      inline def setAssignee_status(value: String): Self = StObject.set(x, "assignee_status", value.asInstanceOf[js.Any])
      
      inline def setAssignee_statusUndefined: Self = StObject.set(x, "assignee_status", js.undefined)
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
      
      inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
      
      inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
      
      inline def setDependencies(value: js.Array[Resource]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: Resource*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDependents(value: js.Array[Resource]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
      
      inline def setDependentsUndefined: Self = StObject.set(x, "dependents", js.undefined)
      
      inline def setDependentsVarargs(value: Resource*): Self = StObject.set(x, "dependents", js.Array(value*))
      
      inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
      
      inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
      
      inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
      
      inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
      
      inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
      
      inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFollowers(value: js.Array[Resource]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
      
      inline def setFollowersVarargs(value: Resource*): Self = StObject.set(x, "followers", js.Array(value*))
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      inline def setHeartedUndefined: Self = StObject.set(x, "hearted", js.undefined)
      
      inline def setHearts(value: js.Array[Resource]): Self = StObject.set(x, "hearts", value.asInstanceOf[js.Any])
      
      inline def setHeartsUndefined: Self = StObject.set(x, "hearts", js.undefined)
      
      inline def setHeartsVarargs(value: Resource*): Self = StObject.set(x, "hearts", js.Array(value*))
      
      inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
      
      inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
      
      inline def setIs_rendered_as_separator(value: Boolean): Self = StObject.set(x, "is_rendered_as_separator", value.asInstanceOf[js.Any])
      
      inline def setIs_rendered_as_separatorUndefined: Self = StObject.set(x, "is_rendered_as_separator", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
      
      inline def setLikes(value: js.Array[User]): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
      
      inline def setLikesVarargs(value: User*): Self = StObject.set(x, "likes", js.Array(value*))
      
      inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
      
      inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
      
      inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
      
      inline def setModified_at(value: String): Self = StObject.set(x, "modified_at", value.asInstanceOf[js.Any])
      
      inline def setModified_atUndefined: Self = StObject.set(x, "modified_at", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setNum_hearts(value: Double): Self = StObject.set(x, "num_hearts", value.asInstanceOf[js.Any])
      
      inline def setNum_heartsUndefined: Self = StObject.set(x, "num_hearts", js.undefined)
      
      inline def setNum_likes(value: Double): Self = StObject.set(x, "num_likes", value.asInstanceOf[js.Any])
      
      inline def setNum_likesUndefined: Self = StObject.set(x, "num_likes", js.undefined)
      
      inline def setNum_subtasks(value: Double): Self = StObject.set(x, "num_subtasks", value.asInstanceOf[js.Any])
      
      inline def setNum_subtasksUndefined: Self = StObject.set(x, "num_subtasks", js.undefined)
      
      inline def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPermalink_url(value: String): Self = StObject.set(x, "permalink_url", value.asInstanceOf[js.Any])
      
      inline def setPermalink_urlUndefined: Self = StObject.set(x, "permalink_url", js.undefined)
      
      inline def setProjects(value: js.Array[Resource]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: Resource*): Self = StObject.set(x, "projects", js.Array(value*))
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
      
      inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
      
      inline def setStart_atUndefined: Self = StObject.set(x, "start_at", js.undefined)
      
      inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
      
      inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
      
      inline def setStart_onUndefined: Self = StObject.set(x, "start_on", js.undefined)
      
      inline def setTags(value: js.Array[Resource]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Resource*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setWorkspace(value: Resource): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait EventResource
    extends StObject
       with Resource {
    
    @JSName("resource_subtype")
    var resource_subtype_EventResource: String
  }
  object EventResource {
    
    inline def apply(gid: String, name: String, resource_subtype: String, resource_type: String): EventResource = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventResource] (val x: Self) extends AnyVal {
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Events.EventSectionResource & std.Partial<asana.asana.resources.Sections.Type> */
  trait EventSection extends StObject {
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var gid: String
    
    var name: String
    
    var project: Gid
    
    var resource_subtype: String
    
    var resource_type: String
  }
  object EventSection {
    
    inline def apply(gid: String, name: String, project: Gid, resource_subtype: String, resource_type: String): EventSection = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSection] (val x: Self) extends AnyVal {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Gid): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSectionResource
    extends StObject
       with EventResource {
    
    var project: Gid
  }
  object EventSectionResource {
    
    inline def apply(gid: String, name: String, project: Gid, resource_subtype: String, resource_type: String): EventSectionResource = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSectionResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSectionResource] (val x: Self) extends AnyVal {
      
      inline def setProject(value: Gid): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Stories.Type> */
  trait EventStory extends StObject {
    
    var assignee: js.UndefOr[Resource] = js.undefined
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var created_by: js.UndefOr[Resource] = js.undefined
    
    var custom_field: js.UndefOr[CustomField] = js.undefined
    
    var dependency: js.UndefOr[Resource] = js.undefined
    
    var duplicate_of: js.UndefOr[Resource] = js.undefined
    
    var duplicated_from: js.UndefOr[Resource] = js.undefined
    
    var follower: js.UndefOr[Resource] = js.undefined
    
    var gid: String
    
    var hearted: js.UndefOr[Boolean] = js.undefined
    
    var hearts: js.UndefOr[js.Array[User]] = js.undefined
    
    var html_text: js.UndefOr[String] = js.undefined
    
    var is_edited: js.UndefOr[Boolean] = js.undefined
    
    var is_pinned: js.UndefOr[Boolean] = js.undefined
    
    var liked: js.UndefOr[Boolean] = js.undefined
    
    var likes: js.UndefOr[js.Array[User]] = js.undefined
    
    var name: String
    
    var new_approval_status: js.UndefOr[String] = js.undefined
    
    var new_dates: js.UndefOr[Dueat] = js.undefined
    
    var new_enum_value: js.UndefOr[Resourcecolorstringenable] = js.undefined
    
    var new_multi_enum_values: js.UndefOr[Resource & js.Array[Color]] = js.undefined
    
    var new_name: js.UndefOr[String] = js.undefined
    
    var new_number_value: js.UndefOr[Double] = js.undefined
    
    var new_resource_subtype: js.UndefOr[String] = js.undefined
    
    var new_section: js.UndefOr[Resource] = js.undefined
    
    var new_text_value: js.UndefOr[String] = js.undefined
    
    var num_hearts: js.UndefOr[Double] = js.undefined
    
    var num_likes: js.UndefOr[Double] = js.undefined
    
    var old_approval_status: js.UndefOr[String] = js.undefined
    
    var old_dates: js.UndefOr[Dueat] = js.undefined
    
    var old_enum_value: js.UndefOr[Resourcecolorstringenable] = js.undefined
    
    var old_multi_enum_values: js.UndefOr[Resource & js.Array[Color]] = js.undefined
    
    var old_name: js.UndefOr[String] = js.undefined
    
    var old_number_value: js.UndefOr[Double] = js.undefined
    
    var old_resource_subtype: js.UndefOr[String] = js.undefined
    
    var old_section: js.UndefOr[Resource] = js.undefined
    
    var old_text_value: js.UndefOr[String] = js.undefined
    
    var previews: js.UndefOr[js.Array[Fallback]] = js.undefined
    
    var project: js.UndefOr[Resource] = js.undefined
    
    var resource_subtype: String
    
    var resource_type: String
    
    var source: js.UndefOr[String] = js.undefined
    
    var sticker_name: js.UndefOr[String | Null] = js.undefined
    
    var story: js.UndefOr[typings.asana.mod.resources.Stories.ShortType] = js.undefined
    
    var tag: js.UndefOr[Resource] = js.undefined
    
    var target: js.UndefOr[Resource] = js.undefined
    
    var task: js.UndefOr[Resource] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EventStory {
    
    inline def apply(gid: String, name: String, resource_subtype: String, resource_type: String): EventStory = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventStory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventStory] (val x: Self) extends AnyVal {
      
      inline def setAssignee(value: Resource): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setCreated_by(value: Resource): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
      
      inline def setCustom_field(value: CustomField): Self = StObject.set(x, "custom_field", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldUndefined: Self = StObject.set(x, "custom_field", js.undefined)
      
      inline def setDependency(value: Resource): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
      
      inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
      
      inline def setDuplicate_of(value: Resource): Self = StObject.set(x, "duplicate_of", value.asInstanceOf[js.Any])
      
      inline def setDuplicate_ofUndefined: Self = StObject.set(x, "duplicate_of", js.undefined)
      
      inline def setDuplicated_from(value: Resource): Self = StObject.set(x, "duplicated_from", value.asInstanceOf[js.Any])
      
      inline def setDuplicated_fromUndefined: Self = StObject.set(x, "duplicated_from", js.undefined)
      
      inline def setFollower(value: Resource): Self = StObject.set(x, "follower", value.asInstanceOf[js.Any])
      
      inline def setFollowerUndefined: Self = StObject.set(x, "follower", js.undefined)
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      inline def setHeartedUndefined: Self = StObject.set(x, "hearted", js.undefined)
      
      inline def setHearts(value: js.Array[User]): Self = StObject.set(x, "hearts", value.asInstanceOf[js.Any])
      
      inline def setHeartsUndefined: Self = StObject.set(x, "hearts", js.undefined)
      
      inline def setHeartsVarargs(value: User*): Self = StObject.set(x, "hearts", js.Array(value*))
      
      inline def setHtml_text(value: String): Self = StObject.set(x, "html_text", value.asInstanceOf[js.Any])
      
      inline def setHtml_textUndefined: Self = StObject.set(x, "html_text", js.undefined)
      
      inline def setIs_edited(value: Boolean): Self = StObject.set(x, "is_edited", value.asInstanceOf[js.Any])
      
      inline def setIs_editedUndefined: Self = StObject.set(x, "is_edited", js.undefined)
      
      inline def setIs_pinned(value: Boolean): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
      
      inline def setIs_pinnedUndefined: Self = StObject.set(x, "is_pinned", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
      
      inline def setLikes(value: js.Array[User]): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
      
      inline def setLikesVarargs(value: User*): Self = StObject.set(x, "likes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNew_approval_status(value: String): Self = StObject.set(x, "new_approval_status", value.asInstanceOf[js.Any])
      
      inline def setNew_approval_statusUndefined: Self = StObject.set(x, "new_approval_status", js.undefined)
      
      inline def setNew_dates(value: Dueat): Self = StObject.set(x, "new_dates", value.asInstanceOf[js.Any])
      
      inline def setNew_datesUndefined: Self = StObject.set(x, "new_dates", js.undefined)
      
      inline def setNew_enum_value(value: Resourcecolorstringenable): Self = StObject.set(x, "new_enum_value", value.asInstanceOf[js.Any])
      
      inline def setNew_enum_valueUndefined: Self = StObject.set(x, "new_enum_value", js.undefined)
      
      inline def setNew_multi_enum_values(value: Resource & js.Array[Color]): Self = StObject.set(x, "new_multi_enum_values", value.asInstanceOf[js.Any])
      
      inline def setNew_multi_enum_valuesUndefined: Self = StObject.set(x, "new_multi_enum_values", js.undefined)
      
      inline def setNew_name(value: String): Self = StObject.set(x, "new_name", value.asInstanceOf[js.Any])
      
      inline def setNew_nameUndefined: Self = StObject.set(x, "new_name", js.undefined)
      
      inline def setNew_number_value(value: Double): Self = StObject.set(x, "new_number_value", value.asInstanceOf[js.Any])
      
      inline def setNew_number_valueUndefined: Self = StObject.set(x, "new_number_value", js.undefined)
      
      inline def setNew_resource_subtype(value: String): Self = StObject.set(x, "new_resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setNew_resource_subtypeUndefined: Self = StObject.set(x, "new_resource_subtype", js.undefined)
      
      inline def setNew_section(value: Resource): Self = StObject.set(x, "new_section", value.asInstanceOf[js.Any])
      
      inline def setNew_sectionUndefined: Self = StObject.set(x, "new_section", js.undefined)
      
      inline def setNew_text_value(value: String): Self = StObject.set(x, "new_text_value", value.asInstanceOf[js.Any])
      
      inline def setNew_text_valueUndefined: Self = StObject.set(x, "new_text_value", js.undefined)
      
      inline def setNum_hearts(value: Double): Self = StObject.set(x, "num_hearts", value.asInstanceOf[js.Any])
      
      inline def setNum_heartsUndefined: Self = StObject.set(x, "num_hearts", js.undefined)
      
      inline def setNum_likes(value: Double): Self = StObject.set(x, "num_likes", value.asInstanceOf[js.Any])
      
      inline def setNum_likesUndefined: Self = StObject.set(x, "num_likes", js.undefined)
      
      inline def setOld_approval_status(value: String): Self = StObject.set(x, "old_approval_status", value.asInstanceOf[js.Any])
      
      inline def setOld_approval_statusUndefined: Self = StObject.set(x, "old_approval_status", js.undefined)
      
      inline def setOld_dates(value: Dueat): Self = StObject.set(x, "old_dates", value.asInstanceOf[js.Any])
      
      inline def setOld_datesUndefined: Self = StObject.set(x, "old_dates", js.undefined)
      
      inline def setOld_enum_value(value: Resourcecolorstringenable): Self = StObject.set(x, "old_enum_value", value.asInstanceOf[js.Any])
      
      inline def setOld_enum_valueUndefined: Self = StObject.set(x, "old_enum_value", js.undefined)
      
      inline def setOld_multi_enum_values(value: Resource & js.Array[Color]): Self = StObject.set(x, "old_multi_enum_values", value.asInstanceOf[js.Any])
      
      inline def setOld_multi_enum_valuesUndefined: Self = StObject.set(x, "old_multi_enum_values", js.undefined)
      
      inline def setOld_name(value: String): Self = StObject.set(x, "old_name", value.asInstanceOf[js.Any])
      
      inline def setOld_nameUndefined: Self = StObject.set(x, "old_name", js.undefined)
      
      inline def setOld_number_value(value: Double): Self = StObject.set(x, "old_number_value", value.asInstanceOf[js.Any])
      
      inline def setOld_number_valueUndefined: Self = StObject.set(x, "old_number_value", js.undefined)
      
      inline def setOld_resource_subtype(value: String): Self = StObject.set(x, "old_resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setOld_resource_subtypeUndefined: Self = StObject.set(x, "old_resource_subtype", js.undefined)
      
      inline def setOld_section(value: Resource): Self = StObject.set(x, "old_section", value.asInstanceOf[js.Any])
      
      inline def setOld_sectionUndefined: Self = StObject.set(x, "old_section", js.undefined)
      
      inline def setOld_text_value(value: String): Self = StObject.set(x, "old_text_value", value.asInstanceOf[js.Any])
      
      inline def setOld_text_valueUndefined: Self = StObject.set(x, "old_text_value", js.undefined)
      
      inline def setPreviews(value: js.Array[Fallback]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      inline def setPreviewsUndefined: Self = StObject.set(x, "previews", js.undefined)
      
      inline def setPreviewsVarargs(value: Fallback*): Self = StObject.set(x, "previews", js.Array(value*))
      
      inline def setProject(value: Resource): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSticker_name(value: String): Self = StObject.set(x, "sticker_name", value.asInstanceOf[js.Any])
      
      inline def setSticker_nameNull: Self = StObject.set(x, "sticker_name", null)
      
      inline def setSticker_nameUndefined: Self = StObject.set(x, "sticker_name", js.undefined)
      
      inline def setStory(value: typings.asana.mod.resources.Stories.ShortType): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setStoryUndefined: Self = StObject.set(x, "story", js.undefined)
      
      inline def setTag(value: Resource): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTarget(value: Resource): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTask(value: Resource): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Tasks.Type> */
  trait EventTask extends StObject {
    
    var approval_status: js.UndefOr[String] = js.undefined
    
    var assignee: js.UndefOr[Assignee | Null] = js.undefined
    
    var assignee_section: js.UndefOr[Resource] = js.undefined
    
    var assignee_status: js.UndefOr[String] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var completed_at: js.UndefOr[String | Null] = js.undefined
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var custom_fields: js.UndefOr[js.Array[CustomField]] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var dependents: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var due_at: js.UndefOr[String | Null] = js.undefined
    
    var due_on: js.UndefOr[String | Null] = js.undefined
    
    var external: js.UndefOr[Data] = js.undefined
    
    var followers: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var gid: String
    
    var hearted: js.UndefOr[Boolean] = js.undefined
    
    var hearts: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var html_notes: js.UndefOr[String] = js.undefined
    
    var is_rendered_as_separator: js.UndefOr[Boolean] = js.undefined
    
    var liked: js.UndefOr[Boolean] = js.undefined
    
    var likes: js.UndefOr[js.Array[User]] = js.undefined
    
    var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
    
    var modified_at: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var notes: js.UndefOr[String] = js.undefined
    
    var num_hearts: js.UndefOr[Double] = js.undefined
    
    var num_likes: js.UndefOr[Double] = js.undefined
    
    var num_subtasks: js.UndefOr[Double] = js.undefined
    
    var parent: js.UndefOr[Resource | Null] = js.undefined
    
    var permalink_url: js.UndefOr[String] = js.undefined
    
    var projects: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var resource_subtype: String
    
    var resource_type: String
    
    var start_at: js.UndefOr[String | Null] = js.undefined
    
    var start_on: js.UndefOr[String | Null] = js.undefined
    
    var tags: js.UndefOr[js.Array[Resource]] = js.undefined
    
    var workspace: js.UndefOr[Resource] = js.undefined
  }
  object EventTask {
    
    inline def apply(gid: String, name: String, resource_subtype: String, resource_type: String): EventTask = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventTask] (val x: Self) extends AnyVal {
      
      inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
      
      inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
      
      inline def setAssignee(value: Assignee): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setAssignee_section(value: Resource): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
      
      inline def setAssignee_sectionUndefined: Self = StObject.set(x, "assignee_section", js.undefined)
      
      inline def setAssignee_status(value: String): Self = StObject.set(x, "assignee_status", value.asInstanceOf[js.Any])
      
      inline def setAssignee_statusUndefined: Self = StObject.set(x, "assignee_status", js.undefined)
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
      
      inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
      
      inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
      
      inline def setDependencies(value: js.Array[Resource]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: Resource*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDependents(value: js.Array[Resource]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
      
      inline def setDependentsUndefined: Self = StObject.set(x, "dependents", js.undefined)
      
      inline def setDependentsVarargs(value: Resource*): Self = StObject.set(x, "dependents", js.Array(value*))
      
      inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
      
      inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
      
      inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
      
      inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
      
      inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
      
      inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFollowers(value: js.Array[Resource]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
      
      inline def setFollowersVarargs(value: Resource*): Self = StObject.set(x, "followers", js.Array(value*))
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      inline def setHeartedUndefined: Self = StObject.set(x, "hearted", js.undefined)
      
      inline def setHearts(value: js.Array[Resource]): Self = StObject.set(x, "hearts", value.asInstanceOf[js.Any])
      
      inline def setHeartsUndefined: Self = StObject.set(x, "hearts", js.undefined)
      
      inline def setHeartsVarargs(value: Resource*): Self = StObject.set(x, "hearts", js.Array(value*))
      
      inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
      
      inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
      
      inline def setIs_rendered_as_separator(value: Boolean): Self = StObject.set(x, "is_rendered_as_separator", value.asInstanceOf[js.Any])
      
      inline def setIs_rendered_as_separatorUndefined: Self = StObject.set(x, "is_rendered_as_separator", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
      
      inline def setLikes(value: js.Array[User]): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
      
      inline def setLikesVarargs(value: User*): Self = StObject.set(x, "likes", js.Array(value*))
      
      inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
      
      inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
      
      inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
      
      inline def setModified_at(value: String): Self = StObject.set(x, "modified_at", value.asInstanceOf[js.Any])
      
      inline def setModified_atUndefined: Self = StObject.set(x, "modified_at", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setNum_hearts(value: Double): Self = StObject.set(x, "num_hearts", value.asInstanceOf[js.Any])
      
      inline def setNum_heartsUndefined: Self = StObject.set(x, "num_hearts", js.undefined)
      
      inline def setNum_likes(value: Double): Self = StObject.set(x, "num_likes", value.asInstanceOf[js.Any])
      
      inline def setNum_likesUndefined: Self = StObject.set(x, "num_likes", js.undefined)
      
      inline def setNum_subtasks(value: Double): Self = StObject.set(x, "num_subtasks", value.asInstanceOf[js.Any])
      
      inline def setNum_subtasksUndefined: Self = StObject.set(x, "num_subtasks", js.undefined)
      
      inline def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPermalink_url(value: String): Self = StObject.set(x, "permalink_url", value.asInstanceOf[js.Any])
      
      inline def setPermalink_urlUndefined: Self = StObject.set(x, "permalink_url", js.undefined)
      
      inline def setProjects(value: js.Array[Resource]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: Resource*): Self = StObject.set(x, "projects", js.Array(value*))
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
      
      inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
      
      inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
      
      inline def setStart_atUndefined: Self = StObject.set(x, "start_at", js.undefined)
      
      inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
      
      inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
      
      inline def setStart_onUndefined: Self = StObject.set(x, "start_on", js.undefined)
      
      inline def setTags(value: js.Array[Resource]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Resource*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setWorkspace(value: Resource): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var data: js.UndefOr[js.Array[EventDataEntity]] = js.undefined
    
    var errors: js.UndefOr[js.Array[EventError]] = js.undefined
    
    var sync: String
  }
  object Type {
    
    inline def apply(sync: String): Type = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[EventDataEntity]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: EventDataEntity*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setErrors(value: js.Array[EventError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: EventError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = EventsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Events.foo` */
  override def _to: EventsStatic = ^
}
