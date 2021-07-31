package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** connects or breaks the lines of {@link Shapes} */
trait XShapeBinder
  extends StObject
     with XInterface {
  
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
  
  @scala.inline
  implicit class XShapeBinderMutableBuilder[Self <: XShapeBinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: XShapes => XShape): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnbind(value: XShape => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
