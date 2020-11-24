package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAccessList extends js.Object {
  
  def apply(Index: String): UserAccess = js.native
  def apply(Index: Double): UserAccess = js.native
  
  def Add(Name: String, AllowEdit: Boolean): UserAccess = js.native
  
  val Count: Double = js.native
  
  def DeleteAll(): Unit = js.native
  
  def Item(Index: String): UserAccess = js.native
  def Item(Index: Double): UserAccess = js.native
  
  def _Default(Index: js.Any): UserAccess = js.native
}
