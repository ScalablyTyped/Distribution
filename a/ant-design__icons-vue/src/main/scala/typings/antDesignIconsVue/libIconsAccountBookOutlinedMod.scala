package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAccountBookOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AccountBookOutlined", JSImport.Default)
  @js.native
  val default: AccountBookOutlinedIconType = js.native
  
  @js.native
  trait AccountBookOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AccountBookOutlinedIconType: String = js.native
  }
  
  type _To = AccountBookOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAccountBookOutlinedMod.foo` */
  override def _to: AccountBookOutlinedIconType = default
}
