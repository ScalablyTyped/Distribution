package typings.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
  */
trait IAriaService extends js.Object {
  def config(attribute: IAriaAttribute): Boolean
}

object IAriaService {
  @scala.inline
  def apply(config: IAriaAttribute => Boolean): IAriaService = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
  
    __obj.asInstanceOf[IAriaService]
  }
}

