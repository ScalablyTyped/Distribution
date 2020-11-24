package typings.antd

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/_util/raf", JSImport.Namespace)
@js.native
object rafMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(callback: js.Function0[Unit]): Double = js.native
    def apply(callback: js.Function0[Unit], delayFrames: Double): Double = js.native
    
    var cancel: js.Function1[/* pid */ js.UndefOr[Double], Unit] = js.native
    
    var ids: RafMap = js.native
  }
  
  type RafMap = NumberDictionary[Double]
}
