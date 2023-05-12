package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGiftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GiftOutlined", JSImport.Default)
  @js.native
  val default: GiftOutlinedIconType = js.native
  
  @js.native
  trait GiftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GiftOutlinedIconType: String = js.native
  }
  
  type _To = GiftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGiftOutlinedMod.foo` */
  override def _to: GiftOutlinedIconType = default
}
