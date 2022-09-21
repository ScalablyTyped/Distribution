package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XInterface {
  
  /**
    * returns the URL list for interception.
    *
    * Wildcards inside the URLs are allowed to register the interceptor for URLs too, which can have optional arguments (e.g. "..#.." or "..?..").
    * @returns a list of URLs which are handled by this interceptor
    */
  val InterceptedURLs: SafeArray[String]
  
  /**
    * returns the URL list for interception.
    *
    * Wildcards inside the URLs are allowed to register the interceptor for URLs too, which can have optional arguments (e.g. "..#.." or "..?..").
    * @returns a list of URLs which are handled by this interceptor
    */
  def getInterceptedURLs(): SafeArray[String]
}
object XInterceptorInfo {
  
  inline def apply(
    InterceptedURLs: SafeArray[String],
    acquire: () => Unit,
    getInterceptedURLs: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInterceptorInfo = {
    val __obj = js.Dynamic.literal(InterceptedURLs = InterceptedURLs.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInterceptedURLs = js.Any.fromFunction0(getInterceptedURLs), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterceptorInfo]
  }
  
  extension [Self <: XInterceptorInfo](x: Self) {
    
    inline def setGetInterceptedURLs(value: () => SafeArray[String]): Self = StObject.set(x, "getInterceptedURLs", js.Any.fromFunction0(value))
    
    inline def setInterceptedURLs(value: SafeArray[String]): Self = StObject.set(x, "InterceptedURLs", value.asInstanceOf[js.Any])
  }
}
