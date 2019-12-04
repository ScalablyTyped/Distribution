package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value by invoking a `useClass` function.
  * Base for `ClassProvider` decorator.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait ClassSansProvider extends js.Object {
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[_]
}

object ClassSansProvider {
  @scala.inline
  def apply(useClass: Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassSansProvider]
  }
}

