package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watches extends StObject {
  
  def apply(Index: String): Watch = js.native
  def apply(Index: Double): Watch = js.native
  
  def Add(Source: js.Any): Watch = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): Watch = js.native
  def Item(Index: Double): Watch = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Watch = js.native
}
