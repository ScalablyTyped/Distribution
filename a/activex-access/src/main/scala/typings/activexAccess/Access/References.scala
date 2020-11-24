package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait References extends js.Object {
  
  def apply(var_0: String): Reference = js.native
  def apply(var_0: Double): Reference = js.native
  
  def AddFromFile(FileName: String): Reference = js.native
  
  def AddFromGuid(Guid: String, Major: Double, Minor: Double): Reference = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(var_0: String): Reference = js.native
  def Item(var_0: Double): Reference = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Reference: Reference): Unit = js.native
}
