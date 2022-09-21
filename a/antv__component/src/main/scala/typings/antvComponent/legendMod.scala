package typings.antvComponent

import typings.antvComponent.legendBaseMod.default
import typings.antvComponent.typesMod.LegendBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("@antv/component/lib/legend", "Base")
  @js.native
  abstract class Base[T /* <: LegendBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/legend", "Category")
  @js.native
  open class Category ()
    extends typings.antvComponent.categoryMod.default
  
  @JSImport("@antv/component/lib/legend", "Continuous")
  @js.native
  open class Continuous ()
    extends typings.antvComponent.continuousMod.default
}
