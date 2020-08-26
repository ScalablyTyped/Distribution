package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects or breaks the lines of {@link Shapes} */
@js.native
trait XShapeBinder extends XInterface {
  /**
    * binds {@link Shapes} together.
    * @param xShapes a container with {@link Shapes} that will be bind together. All {@link Shapes} will be converted to a {@link PolyPolygonBezierShape} and
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all line segment from the supplied {@link Shapes} . It is also added to the {@link
    */
  def bind(xShapes: XShapes): XShape = js.native
  /**
    * breaks a {@link Shape} into its line segments
    * @param xShape the given {@link Shape} will be converted to a {@link PolyPolygonBezierShape} and the line segments of this {@link Shape} will be used to
    */
  def unbind(xShape: XShape): Unit = js.native
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
  @scala.inline
  implicit class XShapeBinderOps[Self <: XShapeBinder] (val x: Self) extends AnyVal {
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
    def setBind(value: XShapes => XShape): Self = this.set("bind", js.Any.fromFunction1(value))
    @scala.inline
    def setUnbind(value: XShape => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
  }
  
}

