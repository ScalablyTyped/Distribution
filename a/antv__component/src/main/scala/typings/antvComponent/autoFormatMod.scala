package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoFormatMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatLabels(labelGroup: IGroup, limitLength: Double, unit: Double, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLabels")(labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
