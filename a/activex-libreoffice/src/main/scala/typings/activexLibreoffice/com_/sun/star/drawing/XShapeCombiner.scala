package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the combine/split functionality. */
trait XShapeCombiner extends XInterface {
  /**
    * combines {@link Shapes}
    * @param xShapes the {@link Shapes} inside this container are converted to PolyPolygonBezierShapes and are than combined into one {@link PolyPolygonBezier
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all converted {@link PolyPolygonBezierShape} combined. It is also added to the {@li
    */
  def combine(xShapes: XShapes): XShape
  /**
    * splits {@link Shapes} .
    * @param Group the {@link Shape} is converted to a PolyPolygonBezierShapes and then split into several PolyPolygonBezierShapes The {@link Shapes} in xShap
    */
  def split(Group: XShape): Unit
}

object XShapeCombiner {
  @scala.inline
  def apply(
    acquire: () => Unit,
    combine: XShapes => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    split: XShape => Unit
  ): XShapeCombiner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), combine = js.Any.fromFunction1(combine), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), split = js.Any.fromFunction1(split))
    __obj.asInstanceOf[XShapeCombiner]
  }
}

