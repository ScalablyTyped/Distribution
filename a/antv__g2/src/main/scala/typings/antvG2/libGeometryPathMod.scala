package typings.antvG2

import typings.antvG2.anon.Data
import typings.antvG2.libGeometryBaseMod.GeometryCfg
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPathMod {
  
  @JSImport("@antv/g2/lib/geometry/path", JSImport.Default)
  @js.native
  open class default protected () extends Path {
    def this(cfg: PathCfg) = this()
  }
  
  @js.native
  trait Path
    extends typings.antvG2.libGeometryBaseMod.default[ShapePoint] {
    
    /** 是否连接空值 */
    var connectNulls: Boolean = js.native
    
    /**
      * 获取组成一条线（一组数据）的所有点以及数据
      * @param mappingData 映射后的数组
      */
    /* protected */ def getPointsAndData(mappingData: js.Array[MappingDatum]): Data = js.native
    
    /* private */ var getShapeInfo: Any = js.native
    
    /** 单个孤立数据点是否展示 */
    var showSinglePoint: Boolean = js.native
  }
  
  trait PathCfg
    extends StObject
       with GeometryCfg {
    
    /** 是否连接空值 */
    var connectNulls: js.UndefOr[Boolean] = js.undefined
    
    /** 单个孤立数据点是否展示 */
    var showSinglePoint: js.UndefOr[Boolean] = js.undefined
  }
  object PathCfg {
    
    inline def apply(container: IGroup): PathCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathCfg]
    }
    
    extension [Self <: PathCfg](x: Self) {
      
      inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
      
      inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
      
      inline def setShowSinglePoint(value: Boolean): Self = StObject.set(x, "showSinglePoint", value.asInstanceOf[js.Any])
      
      inline def setShowSinglePointUndefined: Self = StObject.set(x, "showSinglePoint", js.undefined)
    }
  }
}
