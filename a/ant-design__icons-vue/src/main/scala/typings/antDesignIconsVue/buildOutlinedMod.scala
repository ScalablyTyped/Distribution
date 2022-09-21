package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BuildOutlined", JSImport.Default)
  @js.native
  val default: BuildOutlinedIconType = js.native
  
  @js.native
  trait BuildOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BuildOutlinedIconType: String = js.native
  }
  
  type _To = BuildOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `buildOutlinedMod.foo` */
  override def _to: BuildOutlinedIconType = default
}
