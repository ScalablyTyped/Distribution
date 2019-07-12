package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDecorator extends js.Object {
  def apply(target: js.Object): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: java.lang.String): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: java.lang.String, parameterIndex: scala.Double): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): scala.Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol, parameterIndex: scala.Double): scala.Unit = js.native
  /**
    * Invoke as decorator.
    */
  def apply[T /* <: Type[_] */](`type`: T): T = js.native
}

