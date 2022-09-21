package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedinFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LinkedinFilled", JSImport.Default)
  @js.native
  val default: LinkedinFilledIconType = js.native
  
  @js.native
  trait LinkedinFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LinkedinFilledIconType: String = js.native
  }
  
  type _To = LinkedinFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `linkedinFilledMod.foo` */
  override def _to: LinkedinFilledIconType = default
}
