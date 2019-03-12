package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheets")
@js.native
class StyleSheets protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.StyleSheets_typekey`: StyleSheets = js.native
  def Add(
    FileName: java.lang.String,
    LinkType: WdStyleSheetLinkType,
    Title: java.lang.String,
    Precedence: WdStyleSheetPrecedence
  ): StyleSheet = js.native
  def Item(Index: js.Any): StyleSheet = js.native
}

