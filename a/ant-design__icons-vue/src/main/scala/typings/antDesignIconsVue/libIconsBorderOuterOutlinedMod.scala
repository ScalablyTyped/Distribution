package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBorderOuterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BorderOuterOutlined", JSImport.Default)
  @js.native
  val default: BorderOuterOutlinedIconType = js.native
  
  @js.native
  trait BorderOuterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BorderOuterOutlinedIconType: String = js.native
  }
  
  type _To = BorderOuterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBorderOuterOutlinedMod.foo` */
  override def _to: BorderOuterOutlinedIconType = default
}
