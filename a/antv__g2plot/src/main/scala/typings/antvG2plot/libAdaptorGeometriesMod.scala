package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesAreaMod.AreaGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesEdgeMod.EdgeGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesIntervalMod.IntervalGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesLineMod.LineGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesPointMod.PointGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesPolygonMod.PolygonGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesSchemaMod.SchemaGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesViolinMod.ViolinGeometryOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def area[O /* <: AreaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def edge[O /* <: EdgeGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("edge")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def interval[O /* <: IntervalGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def line[O /* <: LineGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def point[O /* <: PointGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def polygon[O /* <: PolygonGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def schema[O /* <: SchemaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def violin[O /* <: ViolinGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("violin")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
}
