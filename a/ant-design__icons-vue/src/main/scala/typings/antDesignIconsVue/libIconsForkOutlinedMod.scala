package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsForkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ForkOutlined", JSImport.Default)
  @js.native
  val default: ForkOutlinedIconType = js.native
  
  @js.native
  trait ForkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ForkOutlinedIconType: String = js.native
  }
  
  type _To = ForkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsForkOutlinedMod.foo` */
  override def _to: ForkOutlinedIconType = default
}
