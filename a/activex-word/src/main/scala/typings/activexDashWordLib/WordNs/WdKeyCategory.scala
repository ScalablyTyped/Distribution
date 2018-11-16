package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdKeyCategory extends js.Object

@JSGlobal("Word.WdKeyCategory")
@js.native
object WdKeyCategory extends js.Object {
  @js.native
  sealed trait wdKeyCategoryAutoText
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryCommand
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryDisable
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryFont
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryMacro
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryNil
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryPrefix
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategoryStyle
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  @js.native
  sealed trait wdKeyCategorySymbol
    extends activexDashWordLib.WordNs.WdKeyCategory
  
  /* 4 */ val wdKeyCategoryAutoText: wdKeyCategoryAutoText with scala.Double = js.native
  /* 1 */ val wdKeyCategoryCommand: wdKeyCategoryCommand with scala.Double = js.native
  /* 0 */ val wdKeyCategoryDisable: wdKeyCategoryDisable with scala.Double = js.native
  /* 3 */ val wdKeyCategoryFont: wdKeyCategoryFont with scala.Double = js.native
  /* 2 */ val wdKeyCategoryMacro: wdKeyCategoryMacro with scala.Double = js.native
  /* -1 */ val wdKeyCategoryNil: wdKeyCategoryNil with scala.Double = js.native
  /* 7 */ val wdKeyCategoryPrefix: wdKeyCategoryPrefix with scala.Double = js.native
  /* 5 */ val wdKeyCategoryStyle: wdKeyCategoryStyle with scala.Double = js.native
  /* 6 */ val wdKeyCategorySymbol: wdKeyCategorySymbol with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdKeyCategory with scala.Double] = js.native
}

