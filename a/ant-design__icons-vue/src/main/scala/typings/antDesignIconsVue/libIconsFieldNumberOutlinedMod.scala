package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFieldNumberOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FieldNumberOutlined", JSImport.Default)
  @js.native
  val default: FieldNumberOutlinedIconType = js.native
  
  @js.native
  trait FieldNumberOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FieldNumberOutlinedIconType: String = js.native
  }
  
  type _To = FieldNumberOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFieldNumberOutlinedMod.foo` */
  override def _to: FieldNumberOutlinedIconType = default
}
