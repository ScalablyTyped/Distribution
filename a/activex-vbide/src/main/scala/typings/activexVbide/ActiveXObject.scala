package typings.activexVbide

import typings.activexVbide.VBIDE.CommandBarEvents
import typings.activexVbide.VBIDE.References
import typings.activexVbide.VBIDE.ReferencesEvents
import typings.activexVbide.activexVbideStrings.CancelDefault
import typings.activexVbide.activexVbideStrings.Click
import typings.activexVbide.activexVbideStrings.CommandBarControl
import typings.activexVbide.activexVbideStrings.ItemAdded
import typings.activexVbide.activexVbideStrings.ItemRemoved
import typings.activexVbide.activexVbideStrings.Reference
import typings.activexVbide.activexVbideStrings.handled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[
      /* this */ CommandBarEvents, 
      /* parameter */ typings.activexVbide.anon.CancelDefault, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ ReferencesEvents, 
      /* parameter */ typings.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ ReferencesEvents, 
      /* parameter */ typings.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ typings.activexVbide.anon.Reference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ typings.activexVbide.anon.Reference, Unit]
  ): Unit = js.native
}
