package typings.ahooks

import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createUseStorageStateMod {
  
  @JSImport("ahooks/lib/createUseStorageState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUseStorageState(getStorage: js.Function0[js.UndefOr[Storage]]): js.Function2[
    /* key */ String, 
    /* options */ js.UndefOr[Options[Any]], 
    js.Tuple2[Any, js.Function1[/* value */ Any | IFuncUpdater[Any], Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseStorageState")(getStorage.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* key */ String, 
    /* options */ js.UndefOr[Options[Any]], 
    js.Tuple2[Any, js.Function1[/* value */ Any | IFuncUpdater[Any], Unit]]
  ]]
  
  type IFuncStorage = js.Function0[Storage]
  
  type IFuncUpdater[T] = js.Function1[/* previousState */ js.UndefOr[T], T]
  
  trait Options[T] extends StObject {
    
    var defaultValue: js.UndefOr[T | IFuncUpdater[T]] = js.undefined
    
    var deserializer: js.UndefOr[js.Function1[/* value */ String, T]] = js.undefined
    
    var serializer: js.UndefOr[js.Function1[/* value */ T, String]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setDefaultValue(value: T | IFuncUpdater[T]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueFunction1(value: /* previousState */ js.UndefOr[T] => T): Self = StObject.set(x, "defaultValue", js.Any.fromFunction1(value))
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDeserializer(value: /* value */ String => T): Self = StObject.set(x, "deserializer", js.Any.fromFunction1(value))
      
      inline def setDeserializerUndefined: Self = StObject.set(x, "deserializer", js.undefined)
      
      inline def setSerializer(value: /* value */ T => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    }
  }
}
