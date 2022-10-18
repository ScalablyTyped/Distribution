package typings.antvG2

import typings.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typings.antvG2.libInterfaceMod.GAnimateCfg
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationFadeMod {
  
  @JSImport("@antv/g2/lib/animate/animation/fade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fadeIn(shape: IGroup, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fadeIn(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fadeOut(shape: IGroup, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fadeOut(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
