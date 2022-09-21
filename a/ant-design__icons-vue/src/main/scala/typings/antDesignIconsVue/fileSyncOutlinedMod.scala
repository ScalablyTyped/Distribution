package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSyncOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileSyncOutlined", JSImport.Default)
  @js.native
  val default: FileSyncOutlinedIconType = js.native
  
  @js.native
  trait FileSyncOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileSyncOutlinedIconType: String = js.native
  }
  
  type _To = FileSyncOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileSyncOutlinedMod.foo` */
  override def _to: FileSyncOutlinedIconType = default
}
