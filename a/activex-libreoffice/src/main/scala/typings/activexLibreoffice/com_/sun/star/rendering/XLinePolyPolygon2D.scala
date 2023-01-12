package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specialized interface for a 2D poly-polygon containing only straight line segments.
  * @since OOo 2.0
  */
trait XLinePolyPolygon2D
  extends StObject
     with XPolyPolygon2D {
  
  /** Get a single point from the poly-polygon */
  def getPoint(nPolygonIndex: Double, nPointIndex: Double): RealPoint2D
  
  /**
    * Query subset of this poly-polygon, starting at the given polygon and the given point within that polygon, and containing the specified number of
    * polygons and points in the last polygon.
    * @param nPolygonIndex The index number of the polygon to start with extracting points. Set to 0 to start with the first polygon.
    * @param nNumberOfPolygons The number of polygons, starting with nPolygonIndex, to extract points from. Set to -1 to extract all polygons, starting with n
    * @param nPointIndex The index of the point within the first polygon (that with the index number nPolygonIndex) to start extraction with. Set to 0 to star
    * @param nNumberOfPoints The number of points in the last polygon of the extraction sequence, to be extracted. Set to -1 to extract all points from the la
    */
  def getPoints(nPolygonIndex: Double, nNumberOfPolygons: Double, nPointIndex: Double, nNumberOfPoints: Double): SafeArray[SafeArray[RealPoint2D]]
  
  /** Set a single point on the poly-polygon. The remaining points of the poly-polygon will not be changed by this method. */
  def setPoint(point: RealPoint2D, nPolygonIndex: Double, nPointIndex: Double): Unit
  
  /**
    * Set the specified sequence of points to the poly-polygon.
    *
    * This method can either set the whole poly-polygon to the new data, or insert the points at the given index
    * @param points the points.
    * @param nPolygonIndex The index of the polygon to start point insertion with. This index must be in the range [0,numPolygons], and the insertion will tak
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setPoints(points: SeqEquiv[SeqEquiv[RealPoint2D]], nPolygonIndex: Double): Unit
}
object XLinePolyPolygon2D {
  
  inline def apply(
    FillRule: FillRule,
    NumberOfPolygons: Double,
    acquire: () => Unit,
    addPolyPolygon: (RealPoint2D, XPolyPolygon2D) => Unit,
    getFillRule: () => FillRule,
    getNumberOfPolygonPoints: Double => Double,
    getNumberOfPolygons: () => Double,
    getPoint: (Double, Double) => RealPoint2D,
    getPoints: (Double, Double, Double, Double) => SafeArray[SafeArray[RealPoint2D]],
    isClosed: Double => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setClosed: (Double, Boolean) => Unit,
    setFillRule: FillRule => Unit,
    setPoint: (RealPoint2D, Double, Double) => Unit,
    setPoints: (SeqEquiv[SeqEquiv[RealPoint2D]], Double) => Unit
  ): XLinePolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule.asInstanceOf[js.Any], NumberOfPolygons = NumberOfPolygons.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPolyPolygon = js.Any.fromFunction2(addPolyPolygon), getFillRule = js.Any.fromFunction0(getFillRule), getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = js.Any.fromFunction0(getNumberOfPolygons), getPoint = js.Any.fromFunction2(getPoint), getPoints = js.Any.fromFunction4(getPoints), isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClosed = js.Any.fromFunction2(setClosed), setFillRule = js.Any.fromFunction1(setFillRule), setPoint = js.Any.fromFunction3(setPoint), setPoints = js.Any.fromFunction2(setPoints))
    __obj.asInstanceOf[XLinePolyPolygon2D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLinePolyPolygon2D] (val x: Self) extends AnyVal {
    
    inline def setGetPoint(value: (Double, Double) => RealPoint2D): Self = StObject.set(x, "getPoint", js.Any.fromFunction2(value))
    
    inline def setGetPoints(value: (Double, Double, Double, Double) => SafeArray[SafeArray[RealPoint2D]]): Self = StObject.set(x, "getPoints", js.Any.fromFunction4(value))
    
    inline def setSetPoint(value: (RealPoint2D, Double, Double) => Unit): Self = StObject.set(x, "setPoint", js.Any.fromFunction3(value))
    
    inline def setSetPoints(value: (SeqEquiv[SeqEquiv[RealPoint2D]], Double) => Unit): Self = StObject.set(x, "setPoints", js.Any.fromFunction2(value))
  }
}
