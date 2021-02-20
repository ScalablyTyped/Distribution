package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupShapes extends StObject {
  
  def apply(Index: String): Shape = js.native
  def apply(Index: Double): Shape = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Shape = js.native
  def Item(Index: Double): Shape = js.native
  
  val Parent: js.Any = js.native
  
  def Range(Index: String): ShapeRange = js.native
  def Range(Index: Double): ShapeRange = js.native
  def Range(Index: SafeArray[Double | String]): ShapeRange = js.native
  
  def _Default(Index: js.Any): Shape = js.native
}
