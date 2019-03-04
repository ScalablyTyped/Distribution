package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the combine/split functionality. */
trait XShapeCombiner
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def split(Group: XShape): scala.Unit
}

object XShapeCombiner {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    combine: js.Function1[XShapes, XShape],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    split: js.Function1[XShape, scala.Unit]
  ): XShapeCombiner = {
    val __obj = js.Dynamic.literal(acquire = acquire, combine = combine, queryInterface = queryInterface, release = release, split = split)
  
    __obj.asInstanceOf[XShapeCombiner]
  }
}

