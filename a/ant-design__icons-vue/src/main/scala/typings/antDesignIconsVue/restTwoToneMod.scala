package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RestTwoTone", JSImport.Default)
  @js.native
  val default: RestTwoToneIconType = js.native
  
  @js.native
  trait RestTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RestTwoToneIconType: String = js.native
  }
  
  type _To = RestTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `restTwoToneMod.foo` */
  override def _to: RestTwoToneIconType = default
}
