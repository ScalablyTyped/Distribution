package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInsertRowRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsertRowRightOutlined", JSImport.Default)
  @js.native
  val default: InsertRowRightOutlinedIconType = js.native
  
  @js.native
  trait InsertRowRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_InsertRowRightOutlinedIconType: String = js.native
  }
  
  type _To = InsertRowRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInsertRowRightOutlinedMod.foo` */
  override def _to: InsertRowRightOutlinedIconType = default
}
