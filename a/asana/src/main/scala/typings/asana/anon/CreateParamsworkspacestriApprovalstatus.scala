package typings.asana.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Tasks.CreateParams & {  workspace :string} */
trait CreateParamsworkspacestriApprovalstatus extends StObject {
  
  var approval_status: js.UndefOr[String] = js.undefined
  
  var assignee: js.UndefOr[String] = js.undefined
  
  var assignee_section: js.UndefOr[String] = js.undefined
  
  // assignee_status: string; // deprecated - use assignee_section
  var completed: js.UndefOr[Boolean] = js.undefined
  
  // hearted?: boolean | undefined; // deprecated and removed from documentation
  var custom_fields: js.UndefOr[StringDictionary[Double | String]] = js.undefined
  
  var due_at: js.UndefOr[String] = js.undefined
  
  var due_on: js.UndefOr[String | Null] = js.undefined
  
  var external: js.UndefOr[Data] = js.undefined
  
  var followers: js.UndefOr[js.Array[String]] = js.undefined
  
  // create-only
  var html_notes: js.UndefOr[String] = js.undefined
  
  var liked: js.UndefOr[Boolean] = js.undefined
  
  var memberships: js.UndefOr[js.Array[Project]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var projects: js.UndefOr[js.Array[String]] = js.undefined
  
  // create-only
  var resource_subtype: js.UndefOr[String] = js.undefined
  
  var start_at: js.UndefOr[String | Null] = js.undefined
  
  var start_on: js.UndefOr[String | Null] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  // create-only
  var workspace: js.UndefOr[String] & String
}
object CreateParamsworkspacestriApprovalstatus {
  
  inline def apply(workspace: js.UndefOr[String] & String): CreateParamsworkspacestriApprovalstatus = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacestriApprovalstatus]
  }
  
  extension [Self <: CreateParamsworkspacestriApprovalstatus](x: Self) {
    
    inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
    
    inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
    
    inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setAssignee_section(value: String): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
    
    inline def setAssignee_sectionUndefined: Self = StObject.set(x, "assignee_section", js.undefined)
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setCustom_fields(value: StringDictionary[Double | String]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
    
    inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
    
    inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setFollowers(value: js.Array[String]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
    
    inline def setFollowersVarargs(value: String*): Self = StObject.set(x, "followers", js.Array(value*))
    
    inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
    
    inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
    
    inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
    
    inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
    
    inline def setMemberships(value: js.Array[Project]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: Project*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
    
    inline def setResource_subtypeUndefined: Self = StObject.set(x, "resource_subtype", js.undefined)
    
    inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
    
    inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
    
    inline def setStart_atUndefined: Self = StObject.set(x, "start_at", js.undefined)
    
    inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
    
    inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
    
    inline def setStart_onUndefined: Self = StObject.set(x, "start_on", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWorkspace(value: js.UndefOr[String] & String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
