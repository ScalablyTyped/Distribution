package typings.antvScale.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickMethod[T] extends StObject {
  
  def apply(min: T, max: T, n: Double, rest: Any*): js.Array[T] = js.native
  def apply(min: T, max: T, n: Unit, rest: Any*): js.Array[T] = js.native
}
