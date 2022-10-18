package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDingtalkSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DingtalkSquareFilled", JSImport.Default)
  @js.native
  val default: DingtalkSquareFilledIconType = js.native
  
  @js.native
  trait DingtalkSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DingtalkSquareFilledIconType: String = js.native
  }
  
  type _To = DingtalkSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDingtalkSquareFilledMod.foo` */
  override def _to: DingtalkSquareFilledIconType = default
}
