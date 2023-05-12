package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEllipsisOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EllipsisOutlined", JSImport.Default)
  @js.native
  val default: EllipsisOutlinedIconType = js.native
  
  @js.native
  trait EllipsisOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EllipsisOutlinedIconType: String = js.native
  }
  
  type _To = EllipsisOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEllipsisOutlinedMod.foo` */
  override def _to: EllipsisOutlinedIconType = default
}
