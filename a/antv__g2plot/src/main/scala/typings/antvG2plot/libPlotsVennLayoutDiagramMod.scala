package typings.antvG2plot

import typings.antvG2plot.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennLayoutDiagramMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn/layout/diagram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circleFromPath(path: Any): Radius = ^.asInstanceOf[js.Dynamic].applyDynamic("circleFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[Radius]
  
  inline def circlePath(x: Any, y: Any, r: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("circlePath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def computeTextCentre(interior: Any, exterior: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTextCentre")(interior.asInstanceOf[js.Any], exterior.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def computeTextCentres(circles: Any, areas: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTextCentres")(circles.asInstanceOf[js.Any], areas.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def intersectionAreaPath(circles: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionAreaPath")(circles.asInstanceOf[js.Any]).asInstanceOf[String]
}
