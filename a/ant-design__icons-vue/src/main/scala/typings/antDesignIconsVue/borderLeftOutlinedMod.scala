package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderLeftOutlined", JSImport.Default)
  @js.native
  val default: BorderLeftOutlinedIconType = js.native
  
  @js.native
  trait BorderLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderLeftOutlinedIconType: String = js.native
  }
  
  type _To = BorderLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `borderLeftOutlinedMod.foo` */
  override def _to: BorderLeftOutlinedIconType = default
}
