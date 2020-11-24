package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controls extends js.Object {
  
  def apply[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T](Index: Double): T = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Item[T](Index: Double): T = js.native
  
  val Parent: js.Any = js.native
}
