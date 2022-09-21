package typings.amapJsApiArrivalRange

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiArrivalRange.AMap.ArrivalRange.SearchOptions
import typings.amapJsApiArrivalRange.AMap.ArrivalRange.SearchResult
import typings.amapJsApiArrivalRange.AMap.ArrivalRange.SearchStatus
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.coverage
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.polygon
import typings.amapJsApiArrivalRange.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 公交到达圈展示
    */
  @js.native
  trait ArrivalRange
    extends StObject
       with EventEmitter {
    
    /**
      * 计算某个时间段内用户通过公交出行可到达的距离范围
      * @param origin 起始点
      * @param time 时间
      * @param callback 回调
      * @param opts 选项
      */
    def search(
      origin: LocationValue,
      time: Double,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
    ): Unit = js.native
    def search(
      origin: LocationValue,
      time: Double,
      callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit],
      opts: SearchOptions
    ): Unit = js.native
  }
  object ArrivalRange {
    
    trait EventMap extends StObject {
      
      var error: Event_[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, Info]
    }
    object EventMap {
      
      inline def apply(error: Event_[error, Info]): EventMap = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      extension [Self <: EventMap](x: Self) {
        
        inline def setError(value: Event_[error, Info]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
    
    trait SearchOptions extends StObject {
      
      // useless
      /**
        * 选择一个想到达的目的地坐标，最多支持5个目的地坐标
        */
      var destination: js.UndefOr[LocationValue | js.Array[LocationValue]] = js.undefined
      
      /**
        * 公交出行策略,可选为：地铁：SUBWAY， 公交：BUS，多策略使用逗号分隔
        */
      var policy: js.UndefOr[String] = js.undefined
      
      // 'BUS' | 'SUBWAY' | 'BUS,SUBWAY' | 'SUBWAY,BUS';
      /**
        * 结果返回样式：polygon：返回多边形边界值，coverage：判断设定的终点坐标是否在到达圈范围内
        */
      var resultType: js.UndefOr[polygon | coverage] = js.undefined
    }
    object SearchOptions {
      
      inline def apply(): SearchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchOptions]
      }
      
      extension [Self <: SearchOptions](x: Self) {
        
        inline def setDestination(value: LocationValue | js.Array[LocationValue]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        inline def setDestinationVarargs(value: LocationValue*): Self = StObject.set(x, "destination", js.Array(value*))
        
        inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
        
        inline def setResultType(value: polygon | coverage): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
        
        inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      }
    }
    
    trait SearchResult extends StObject {
      
      /**
        * 到达圈边界坐标点
        */
      var bounds: js.Array[js.Array[js.Array[js.Array[String]]]]
      
      /**
        * 提供的终点坐标是否在到达圈内
        */
      var inRange: js.UndefOr[js.Array[Boolean]] = js.undefined
      
      /**
        * 查询状态说明
        */
      var info: String
      
      // internal
      var infocode: String
    }
    object SearchResult {
      
      inline def apply(bounds: js.Array[js.Array[js.Array[js.Array[String]]]], info: String, infocode: String): SearchResult = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResult]
      }
      
      extension [Self <: SearchResult](x: Self) {
        
        inline def setBounds(value: js.Array[js.Array[js.Array[js.Array[String]]]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsVarargs(value: js.Array[js.Array[js.Array[String]]]*): Self = StObject.set(x, "bounds", js.Array(value*))
        
        inline def setInRange(value: js.Array[Boolean]): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
        
        inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
        
        inline def setInRangeVarargs(value: Boolean*): Self = StObject.set(x, "inRange", js.Array(value*))
        
        inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfocode(value: String): Self = StObject.set(x, "infocode", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete
      - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
      - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data
    */
    trait SearchStatus extends StObject
    object SearchStatus {
      
      inline def complete: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete = "complete".asInstanceOf[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete]
      
      inline def error: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error = "error".asInstanceOf[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error]
      
      inline def no_data: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data = "no_data".asInstanceOf[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data]
    }
  }
}
