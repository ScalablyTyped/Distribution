package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldStringOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FieldStringOutlined", JSImport.Default)
  @js.native
  val default: FieldStringOutlinedIconType = js.native
  
  @js.native
  trait FieldStringOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FieldStringOutlinedIconType: String = js.native
  }
  
  type _To = FieldStringOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fieldStringOutlinedMod.foo` */
  override def _to: FieldStringOutlinedIconType = default
}
