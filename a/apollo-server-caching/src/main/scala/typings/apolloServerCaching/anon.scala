package typings.apolloServerCaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxSize[V] extends StObject {
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var onDispose: js.UndefOr[js.Function2[/* key */ String, /* value */ V, Unit]] = js.undefined
    
    var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ String, Double]] = js.undefined
  }
  object MaxSize {
    
    @scala.inline
    def apply[V](): MaxSize[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxSize[V]]
    }
    
    @scala.inline
    implicit class MaxSizeMutableBuilder[Self <: MaxSize[?], V] (val x: Self & MaxSize[V]) extends AnyVal {
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setOnDispose(value: (/* key */ String, /* value */ V) => Unit): Self = StObject.set(x, "onDispose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDisposeUndefined: Self = StObject.set(x, "onDispose", js.undefined)
      
      @scala.inline
      def setSizeCalculator(value: (/* value */ V, /* key */ String) => Double): Self = StObject.set(x, "sizeCalculator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSizeCalculatorUndefined: Self = StObject.set(x, "sizeCalculator", js.undefined)
    }
  }
  
  trait Ttl extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object Ttl {
    
    @scala.inline
    def apply(): Ttl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ttl]
    }
    
    @scala.inline
    implicit class TtlMutableBuilder[Self <: Ttl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
