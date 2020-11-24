package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends js.Object {
  
  def apply(Item: String): Group = js.native
  def apply(Item: Double): Group = js.native
  
  def Append(Group: Group): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Group = js.native
  def Item(Item: Double): Group = js.native
  
  def Refresh(): Unit = js.native
}
