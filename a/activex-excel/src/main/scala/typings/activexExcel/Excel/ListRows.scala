package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRows extends StObject {
  
  def apply(Index: String): ListRow = js.native
  def apply(Index: Double): ListRow = js.native
  
  def Add(): ListRow = js.native
  def Add(Position: Double): ListRow = js.native
  def Add(Position: Double, AlwaysInsert: Boolean): ListRow = js.native
  def Add(Position: Unit, AlwaysInsert: Boolean): ListRow = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ListRow = js.native
  def Item(Index: Double): ListRow = js.native
  
  val Parent: js.Any = js.native
  
  def _Add(): ListRow = js.native
  def _Add(Position: js.Any): ListRow = js.native
  
  def _Default(Index: js.Any): ListRow = js.native
}
