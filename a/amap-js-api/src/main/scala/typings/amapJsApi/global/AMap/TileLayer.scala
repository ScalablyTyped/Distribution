package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.TileLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer")
@js.native
/**
  * 切片图层
  * @param options 图层选项
  */
class TileLayer ()
  extends typings.amapJsApi.AMap.TileLayer {
  def this(options: Options) = this()
}

@JSGlobal("AMap.TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  /**
    * 灵活切片图层
    * @param options 图层选项
    */
  class Flexible ()
    extends typings.amapJsApi.AMap.TileLayer {
    def this(options: typings.amapJsApi.AMap.TileLayer.Flexible.Options) = this()
  }
  
  /**
    * 路网图层
    */
  @js.native
  class RoadNet ()
    extends typings.amapJsApi.AMap.TileLayer
  
  /**
    * 卫星图层
    */
  @js.native
  class Satellite ()
    extends typings.amapJsApi.AMap.TileLayer
  
  @js.native
  /**
    * 实时交通图层
    * @param options 图层选项
    */
  class Traffic ()
    extends typings.amapJsApi.AMap.TileLayer {
    def this(options: typings.amapJsApi.AMap.TileLayer.Traffic.Options) = this()
  }
  
  @js.native
  class WMS protected ()
    extends typings.amapJsApi.AMap.TileLayer.WMS {
    /**
      * WMS图层
      * @param options 图层选项
      */
    def this(options: typings.amapJsApi.AMap.TileLayer.WMS.Options) = this()
  }
  
  @js.native
  class WMTS protected ()
    extends typings.amapJsApi.AMap.TileLayer.WMTS {
    /**
      * WMTS图层
      * @param options 图层选项
      */
    def this(options: typings.amapJsApi.AMap.TileLayer.WMTS.Options) = this()
  }
  
}

