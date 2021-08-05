package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKey extends StObject {
  
  /**
    * Specifies that the entire query string should be excluded from the cache key. By
    * default, the entire query string is part of the cache key.
    */
  def excludeQueryString(): Unit
  
  /**
    * Specifies that the named cookie is included in the cache key. Can be called multiple
    * times to include multiple cookies.
    *
    * @param name The name of the cookie to include in the cid
    */
  def includeCookie(name: String): Unit
  
  /**
    * Specifies that the named HTTP request header is included in the cache key. Can be
    * called multiple times to include multiple headers.
    *
    * @param name The name of the header to include in the cid
    */
  def includeHeader(name: String): Unit
  
  /**
    * Specifies that the named query argument is included in the cache key. Can be called
    * multiple times to include multiple query arguments. Calling this function will result
    * in all query arguments not explicitly included to be excluded from the cache key. By
    * default, the entire query string is part of the cache key. This would override previous
    * calls to "excludeQueryString()" or "includeQueryString()".
    *
    * @param name The name of the query arg to include in the cache key
    */
  def includeQueryArgument(name: String): Unit
  
  /**
    * Specifies that the entire query string should be included from the cache key. This is
    * done by default, however it is provided as an API to be reverted to the default.
    */
  def includeQueryString(): Unit
  
  /**
    * Specifies that the named variable is included in the cache key. Can be called multiple
    * times to include multiple variable.
    *
    * @param name The name of the variable to include in the cid
    */
  def includeVariable(name: String): Unit
}
object CacheKey {
  
  inline def apply(
    excludeQueryString: () => Unit,
    includeCookie: String => Unit,
    includeHeader: String => Unit,
    includeQueryArgument: String => Unit,
    includeQueryString: () => Unit,
    includeVariable: String => Unit
  ): CacheKey = {
    val __obj = js.Dynamic.literal(excludeQueryString = js.Any.fromFunction0(excludeQueryString), includeCookie = js.Any.fromFunction1(includeCookie), includeHeader = js.Any.fromFunction1(includeHeader), includeQueryArgument = js.Any.fromFunction1(includeQueryArgument), includeQueryString = js.Any.fromFunction0(includeQueryString), includeVariable = js.Any.fromFunction1(includeVariable))
    __obj.asInstanceOf[CacheKey]
  }
  
  extension [Self <: CacheKey](x: Self) {
    
    inline def setExcludeQueryString(value: () => Unit): Self = StObject.set(x, "excludeQueryString", js.Any.fromFunction0(value))
    
    inline def setIncludeCookie(value: String => Unit): Self = StObject.set(x, "includeCookie", js.Any.fromFunction1(value))
    
    inline def setIncludeHeader(value: String => Unit): Self = StObject.set(x, "includeHeader", js.Any.fromFunction1(value))
    
    inline def setIncludeQueryArgument(value: String => Unit): Self = StObject.set(x, "includeQueryArgument", js.Any.fromFunction1(value))
    
    inline def setIncludeQueryString(value: () => Unit): Self = StObject.set(x, "includeQueryString", js.Any.fromFunction0(value))
    
    inline def setIncludeVariable(value: String => Unit): Self = StObject.set(x, "includeVariable", js.Any.fromFunction1(value))
  }
}
