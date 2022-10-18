package typings.antvG2

import typings.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typings.antvG2.libInterfaceMod.GAnimateCfg
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationZoomMod {
  
  @JSImport("@antv/g2/lib/animate/animation/zoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zoomIn(shape: IGroup, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomIn(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zoomOut(shape: IGroup, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoomOut(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
