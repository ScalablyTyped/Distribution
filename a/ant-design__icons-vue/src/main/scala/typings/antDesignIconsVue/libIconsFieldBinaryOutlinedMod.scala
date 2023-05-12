package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFieldBinaryOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FieldBinaryOutlined", JSImport.Default)
  @js.native
  val default: FieldBinaryOutlinedIconType = js.native
  
  @js.native
  trait FieldBinaryOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FieldBinaryOutlinedIconType: String = js.native
  }
  
  type _To = FieldBinaryOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFieldBinaryOutlinedMod.foo` */
  override def _to: FieldBinaryOutlinedIconType = default
}
