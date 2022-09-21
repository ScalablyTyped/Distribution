package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fundViewOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FundViewOutlined", JSImport.Default)
  @js.native
  val default: FundViewOutlinedIconType = js.native
  
  @js.native
  trait FundViewOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FundViewOutlinedIconType: String = js.native
  }
  
  type _To = FundViewOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fundViewOutlinedMod.foo` */
  override def _to: FundViewOutlinedIconType = default
}
