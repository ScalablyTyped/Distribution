package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagProperties extends js.Object {
  
  def apply(Index: String): SmartTagProperty = js.native
  def apply(Index: Double): SmartTagProperty = js.native
  
  def Add(Name: String, Value: js.Any): SmartTagProperty = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): SmartTagProperty = js.native
  def Item(Index: Double): SmartTagProperty = js.native
  
  val Parent: js.Any = js.native
}
