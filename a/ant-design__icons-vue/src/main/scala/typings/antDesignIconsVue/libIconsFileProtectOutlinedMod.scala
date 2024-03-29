package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileProtectOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileProtectOutlined", JSImport.Default)
  @js.native
  val default: FileProtectOutlinedIconType = js.native
  
  @js.native
  trait FileProtectOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FileProtectOutlinedIconType: String = js.native
  }
  
  type _To = FileProtectOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileProtectOutlinedMod.foo` */
  override def _to: FileProtectOutlinedIconType = default
}
