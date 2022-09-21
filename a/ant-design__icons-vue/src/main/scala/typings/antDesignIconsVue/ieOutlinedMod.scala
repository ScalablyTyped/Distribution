package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IeOutlined", JSImport.Default)
  @js.native
  val default: IeOutlinedIconType = js.native
  
  @js.native
  trait IeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IeOutlinedIconType: String = js.native
  }
  
  type _To = IeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `ieOutlinedMod.foo` */
  override def _to: IeOutlinedIconType = default
}
