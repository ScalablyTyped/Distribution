package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEditionOption extends js.Object

@JSGlobal("Word.WdEditionOption")
@js.native
object WdEditionOption extends js.Object {
  @js.native
  sealed trait wdAutomaticUpdate
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdCancelPublisher
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdChangeAttributes
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdManualUpdate
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdOpenSource
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdSelectPublisher
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdSendPublisher
    extends activexDashWordLib.WordNs.WdEditionOption
  
  @js.native
  sealed trait wdUpdateSubscriber
    extends activexDashWordLib.WordNs.WdEditionOption
  
  /* 3 */ val wdAutomaticUpdate: wdAutomaticUpdate with scala.Double = js.native
  /* 0 */ val wdCancelPublisher: wdCancelPublisher with scala.Double = js.native
  /* 5 */ val wdChangeAttributes: wdChangeAttributes with scala.Double = js.native
  /* 4 */ val wdManualUpdate: wdManualUpdate with scala.Double = js.native
  /* 7 */ val wdOpenSource: wdOpenSource with scala.Double = js.native
  /* 2 */ val wdSelectPublisher: wdSelectPublisher with scala.Double = js.native
  /* 1 */ val wdSendPublisher: wdSendPublisher with scala.Double = js.native
  /* 6 */ val wdUpdateSubscriber: wdUpdateSubscriber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEditionOption with scala.Double] = js.native
}

