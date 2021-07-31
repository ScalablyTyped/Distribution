package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServices extends StObject {
  
  def apply(Index: String): WebService = js.native
  def apply(Index: Double): WebService = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): WebService = js.native
  def Item(Index: Double): WebService = js.native
  
  val Parent: js.Any = js.native
}
