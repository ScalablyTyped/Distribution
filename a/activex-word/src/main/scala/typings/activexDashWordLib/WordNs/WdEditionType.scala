package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEditionType extends js.Object

@JSGlobal("Word.WdEditionType")
@js.native
object WdEditionType extends js.Object {
  @js.native
  sealed trait wdPublisher
    extends activexDashWordLib.WordNs.WdEditionType
  
  @js.native
  sealed trait wdSubscriber
    extends activexDashWordLib.WordNs.WdEditionType
  
  /* 0 */ val wdPublisher: wdPublisher with scala.Double = js.native
  /* 1 */ val wdSubscriber: wdSubscriber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEditionType with scala.Double] = js.native
}

