package typings.achingbrainSsdp

import typings.achingbrainSsdp.mod.Service
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCacheMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/cache", "cache")
  @js.native
  val cache: Cache_ = js.native
  
  trait Cache_ extends StObject {
    
    def cacheService(service: Service[Record[String, Any]]): Unit
    
    def clear(): Unit
    
    def deleteService(serviceType: String, uniqueServiceName: String): Unit
    
    def getService(serviceType: String, uniqueServiceName: String): js.UndefOr[Service[Record[String, Any]]]
    
    def hasService(serviceType: String, uniqueServiceName: String): Boolean
    
    /* private */ var services: Any
  }
  object Cache_ {
    
    inline def apply(
      cacheService: Service[Record[String, Any]] => Unit,
      clear: () => Unit,
      deleteService: (String, String) => Unit,
      getService: (String, String) => js.UndefOr[Service[Record[String, Any]]],
      hasService: (String, String) => Boolean,
      services: Any
    ): Cache_ = {
      val __obj = js.Dynamic.literal(cacheService = js.Any.fromFunction1(cacheService), clear = js.Any.fromFunction0(clear), deleteService = js.Any.fromFunction2(deleteService), getService = js.Any.fromFunction2(getService), hasService = js.Any.fromFunction2(hasService), services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache_]
    }
    
    extension [Self <: Cache_](x: Self) {
      
      inline def setCacheService(value: Service[Record[String, Any]] => Unit): Self = StObject.set(x, "cacheService", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDeleteService(value: (String, String) => Unit): Self = StObject.set(x, "deleteService", js.Any.fromFunction2(value))
      
      inline def setGetService(value: (String, String) => js.UndefOr[Service[Record[String, Any]]]): Self = StObject.set(x, "getService", js.Any.fromFunction2(value))
      
      inline def setHasService(value: (String, String) => Boolean): Self = StObject.set(x, "hasService", js.Any.fromFunction2(value))
      
      inline def setServices(value: Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    }
  }
}
