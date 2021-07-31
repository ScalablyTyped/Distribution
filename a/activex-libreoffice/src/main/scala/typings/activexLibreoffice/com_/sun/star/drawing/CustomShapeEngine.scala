package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service is for a {@link CustomShape} */
trait CustomShapeEngine
  extends StObject
     with XInitialization
     with XCustomShapeEngine
object CustomShapeEngine {
  
  @scala.inline
  def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: () => Unit,
    getInteraction: () => SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => Rectangle,
    initialize: SeqEquiv[js.Any] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: () => XShape
  ): CustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], LineGeometry = LineGeometry.asInstanceOf[js.Any], TextBounds = TextBounds.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[CustomShapeEngine]
  }
}
