package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdConstants extends js.Object

@JSGlobal("Word.WdConstants")
@js.native
object WdConstants extends js.Object {
  @js.native
  sealed trait wdAutoPosition
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdBackward
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdCreatorCode
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdFirst
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdForward
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdToggle
    extends activexDashWordLib.WordNs.WdConstants
  
  @js.native
  sealed trait wdUndefined
    extends activexDashWordLib.WordNs.WdConstants
  
  /* 0 */ val wdAutoPosition: wdAutoPosition with scala.Double = js.native
  /* -1073741823 */ val wdBackward: wdBackward with scala.Double = js.native
  /* 1297307460 */ val wdCreatorCode: wdCreatorCode with scala.Double = js.native
  /* 1 */ val wdFirst: wdFirst with scala.Double = js.native
  /* 1073741823 */ val wdForward: wdForward with scala.Double = js.native
  /* 9999998 */ val wdToggle: wdToggle with scala.Double = js.native
  /* 9999999 */ val wdUndefined: wdUndefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdConstants with scala.Double] = js.native
}

