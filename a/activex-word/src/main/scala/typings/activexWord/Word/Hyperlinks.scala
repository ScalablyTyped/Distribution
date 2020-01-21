package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Hyperlinks")
@js.native
class Hyperlinks protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Hyperlinks_typekey")
  var WordDotHyperlinks_typekey: Hyperlinks = js.native
  def Add(Anchor: js.Any): Hyperlink = js.native
  def Add(Anchor: js.Any, Address: js.Any): Hyperlink = js.native
  def Add(Anchor: js.Any, Address: js.Any, SubAddress: js.Any): Hyperlink = js.native
  def Add(Anchor: js.Any, Address: js.Any, SubAddress: js.Any, ScreenTip: js.Any): Hyperlink = js.native
  def Add(Anchor: js.Any, Address: js.Any, SubAddress: js.Any, ScreenTip: js.Any, TextToDisplay: js.Any): Hyperlink = js.native
  def Add(
    Anchor: js.Any,
    Address: js.Any,
    SubAddress: js.Any,
    ScreenTip: js.Any,
    TextToDisplay: js.Any,
    Target: js.Any
  ): Hyperlink = js.native
  def Item(Index: js.Any): Hyperlink = js.native
  def _Add(Anchor: js.Any): Hyperlink = js.native
  def _Add(Anchor: js.Any, Address: js.Any): Hyperlink = js.native
  def _Add(Anchor: js.Any, Address: js.Any, SubAddress: js.Any): Hyperlink = js.native
}

