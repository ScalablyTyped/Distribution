package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.MethodType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * If the response should persist on cache.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data to transfer to the server.
    */
  val data: js.UndefOr[(Record[String, Any]) | (js.Array[Record[String, Any]])] = js.undefined
  
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType
  
  /**
    * The path of the request. i.e: `/1/indexes`.
    */
  val path: String
}
object Request {
  
  inline def apply(method: MethodType, path: String): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    inline def setData(value: (Record[String, Any]) | (js.Array[Record[String, Any]])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMethod(value: MethodType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
