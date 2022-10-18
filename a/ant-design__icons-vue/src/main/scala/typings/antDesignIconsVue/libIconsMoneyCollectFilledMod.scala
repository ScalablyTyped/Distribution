package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMoneyCollectFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MoneyCollectFilled", JSImport.Default)
  @js.native
  val default: MoneyCollectFilledIconType = js.native
  
  @js.native
  trait MoneyCollectFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MoneyCollectFilledIconType: String = js.native
  }
  
  type _To = MoneyCollectFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMoneyCollectFilledMod.foo` */
  override def _to: MoneyCollectFilledIconType = default
}
