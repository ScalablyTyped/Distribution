package typings.antvG2plot.mod

import typings.antvG2plot.libAdaptorGeometriesAreaMod.AreaGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesIntervalMod.IntervalGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesLineMod.LineGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesPointMod.PointGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesPolygonMod.PolygonGeometryOptions
import typings.antvG2plot.libAdaptorGeometriesSchemaMod.SchemaGeometryOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesLocaleMod.Locale
import typings.antvG2plot.libUtilsFlowMod.FlowFunction
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.antvG2plot.mod.^
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def FUNNEL_CONVERSATION_FIELD: /* "$$conversion$$" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNNEL_CONVERSATION_FIELD").asInstanceOf[/* "$$conversion$$" */ String]

inline def addWaterWave(
  x: Double,
  y: Double,
  level: Double,
  waveCount: Double,
  waveAttrs: ShapeStyle,
  group: IGroup,
  clip: IShape,
  radius: Double,
  waveLength: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addWaterWave(
  x: Double,
  y: Double,
  level: Double,
  waveCount: Double,
  waveAttrs: ShapeStyle,
  group: IGroup,
  clip: IShape,
  radius: Double,
  waveLength: Double,
  animation: Animation
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def area[O /* <: AreaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def flow[P](flows: FlowFunction[P]*): FlowFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(flows.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FlowFunction[P]]

inline def getCanvasPattern(options: PatternOption): js.UndefOr[CanvasPattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasPattern")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CanvasPattern]]

inline def interval[O /* <: IntervalGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def line[O /* <: LineGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def point[O /* <: PointGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def polygon[O /* <: PolygonGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def registerLocale(locale: String, localeObj: Locale): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocale")(locale.asInstanceOf[js.Any], localeObj.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def schema[O /* <: SchemaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]

inline def setGlobal(datum: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(datum.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def version: /* "2.4.20" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[/* "2.4.20" */ String]
