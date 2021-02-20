package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowEditRanges extends StObject {
  
  def apply(Index: String): AllowEditRange = js.native
  def apply(Index: Double): AllowEditRange = js.native
  
  def Add(Title: String, Range: Range): AllowEditRange = js.native
  def Add(Title: String, Range: Range, Password: String): AllowEditRange = js.native
  
  val Count: Double = js.native
  
  def Item(Index: String): AllowEditRange = js.native
  def Item(Index: Double): AllowEditRange = js.native
  
  def _Default(Index: String): AllowEditRange = js.native
  def _Default(Index: Double): AllowEditRange = js.native
}
