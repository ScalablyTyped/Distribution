package typings.adobeEsModulesMiddleware.mod.karmaAugmentingMod

import typings.adobeEsModulesMiddleware.mod.MiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * used in Karma to aid in testing es-modules in the browser
    * see {@link https://github.com/adobe/es-modules-middleware}
    */
  var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(esModulesMiddleware: MiddlewareOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (esModulesMiddleware != null) __obj.updateDynamic("esModulesMiddleware")(esModulesMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

