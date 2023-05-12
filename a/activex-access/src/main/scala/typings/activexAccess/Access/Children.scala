package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  def apply[T](Index: String): T = js.native
  // eslint-disable-next-line no-unnecessary-generics
  def apply[T](Index: Double): T = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item[T](Index: String): T = js.native
  // eslint-disable-next-line no-unnecessary-generics
  def Item[T](Index: Double): T = js.native
}
