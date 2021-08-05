package typings.antd

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rafMod {
  
  object default {
    
    inline def apply(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(callback: js.Function0[Unit], delayFrames: Double): Double = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], delayFrames.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("antd/lib/_util/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/_util/raf", "default.cancel")
    @js.native
    def cancel: js.Function1[/* pid */ js.UndefOr[Double], Unit] = js.native
    inline def cancel_=(x: js.Function1[/* pid */ js.UndefOr[Double], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/_util/raf", "default.ids")
    @js.native
    def ids: RafMap = js.native
    inline def ids_=(x: RafMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ids")(x.asInstanceOf[js.Any])
  }
  
  type RafMap = NumberDictionary[Double]
}
