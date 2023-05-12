package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMoneyCollectOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MoneyCollectOutlined", JSImport.Default)
  @js.native
  val default: MoneyCollectOutlinedIconType = js.native
  
  @js.native
  trait MoneyCollectOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MoneyCollectOutlinedIconType: String = js.native
  }
  
  type _To = MoneyCollectOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMoneyCollectOutlinedMod.foo` */
  override def _to: MoneyCollectOutlinedIconType = default
}
