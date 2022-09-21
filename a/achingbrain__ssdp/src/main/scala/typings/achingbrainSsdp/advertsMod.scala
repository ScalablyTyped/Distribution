package typings.achingbrainSsdp

import typings.achingbrainSsdp.advertiseMod.Advert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advertsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/adverts", "adverts")
  @js.native
  val adverts: Adverts_ = js.native
  
  trait Adverts_ extends StObject {
    
    def add(advert: CachedAdvert): Unit
    
    /* private */ var adverts: Any
    
    def clear(): Unit
    
    def forEach(fn: js.Function1[/* advert */ Advert, Unit]): Unit
    
    def remove(advert: CachedAdvert): Unit
    
    def stopAll(): js.Promise[Unit]
  }
  object Adverts_ {
    
    inline def apply(
      add: CachedAdvert => Unit,
      adverts: Any,
      clear: () => Unit,
      forEach: js.Function1[/* advert */ Advert, Unit] => Unit,
      remove: CachedAdvert => Unit,
      stopAll: () => js.Promise[Unit]
    ): Adverts_ = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), adverts = adverts.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), forEach = js.Any.fromFunction1(forEach), remove = js.Any.fromFunction1(remove), stopAll = js.Any.fromFunction0(stopAll))
      __obj.asInstanceOf[Adverts_]
    }
    
    extension [Self <: Adverts_](x: Self) {
      
      inline def setAdd(value: CachedAdvert => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAdverts(value: Any): Self = StObject.set(x, "adverts", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function1[/* advert */ Advert, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setRemove(value: CachedAdvert => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setStopAll(value: () => js.Promise[Unit]): Self = StObject.set(x, "stopAll", js.Any.fromFunction0(value))
    }
  }
  
  trait CachedAdvert extends StObject {
    
    var service: Advert
    
    def stop(): js.Promise[Unit]
  }
  object CachedAdvert {
    
    inline def apply(service: Advert, stop: () => js.Promise[Unit]): CachedAdvert = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[CachedAdvert]
    }
    
    extension [Self <: CachedAdvert](x: Self) {
      
      inline def setService(value: Advert): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
