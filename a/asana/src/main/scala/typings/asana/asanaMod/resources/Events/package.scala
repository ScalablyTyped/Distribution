package typings.asana.asanaMod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Events {
  import typings.std.Partial

  type EventProject = EventResource with Partial[typings.asana.asanaMod.resources.Tasks.Type]
  type EventSection = EventSectionResource with Partial[typings.asana.asanaMod.resources.Sections.Type]
  type EventStory = EventResource with Partial[typings.asana.asanaMod.resources.Stories.Type]
  type EventTask = EventResource with Partial[typings.asana.asanaMod.resources.Tasks.Type]
}
