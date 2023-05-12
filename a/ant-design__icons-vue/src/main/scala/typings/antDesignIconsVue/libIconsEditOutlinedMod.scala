package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEditOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EditOutlined", JSImport.Default)
  @js.native
  val default: EditOutlinedIconType = js.native
  
  @js.native
  trait EditOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EditOutlinedIconType: String = js.native
  }
  
  type _To = EditOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEditOutlinedMod.foo` */
  override def _to: EditOutlinedIconType = default
}
