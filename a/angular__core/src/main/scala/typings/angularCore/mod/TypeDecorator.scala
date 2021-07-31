package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDecorator extends StObject {
  
  def apply(target: js.Object): Unit = js.native
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: String, parameterIndex: Double): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol, parameterIndex: Double): Unit = js.native
  def apply(target: js.Object, propertyKey: Unit, parameterIndex: Double): Unit = js.native
  /**
    * Invoke as decorator.
    */
  def apply[T /* <: Type[js.Any] */](`type`: T): T = js.native
}
