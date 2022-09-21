package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fundProjectionScreenOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FundProjectionScreenOutlined", JSImport.Default)
  @js.native
  val default: FundProjectionScreenOutlinedIconType = js.native
  
  @js.native
  trait FundProjectionScreenOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FundProjectionScreenOutlinedIconType: String = js.native
  }
  
  type _To = FundProjectionScreenOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fundProjectionScreenOutlinedMod.foo` */
  override def _to: FundProjectionScreenOutlinedIconType = default
}
