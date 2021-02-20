package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAccessList extends StObject {
  
  def apply(Index: String): UserAccess = js.native
  def apply(Index: Double): UserAccess = js.native
  
  def Add(Name: String, AllowEdit: Boolean): UserAccess = js.native
  
  val Count: Double = js.native
  
  def DeleteAll(): Unit = js.native
  
  def Item(Index: String): UserAccess = js.native
  def Item(Index: Double): UserAccess = js.native
  
  def _Default(Index: js.Any): UserAccess = js.native
}
