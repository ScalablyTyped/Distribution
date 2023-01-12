package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import typings.antvUtil.anon.X
import typings.antvUtil.antvUtilStrings.A
import typings.antvUtil.antvUtilStrings.C
import typings.antvUtil.antvUtilStrings.H
import typings.antvUtil.antvUtilStrings.L
import typings.antvUtil.antvUtilStrings.M
import typings.antvUtil.antvUtilStrings.Q
import typings.antvUtil.antvUtilStrings.S
import typings.antvUtil.antvUtilStrings.T
import typings.antvUtil.antvUtilStrings.V
import typings.antvUtil.antvUtilStrings.Z
import typings.antvUtil.antvUtilStrings.a_
import typings.antvUtil.antvUtilStrings.c_
import typings.antvUtil.antvUtilStrings.h_
import typings.antvUtil.antvUtilStrings.l_
import typings.antvUtil.antvUtilStrings.m_
import typings.antvUtil.antvUtilStrings.q_
import typings.antvUtil.antvUtilStrings.s_
import typings.antvUtil.antvUtilStrings.t_
import typings.antvUtil.antvUtilStrings.v_
import typings.antvUtil.antvUtilStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathTypesMod {
  
  type ACommand_ = A
  
  type ASegment_ = js.Tuple8[ACommand_, Double, Double, Double, Double, Double, Double, Double]
  
  type AbsoluteArray = Array[MSegment_ | AbsoluteSegment]
  
  type AbsoluteCommand = MCommand_ | LCommand_ | VCommand_ | HCommand_ | ZCommand_ | CCommand_ | SCommand_ | QCommand_ | TCommand_ | ACommand_
  
  type AbsoluteSegment = MSegment_ | LSegment_ | VSegment_ | HSegment_ | CSegment_ | SSegment_ | QSegment_ | TSegment_ | ASegment_ | ZSegment_
  
  type ArcSegment = ASegment_ | aSegment
  
  type CCommand_ = C
  
  type CSegment_ = js.Tuple7[CCommand_, Double, Double, Double, Double, Double, Double]
  
  type CloseSegment = ZSegment_ | zSegment
  
  type CubicSegment = CSegment_ | cSegment
  
  type CurveArray = Array[MSegment_ | CSegment_]
  
  type HCommand_ = H
  
  type HSegment_ = js.Tuple2[HCommand_, Double]
  
  type HorLineSegment = HSegment_ | hSegment
  
  type LCommand_ = L
  
  type LSegment_ = js.Tuple3[LCommand_, Double, Double]
  
  trait LengthFactory extends StObject {
    
    var length: Double
    
    var max: Point
    
    var min: Point
    
    var point: Point
  }
  object LengthFactory {
    
    inline def apply(length: Double, max: Point, min: Point, point: Point): LengthFactory = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LengthFactory] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  type LineSegment = LSegment_ | lSegment
  
  type MCommand_ = M
  
  type MSegment_ = js.Tuple3[MCommand_, Double, Double]
  
  type MoveSegment = MSegment_ | mSegment
  
  type NormalArray = Array[MSegment_ | NormalSegment]
  
  type NormalSegment = MSegment_ | LSegment_ | CSegment_ | QSegment_ | ASegment_ | ZSegment_
  
  trait ParserParams extends StObject {
    
    var qx: Double | Null
    
    var qy: Double | Null
    
    var x: Double
    
    var x1: Double
    
    var x2: Double
    
    var y: Double
    
    var y1: Double
    
    var y2: Double
  }
  object ParserParams {
    
    inline def apply(x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): ParserParams = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], qx = null, qy = null)
      __obj.asInstanceOf[ParserParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParserParams] (val x: Self) extends AnyVal {
      
      inline def setQx(value: Double): Self = StObject.set(x, "qx", value.asInstanceOf[js.Any])
      
      inline def setQxNull: Self = StObject.set(x, "qx", null)
      
      inline def setQy(value: Double): Self = StObject.set(x, "qy", value.asInstanceOf[js.Any])
      
      inline def setQyNull: Self = StObject.set(x, "qy", null)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  type PathArray = Array[MSegment_ | mSegment | PathSegment]
  
  trait PathBBox extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var cz: Double
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var x2: Double
    
    var y: Double
    
    var y2: Double
  }
  object PathBBox {
    
    inline def apply(
      cx: Double,
      cy: Double,
      cz: Double,
      height: Double,
      width: Double,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): PathBBox = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], cz = cz.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathBBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathBBox] (val x: Self) extends AnyVal {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCz(value: Double): Self = StObject.set(x, "cz", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathBBoxTotalLength
    extends StObject
       with PathBBox {
    
    var length: Double
  }
  object PathBBoxTotalLength {
    
    inline def apply(
      cx: Double,
      cy: Double,
      cz: Double,
      height: Double,
      length: Double,
      width: Double,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): PathBBoxTotalLength = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], cz = cz.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathBBoxTotalLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathBBoxTotalLength] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  type PathCommand = AbsoluteCommand | RelativeCommand
  
  trait PathLengthFactoryOptions extends StObject {
    
    var bbox: Boolean
    
    var length: Boolean
    
    var sampleSize: Double
  }
  object PathLengthFactoryOptions {
    
    inline def apply(bbox: Boolean, length: Boolean, sampleSize: Double): PathLengthFactoryOptions = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sampleSize = sampleSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathLengthFactoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathLengthFactoryOptions] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: Boolean): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    }
  }
  
  type PathSegment = MoveSegment | LineSegment | VertLineSegment | HorLineSegment | CloseSegment | CubicSegment | ShortCubicSegment | QuadSegment | ShortQuadSegment | ArcSegment
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointProperties extends StObject {
    
    var closest: X
    
    var distance: Double
    
    var segment: js.UndefOr[SegmentProperties] = js.undefined
  }
  object PointProperties {
    
    inline def apply(closest: X, distance: Double): PointProperties = {
      val __obj = js.Dynamic.literal(closest = closest.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointProperties] (val x: Self) extends AnyVal {
      
      inline def setClosest(value: X): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: SegmentProperties): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    }
  }
  
  type PolygonArray = Array[MSegment_ | ZSegment_ | LSegment_]
  
  type PolylineArray = Array[MSegment_ | LSegment_]
  
  type QCommand_ = Q
  
  type QSegment_ = js.Tuple5[QCommand_, Double, Double, Double, Double]
  
  type QuadSegment = QSegment_ | qSegment
  
  type RelativeArray = Array[MSegment_ | RelativeSegment]
  
  type RelativeCommand = mCommand | lCommand | vCommand | hCommand | zCommand | cCommand | sCommand | qCommand | tCommand | aCommand
  
  type RelativeSegment = mSegment | lSegment | vSegment | hSegment | cSegment | sSegment | qSegment | tSegment | aSegment | zSegment
  
  type SCommand_ = S
  
  type SSegment_ = js.Tuple5[SCommand_, Double, Double, Double, Double]
  
  trait SegmentLimits extends StObject {
    
    var max: Point
    
    var min: Point
  }
  object SegmentLimits {
    
    inline def apply(max: Point, min: Point): SegmentLimits = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentLimits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentLimits] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait SegmentProperties
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** the segment index */
    var index: Double
    
    /** the segment length */
    var length: Double
    
    /** the length including the segment length */
    var lengthAtSegment: Double
    
    /** the segment */
    var segment: PathSegment
  }
  object SegmentProperties {
    
    inline def apply(index: Double, length: Double, lengthAtSegment: Double, segment: PathSegment): SegmentProperties = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthAtSegment = lengthAtSegment.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentProperties] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthAtSegment(value: Double): Self = StObject.set(x, "lengthAtSegment", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: PathSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentVarargs(value: (ZCommand_ | zCommand)*): Self = StObject.set(x, "segment", js.Array(value*))
    }
  }
  
  type ShortCubicSegment = SSegment_ | sSegment
  
  type ShortQuadSegment = TSegment_ | tSegment
  
  type ShortSegment = VertLineSegment | HorLineSegment | ShortCubicSegment | ShortQuadSegment | CloseSegment
  
  type TCommand_ = T
  
  type TSegment_ = js.Tuple3[TCommand_, Double, Double]
  
  type VCommand_ = V
  
  type VSegment_ = js.Tuple2[VCommand_, Double]
  
  type VertLineSegment = vSegment | VSegment_
  
  type ZCommand_ = Z
  
  type ZSegment_ = js.Array[ZCommand_]
  
  type aCommand = a_
  
  type aSegment = js.Tuple8[aCommand, Double, Double, Double, Double, Double, Double, Double]
  
  type cCommand = c_
  
  type cSegment = js.Tuple7[cCommand, Double, Double, Double, Double, Double, Double]
  
  type hCommand = h_
  
  type hSegment = js.Tuple2[hCommand, Double]
  
  type lCommand = l_
  
  type lSegment = js.Tuple3[lCommand, Double, Double]
  
  type mCommand = m_
  
  type mSegment = js.Tuple3[mCommand, Double, Double]
  
  type qCommand = q_
  
  type qSegment = js.Tuple5[qCommand, Double, Double, Double, Double]
  
  type sCommand = s_
  
  type sSegment = js.Tuple5[sCommand, Double, Double, Double, Double]
  
  type tCommand = t_
  
  type tSegment = js.Tuple3[tCommand, Double, Double]
  
  type vCommand = v_
  
  type vSegment = js.Tuple2[vCommand, Double]
  
  type zCommand = z_
  
  type zSegment = js.Array[zCommand]
}
