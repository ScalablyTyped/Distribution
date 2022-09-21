package typings.antvComponent

import typings.antvComponent.typesMod.CircleAxisCfg
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("@antv/component/lib/axis/circle", JSImport.Default)
  @js.native
  open class default () extends Circle
  
  @js.native
  trait Circle
    extends typings.antvComponent.baseMod.default[CircleAxisCfg] {
    
    /* private */ var autoProcessOverlap: Any = js.native
    
    /**
      * 是否可以执行某一 overlap
      * @param name
      */
    /* private */ var canProcessOverlap: Any = js.native
    
    /* private */ var getCirclePoint: Any = js.native
    
    /* protected */ def getTickPoint(tickValue: Any): Point = js.native
  }
}
