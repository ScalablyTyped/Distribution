package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDecorator extends js.Object {
  def apply(target: js.Object): Unit = js.native
  def apply(target: js.Object, propertyKey: js.UndefOr[scala.Nothing], parameterIndex: Double): Unit = js.native
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: String, parameterIndex: Double): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol, parameterIndex: Double): Unit = js.native
  /**
    * Invoke as decorator.
    */
  def apply[T /* <: Type[_] */](`type`: T): T = js.native
}

