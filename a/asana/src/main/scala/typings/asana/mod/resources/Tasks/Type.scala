package typings.asana.mod.resources.Tasks

import typings.asana.mod.resources.Assignee
import typings.asana.mod.resources.CustomField
import typings.asana.mod.resources.Membership
import typings.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends Resource {
  var assignee: Assignee | Null = js.native
  var assignee_status: String = js.native
  var completed: Boolean = js.native
  var completed_at: String | Null = js.native
  var created_at: String = js.native
  var custom_fields: js.Array[CustomField] = js.native
  var due_at: String = js.native
  var due_on: String = js.native
  var followers: js.Array[Resource] = js.native
  var hearted: Boolean = js.native
  var memberships: js.Array[Membership] = js.native
  var modified_at: String = js.native
  var notes: String = js.native
  var num_hearts: Double = js.native
  var parent: Resource = js.native
  var projects: js.Array[Resource] = js.native
  var tags: js.Array[Resource] = js.native
  var workspace: Resource = js.native
}

