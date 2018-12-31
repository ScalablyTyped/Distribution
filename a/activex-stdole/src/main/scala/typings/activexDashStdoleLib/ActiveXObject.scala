package typings
package activexDashStdoleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashStdoleLib.stdoleNs.StdFont,
    event: activexDashStdoleLib.activexDashStdoleLibStrings.FontChanged,
    argNames: js.Array[activexDashStdoleLib.activexDashStdoleLibStrings.PropertyName],
    handler: js.ThisFunction1[
      /* this */ activexDashStdoleLib.stdoleNs.StdFont, 
      /* parameter */ Anon_PropertyName, 
      scala.Unit
    ]
  ): scala.Unit
}

