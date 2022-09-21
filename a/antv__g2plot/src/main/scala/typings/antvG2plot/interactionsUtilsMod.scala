package typings.antvG2plot

import typings.antvG2.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionsUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/mix/interactions/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearHighlight(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHighlight")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getElementValue(element: Element, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementValue")(element.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
}
