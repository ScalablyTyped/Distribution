package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SaveOutlined", JSImport.Default)
  @js.native
  val default: SaveOutlinedIconType = js.native
  
  @js.native
  trait SaveOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SaveOutlinedIconType: String = js.native
  }
  
  type _To = SaveOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `saveOutlinedMod.foo` */
  override def _to: SaveOutlinedIconType = default
}
