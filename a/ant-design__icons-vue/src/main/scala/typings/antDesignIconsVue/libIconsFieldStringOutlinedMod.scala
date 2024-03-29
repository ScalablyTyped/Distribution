package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFieldStringOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FieldStringOutlined", JSImport.Default)
  @js.native
  val default: FieldStringOutlinedIconType = js.native
  
  @js.native
  trait FieldStringOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FieldStringOutlinedIconType: String = js.native
  }
  
  type _To = FieldStringOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFieldStringOutlinedMod.foo` */
  override def _to: FieldStringOutlinedIconType = default
}
