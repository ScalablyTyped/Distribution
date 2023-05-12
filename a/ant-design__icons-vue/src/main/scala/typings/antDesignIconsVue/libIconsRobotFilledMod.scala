package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRobotFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RobotFilled", JSImport.Default)
  @js.native
  val default: RobotFilledIconType = js.native
  
  @js.native
  trait RobotFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RobotFilledIconType: String = js.native
  }
  
  type _To = RobotFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRobotFilledMod.foo` */
  override def _to: RobotFilledIconType = default
}
