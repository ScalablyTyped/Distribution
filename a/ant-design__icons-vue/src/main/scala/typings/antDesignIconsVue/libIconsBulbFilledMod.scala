package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBulbFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BulbFilled", JSImport.Default)
  @js.native
  val default: BulbFilledIconType = js.native
  
  @js.native
  trait BulbFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BulbFilledIconType: String = js.native
  }
  
  type _To = BulbFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBulbFilledMod.foo` */
  override def _to: BulbFilledIconType = default
}
