package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpProvider extends IServiceProvider {
  var defaults: IHttpProviderDefaults = js.native
  /**
           * Register service factories (names or implementations) for interceptors which are called before and after
           * each request.
           */
  var interceptors: js.Array[java.lang.String | Injectable[IHttpInterceptorFactory]] = js.native
  def useApplyAsync(): scala.Boolean = js.native
  def useApplyAsync(value: scala.Boolean): IHttpProvider = js.native
  /**
           * @param value If true, `$http` will return a normal promise without the `success` and `error` methods.
           * @returns If a value is specified, returns the $httpProvider for chaining.
           *    otherwise, returns the current configured value.
           */
  def useLegacyPromiseExtensions(value: scala.Boolean): scala.Boolean | IHttpProvider = js.native
}

