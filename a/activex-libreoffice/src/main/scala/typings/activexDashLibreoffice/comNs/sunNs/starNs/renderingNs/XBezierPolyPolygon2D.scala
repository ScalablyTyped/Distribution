package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealPoint2D
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialized interface for a 2D poly-polygon containing straight line and Bezier segments.
  *
  * This poly-polygon can contain polygons consisting of a mixture of cubic Bezier curves and straight lines. As the straight line is a special case of a
  * cubic Bezier curve (control points collinear with the line through start and end point), this can be expressed uniformly with a sequence of
  * RealBezierSegment2Ds.
  *
  * By convention, a RealBezierSegment2D is a straight line segment, if all three contained points are strictly equal.
  * @since OOo 2.0
  */
trait XBezierPolyPolygon2D extends XPolyPolygon2D {
  /**
    * Get a single point from the poly-polygon.
    * @param nPolygonIndex The index of the polygon where the point to be extract is contained within. This index must be in the range [0,numPolygons-1].
    * @param nPointIndex The index of the point in the polygon specified by nPolygonIndex, which is to be retrieved. This value must not exceed the number of
    * @returns the requested point.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def getBezierSegment(nPolygonIndex: Double, nPointIndex: Double): RealBezierSegment2D
  /**
    * Query subset of this poly-polygon.
    *
    * Query subset of this poly-polygon, starting at the given polygon and the given point within that polygon, and containing the specified number of
    * polygons and points in the last polygon.
    * @param nPolygonIndex The index of the polygon to start point retrieval with. This index must be in the range [0,numPolygons-1].
    * @param nNumberOfPolygons The number of polygons to extract. This value must not exceed numPolygons-nPolygonIndex.
    * @param nPointIndex The index of the first point in the first polygon to extract. This value must not exceed the number of points in this polygon minus one.
    * @param nNumberOfPoints The number of points to extract from the last polygon. This value must not exceed the number of points in this last polygon minus one.
    * @returns the sequence of extracted points.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def getBezierSegments(nPolygonIndex: Double, nNumberOfPolygons: Double, nPointIndex: Double, nNumberOfPoints: Double): SafeArray[SafeArray[RealBezierSegment2D]]
  /**
    * Set a single point on the poly-polygon.
    *
    * The remaining points of the poly-polygon will not be changed by this method. Use {@link XBezierPolyPolygon2D.getNumberOfPolygons()} or {@link
    * XBezierPolyPolygon2D.getNumberOfPolygonPoints()} to append points or polygons, respectively.
    * @param point The point to be set at the poly-polygon.
    * @param nPolygonIndex The index of the polygon to insert the point in. This index must be in the range [0,numPolygons].
    * @param nPointIndex The index of the point in the polygon specified by nPolygonIndex, which is to be set. This value must not exceed the number of points
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setBezierSegment(point: RealBezierSegment2D, nPolygonIndex: Double, nPointIndex: Double): Unit
  /**
    * Set the specified sequence of Bezier segments to the poly-polygon.
    *
    * This method can either set the whole poly-polygon to the new data, or insert the segments at the given index
    * @param points the points.
    * @param nPolygonIndex The index of the polygon to start segment insertion with. This index must be in the range [0,numPolygons], and the insertion will t
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setBezierSegments(points: SeqEquiv[SeqEquiv[RealBezierSegment2D]], nPolygonIndex: Double): Unit
}

object XBezierPolyPolygon2D {
  @scala.inline
  def apply(
    FillRule: FillRule,
    NumberOfPolygons: Double,
    acquire: () => Unit,
    addPolyPolygon: (RealPoint2D, XPolyPolygon2D) => Unit,
    getBezierSegment: (Double, Double) => RealBezierSegment2D,
    getBezierSegments: (Double, Double, Double, Double) => SafeArray[SafeArray[RealBezierSegment2D]],
    getFillRule: () => FillRule,
    getNumberOfPolygonPoints: Double => Double,
    getNumberOfPolygons: () => Double,
    isClosed: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setBezierSegment: (RealBezierSegment2D, Double, Double) => Unit,
    setBezierSegments: (SeqEquiv[SeqEquiv[RealBezierSegment2D]], Double) => Unit,
    setClosed: (Double, Boolean) => Unit,
    setFillRule: FillRule => Unit
  ): XBezierPolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule, NumberOfPolygons = NumberOfPolygons, acquire = js.Any.fromFunction0(acquire), addPolyPolygon = js.Any.fromFunction2(addPolyPolygon), getBezierSegment = js.Any.fromFunction2(getBezierSegment), getBezierSegments = js.Any.fromFunction4(getBezierSegments), getFillRule = js.Any.fromFunction0(getFillRule), getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = js.Any.fromFunction0(getNumberOfPolygons), isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBezierSegment = js.Any.fromFunction3(setBezierSegment), setBezierSegments = js.Any.fromFunction2(setBezierSegments), setClosed = js.Any.fromFunction2(setClosed), setFillRule = js.Any.fromFunction1(setFillRule))
  
    __obj.asInstanceOf[XBezierPolyPolygon2D]
  }
}

