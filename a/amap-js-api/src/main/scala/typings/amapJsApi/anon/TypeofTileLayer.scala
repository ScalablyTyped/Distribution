package typings.amapJsApi.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.amapJsApi.AMap.TileLayer.Flexible
import typings.amapJsApi.AMap.TileLayer.Flexible.Options
import typings.amapJsApi.AMap.TileLayer.RoadNet
import typings.amapJsApi.AMap.TileLayer.Satellite
import typings.amapJsApi.AMap.TileLayer.Traffic
import typings.amapJsApi.AMap.TileLayer.WMS
import typings.amapJsApi.AMap.TileLayer.WMTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTileLayer extends StObject {
  
  val Flexible: Instantiable1[/* options */ js.UndefOr[Options], typings.amapJsApi.AMap.TileLayer.Flexible] = js.native
  
  /**
    * 路网图层
    */
  var RoadNet: Instantiable0[typings.amapJsApi.AMap.TileLayer.RoadNet] = js.native
  
  /**
    * 卫星图层
    */
  var Satellite: Instantiable0[typings.amapJsApi.AMap.TileLayer.Satellite] = js.native
  
  val Traffic: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.TileLayer.Traffic.Options], 
    typings.amapJsApi.AMap.TileLayer.Traffic
  ] = js.native
  
  val WMS: Instantiable1[
    /* options */ typings.amapJsApi.AMap.TileLayer.WMS.Options, 
    typings.amapJsApi.AMap.TileLayer.WMS
  ] = js.native
  
  val WMTS: Instantiable1[
    /* options */ typings.amapJsApi.AMap.TileLayer.WMTS.Options, 
    typings.amapJsApi.AMap.TileLayer.WMTS
  ] = js.native
}
object TypeofTileLayer {
  
  @scala.inline
  def apply(
    Flexible: Instantiable1[/* options */ js.UndefOr[Options], Flexible],
    RoadNet: Instantiable0[RoadNet],
    Satellite: Instantiable0[Satellite],
    Traffic: Instantiable1[
      /* options */ js.UndefOr[typings.amapJsApi.AMap.TileLayer.Traffic.Options], 
      Traffic
    ],
    WMS: Instantiable1[/* options */ typings.amapJsApi.AMap.TileLayer.WMS.Options, WMS],
    WMTS: Instantiable1[/* options */ typings.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]
  ): TypeofTileLayer = {
    val __obj = js.Dynamic.literal(Flexible = Flexible.asInstanceOf[js.Any], RoadNet = RoadNet.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Traffic = Traffic.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], WMTS = WMTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTileLayer]
  }
  
  @scala.inline
  implicit class TypeofTileLayerMutableBuilder[Self <: TypeofTileLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexible(value: Instantiable1[/* options */ js.UndefOr[Options], Flexible]): Self = StObject.set(x, "Flexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadNet(value: Instantiable0[RoadNet]): Self = StObject.set(x, "RoadNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatellite(value: Instantiable0[Satellite]): Self = StObject.set(x, "Satellite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffic(
      value: Instantiable1[
          /* options */ js.UndefOr[typings.amapJsApi.AMap.TileLayer.Traffic.Options], 
          Traffic
        ]
    ): Self = StObject.set(x, "Traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWMS(value: Instantiable1[/* options */ typings.amapJsApi.AMap.TileLayer.WMS.Options, WMS]): Self = StObject.set(x, "WMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWMTS(value: Instantiable1[/* options */ typings.amapJsApi.AMap.TileLayer.WMTS.Options, WMTS]): Self = StObject.set(x, "WMTS", value.asInstanceOf[js.Any])
  }
}
