package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightOutlined", JSImport.Default)
  @js.native
  val default: RightOutlinedIconType = js.native
  
  @js.native
  trait RightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RightOutlinedIconType: String = js.native
  }
  
  type _To = RightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRightOutlinedMod.foo` */
  override def _to: RightOutlinedIconType = default
}
