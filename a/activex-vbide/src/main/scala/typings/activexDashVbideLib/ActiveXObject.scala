package typings
package activexDashVbideLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashVbideLib.VBIDENs.CommandBarEvents,
    event: activexDashVbideLib.activexDashVbideLibStrings.Click,
    argNames: js.Tuple3[
      activexDashVbideLib.activexDashVbideLibStrings.CommandBarControl, 
      activexDashVbideLib.activexDashVbideLibStrings.handled, 
      activexDashVbideLib.activexDashVbideLibStrings.CancelDefault
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashVbideLib.VBIDENs.CommandBarEvents, 
      /* parameter */ Anon_CancelDefault, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashVbideLib.VBIDENs.ReferencesEvents,
    event: activexDashVbideLib.activexDashVbideLibStrings.ItemAdded,
    argNames: js.Array[activexDashVbideLib.activexDashVbideLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashVbideLib.VBIDENs.ReferencesEvents, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashVbideLib.VBIDENs.ReferencesEvents,
    event: activexDashVbideLib.activexDashVbideLibStrings.ItemRemoved,
    argNames: js.Array[activexDashVbideLib.activexDashVbideLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashVbideLib.VBIDENs.ReferencesEvents, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashVbideLib.VBIDENs.References,
    event: activexDashVbideLib.activexDashVbideLibStrings.ItemAdded,
    argNames: js.Array[activexDashVbideLib.activexDashVbideLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashVbideLib.VBIDENs.References, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashVbideLib.VBIDENs.References,
    event: activexDashVbideLib.activexDashVbideLibStrings.ItemRemoved,
    argNames: js.Array[activexDashVbideLib.activexDashVbideLibStrings.Reference],
    handler: js.ThisFunction1[
      /* this */ activexDashVbideLib.VBIDENs.References, 
      /* parameter */ Anon_Reference, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

