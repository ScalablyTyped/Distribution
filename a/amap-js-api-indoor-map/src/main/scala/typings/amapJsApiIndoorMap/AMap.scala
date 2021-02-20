package typings.amapJsApiIndoorMap

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.Layer
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiIndoorMap.AMap.IndoorMap.Building
import typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchResult
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapBooleans.`false`
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`0`
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapNumbers.`1`
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover
import typings.amapJsApiIndoorMap.anon.Buildingid
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait IndoorMap extends Layer {
    
    // internal
    def getFloorBar(): Unit = js.native
    
    /**
      * 获取处于被选中状态的室内地图的一些基本信息
      */
    def getSelectedBuilding(): Building | Null = js.native
    
    /**
      * 获取处于被选中状态的室内地图的ID
      */
    def getSelectedBuildingId(): String | Null = js.native
    
    /**
      * 隐藏楼层切换控件
      */
    def hideFloorBar(): Unit = js.native
    
    /**
      * 隐藏室内地图标注
      */
    def hideLabels(): Unit = js.native
    
    def setSelectedBuildingId(id: String): Unit = js.native
    
    /**
      * 显示指定的楼层
      * @param floor 楼层
      * @param noMove 禁止移动
      */
    def showFloor(floor: Double): js.UndefOr[`false`] = js.native
    def showFloor(floor: Double, noMove: Boolean): js.UndefOr[`false`] = js.native
    
    /**
      * 显示楼层切换控件
      */
    def showFloorBar(): Unit = js.native
    
    /**
      * 显示指定室内地图信息
      * @param indoorId 建筑物ID
      * @param callback 回调
      */
    def showIndoorMap(indoorId: String): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: js.UndefOr[scala.Nothing],
      noMove: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: js.UndefOr[scala.Nothing],
      noMove: Boolean
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: js.UndefOr[scala.Nothing],
      noMove: Boolean,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: js.UndefOr[scala.Nothing], shopId: String): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: String,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: String,
      noMove: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: js.UndefOr[scala.Nothing], shopId: String, noMove: Boolean): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: js.UndefOr[scala.Nothing],
      shopId: String,
      noMove: Boolean,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: Double): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: js.UndefOr[scala.Nothing],
      noMove: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: Double, shopId: js.UndefOr[scala.Nothing], noMove: Boolean): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: js.UndefOr[scala.Nothing],
      noMove: Boolean,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: Double, shopId: String): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: String,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: String,
      noMove: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    def showIndoorMap(indoorId: String, floor: Double, shopId: String, noMove: Boolean): Unit = js.native
    def showIndoorMap(
      indoorId: String,
      floor: Double,
      shopId: String,
      noMove: Boolean,
      callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
    ): Unit = js.native
    
    /**
      * 显示室内地图标注
      */
    def showLabels(): Unit = js.native
  }
  object IndoorMap {
    
    @js.native
    trait Building extends StObject {
      
      /**
        * 所在楼层
        */
      var floor: Double = js.native
      
      var floor_details: FloorDetails = js.native
      
      /**
        * 所属楼宇ID
        */
      var id: String = js.native
      
      /**
        * 楼层的经纬度
        */
      var lnglat: LngLat = js.native
      
      /**
        * 楼层名称
        */
      var name: String = js.native
    }
    object Building {
      
      @scala.inline
      def apply(floor: Double, floor_details: FloorDetails, id: String, lnglat: LngLat, name: String): Building = {
        val __obj = js.Dynamic.literal(floor = floor.asInstanceOf[js.Any], floor_details = floor_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Building]
      }
      
      @scala.inline
      implicit class BuildingMutableBuilder[Self <: Building] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFloor(value: Double): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloor_details(value: FloorDetails): Self = StObject.set(x, "floor_details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EventMap extends StObject {
      
      var click: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.click] = js.native
      
      var complete: Event_[
            typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.complete, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      var floor_complete: Event_[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.floor_complete, SearchResult] = js.native
      
      var mouseout: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseout] = js.native
      
      var mouseover: MouseEvent[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.mouseover] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(
        click: MouseEvent[click],
        complete: Event_[complete, js.UndefOr[scala.Nothing]],
        floor_complete: Event_[floor_complete, SearchResult],
        mouseout: MouseEvent[mouseout],
        mouseover: MouseEvent[mouseover]
      ): EventMap = {
        val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], floor_complete = floor_complete.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClick(value: MouseEvent[click]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloor_complete(value: Event_[floor_complete, SearchResult]): Self = StObject.set(x, "floor_complete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMouseout(value: MouseEvent[mouseout]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMouseover(value: MouseEvent[mouseover]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FloorDetails extends StObject {
      
      /**
        * 各楼层索引
        */
      var floor_indexs: js.Array[Double] = js.native
      
      /**
        * 各楼层名字
        */
      var floor_names: js.Array[String] = js.native
      
      /**
        * 各楼层英文
        */
      var floor_nonas: js.Array[String] = js.native
    }
    object FloorDetails {
      
      @scala.inline
      def apply(floor_indexs: js.Array[Double], floor_names: js.Array[String], floor_nonas: js.Array[String]): FloorDetails = {
        val __obj = js.Dynamic.literal(floor_indexs = floor_indexs.asInstanceOf[js.Any], floor_names = floor_names.asInstanceOf[js.Any], floor_nonas = floor_nonas.asInstanceOf[js.Any])
        __obj.asInstanceOf[FloorDetails]
      }
      
      @scala.inline
      implicit class FloorDetailsMutableBuilder[Self <: FloorDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFloor_indexs(value: js.Array[Double]): Self = StObject.set(x, "floor_indexs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloor_indexsVarargs(value: Double*): Self = StObject.set(x, "floor_indexs", js.Array(value :_*))
        
        @scala.inline
        def setFloor_names(value: js.Array[String]): Self = StObject.set(x, "floor_names", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloor_namesVarargs(value: String*): Self = StObject.set(x, "floor_names", js.Array(value :_*))
        
        @scala.inline
        def setFloor_nonas(value: js.Array[String]): Self = StObject.set(x, "floor_nonas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloor_nonasVarargs(value: String*): Self = StObject.set(x, "floor_nonas", js.Array(value :_*))
      }
    }
    
    type MouseEvent[N /* <: String */] = Event_[N, Buildingid]
    
    @js.native
    trait Options
      extends typings.amapJsApi.AMap.Layer.Options {
      
      /**
        * 是否持续显示
        */
      var alaysShow: js.UndefOr[Boolean] = js.native
      
      var autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.native
      
      /**
        * 鼠标悬停到店铺面时的鼠标样式
        */
      var cursor: js.UndefOr[String] = js.native
      
      var disableHoverMarker: js.UndefOr[Boolean] = js.native
      
      var disableIconRender: js.UndefOr[Boolean] = js.native
      
      var disableLabelRender: js.UndefOr[Boolean] = js.native
      
      var featurezIndex: js.UndefOr[Double] = js.native
      
      /**
        * 是否隐藏楼层切换控件
        */
      var hideFloorBar: js.UndefOr[Boolean] = js.native
      
      /**
        * 图层的透明度
        */
      var opacity: js.UndefOr[Double] = js.native
      
      // internal
      var visible: js.UndefOr[Boolean] = js.native
      
      /**
        * 图层叠加的顺序值
        */
      var zIndex: js.UndefOr[Double] = js.native
      
      var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlaysShow(value: Boolean): Self = StObject.set(x, "alaysShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlaysShowUndefined: Self = StObject.set(x, "alaysShow", js.undefined)
        
        @scala.inline
        def setAutoLoadBuildingsInTile(value: Boolean): Self = StObject.set(x, "autoLoadBuildingsInTile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoLoadBuildingsInTileUndefined: Self = StObject.set(x, "autoLoadBuildingsInTile", js.undefined)
        
        @scala.inline
        def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        @scala.inline
        def setDisableHoverMarker(value: Boolean): Self = StObject.set(x, "disableHoverMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableHoverMarkerUndefined: Self = StObject.set(x, "disableHoverMarker", js.undefined)
        
        @scala.inline
        def setDisableIconRender(value: Boolean): Self = StObject.set(x, "disableIconRender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableIconRenderUndefined: Self = StObject.set(x, "disableIconRender", js.undefined)
        
        @scala.inline
        def setDisableLabelRender(value: Boolean): Self = StObject.set(x, "disableLabelRender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableLabelRenderUndefined: Self = StObject.set(x, "disableLabelRender", js.undefined)
        
        @scala.inline
        def setFeaturezIndex(value: Double): Self = StObject.set(x, "featurezIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeaturezIndexUndefined: Self = StObject.set(x, "featurezIndex", js.undefined)
        
        @scala.inline
        def setHideFloorBar(value: Boolean): Self = StObject.set(x, "hideFloorBar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideFloorBarUndefined: Self = StObject.set(x, "hideFloorBar", js.undefined)
        
        @scala.inline
        def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
        @scala.inline
        def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
        
        @scala.inline
        def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
      }
    }
    
    @js.native
    trait SearchErrorResult extends SearchResult {
      
      var error: Error = js.native
      
      /**
        * 楼宇id
        */
      var id: String = js.native
      
      var status: `1` = js.native
    }
    object SearchErrorResult {
      
      @scala.inline
      def apply(error: Error, id: String, status: `1`): SearchErrorResult = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchErrorResult]
      }
      
      @scala.inline
      implicit class SearchErrorResultMutableBuilder[Self <: SearchErrorResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult
      - typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult
    */
    trait SearchResult extends StObject
    object SearchResult {
      
      @scala.inline
      def SearchErrorResult(error: Error, id: String, status: `1`): typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult]
      }
      
      @scala.inline
      def SearchSuccessResult(building: Building, id: String, status: `0`): typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult = {
        val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult]
      }
    }
    
    @js.native
    trait SearchSuccessResult extends SearchResult {
      
      /**
        * 建筑信息
        */
      var building: Building = js.native
      
      /**
        * 楼层的id
        */
      var id: String = js.native
      
      var status: `0` = js.native
    }
    object SearchSuccessResult {
      
      @scala.inline
      def apply(building: Building, id: String, status: `0`): SearchSuccessResult = {
        val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchSuccessResult]
      }
      
      @scala.inline
      implicit class SearchSuccessResultMutableBuilder[Self <: SearchSuccessResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuilding(value: Building): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Shop extends StObject {
      
      /**
        * 店铺所属楼宇ID
        */
      var building_id: String = js.native
      
      /**
        * 分类
        */
      var category: ShopCategory = js.native
      
      /**
        * 店铺的id
        */
      var id: String = js.native
      
      /**
        * 店铺的经纬度
        */
      var lnglat: LngLat = js.native
      
      /**
        * 店铺名称
        */
      var name: String = js.native
      
      /**
        * 兴趣点ID
        */
      var poiId: String = js.native
    }
    object Shop {
      
      @scala.inline
      def apply(
        building_id: String,
        category: ShopCategory,
        id: String,
        lnglat: LngLat,
        name: String,
        poiId: String
      ): Shop = {
        val __obj = js.Dynamic.literal(building_id = building_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poiId = poiId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Shop]
      }
      
      @scala.inline
      implicit class ShopMutableBuilder[Self <: Shop] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuilding_id(value: String): Self = StObject.set(x, "building_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategory(value: ShopCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoiId(value: String): Self = StObject.set(x, "poiId", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.public
      - typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.connection
      - typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.shop
    */
    trait ShopCategory extends StObject
    object ShopCategory {
      
      @scala.inline
      def connection: typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.connection = "connection".asInstanceOf[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.connection]
      
      @scala.inline
      def public: typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.public = "public".asInstanceOf[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.public]
      
      @scala.inline
      def shop: typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.shop = "shop".asInstanceOf[typings.amapJsApiIndoorMap.amapJsApiIndoorMapStrings.shop]
    }
  }
}
