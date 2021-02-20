package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHttpProvider extends IServiceProvider {
  
  var defaults: IHttpProviderDefaults = js.native
  
  /**
    * Register service factories (names or implementations) for interceptors which are called before and after
    * each request.
    */
  var interceptors: js.Array[String | Injectable[IHttpInterceptorFactory]] = js.native
  
  def useApplyAsync(): Boolean = js.native
  def useApplyAsync(value: Boolean): IHttpProvider = js.native
  
  /**
    * Array containing URLs whose origins are trusted to receive the XSRF token.
    */
  var xsrfTrustedOrigins: js.Array[String] = js.native
  
  /** @deprecated The old name of xsrfTrustedOrigins. Kept for compatibility. */
  var xsrfWhitelistedOrigins: js.Array[String] = js.native
}
