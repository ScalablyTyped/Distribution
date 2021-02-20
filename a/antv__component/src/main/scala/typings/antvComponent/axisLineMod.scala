package typings.antvComponent

import typings.antvComponent.typesMod.LineAxisCfg
import typings.glMatrix.mod.vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisLineMod {
  
  @JSImport("@antv/component/lib/axis/line", JSImport.Default)
  @js.native
  class default () extends Line
  
  @js.native
  trait Line
    extends typings.antvComponent.baseMod.default[LineAxisCfg] {
    
    var autoProcessOverlap: js.Any = js.native
    
    /* protected */ def getAxisVector(): js.Tuple2[Double, Double] = js.native
    
    /**
      * 获取 labelGroup 的选择长度
      * @param {IGroup}
      */
    var getRotateLength: js.Any = js.native
    
    /* protected */ def getSideVector(offset: Double): vec2 = js.native
    
    /* protected */ def isHorizontal(): Boolean = js.native
    
    /* protected */ def isVertical(): Boolean = js.native
  }
}
