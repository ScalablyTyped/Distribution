package typings.antDesignCssinjs

import org.scalablytyped.runtime.Shortcut
import typings.antDesignCssinjs.esTransformersInterfaceMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransformersLegacyLogicalPropertiesMod extends Shortcut {
  
  /**
    * Convert css logical properties to legacy properties.
    * Such as: `margin-block-start` to `margin-top`.
    * Transform list:
    * - inset
    * - margin
    * - padding
    * - border
    */
  @JSImport("@ant-design/cssinjs/es/transformers/legacyLogicalProperties", JSImport.Default)
  @js.native
  val default: Transformer = js.native
  
  type _To = Transformer
  
  /* This means you don't have to write `default`, but can instead just say `esTransformersLegacyLogicalPropertiesMod.foo` */
  override def _to: Transformer = default
}
