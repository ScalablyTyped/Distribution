package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects or breaks the lines of {@link Shapes} */
trait XShapeBinder extends XInterface {
  /**
    * binds {@link Shapes} together.
    * @param xShapes a container with {@link Shapes} that will be bind together. All {@link Shapes} will be converted to a {@link PolyPolygonBezierShape} and
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all line segment from the supplied {@link Shapes} . It is also added to the {@link
    */
  def bind(xShapes: XShapes): XShape
  /**
    * breaks a {@link Shape} into its line segments
    * @param xShape the given {@link Shape} will be converted to a {@link PolyPolygonBezierShape} and the line segments of this {@link Shape} will be used to
    */
  def unbind(xShape: XShape): Unit
}

object XShapeBinder {
  @scala.inline
  def apply(
    acquire: () => Unit,
    bind: XShapes => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unbind: XShape => Unit
  ): XShapeBinder = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), bind = js.Any.fromFunction1(bind), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unbind = js.Any.fromFunction1(unbind))
  
    __obj.asInstanceOf[XShapeBinder]
  }
}

