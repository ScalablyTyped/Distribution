package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspaces extends js.Object {
  
  def apply(Item: String): Workspace = js.native
  def apply(Item: Double): Workspace = js.native
  
  def Append(Workspace: Workspace): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Workspace = js.native
  def Item(Item: Double): Workspace = js.native
  
  def Refresh(): Unit = js.native
}
