package typings.antvG2plot

import typings.antvG2.libInterfaceMod.LineOption
import typings.antvG2plot.anon.PickFunnelOptionsyFieldma
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libPlotsFunnelTypesMod.FunnelOptions
import typings.antvG2plot.libTypesCommonMod.Data
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsFunnelGeometriesCommonMod {
  
  @JSImport("@antv/g2plot/lib/plots/funnel/geometries/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conversionTagComponent(
    getLineCoordinate: js.Function4[
      /* datum */ Datum, 
      /* datumIndex */ Double, 
      /* data */ Data, 
      /* initLineOption */ Record[String, Any], 
      LineOption
    ]
  ): js.Function1[/* params */ Params[FunnelOptions], Params[FunnelOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionTagComponent")(getLineCoordinate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[FunnelOptions], Params[FunnelOptions]]]
  
  inline def transformData(
    data: js.Array[Record[String, Any]],
    originData: js.Array[Record[String, Any]],
    options: PickFunnelOptionsyFieldma
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], originData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
}
