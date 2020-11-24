package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalVars extends js.Object {
  
  def apply(Index: js.Any): LocalVar = js.native
  
  def Add(Name: String, Value: js.Any): Unit = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: js.Any): LocalVar = js.native
  
  val Parent: js.Any = js.native
}
