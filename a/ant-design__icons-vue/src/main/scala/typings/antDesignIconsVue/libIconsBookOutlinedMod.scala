package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBookOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BookOutlined", JSImport.Default)
  @js.native
  val default: BookOutlinedIconType = js.native
  
  @js.native
  trait BookOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BookOutlinedIconType: String = js.native
  }
  
  type _To = BookOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBookOutlinedMod.foo` */
  override def _to: BookOutlinedIconType = default
}
