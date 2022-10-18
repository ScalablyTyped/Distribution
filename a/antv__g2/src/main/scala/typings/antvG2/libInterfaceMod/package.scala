package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.antvG2Strings.auto
import typings.antvG2.antvG2Strings.reflect
import typings.antvG2.antvG2Strings.rotate
import typings.antvG2.antvG2Strings.scale
import typings.antvG2.antvG2Strings.transpose
import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libFacetMod.Facet
import typings.antvG2.libGeometryElementMod.default
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.PathCommand
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionCallback = js.Function1[/* context */ IInteractionContext, Unit]

type AllLegendsOptions = LegendCfg | (Record[String, LegendOption]) | Boolean

type AnimateDelayCallback = js.Function1[/* data */ Datum, Double]

type AnimateDurationCallback = js.Function1[/* data */ Datum, Double]

type AnimateEasingCallback = js.Function1[/* data */ Datum, String]

type AnnotationPosition = (js.Tuple2[Double | String, Double | String]) | (Record[String, Double | String]) | AnnotationPositionCallback

type AnnotationPositionCallback = js.Function2[
/* xScales */ (js.Array[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
]) | (Record[
  String, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
]), 
/* yScales */ (js.Array[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
]) | (Record[
  String, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
]), 
js.Tuple2[Double | String, Double | String]]

type ArcOption = RegionPositionBaseOption

type AxisOption = AxisCfg | Boolean

type CircleData = FacetData

type CoordinateActions = CoordinateRotate | CoordinateReflect | CoordinateScale | CoordinateTranspose

type CoordinateReflect = js.Tuple2[reflect, x | y]

type CoordinateRotate = js.Tuple2[rotate, Double]

type CoordinateScale = js.Tuple3[scale, Double, Double]

type CoordinateTranspose = js.Array[transpose]

type CustomOption = Any

type Data = js.Array[Datum]

type Datum = Record[String, Any]

type EventCallback = js.Function1[/* event */ LooseObject, Unit]

type EventCfg = StringDictionary[EventCallback]

type FacetCtor = Instantiable2[/* view */ View, /* cfg */ Any, Facet[FacetCfg[FacetData], FacetData]]

type FacetDataFilter = js.Function1[/* data */ js.Array[Datum], Boolean]

type FilterCondition = js.Function3[/* value */ Any, /* datum */ Datum, /* idx */ js.UndefOr[Double], Boolean]

type GeometryLabelContentCallback = js.Function3[
/* data */ Datum, 
/* mappingData */ MappingDatum, 
/* index */ Double, 
String | IShape | IGroup]

type LegendOption = LegendCfg | Boolean

type LooseObject = StringDictionary[Any]

type MarkerCallback = js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, js.Array[PathCommand]]

type MatrixData = FacetData

type MirrorData = FacetData

type Padding = js.Tuple4[Double, Double, Double, Double]

type Position = js.Tuple2[Double, Double]

type RectData = FacetData

type RegionOption = RegionPositionBaseOption

type ScrollbarOption = ScrollbarCfg | Boolean

type ShapeMarkerSymbol = js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, js.Array[PathCommand]]

type ShapeVertices = js.Array[js.Array[Point] | Point | RangePoint]

type SliderOption = SliderCfg | Boolean

type StateStyleCallback = js.Function1[/* element */ default, LooseObject]

type SyncViewPaddingFn = js.Function3[/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor, Unit]

type TooltipCrosshairsTextCallback = js.Function4[
/* type */ String, 
/* defaultContent */ Any, 
/* items */ js.Array[Any], 
/* currentPoint */ Point, 
TooltipCrosshairsText]

type TooltipOption = TooltipCfg | Boolean

type TooltipTitle = String | (js.Function2[/* title */ String, /* datum */ Datum, String])

type ViewAppendPadding = Double | js.Array[Double]

type ViewPadding = Double | js.Array[Double] | auto
