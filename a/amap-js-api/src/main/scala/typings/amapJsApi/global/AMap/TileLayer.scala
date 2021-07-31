package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.TileLayer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.TileLayer")
@js.native
/**
  * 切片图层
  * @param options 图层选项
  */
class TileLayer ()
  extends StObject
     with typings.amapJsApi.AMap.TileLayer {
  def this(options: Options) = this()
}
object TileLayer {
  
  @JSGlobal("AMap.TileLayer.Flexible")
  @js.native
  /**
    * 灵活切片图层
    * @param options 图层选项
    */
  class Flexible ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer {
    def this(options: typings.amapJsApi.AMap.TileLayer.Flexible.Options) = this()
  }
  
  /**
    * 路网图层
    */
  @JSGlobal("AMap.TileLayer.RoadNet")
  @js.native
  class RoadNet ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer
  
  /**
    * 卫星图层
    */
  @JSGlobal("AMap.TileLayer.Satellite")
  @js.native
  class Satellite ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer
  
  @JSGlobal("AMap.TileLayer.Traffic")
  @js.native
  /**
    * 实时交通图层
    * @param options 图层选项
    */
  class Traffic ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer {
    def this(options: typings.amapJsApi.AMap.TileLayer.Traffic.Options) = this()
  }
  
  @JSGlobal("AMap.TileLayer.WMS")
  @js.native
  class WMS protected ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer.WMS {
    /**
      * WMS图层
      * @param options 图层选项
      */
    def this(options: typings.amapJsApi.AMap.TileLayer.WMS.Options) = this()
  }
  
  @JSGlobal("AMap.TileLayer.WMTS")
  @js.native
  class WMTS protected ()
    extends StObject
       with typings.amapJsApi.AMap.TileLayer.WMTS {
    /**
      * WMTS图层
      * @param options 图层选项
      */
    def this(options: typings.amapJsApi.AMap.TileLayer.WMTS.Options) = this()
  }
}
