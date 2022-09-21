package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html5FilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/Html5Filled", JSImport.Default)
  @js.native
  val default: Html5FilledIconType = js.native
  
  @js.native
  trait Html5FilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_Html5FilledIconType: String = js.native
  }
  
  type _To = Html5FilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `html5FilledMod.foo` */
  override def _to: Html5FilledIconType = default
}
