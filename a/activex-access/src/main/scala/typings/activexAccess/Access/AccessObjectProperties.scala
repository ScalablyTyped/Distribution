package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessObjectProperties extends js.Object {
  
  def apply(Index: String): AccessObjectProperty = js.native
  def apply(Index: Double): AccessObjectProperty = js.native
  
  def Add(PropertyName: String, Value: js.Any): Unit = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): AccessObjectProperty = js.native
  def Item(Index: Double): AccessObjectProperty = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Item: String): Unit = js.native
  def Remove(Item: Double): Unit = js.native
}
