package typings.antDesignReactNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignReactNative.anon.Direction
import typings.antDesignReactNative.stepsMod.StepsProps
import typings.antDesignReactNative.stepsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Steps")
@js.native
class Steps protected () extends default {
  def this(props: StepsProps) = this()
}
/* static members */
object Steps {
  
  @JSImport("@ant-design/react-native", "Steps")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Steps.Step")
  @js.native
  def Step: Instantiable0[typings.antDesignReactNative.stepsItemMod.default] = js.native
  @scala.inline
  def Step_=(x: Instantiable0[typings.antDesignReactNative.stepsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Steps.defaultProps")
  @js.native
  def defaultProps: Direction = js.native
  @scala.inline
  def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
