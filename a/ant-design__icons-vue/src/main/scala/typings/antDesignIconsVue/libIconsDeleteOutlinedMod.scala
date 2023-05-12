package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDeleteOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeleteOutlined", JSImport.Default)
  @js.native
  val default: DeleteOutlinedIconType = js.native
  
  @js.native
  trait DeleteOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DeleteOutlinedIconType: String = js.native
  }
  
  type _To = DeleteOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDeleteOutlinedMod.foo` */
  override def _to: DeleteOutlinedIconType = default
}
