package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AppearTransition
import typings.antDesignReactNative.libProgressMod.ProgressProps
import typings.antDesignReactNative.libProgressMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Progress")
@js.native
open class Progress protected () extends default {
  def this(props: ProgressProps) = this()
}
/* static members */
object Progress {
  
  @JSImport("@ant-design/react-native", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Progress.defaultProps")
  @js.native
  def defaultProps: AppearTransition = js.native
  inline def defaultProps_=(x: AppearTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
