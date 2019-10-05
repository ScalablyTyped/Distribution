package typings.activexDashVbide

import typings.activexDashVbide.VBIDE.CommandBarEvents
import typings.activexDashVbide.VBIDE.References
import typings.activexDashVbide.VBIDE.ReferencesEvents
import typings.activexDashVbide.activexDashVbideStrings.CancelDefault
import typings.activexDashVbide.activexDashVbideStrings.Click
import typings.activexDashVbide.activexDashVbideStrings.CommandBarControl
import typings.activexDashVbide.activexDashVbideStrings.ItemAdded
import typings.activexDashVbide.activexDashVbideStrings.ItemRemoved
import typings.activexDashVbide.activexDashVbideStrings.Reference
import typings.activexDashVbide.activexDashVbideStrings.handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarEvents, /* parameter */ Anon_CancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ Anon_Reference, Unit]
  ): Unit = js.native
}

