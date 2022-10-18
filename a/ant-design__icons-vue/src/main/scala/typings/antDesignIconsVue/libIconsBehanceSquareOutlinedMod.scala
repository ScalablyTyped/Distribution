package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBehanceSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BehanceSquareOutlined", JSImport.Default)
  @js.native
  val default: BehanceSquareOutlinedIconType = js.native
  
  @js.native
  trait BehanceSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BehanceSquareOutlinedIconType: String = js.native
  }
  
  type _To = BehanceSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBehanceSquareOutlinedMod.foo` */
  override def _to: BehanceSquareOutlinedIconType = default
}
