package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperlinks extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Hyperlink = js.native
  def apply(Index: Double): Hyperlink = js.native
  def Add(Anchor: Range, Address: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Delete(): Unit = js.native
  def Item(Index: String): Hyperlink = js.native
  def Item(Index: Double): Hyperlink = js.native
  def _Default(Index: js.Any): Hyperlink = js.native
}

