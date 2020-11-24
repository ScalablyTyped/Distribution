package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Author: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.Comment_typekey")
  var ExcelDotComment_typekey: Comment = js.native
  
  def Next(): Comment = js.native
  
  val Parent: js.Any = js.native
  
  def Previous(): Comment = js.native
  
  val Shape: typings.activexExcel.Excel.Shape = js.native
  
  def Text(): String = js.native
  def Text(Text: js.UndefOr[scala.Nothing], Start: js.UndefOr[scala.Nothing], Overwrite: Boolean): String = js.native
  def Text(Text: js.UndefOr[scala.Nothing], Start: Double): String = js.native
  def Text(Text: js.UndefOr[scala.Nothing], Start: Double, Overwrite: Boolean): String = js.native
  def Text(Text: String): String = js.native
  def Text(Text: String, Start: js.UndefOr[scala.Nothing], Overwrite: Boolean): String = js.native
  def Text(Text: String, Start: Double): String = js.native
  def Text(Text: String, Start: Double, Overwrite: Boolean): String = js.native
  
  var Visible: Boolean = js.native
}
