package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileZipOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileZipOutlined", JSImport.Default)
  @js.native
  val default: FileZipOutlinedIconType = js.native
  
  @js.native
  trait FileZipOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileZipOutlinedIconType: String = js.native
  }
  
  type _To = FileZipOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileZipOutlinedMod.foo` */
  override def _to: FileZipOutlinedIconType = default
}
