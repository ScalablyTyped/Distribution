package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAmazonOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AmazonOutlined", JSImport.Default)
  @js.native
  val default: AmazonOutlinedIconType = js.native
  
  @js.native
  trait AmazonOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AmazonOutlinedIconType: String = js.native
  }
  
  type _To = AmazonOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAmazonOutlinedMod.foo` */
  override def _to: AmazonOutlinedIconType = default
}
