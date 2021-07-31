package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertFrom {
  
  trait Result extends StObject {
    
    /**
      * 成功状态文字描述
      */
    var info: String
    
    // 'ok'
    /**
      * 高德坐标集合
      */
    var locations: js.Array[LngLat]
  }
  object Result {
    
    @scala.inline
    def apply(info: String, locations: js.Array[LngLat]): Result = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[LngLat]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: LngLat*): Self = StObject.set(x, "locations", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.complete
    - typings.amapJsApi.amapJsApiStrings.error
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typings.amapJsApi.amapJsApiStrings.complete = "complete".asInstanceOf[typings.amapJsApi.amapJsApiStrings.complete]
    
    @scala.inline
    def error: typings.amapJsApi.amapJsApiStrings.error = "error".asInstanceOf[typings.amapJsApi.amapJsApiStrings.error]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.amapJsApiStrings.gps
    - typings.amapJsApi.amapJsApiStrings.baidu
    - typings.amapJsApi.amapJsApiStrings.mapbar
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def baidu: typings.amapJsApi.amapJsApiStrings.baidu = "baidu".asInstanceOf[typings.amapJsApi.amapJsApiStrings.baidu]
    
    @scala.inline
    def gps: typings.amapJsApi.amapJsApiStrings.gps = "gps".asInstanceOf[typings.amapJsApi.amapJsApiStrings.gps]
    
    @scala.inline
    def mapbar: typings.amapJsApi.amapJsApiStrings.mapbar = "mapbar".asInstanceOf[typings.amapJsApi.amapJsApiStrings.mapbar]
  }
}
