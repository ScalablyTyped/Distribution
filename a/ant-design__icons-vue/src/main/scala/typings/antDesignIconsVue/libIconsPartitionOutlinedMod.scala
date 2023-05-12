package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPartitionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PartitionOutlined", JSImport.Default)
  @js.native
  val default: PartitionOutlinedIconType = js.native
  
  @js.native
  trait PartitionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PartitionOutlinedIconType: String = js.native
  }
  
  type _To = PartitionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPartitionOutlinedMod.foo` */
  override def _to: PartitionOutlinedIconType = default
}
