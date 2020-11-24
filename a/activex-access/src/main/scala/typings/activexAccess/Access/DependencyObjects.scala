package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyObjects extends js.Object {
  
  def apply(Index: String): AccessObject = js.native
  def apply(Index: Double): AccessObject = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): AccessObject = js.native
  def Item(Index: Double): AccessObject = js.native
  
  val Parent: js.Any = js.native
}
