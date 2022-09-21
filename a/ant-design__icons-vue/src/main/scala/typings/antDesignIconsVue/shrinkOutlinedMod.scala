package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shrinkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShrinkOutlined", JSImport.Default)
  @js.native
  val default: ShrinkOutlinedIconType = js.native
  
  @js.native
  trait ShrinkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ShrinkOutlinedIconType: String = js.native
  }
  
  type _To = ShrinkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `shrinkOutlinedMod.foo` */
  override def _to: ShrinkOutlinedIconType = default
}
