package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperlinks extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Hyperlink = js.native
  def apply(Index: scala.Double): Hyperlink = js.native
  def Add(Anchor: Range, Address: java.lang.String): Hyperlink = js.native
  def Add(Anchor: Range, Address: java.lang.String, SubAddress: java.lang.String): Hyperlink = js.native
  def Add(
    Anchor: Range,
    Address: java.lang.String,
    SubAddress: java.lang.String,
    ScreenTip: java.lang.String
  ): Hyperlink = js.native
  def Add(
    Anchor: Range,
    Address: java.lang.String,
    SubAddress: java.lang.String,
    ScreenTip: java.lang.String,
    TextToDisplay: java.lang.String
  ): Hyperlink = js.native
  def Add(Anchor: Shape, Address: java.lang.String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: java.lang.String, SubAddress: java.lang.String): Hyperlink = js.native
  def Add(
    Anchor: Shape,
    Address: java.lang.String,
    SubAddress: java.lang.String,
    ScreenTip: java.lang.String
  ): Hyperlink = js.native
  def Add(
    Anchor: Shape,
    Address: java.lang.String,
    SubAddress: java.lang.String,
    ScreenTip: java.lang.String,
    TextToDisplay: java.lang.String
  ): Hyperlink = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: java.lang.String): Hyperlink = js.native
  def Item(Index: scala.Double): Hyperlink = js.native
  def _Default(Index: js.Any): Hyperlink = js.native
}

