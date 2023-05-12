package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFormOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FormOutlined", JSImport.Default)
  @js.native
  val default: FormOutlinedIconType = js.native
  
  @js.native
  trait FormOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FormOutlinedIconType: String = js.native
  }
  
  type _To = FormOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFormOutlinedMod.foo` */
  override def _to: FormOutlinedIconType = default
}
