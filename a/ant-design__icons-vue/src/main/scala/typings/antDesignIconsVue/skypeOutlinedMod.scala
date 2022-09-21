package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skypeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkypeOutlined", JSImport.Default)
  @js.native
  val default: SkypeOutlinedIconType = js.native
  
  @js.native
  trait SkypeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SkypeOutlinedIconType: String = js.native
  }
  
  type _To = SkypeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `skypeOutlinedMod.foo` */
  override def _to: SkypeOutlinedIconType = default
}
