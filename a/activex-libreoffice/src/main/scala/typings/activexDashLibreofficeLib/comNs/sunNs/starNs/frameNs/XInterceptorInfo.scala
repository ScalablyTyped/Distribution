package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to get information about a registered interceptor and is used by frame interceptor mechanism to perform interception.
  *
  * {@link Frame} can call right interceptor directly without calling all of registered ones. Use it as an additional interface to {@link
  * XDispatchProviderInterceptor} . If any interceptor in list doesn't support this interface - these mechanism will be broken and normal list of
  * master-slave interceptor objects will be used from top to the bottom.
  * @see XDispatchProviderInterception
  * @see XDispatchProviderInterceptor
  */
trait XInterceptorInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the URL list for interception.
    *
    * Wildcards inside the URLs are allowed to register the interceptor for URLs too, which can have optional arguments (e.g. "..#.." or "..?..").
    * @returns a list of URLs which are handled by this interceptor
    */
  val InterceptedURLs: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns the URL list for interception.
    *
    * Wildcards inside the URLs are allowed to register the interceptor for URLs too, which can have optional arguments (e.g. "..#.." or "..?..").
    * @returns a list of URLs which are handled by this interceptor
    */
  def getInterceptedURLs(): activexDashInteropLib.SafeArray[java.lang.String]
}

