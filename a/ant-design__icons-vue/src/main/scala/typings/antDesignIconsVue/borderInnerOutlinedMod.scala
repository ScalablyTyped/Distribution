package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderInnerOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderInnerOutlined", JSImport.Default)
  @js.native
  val default: BorderInnerOutlinedIconType = js.native
  
  @js.native
  trait BorderInnerOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderInnerOutlinedIconType: String = js.native
  }
  
  type _To = BorderInnerOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `borderInnerOutlinedMod.foo` */
  override def _to: BorderInnerOutlinedIconType = default
}
