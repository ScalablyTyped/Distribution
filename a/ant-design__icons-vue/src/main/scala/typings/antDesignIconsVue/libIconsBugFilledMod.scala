package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBugFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BugFilled", JSImport.Default)
  @js.native
  val default: BugFilledIconType = js.native
  
  @js.native
  trait BugFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BugFilledIconType: String = js.native
  }
  
  type _To = BugFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBugFilledMod.foo` */
  override def _to: BugFilledIconType = default
}
