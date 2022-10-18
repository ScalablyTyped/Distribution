package typings.antvG2plot

import typings.antvG2plot.libPlotsFacetTypesMod.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsFacetUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/facet/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def execViewAdaptor(
    viewOfG2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: IView
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("execViewAdaptor")(viewOfG2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
