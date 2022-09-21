package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WSParameters extends StObject {
  
  def apply(Index: String): WSParameter = js.native
  def apply(Index: Double): WSParameter = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): WSParameter = js.native
  def Item(Index: Double): WSParameter = js.native
  
  val Parent: Any = js.native
}
