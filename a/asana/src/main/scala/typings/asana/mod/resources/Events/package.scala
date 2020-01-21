package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Events {
  type EventProject = typings.asana.mod.resources.Events.EventResource with typings.std.Partial[typings.asana.mod.resources.Tasks.Type]
  type EventSection = typings.asana.mod.resources.Events.EventSectionResource with typings.std.Partial[typings.asana.mod.resources.Sections.Type]
  type EventStory = typings.asana.mod.resources.Events.EventResource with typings.std.Partial[typings.asana.mod.resources.Stories.Type]
  type EventTask = typings.asana.mod.resources.Events.EventResource with typings.std.Partial[typings.asana.mod.resources.Tasks.Type]
}
