package typings.angularCore.r3SymbolsMod

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
@js.native
trait ClassSansProvider extends js.Object {
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[_] = js.native
}

object ClassSansProvider {
  @scala.inline
  def apply(useClass: Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSansProvider]
  }
  @scala.inline
  implicit class ClassSansProviderOps[Self <: ClassSansProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUseClass(value: Type[_]): Self = this.set("useClass", value.asInstanceOf[js.Any])
  }
  
}

