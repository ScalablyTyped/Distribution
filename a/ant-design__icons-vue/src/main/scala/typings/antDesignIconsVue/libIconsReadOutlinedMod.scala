package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsReadOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReadOutlined", JSImport.Default)
  @js.native
  val default: ReadOutlinedIconType = js.native
  
  @js.native
  trait ReadOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ReadOutlinedIconType: String = js.native
  }
  
  type _To = ReadOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsReadOutlinedMod.foo` */
  override def _to: ReadOutlinedIconType = default
}
