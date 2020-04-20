package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSansProvider extends InjectableProvider {
  /**
    * The value to inject.
    */
  var useValue: js.Any
}

object ValueSansProvider {
  @scala.inline
  def apply(useValue: js.Any): ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSansProvider]
  }
}

