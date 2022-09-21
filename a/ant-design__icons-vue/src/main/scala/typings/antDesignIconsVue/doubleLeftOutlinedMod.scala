package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DoubleLeftOutlined", JSImport.Default)
  @js.native
  val default: DoubleLeftOutlinedIconType = js.native
  
  @js.native
  trait DoubleLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DoubleLeftOutlinedIconType: String = js.native
  }
  
  type _To = DoubleLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `doubleLeftOutlinedMod.foo` */
  override def _to: DoubleLeftOutlinedIconType = default
}
