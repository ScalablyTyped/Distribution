package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends js.Object {
  
  def apply(Item: String): Property = js.native
  def apply(Item: Double): Property = js.native
  
  def Append(Property: Property): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Property = js.native
  def Item(Item: Double): Property = js.native
  
  def Refresh(): Unit = js.native
}
