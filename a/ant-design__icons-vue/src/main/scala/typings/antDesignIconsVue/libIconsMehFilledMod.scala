package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMehFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MehFilled", JSImport.Default)
  @js.native
  val default: MehFilledIconType = js.native
  
  @js.native
  trait MehFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MehFilledIconType: String = js.native
  }
  
  type _To = MehFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMehFilledMod.foo` */
  override def _to: MehFilledIconType = default
}
