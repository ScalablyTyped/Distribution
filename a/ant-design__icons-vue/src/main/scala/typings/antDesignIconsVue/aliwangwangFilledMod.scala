package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliwangwangFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AliwangwangFilled", JSImport.Default)
  @js.native
  val default: AliwangwangFilledIconType = js.native
  
  @js.native
  trait AliwangwangFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AliwangwangFilledIconType: String = js.native
  }
  
  type _To = AliwangwangFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `aliwangwangFilledMod.foo` */
  override def _to: AliwangwangFilledIconType = default
}
