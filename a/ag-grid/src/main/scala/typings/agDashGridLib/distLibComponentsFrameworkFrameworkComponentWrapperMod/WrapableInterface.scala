package typings
package agDashGridLib.distLibComponentsFrameworkFrameworkComponentWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapableInterface extends js.Object {
  def addMethod(name: java.lang.String, callback: js.Function): scala.Unit
  def callMethod(name: java.lang.String, args: stdLib.IArguments): scala.Unit
  def hasMethod(name: java.lang.String): scala.Boolean
}

object WrapableInterface {
  @scala.inline
  def apply(
    addMethod: (java.lang.String, js.Function) => scala.Unit,
    callMethod: (java.lang.String, stdLib.IArguments) => scala.Unit,
    hasMethod: java.lang.String => scala.Boolean
  ): WrapableInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction2(addMethod), callMethod = js.Any.fromFunction2(callMethod), hasMethod = js.Any.fromFunction1(hasMethod))
  
    __obj.asInstanceOf[WrapableInterface]
  }
}

