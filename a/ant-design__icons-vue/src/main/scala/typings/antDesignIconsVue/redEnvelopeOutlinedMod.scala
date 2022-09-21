package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redEnvelopeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedEnvelopeOutlined", JSImport.Default)
  @js.native
  val default: RedEnvelopeOutlinedIconType = js.native
  
  @js.native
  trait RedEnvelopeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedEnvelopeOutlinedIconType: String = js.native
  }
  
  type _To = RedEnvelopeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `redEnvelopeOutlinedMod.foo` */
  override def _to: RedEnvelopeOutlinedIconType = default
}
