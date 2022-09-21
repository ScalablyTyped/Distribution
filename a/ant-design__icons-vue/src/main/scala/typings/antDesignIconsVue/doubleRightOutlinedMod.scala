package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DoubleRightOutlined", JSImport.Default)
  @js.native
  val default: DoubleRightOutlinedIconType = js.native
  
  @js.native
  trait DoubleRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DoubleRightOutlinedIconType: String = js.native
  }
  
  type _To = DoubleRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `doubleRightOutlinedMod.foo` */
  override def _to: DoubleRightOutlinedIconType = default
}
