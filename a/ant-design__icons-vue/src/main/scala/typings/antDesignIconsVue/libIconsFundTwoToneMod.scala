package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFundTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FundTwoTone", JSImport.Default)
  @js.native
  val default: FundTwoToneIconType = js.native
  
  @js.native
  trait FundTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FundTwoToneIconType: String = js.native
  }
  
  type _To = FundTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFundTwoToneMod.foo` */
  override def _to: FundTwoToneIconType = default
}
