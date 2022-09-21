package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object underlineOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UnderlineOutlined", JSImport.Default)
  @js.native
  val default: UnderlineOutlinedIconType = js.native
  
  @js.native
  trait UnderlineOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UnderlineOutlinedIconType: String = js.native
  }
  
  type _To = UnderlineOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `underlineOutlinedMod.foo` */
  override def _to: UnderlineOutlinedIconType = default
}
