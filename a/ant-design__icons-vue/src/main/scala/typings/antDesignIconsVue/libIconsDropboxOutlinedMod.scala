package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDropboxOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DropboxOutlined", JSImport.Default)
  @js.native
  val default: DropboxOutlinedIconType = js.native
  
  @js.native
  trait DropboxOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DropboxOutlinedIconType: String = js.native
  }
  
  type _To = DropboxOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDropboxOutlinedMod.foo` */
  override def _to: DropboxOutlinedIconType = default
}
