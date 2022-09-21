package typings.alpinejs

import typings.alpinejs.alpinejsBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpine extends StObject {
    
    var Alpine: this.type
    
    def interceptor[V](
      callback: js.Function5[
          /* initialValue */ V, 
          /* getter */ js.Function0[V], 
          /* setter */ js.Function1[/* value */ V, Unit], 
          /* path */ String, 
          /* key */ String, 
          V
        ]
    ): js.Function1[/* initialValue */ V, V]
    def interceptor[V](
      callback: js.Function5[
          /* initialValue */ V, 
          /* getter */ js.Function0[V], 
          /* setter */ js.Function1[/* value */ V, Unit], 
          /* path */ String, 
          /* key */ String, 
          V
        ],
      mutateObj: js.Function1[/* obj */ InitialValue[V], Unit]
    ): js.Function1[/* initialValue */ V, V]
    @JSName("interceptor")
    var interceptor_Original: js.Function2[
        /* callback */ js.Function5[
          /* initialValue */ Any, 
          /* getter */ js.Function0[Any], 
          /* setter */ js.Function1[/* value */ Any, Unit], 
          /* path */ String, 
          /* key */ String, 
          Any
        ], 
        /* mutateObj */ js.UndefOr[js.Function1[/* obj */ InitialValue[Any], Unit]], 
        js.Function1[/* initialValue */ Any, Any]
      ]
  }
  object Alpine {
    
    inline def apply(
      Alpine: Alpine,
      interceptor: (/* callback */ js.Function5[
          /* initialValue */ Any, 
          /* getter */ js.Function0[Any], 
          /* setter */ js.Function1[/* value */ Any, Unit], 
          /* path */ String, 
          /* key */ String, 
          Any
        ], /* mutateObj */ js.UndefOr[js.Function1[/* obj */ InitialValue[Any], Unit]]) => js.Function1[/* initialValue */ Any, Any]
    ): Alpine = {
      val __obj = js.Dynamic.literal(Alpine = Alpine.asInstanceOf[js.Any], interceptor = js.Any.fromFunction2(interceptor))
      __obj.asInstanceOf[Alpine]
    }
    
    extension [Self <: Alpine](x: Self) {
      
      inline def setAlpine(value: Alpine): Self = StObject.set(x, "Alpine", value.asInstanceOf[js.Any])
      
      inline def setInterceptor(
        value: (/* callback */ js.Function5[
              /* initialValue */ Any, 
              /* getter */ js.Function0[Any], 
              /* setter */ js.Function1[/* value */ Any, Unit], 
              /* path */ String, 
              /* key */ String, 
              Any
            ], /* mutateObj */ js.UndefOr[js.Function1[/* obj */ InitialValue[Any], Unit]]) => js.Function1[/* initialValue */ Any, Any]
      ): Self = StObject.set(x, "interceptor", js.Any.fromFunction2(value))
    }
  }
  
  trait During extends StObject {
    
    var during: (Record[String, String]) | String
    
    var end: (Record[String, String]) | String
    
    var start: (Record[String, String]) | String
  }
  object During {
    
    inline def apply(
      during: (Record[String, String]) | String,
      end: (Record[String, String]) | String,
      start: (Record[String, String]) | String
    ): During = {
      val __obj = js.Dynamic.literal(during = during.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[During]
    }
    
    extension [Self <: During](x: Self) {
      
      inline def setDuring(value: (Record[String, String]) | String): Self = StObject.set(x, "during", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: (Record[String, String]) | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: (Record[String, String]) | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialValue[V] extends StObject {
    
    var _x_intceptor: `true`
    
    var initialValue: V
    
    def intialize(data: V, path: String, key: String): V
  }
  object InitialValue {
    
    inline def apply[V](initialValue: V, intialize: (V, String, String) => V): InitialValue[V] = {
      val __obj = js.Dynamic.literal(_x_intceptor = true, initialValue = initialValue.asInstanceOf[js.Any], intialize = js.Any.fromFunction3(intialize))
      __obj.asInstanceOf[InitialValue[V]]
    }
    
    extension [Self <: InitialValue[?], V](x: Self & InitialValue[V]) {
      
      inline def setInitialValue(value: V): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setIntialize(value: (V, String, String) => V): Self = StObject.set(x, "intialize", js.Any.fromFunction3(value))
      
      inline def set_x_intceptor(value: `true`): Self = StObject.set(x, "_x_intceptor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[T] extends StObject {
    
    var name: String
    
    var value: T
  }
  object Name {
    
    inline def apply[T](name: String, value: T): Name[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    extension [Self <: Name[?], T](x: Self & Name[T]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
