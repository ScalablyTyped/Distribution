package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.Direction
import typings.antdMobileRn.stepsIndexNativeMod.StepsNativeProps
import typings.antdMobileRn.stepsIndexNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "Steps")
@js.native
class Steps protected () extends default {
  def this(props: StepsNativeProps) = this()
}
/* static members */
object Steps {
  
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Steps.Step")
  @js.native
  def Step: js.Any = js.native
  @scala.inline
  def Step_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Steps.defaultProps")
  @js.native
  def defaultProps: Direction = js.native
  @scala.inline
  def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
