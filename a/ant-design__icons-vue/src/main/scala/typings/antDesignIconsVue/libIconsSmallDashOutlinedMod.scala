package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSmallDashOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SmallDashOutlined", JSImport.Default)
  @js.native
  val default: SmallDashOutlinedIconType = js.native
  
  @js.native
  trait SmallDashOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SmallDashOutlinedIconType: String = js.native
  }
  
  type _To = SmallDashOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSmallDashOutlinedMod.foo` */
  override def _to: SmallDashOutlinedIconType = default
}
