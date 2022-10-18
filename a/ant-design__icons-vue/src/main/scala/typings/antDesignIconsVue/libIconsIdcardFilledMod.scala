package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIdcardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IdcardFilled", JSImport.Default)
  @js.native
  val default: IdcardFilledIconType = js.native
  
  @js.native
  trait IdcardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IdcardFilledIconType: String = js.native
  }
  
  type _To = IdcardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIdcardFilledMod.foo` */
  override def _to: IdcardFilledIconType = default
}
