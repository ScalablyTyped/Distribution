package typings.angularStrap.mgcrea.ngStrap.aside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsideProvider extends js.Object {
  var defaults: IAsideOptions
}

object IAsideProvider {
  @scala.inline
  def apply(defaults: IAsideOptions): IAsideProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAsideProvider]
  }
}

