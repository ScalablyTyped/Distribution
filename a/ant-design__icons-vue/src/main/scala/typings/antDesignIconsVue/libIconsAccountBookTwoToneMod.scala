package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAccountBookTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AccountBookTwoTone", JSImport.Default)
  @js.native
  val default: AccountBookTwoToneIconType = js.native
  
  @js.native
  trait AccountBookTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AccountBookTwoToneIconType: String = js.native
  }
  
  type _To = AccountBookTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAccountBookTwoToneMod.foo` */
  override def _to: AccountBookTwoToneIconType = default
}
