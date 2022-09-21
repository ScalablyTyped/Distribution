package typings.ahooks

import typings.ahooks.anon.FnCallHandlerTimeoutArguments
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ahooks/lib/useRequest/src/utils/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCache(key: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCache(key: CachedKey): js.UndefOr[RecordData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCache")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RecordData]]
  
  inline def setCache(key: CachedKey, cacheTime: Double, cachedData: CachedData[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCache")(key.asInstanceOf[js.Any], cacheTime.asInstanceOf[js.Any], cachedData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CachedData[TData, TParams] extends StObject {
    
    var data: TData
    
    var params: TParams
    
    var time: Double
  }
  object CachedData {
    
    inline def apply[TData, TParams](data: TData, params: TParams, time: Double): CachedData[TData, TParams] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedData[TData, TParams]]
    }
    
    extension [Self <: CachedData[?, ?], TData, TParams](x: Self & (CachedData[TData, TParams])) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setParams(value: TParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  type CachedKey = String | Double
  
  trait RecordData
    extends StObject
       with CachedData[Any, Any] {
    
    var timer: js.UndefOr[Timer] = js.undefined
  }
  object RecordData {
    
    inline def apply(data: Any, params: Any, time: Double): RecordData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordData]
    }
    
    extension [Self <: RecordData](x: Self) {
      
      inline def setTimer(value: Timer): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    }
  }
  
  type Timer = ReturnType[FnCallHandlerTimeoutArguments]
}
