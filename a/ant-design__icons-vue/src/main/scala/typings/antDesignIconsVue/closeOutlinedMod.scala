package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseOutlined", JSImport.Default)
  @js.native
  val default: CloseOutlinedIconType = js.native
  
  @js.native
  trait CloseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloseOutlinedIconType: String = js.native
  }
  
  type _To = CloseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `closeOutlinedMod.foo` */
  override def _to: CloseOutlinedIconType = default
}
