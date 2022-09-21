package typings.antvG2

import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncViewPaddingMod {
  
  @JSImport("@antv/g2/lib/chart/util/sync-view-padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultSyncViewPadding(chart: View, views: js.Array[View], PC: PaddingCalCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSyncViewPadding")(chart.asInstanceOf[js.Any], views.asInstanceOf[js.Any], PC.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
