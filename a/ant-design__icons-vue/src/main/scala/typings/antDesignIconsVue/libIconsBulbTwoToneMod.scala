package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBulbTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BulbTwoTone", JSImport.Default)
  @js.native
  val default: BulbTwoToneIconType = js.native
  
  @js.native
  trait BulbTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BulbTwoToneIconType: String = js.native
  }
  
  type _To = BulbTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBulbTwoToneMod.foo` */
  override def _to: BulbTwoToneIconType = default
}
