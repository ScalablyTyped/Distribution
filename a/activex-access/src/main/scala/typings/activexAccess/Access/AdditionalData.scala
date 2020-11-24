package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalData extends js.Object {
  
  def apply(Index: String): AdditionalData = js.native
  def apply(Index: Double): AdditionalData = js.native
  
  def Add(var_0: String): AdditionalData = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): AdditionalData = js.native
  def Item(Index: Double): AdditionalData = js.native
  
  var Name: String = js.native
}
