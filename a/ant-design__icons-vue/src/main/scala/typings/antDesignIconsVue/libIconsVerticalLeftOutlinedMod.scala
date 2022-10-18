package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVerticalLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerticalLeftOutlined", JSImport.Default)
  @js.native
  val default: VerticalLeftOutlinedIconType = js.native
  
  @js.native
  trait VerticalLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerticalLeftOutlinedIconType: String = js.native
  }
  
  type _To = VerticalLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVerticalLeftOutlinedMod.foo` */
  override def _to: VerticalLeftOutlinedIconType = default
}
