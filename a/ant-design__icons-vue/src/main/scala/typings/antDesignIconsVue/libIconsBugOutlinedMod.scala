package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBugOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BugOutlined", JSImport.Default)
  @js.native
  val default: BugOutlinedIconType = js.native
  
  @js.native
  trait BugOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BugOutlinedIconType: String = js.native
  }
  
  type _To = BugOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBugOutlinedMod.foo` */
  override def _to: BugOutlinedIconType = default
}
