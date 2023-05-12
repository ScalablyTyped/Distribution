package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderRightOutlined", JSImport.Default)
  @js.native
  val default: BorderRightOutlinedIconType = js.native
  
  @js.native
  trait BorderRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BorderRightOutlinedIconType: String = js.native
  }
  
  type _To = BorderRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderRightOutlinedMod.foo` */
  override def _to: BorderRightOutlinedIconType = default
}
