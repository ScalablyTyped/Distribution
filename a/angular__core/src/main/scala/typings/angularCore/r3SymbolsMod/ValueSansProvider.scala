package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value for a token.
  * Base for `ValueProvider` decorator.
  *
  * @publicApi
  */
trait ValueSansProvider extends js.Object {
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

