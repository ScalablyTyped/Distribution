package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documents extends js.Object {
  
  def apply(Item: String): Document = js.native
  def apply(Item: Double): Document = js.native
  
  val Count: Double = js.native
  
  def Item(Item: String): Document = js.native
  def Item(Item: Double): Document = js.native
  
  def Refresh(): Unit = js.native
}
