package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsZhihuOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ZhihuOutlined", JSImport.Default)
  @js.native
  val default: ZhihuOutlinedIconType = js.native
  
  @js.native
  trait ZhihuOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ZhihuOutlinedIconType: String = js.native
  }
  
  type _To = ZhihuOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsZhihuOutlinedMod.foo` */
  override def _to: ZhihuOutlinedIconType = default
}
