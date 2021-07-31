package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reports extends StObject {
  
  def apply(Index: String): Report = js.native
  def apply(Index: Double): Report = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): Report = js.native
  def Item(Index: Double): Report = js.native
  
  val Parent: js.Any = js.native
}
