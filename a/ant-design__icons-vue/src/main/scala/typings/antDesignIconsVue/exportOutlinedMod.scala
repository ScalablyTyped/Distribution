package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExportOutlined", JSImport.Default)
  @js.native
  val default: ExportOutlinedIconType = js.native
  
  @js.native
  trait ExportOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExportOutlinedIconType: String = js.native
  }
  
  type _To = ExportOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `exportOutlinedMod.foo` */
  override def _to: ExportOutlinedIconType = default
}
