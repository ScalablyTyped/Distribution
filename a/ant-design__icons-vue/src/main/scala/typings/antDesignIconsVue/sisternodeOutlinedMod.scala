package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sisternodeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SisternodeOutlined", JSImport.Default)
  @js.native
  val default: SisternodeOutlinedIconType = js.native
  
  @js.native
  trait SisternodeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SisternodeOutlinedIconType: String = js.native
  }
  
  type _To = SisternodeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `sisternodeOutlinedMod.foo` */
  override def _to: SisternodeOutlinedIconType = default
}
