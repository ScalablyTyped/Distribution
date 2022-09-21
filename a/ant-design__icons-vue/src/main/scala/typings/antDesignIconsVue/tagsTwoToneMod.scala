package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagsTwoTone", JSImport.Default)
  @js.native
  val default: TagsTwoToneIconType = js.native
  
  @js.native
  trait TagsTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TagsTwoToneIconType: String = js.native
  }
  
  type _To = TagsTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `tagsTwoToneMod.foo` */
  override def _to: TagsTwoToneIconType = default
}
