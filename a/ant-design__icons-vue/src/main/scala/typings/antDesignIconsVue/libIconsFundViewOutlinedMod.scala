package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFundViewOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FundViewOutlined", JSImport.Default)
  @js.native
  val default: FundViewOutlinedIconType = js.native
  
  @js.native
  trait FundViewOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FundViewOutlinedIconType: String = js.native
  }
  
  type _To = FundViewOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFundViewOutlinedMod.foo` */
  override def _to: FundViewOutlinedIconType = default
}
