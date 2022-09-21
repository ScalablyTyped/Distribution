package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instagramFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InstagramFilled", JSImport.Default)
  @js.native
  val default: InstagramFilledIconType = js.native
  
  @js.native
  trait InstagramFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InstagramFilledIconType: String = js.native
  }
  
  type _To = InstagramFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `instagramFilledMod.foo` */
  override def _to: InstagramFilledIconType = default
}
