package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EllipsisOutlined", JSImport.Default)
  @js.native
  val default: EllipsisOutlinedIconType = js.native
  
  @js.native
  trait EllipsisOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EllipsisOutlinedIconType: String = js.native
  }
  
  type _To = EllipsisOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `ellipsisOutlinedMod.foo` */
  override def _to: EllipsisOutlinedIconType = default
}
