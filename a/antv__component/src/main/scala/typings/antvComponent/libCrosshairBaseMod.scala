package typings.antvComponent

import typings.antvComponent.libTypesMod.CrosshairBaseCfg
import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCrosshairBaseMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/crosshair/base", JSImport.Default)
  @js.native
  open class default[T /* <: CrosshairBaseCfg */] () extends CrosshairBase[T]
  
  @js.native
  trait CrosshairBase[T /* <: CrosshairBaseCfg */]
    extends typings.antvComponent.libAbstractGroupComponentMod.default[GroupComponentCfg] {
    
    /* protected */ def getLinePath(): js.Array[Any] = js.native
    
    /* protected */ def getRotateAngle(): Double = js.native
    
    /**
      * @protected
      * 获取文本点的位置
      * @return {Point} 文本的位置
      */
    /* protected */ def getTextPoint(): Point = js.native
    
    /* private */ var renderBackground: Any = js.native
    
    /* protected */ def renderLine(group: IGroup): Unit = js.native
    
    /* protected */ def renderText(group: IGroup): Unit = js.native
  }
}
