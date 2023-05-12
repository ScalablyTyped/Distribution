package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDribbbleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DribbbleOutlined", JSImport.Default)
  @js.native
  val default: DribbbleOutlinedIconType = js.native
  
  @js.native
  trait DribbbleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DribbbleOutlinedIconType: String = js.native
  }
  
  type _To = DribbbleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDribbbleOutlinedMod.foo` */
  override def _to: DribbbleOutlinedIconType = default
}
