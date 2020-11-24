package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recordsets extends js.Object {
  
  def apply(Item: String): Recordset = js.native
  def apply(Item: Double): Recordset = js.native
  
  val Count: Double = js.native
  
  def Item(Item: String): Recordset = js.native
  def Item(Item: Double): Recordset = js.native
  
  def Refresh(): Unit = js.native
}
