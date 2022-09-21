package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.AppearTransition
import typings.antdMobileRn.progressIndexNativeMod.ProgressProps
import typings.antdMobileRn.progressIndexNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Progress")
@js.native
open class Progress protected () extends default {
  def this(props: ProgressProps) = this()
}
/* static members */
object Progress {
  
  @JSImport("antd-mobile-rn", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Progress.defaultProps")
  @js.native
  def defaultProps: AppearTransition = js.native
  inline def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
