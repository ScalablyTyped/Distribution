package typings.antvG2

import typings.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typings.antvG2.libInterfaceMod.GAnimateCfg
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationMod {
  
  @JSImport("@antv/g2/lib/animate/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnimation(`type`: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimation")(`type`.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def registerAnimation(`type`: String, animation: Animation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(`type`.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Animation = js.Function3[
    /* element */ IGroup | IShape, 
    /* animateCfg */ GAnimateCfg, 
    /* cfg */ AnimateExtraCfg, 
    Unit
  ]
}
