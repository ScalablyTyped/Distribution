package typings.antvG2.libInterfaceMod

import typings.antvG2.antvG2Strings.cartesian
import typings.antvG2.antvG2Strings.helix
import typings.antvG2.antvG2Strings.polar
import typings.antvG2.antvG2Strings.rect
import typings.antvG2.antvG2Strings.theta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateOption extends StObject {
  
  /**
    * @title 坐标系变换
    * @description
    * 1. rotate 表示旋转，使用弧度制。
    * 2. scale 表示沿着 x 和 y 方向的缩放比率。
    * 3. reflect 表示沿 x 方向镜像或者沿 y 轴方向映射。
    * 4. transpose 表示 x，y 轴置换。
    */
  var actions: js.UndefOr[js.Array[CoordinateActions]] = js.undefined
  
  /**
    * @title 坐标系配置项，目前常用于极坐标。
    */
  var cfg: js.UndefOr[CoordinateCfg] = js.undefined
  
  /**
    * @title 坐标系类型
    */
  var `type`: js.UndefOr[polar | theta | rect | cartesian | helix] = js.undefined
}
object CoordinateOption {
  
  inline def apply(): CoordinateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateOption]
  }
  
  extension [Self <: CoordinateOption](x: Self) {
    
    inline def setActions(value: js.Array[CoordinateActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: CoordinateActions*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCfg(value: CoordinateCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: polar | theta | rect | cartesian | helix): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
