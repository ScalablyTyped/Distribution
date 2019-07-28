package typings.agDashGrid.distLibComponentsFrameworkFrameworkComponentWrapperMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapableInterface extends js.Object {
  def addMethod(name: String, callback: js.Function): Unit
  def callMethod(name: String, args: IArguments): Unit
  def hasMethod(name: String): Boolean
}

object WrapableInterface {
  @scala.inline
  def apply(
    addMethod: (String, js.Function) => Unit,
    callMethod: (String, IArguments) => Unit,
    hasMethod: String => Boolean
  ): WrapableInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction2(addMethod), callMethod = js.Any.fromFunction2(callMethod), hasMethod = js.Any.fromFunction1(hasMethod))
  
    __obj.asInstanceOf[WrapableInterface]
  }
}

