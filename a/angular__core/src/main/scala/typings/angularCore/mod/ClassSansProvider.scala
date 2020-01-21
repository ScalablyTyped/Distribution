package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSansProvider extends InjectableProvider {
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

