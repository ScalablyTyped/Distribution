package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlDraggable extends js.Object

@JSGlobal("MSHTML._htmlDraggable")
@js.native
object _htmlDraggable extends js.Object {
  @js.native
  sealed trait htmlDraggableAuto
    extends activexDashMshtmlLib.MSHTMLNs._htmlDraggable
  
  @js.native
  sealed trait htmlDraggableFalse
    extends activexDashMshtmlLib.MSHTMLNs._htmlDraggable
  
  @js.native
  sealed trait htmlDraggableTrue
    extends activexDashMshtmlLib.MSHTMLNs._htmlDraggable
  
  @js.native
  sealed trait htmlDraggable_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlDraggable
  
  /* 0 */ val htmlDraggableAuto: htmlDraggableAuto with scala.Double = js.native
  /* 2 */ val htmlDraggableFalse: htmlDraggableFalse with scala.Double = js.native
  /* 1 */ val htmlDraggableTrue: htmlDraggableTrue with scala.Double = js.native
  /* 2147483647 */ val htmlDraggable_Max: htmlDraggable_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlDraggable with scala.Double] = js.native
}

