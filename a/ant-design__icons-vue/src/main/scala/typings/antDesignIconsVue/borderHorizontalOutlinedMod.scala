package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderHorizontalOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderHorizontalOutlined", JSImport.Default)
  @js.native
  val default: BorderHorizontalOutlinedIconType = js.native
  
  @js.native
  trait BorderHorizontalOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderHorizontalOutlinedIconType: String = js.native
  }
  
  type _To = BorderHorizontalOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `borderHorizontalOutlinedMod.foo` */
  override def _to: BorderHorizontalOutlinedIconType = default
}
