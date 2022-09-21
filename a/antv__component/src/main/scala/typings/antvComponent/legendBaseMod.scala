package typings.antvComponent

import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvComponent.typesMod.LegendBaseCfg
import typings.antvComponent.typesMod.PointLocationCfg
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendBaseMod {
  
  @JSImport("@antv/component/lib/legend/base", JSImport.Default)
  @js.native
  abstract class default[T /* <: LegendBaseCfg */] () extends LegendBase[T]
  
  @js.native
  trait LegendBase[T /* <: LegendBaseCfg */]
    extends typings.antvComponent.groupComponentMod.default[GroupComponentCfg] {
    
    /* protected */ def drawBackground(group: IGroup): Unit = js.native
    
    /* protected */ def drawLegendContent(group: Any): Any = js.native
    
    /* protected */ def drawTitle(group: IGroup): Unit = js.native
    
    /* protected */ def getDrawPoint(): Point = js.native
    
    /* private */ var resetDraw: Any = js.native
    
    /* protected */ def resetLocation(): Unit = js.native
    
    /* protected */ def setDrawPoint(point: Point): Unit = js.native
    
    def setLocation(cfg: PointLocationCfg): Unit = js.native
  }
}
