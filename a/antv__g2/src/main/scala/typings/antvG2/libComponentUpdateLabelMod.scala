package typings.antvG2

import typings.antvCoord.mod.Coordinate
import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentUpdateLabelMod {
  
  @JSImport("@antv/g2/lib/component/update-label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateLabel(fromShape: IGroup, toShape: IGroup, cfg: Cfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLabel")(fromShape.asInstanceOf[js.Any], toShape.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** label 的必要配置 */
  trait Cfg extends StObject {
    
    var animateCfg: Any
    
    var coordinate: Coordinate
    
    var data: Any
    
    var origin: Any
  }
  object Cfg {
    
    inline def apply(animateCfg: Any, coordinate: Coordinate, data: Any, origin: Any): Cfg = {
      val __obj = js.Dynamic.literal(animateCfg = animateCfg.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cfg]
    }
    
    extension [Self <: Cfg](x: Self) {
      
      inline def setAnimateCfg(value: Any): Self = StObject.set(x, "animateCfg", value.asInstanceOf[js.Any])
      
      inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
