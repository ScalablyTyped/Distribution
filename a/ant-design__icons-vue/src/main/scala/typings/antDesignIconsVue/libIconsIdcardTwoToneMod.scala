package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIdcardTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IdcardTwoTone", JSImport.Default)
  @js.native
  val default: IdcardTwoToneIconType = js.native
  
  @js.native
  trait IdcardTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_IdcardTwoToneIconType: String = js.native
  }
  
  type _To = IdcardTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIdcardTwoToneMod.foo` */
  override def _to: IdcardTwoToneIconType = default
}
