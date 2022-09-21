package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileOutlined", JSImport.Default)
  @js.native
  val default: FileOutlinedIconType = js.native
  
  @js.native
  trait FileOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileOutlinedIconType: String = js.native
  }
  
  type _To = FileOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileOutlinedMod.foo` */
  override def _to: FileOutlinedIconType = default
}
