package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

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
  def getBezierSegment(nPolygonIndex: scala.Double, nPointIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D
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
  def getBezierSegments(
    nPolygonIndex: scala.Double,
    nNumberOfPolygons: scala.Double,
    nPointIndex: scala.Double,
    nNumberOfPoints: scala.Double
  ): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
  ]
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
  def setBezierSegment(
    point: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D,
    nPolygonIndex: scala.Double,
    nPointIndex: scala.Double
  ): scala.Unit
  /**
    * Set the specified sequence of Bezier segments to the poly-polygon.
    *
    * This method can either set the whole poly-polygon to the new data, or insert the segments at the given index
    * @param points the points.
    * @param nPolygonIndex The index of the polygon to start segment insertion with. This index must be in the range [0,numPolygons], and the insertion will t
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setBezierSegments(
    points: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
    ],
    nPolygonIndex: scala.Double
  ): scala.Unit
}

object XBezierPolyPolygon2D {
  @scala.inline
  def apply(
    FillRule: FillRule,
    NumberOfPolygons: scala.Double,
    acquire: js.Function0[scala.Unit],
    addPolyPolygon: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      XPolyPolygon2D, 
      scala.Unit
    ],
    getBezierSegment: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D
    ],
    getBezierSegments: js.Function4[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
      ]
    ],
    getFillRule: js.Function0[FillRule],
    getNumberOfPolygonPoints: js.Function1[scala.Double, scala.Double],
    getNumberOfPolygons: js.Function0[scala.Double],
    isClosed: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setBezierSegment: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    setBezierSegments: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
      ], 
      scala.Double, 
      scala.Unit
    ],
    setClosed: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    setFillRule: js.Function1[FillRule, scala.Unit]
  ): XBezierPolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule, NumberOfPolygons = NumberOfPolygons, acquire = acquire, addPolyPolygon = addPolyPolygon, getBezierSegment = getBezierSegment, getBezierSegments = getBezierSegments, getFillRule = getFillRule, getNumberOfPolygonPoints = getNumberOfPolygonPoints, getNumberOfPolygons = getNumberOfPolygons, isClosed = isClosed, queryInterface = queryInterface, release = release, setBezierSegment = setBezierSegment, setBezierSegments = setBezierSegments, setClosed = setClosed, setFillRule = setFillRule)
  
    __obj.asInstanceOf[XBezierPolyPolygon2D]
  }
}

