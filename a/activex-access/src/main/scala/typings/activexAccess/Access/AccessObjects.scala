package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessObjects extends js.Object {
  
  def apply(var_0: String): AccessObject = js.native
  def apply(var_0: Double): AccessObject = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(var_0: String): AccessObject = js.native
  def Item(var_0: Double): AccessObject = js.native
  
  val Parent: js.Any = js.native
}
