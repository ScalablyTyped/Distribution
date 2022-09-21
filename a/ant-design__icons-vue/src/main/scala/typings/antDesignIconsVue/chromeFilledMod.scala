package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ChromeFilled", JSImport.Default)
  @js.native
  val default: ChromeFilledIconType = js.native
  
  @js.native
  trait ChromeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ChromeFilledIconType: String = js.native
  }
  
  type _To = ChromeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `chromeFilledMod.foo` */
  override def _to: ChromeFilledIconType = default
}
