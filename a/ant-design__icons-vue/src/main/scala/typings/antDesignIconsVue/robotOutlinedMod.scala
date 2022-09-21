package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object robotOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RobotOutlined", JSImport.Default)
  @js.native
  val default: RobotOutlinedIconType = js.native
  
  @js.native
  trait RobotOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RobotOutlinedIconType: String = js.native
  }
  
  type _To = RobotOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `robotOutlinedMod.foo` */
  override def _to: RobotOutlinedIconType = default
}
