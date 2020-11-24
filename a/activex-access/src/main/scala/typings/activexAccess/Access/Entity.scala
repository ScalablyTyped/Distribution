package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends js.Object {
  
  @JSName("Access.Entity_typekey")
  var AccessDotEntity_typekey: Entity = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  def Operations(Index: String): Operation = js.native
  def Operations(Index: Double): Operation = js.native
  @JSName("Operations")
  val Operations_Original: Operations = js.native
  
  val Parent: js.Any = js.native
}
