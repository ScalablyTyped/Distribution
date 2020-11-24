package typings.antvComponent

import typings.antvComponent.baseMod.AxisBase
import typings.antvComponent.typesMod.CircleAxisCfg
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/circle", JSImport.Namespace)
@js.native
object circleMod extends js.Object {
  
  @js.native
  trait Circle extends AxisBase[CircleAxisCfg] {
    
    var getCirclePoint: js.Any = js.native
    
    /* protected */ def getTickPoint(tickValue: js.Any): Point = js.native
  }
  
  @js.native
  class default () extends Circle
}
