package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePdfOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FilePdfOutlined", JSImport.Default)
  @js.native
  val default: FilePdfOutlinedIconType = js.native
  
  @js.native
  trait FilePdfOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FilePdfOutlinedIconType: String = js.native
  }
  
  type _To = FilePdfOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `filePdfOutlinedMod.foo` */
  override def _to: FilePdfOutlinedIconType = default
}
