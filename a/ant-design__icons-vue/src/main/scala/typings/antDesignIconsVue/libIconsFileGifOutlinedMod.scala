package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileGifOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileGifOutlined", JSImport.Default)
  @js.native
  val default: FileGifOutlinedIconType = js.native
  
  @js.native
  trait FileGifOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileGifOutlinedIconType: String = js.native
  }
  
  type _To = FileGifOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileGifOutlinedMod.foo` */
  override def _to: FileGifOutlinedIconType = default
}
