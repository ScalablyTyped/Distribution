package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBulbOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BulbOutlined", JSImport.Default)
  @js.native
  val default: BulbOutlinedIconType = js.native
  
  @js.native
  trait BulbOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BulbOutlinedIconType: String = js.native
  }
  
  type _To = BulbOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBulbOutlinedMod.foo` */
  override def _to: BulbOutlinedIconType = default
}
