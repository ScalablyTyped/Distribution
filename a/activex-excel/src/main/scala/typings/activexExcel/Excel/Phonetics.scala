package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phonetics extends js.Object {
  
  def apply(Index: Double): Phonetic = js.native
  
  def Add(Start: Double, Length: Double, Text: String): Unit = js.native
  
  var Alignment: Double = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var CharacterType: Double = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  def Item(Index: Double): Phonetic = js.native
  
  val Length: Double = js.native
  
  val Parent: js.Any = js.native
  
  val Start: Double = js.native
  
  var Text: String = js.native
  
  var Visible: Boolean = js.native
  
  def _Default(Index: Double): js.Any = js.native
}
