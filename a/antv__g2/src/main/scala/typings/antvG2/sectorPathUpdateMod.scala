package typings.antvG2

import typings.antvG2.anon.EndAngle
import typings.antvG2.interfaceMod.AnimateExtraCfg
import typings.antvG2.libInterfaceMod.GAnimateCfg
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectorPathUpdateMod {
  
  @JSImport("@antv/g2/lib/animate/animation/sector-path-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArcInfo(path: js.Array[PathCommand]): EndAngle = ^.asInstanceOf[js.Dynamic].applyDynamic("getArcInfo")(path.asInstanceOf[js.Any]).asInstanceOf[EndAngle]
  
  inline def sectorPathUpdate(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sectorPathUpdate")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
