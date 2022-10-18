package typings.antvG2

import typings.antvG2.libChartViewMod.View
import typings.antvG2.libGeometryElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementHighlightUtilMod {
  
  @JSImport("@antv/g2/lib/interaction/action/element/highlight-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearHighlight(view: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHighlight")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setHighlightBy(elements: js.Array[default], callback: MatchCallback, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHighlightBy")(elements.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MatchCallback = js.Function1[/* el */ default, Boolean]
}
