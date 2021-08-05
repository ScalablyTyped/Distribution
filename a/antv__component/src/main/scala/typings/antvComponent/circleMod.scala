package typings.antvComponent

import typings.antvComponent.typesMod.CircleAxisCfg
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("@antv/component/lib/axis/circle", JSImport.Default)
  @js.native
  class default () extends Circle
  
  @js.native
  trait Circle
    extends typings.antvComponent.baseMod.default[CircleAxisCfg] {
    
    /* private */ var getCirclePoint: js.Any = js.native
    
    /* protected */ def getTickPoint(tickValue: js.Any): Point = js.native
  }
}
