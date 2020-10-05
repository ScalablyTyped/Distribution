package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * Base for `StaticClassProvider` decorator.
  *
  * @publicApi
  */
@js.native
trait StaticClassSansProvider extends js.Object {
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_] = js.native
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: Type[_] = js.native
}

object StaticClassSansProvider {
  @scala.inline
  def apply(deps: js.Array[_], useClass: Type[_]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassSansProvider]
  }
  @scala.inline
  implicit class StaticClassSansProviderOps[Self <: StaticClassSansProvider] (val x: Self) extends AnyVal {
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
    def setDepsVarargs(value: js.Any*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[_]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseClass(value: Type[_]): Self = this.set("useClass", value.asInstanceOf[js.Any])
  }
  
}

