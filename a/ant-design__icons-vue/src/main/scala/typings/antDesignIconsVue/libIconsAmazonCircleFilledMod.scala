package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAmazonCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AmazonCircleFilled", JSImport.Default)
  @js.native
  val default: AmazonCircleFilledIconType = js.native
  
  @js.native
  trait AmazonCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AmazonCircleFilledIconType: String = js.native
  }
  
  type _To = AmazonCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAmazonCircleFilledMod.foo` */
  override def _to: AmazonCircleFilledIconType = default
}
