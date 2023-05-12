package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTagTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TagTwoTone", JSImport.Default)
  @js.native
  val default: TagTwoToneIconType = js.native
  
  @js.native
  trait TagTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TagTwoToneIconType: String = js.native
  }
  
  type _To = TagTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTagTwoToneMod.foo` */
  override def _to: TagTwoToneIconType = default
}
