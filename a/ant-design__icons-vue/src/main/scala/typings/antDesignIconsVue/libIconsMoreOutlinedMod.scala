package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMoreOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MoreOutlined", JSImport.Default)
  @js.native
  val default: MoreOutlinedIconType = js.native
  
  @js.native
  trait MoreOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MoreOutlinedIconType: String = js.native
  }
  
  type _To = MoreOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMoreOutlinedMod.foo` */
  override def _to: MoreOutlinedIconType = default
}
