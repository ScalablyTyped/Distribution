package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic interface for poly-polygons in 2D.
  * @since OOo 2.0
  */
trait XPolyPolygon2D
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  var FillRule: FillRule
  /** Query number of polygons inside this poly-polygon */
  val NumberOfPolygons: scala.Double
  /**
    * Add the specified poly-polygon at the given position.
    *
    * One can do symbolic path construction with this method. The poly-polygons added by this method are not joined in the sense that they participate in
    * mutual fill rule calculations like the polygons inside a single poly-polygon do. When rendering such a poly-polygon without transparency, it will look
    * like the constituting poly-polygons rendered separately on top of another. Alas, when rendering with transparency, separate rendering will combine the
    * alpha of overlapping areas, whereas addPolyPolygon results in constant alpha, regardless how many internal poly-polygons overlap at a single place.
    * @param position The poly-polygon will be added at the given position, i.e. the upper, left edge of the referenced poly-polygon will be at this position
    * @param polyPolygon The poly-polygon to add. Note that the content of this poly-polygon is copied, later changes to polyPolygon will have no effect on th
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the {@link XPolyPolygon2D} parameter does not support one of the data-providing derivat
    */
  def addPolyPolygon(
    position: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    polyPolygon: XPolyPolygon2D
  ): scala.Unit
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  def getFillRule(): FillRule
  /**
    * Query number of points inside given polygon
    * @param polygon The index of the polygon to query the number of points for. Must be in the range [0, {@link getNumberOfPolygons()} -1].
    */
  def getNumberOfPolygonPoints(polygon: scala.Double): scala.Double
  /** Query number of polygons inside this poly-polygon */
  def getNumberOfPolygons(): scala.Double
  /** Query whether the specified polygon outline is closed. */
  def isClosed(index: scala.Double): scala.Boolean
  /** Set the close state of the specified polygon outline. Use -1 as the index to affect all polygons of this poly-polygon. */
  def setClosed(index: scala.Double, closedState: scala.Boolean): scala.Unit
  /** Set the rule used to determine inside and outside of the poly-polygon. */
  def setFillRule(fillRule: FillRule): scala.Unit
}

