package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlinks extends StObject {
  
  def apply(Index: String): Hyperlink = js.native
  def apply(Index: Double): Hyperlink = js.native
  
  def Add(Anchor: Range, Address: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: Unit, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: Unit, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: Unit, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: Unit, ScreenTip: Unit, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: Unit, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: Unit, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: Unit, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: Unit, ScreenTip: Unit, TextToDisplay: String): Hyperlink = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): Hyperlink = js.native
  def Item(Index: Double): Hyperlink = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Hyperlink = js.native
}
