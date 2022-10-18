package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFileAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileAddOutlined", JSImport.Default)
  @js.native
  val default: FileAddOutlinedIconType = js.native
  
  @js.native
  trait FileAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileAddOutlinedIconType: String = js.native
  }
  
  type _To = FileAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFileAddOutlinedMod.foo` */
  override def _to: FileAddOutlinedIconType = default
}
