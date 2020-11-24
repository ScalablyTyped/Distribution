package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTags extends js.Object {
  
  def apply(Index: String): SmartTag = js.native
  def apply(Index: Double): SmartTag = js.native
  
  def Add(Name: String): SmartTag = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): SmartTag = js.native
  def Item(Index: Double): SmartTag = js.native
  
  val Parent: js.Any = js.native
}
