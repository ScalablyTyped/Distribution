package typings.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
  */
trait IAriaProvider extends js.Object {
  def config(config: IAriaProviderOptions): Unit
}

object IAriaProvider {
  @scala.inline
  def apply(config: IAriaProviderOptions => Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
  
    __obj.asInstanceOf[IAriaProvider]
  }
}

