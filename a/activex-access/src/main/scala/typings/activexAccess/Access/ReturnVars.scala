package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnVars extends StObject {
  
  def apply(Index: String): ReturnVar = js.native
  def apply(Index: Double): ReturnVar = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): ReturnVar = js.native
  def Item(Index: Double): ReturnVar = js.native
  
  val Parent: Any = js.native
}
