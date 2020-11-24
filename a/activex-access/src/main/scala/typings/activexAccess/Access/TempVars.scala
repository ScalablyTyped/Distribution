package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempVars extends js.Object {
  
  def apply(Index: String): TempVar = js.native
  def apply(Index: Double): TempVar = js.native
  
  def Add(Name: String, Value: String): Unit = js.native
  def Add(Name: String, Value: Boolean): Unit = js.native
  def Add(Name: String, Value: Double): Unit = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): TempVar = js.native
  def Item(Index: Double): TempVar = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: String): Unit = js.native
  def Remove(Index: Double): Unit = js.native
  
  def RemoveAll(): Unit = js.native
}
