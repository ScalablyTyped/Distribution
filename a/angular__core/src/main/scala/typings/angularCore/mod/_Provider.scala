package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Provider extends js.Object

object _Provider {
  @scala.inline
  def ExistingProvider(provide: js.Any, useExisting: js.Any, multi: js.UndefOr[Boolean] = js.undefined): _Provider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Provider]
  }
  @scala.inline
  def ClassProvider(provide: js.Any, useClass: Type[_], multi: js.UndefOr[Boolean] = js.undefined): _Provider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Provider]
  }
  @scala.inline
  def ValueProvider(provide: js.Any, useValue: js.Any, multi: js.UndefOr[Boolean] = js.undefined): _Provider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Provider]
  }
  @scala.inline
  def ConstructorProvider(provide: Type[_], deps: js.Array[_] = null, multi: js.UndefOr[Boolean] = js.undefined): _Provider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Provider]
  }
  @scala.inline
  def FactoryProvider(
    provide: js.Any,
    useFactory: js.Function,
    deps: js.Array[_] = null,
    multi: js.UndefOr[Boolean] = js.undefined
  ): _Provider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Provider]
  }
}

