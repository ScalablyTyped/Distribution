package typings.antvG2

import typings.antvG2.anon.Duration
import typings.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.AnimateCfg
import typings.antvG2.libInterfaceMod.Point
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateMod {
  
  @JSImport("@antv/g2/lib/animate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DEFAULT_ANIMATE_CFG {
    
    @JSImport("@antv/g2/lib/animate", "DEFAULT_ANIMATE_CFG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2/lib/animate", "DEFAULT_ANIMATE_CFG.appear")
    @js.native
    def appear: Duration = js.native
    inline def appear_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appear")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2/lib/animate", "DEFAULT_ANIMATE_CFG.enter")
    @js.native
    def enter: Duration = js.native
    inline def enter_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enter")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2/lib/animate", "DEFAULT_ANIMATE_CFG.leave")
    @js.native
    def leave: Duration = js.native
    inline def leave_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leave")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2/lib/animate", "DEFAULT_ANIMATE_CFG.update")
    @js.native
    def update: Duration = js.native
    inline def update_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
  }
  
  inline def doAnimate(shape: IGroup, animateCfg: AnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doAnimate")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doAnimate(shape: IShape, animateCfg: AnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doAnimate")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doGroupAppearAnimate(
    container: IGroup,
    animateCfg: AnimateCfg,
    geometryType: String,
    coordinate: Coordinate,
    minYPoint: Point
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doGroupAppearAnimate")(container.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], geometryType.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], minYPoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefaultAnimateCfg(elementName: String, coordinate: Coordinate): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAnimateCfg")(elementName.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getDefaultAnimateCfg(elementName: String, coordinate: Coordinate, animateType: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAnimateCfg")(elementName.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], animateType.asInstanceOf[js.Any])).asInstanceOf[Any]
}
