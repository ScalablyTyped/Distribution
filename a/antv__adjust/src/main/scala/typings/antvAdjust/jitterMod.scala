package typings.antvAdjust

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/adjust/lib/adjusts/jitter", JSImport.Namespace)
@js.native
object jitterMod extends js.Object {
  
  @js.native
  trait Jitter
    extends typings.antvAdjust.adjustMod.default {
    
    var adjustGroup: js.Any = js.native
    
    var getAdjustOffset: js.Any = js.native
  }
  
  @js.native
  class default () extends Jitter
}
