package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Databases extends js.Object {
  
  def apply(Item: String): Database = js.native
  def apply(Item: Double): Database = js.native
  
  val Count: Double = js.native
  
  def Item(Item: String): Database = js.native
  def Item(Item: Double): Database = js.native
  
  def Refresh(): Unit = js.native
}
