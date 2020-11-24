package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends js.Object {
  
  def apply(Index: Double): Page = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Page = js.native
  
  def _Default(Index: js.Any): Page = js.native
}
