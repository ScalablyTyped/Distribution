package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropboxOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DropboxOutlined", JSImport.Default)
  @js.native
  val default: DropboxOutlinedIconType = js.native
  
  @js.native
  trait DropboxOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DropboxOutlinedIconType: String = js.native
  }
  
  type _To = DropboxOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dropboxOutlinedMod.foo` */
  override def _to: DropboxOutlinedIconType = default
}
