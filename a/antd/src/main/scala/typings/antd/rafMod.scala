package typings.antd

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rafMod {
  
  object default {
    
    @JSImport("antd/lib/_util/raf", JSImport.Default)
    @js.native
    def apply(callback: js.Function0[Unit]): Double = js.native
    @JSImport("antd/lib/_util/raf", JSImport.Default)
    @js.native
    def apply(callback: js.Function0[Unit], delayFrames: Double): Double = js.native
    @JSImport("antd/lib/_util/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/_util/raf", "default.cancel")
    @js.native
    def cancel: js.Function1[/* pid */ js.UndefOr[Double], Unit] = js.native
    @scala.inline
    def cancel_=(x: js.Function1[/* pid */ js.UndefOr[Double], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/_util/raf", "default.ids")
    @js.native
    def ids: RafMap = js.native
    @scala.inline
    def ids_=(x: RafMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ids")(x.asInstanceOf[js.Any])
  }
  
  type RafMap = NumberDictionary[Double]
}
