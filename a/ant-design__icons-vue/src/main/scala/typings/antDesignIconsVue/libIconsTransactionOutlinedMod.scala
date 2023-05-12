package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTransactionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TransactionOutlined", JSImport.Default)
  @js.native
  val default: TransactionOutlinedIconType = js.native
  
  @js.native
  trait TransactionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TransactionOutlinedIconType: String = js.native
  }
  
  type _To = TransactionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTransactionOutlinedMod.foo` */
  override def _to: TransactionOutlinedIconType = default
}
