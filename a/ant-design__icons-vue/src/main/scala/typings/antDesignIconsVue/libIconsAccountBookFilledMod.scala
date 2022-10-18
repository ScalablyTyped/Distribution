package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAccountBookFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AccountBookFilled", JSImport.Default)
  @js.native
  val default: AccountBookFilledIconType = js.native
  
  @js.native
  trait AccountBookFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AccountBookFilledIconType: String = js.native
  }
  
  type _To = AccountBookFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAccountBookFilledMod.foo` */
  override def _to: AccountBookFilledIconType = default
}
