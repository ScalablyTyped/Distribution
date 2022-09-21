package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retweetOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RetweetOutlined", JSImport.Default)
  @js.native
  val default: RetweetOutlinedIconType = js.native
  
  @js.native
  trait RetweetOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RetweetOutlinedIconType: String = js.native
  }
  
  type _To = RetweetOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `retweetOutlinedMod.foo` */
  override def _to: RetweetOutlinedIconType = default
}
