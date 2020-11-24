package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic interface for poly-polygons in 2D.
  * @since OOo 2.0
  */
@js.native
trait XPolyPolygon2D extends XInterface {
  
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  var FillRule: typings.activexLibreoffice.com_.sun.star.rendering.FillRule = js.native
  
  /** Query number of polygons inside this poly-polygon */
  val NumberOfPolygons: Double = js.native
  
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
  def addPolyPolygon(position: RealPoint2D, polyPolygon: XPolyPolygon2D): Unit = js.native
  
  /** Query the rule used to determine inside and outside of the poly-polygon. */
  def getFillRule(): FillRule = js.native
  
  /**
    * Query number of points inside given polygon
    * @param polygon The index of the polygon to query the number of points for. Must be in the range [0, {@link getNumberOfPolygons()} -1].
    */
  def getNumberOfPolygonPoints(polygon: Double): Double = js.native
  
  /** Query number of polygons inside this poly-polygon */
  def getNumberOfPolygons(): Double = js.native
  
  /** Query whether the specified polygon outline is closed. */
  def isClosed(index: Double): Boolean = js.native
  
  /** Set the close state of the specified polygon outline. Use -1 as the index to affect all polygons of this poly-polygon. */
  def setClosed(index: Double, closedState: Boolean): Unit = js.native
  
  /** Set the rule used to determine inside and outside of the poly-polygon. */
  def setFillRule(fillRule: FillRule): Unit = js.native
}
object XPolyPolygon2D {
  
  @scala.inline
  def apply(
    FillRule: FillRule,
    NumberOfPolygons: Double,
    acquire: () => Unit,
    addPolyPolygon: (RealPoint2D, XPolyPolygon2D) => Unit,
    getFillRule: () => FillRule,
    getNumberOfPolygonPoints: Double => Double,
    getNumberOfPolygons: () => Double,
    isClosed: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setClosed: (Double, Boolean) => Unit,
    setFillRule: FillRule => Unit
  ): XPolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule.asInstanceOf[js.Any], NumberOfPolygons = NumberOfPolygons.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPolyPolygon = js.Any.fromFunction2(addPolyPolygon), getFillRule = js.Any.fromFunction0(getFillRule), getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = js.Any.fromFunction0(getNumberOfPolygons), isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClosed = js.Any.fromFunction2(setClosed), setFillRule = js.Any.fromFunction1(setFillRule))
    __obj.asInstanceOf[XPolyPolygon2D]
  }
  
  @scala.inline
  implicit class XPolyPolygon2DOps[Self <: XPolyPolygon2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFillRule(value: FillRule): Self = this.set("FillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPolygons(value: Double): Self = this.set("NumberOfPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPolyPolygon(value: (RealPoint2D, XPolyPolygon2D) => Unit): Self = this.set("addPolyPolygon", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFillRule(value: () => FillRule): Self = this.set("getFillRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumberOfPolygonPoints(value: Double => Double): Self = this.set("getNumberOfPolygonPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberOfPolygons(value: () => Double): Self = this.set("getNumberOfPolygons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsClosed(value: Double => Boolean): Self = this.set("isClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClosed(value: (Double, Boolean) => Unit): Self = this.set("setClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFillRule(value: FillRule => Unit): Self = this.set("setFillRule", js.Any.fromFunction1(value))
  }
}
