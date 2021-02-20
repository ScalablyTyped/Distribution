package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The {@link XCustomShapeEngine} */
@js.native
trait XCustomShapeEngine extends XInterface {
  
  /** @returns a collection of interaction handles */
  val Interaction: SafeArray[XCustomShapeHandle] = js.native
  
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords = js.native
  
  /** @returns the text bound of the shape */
  val TextBounds: Rectangle = js.native
  
  /** @returns a collection of interaction handles */
  def getInteraction(): SafeArray[XCustomShapeHandle] = js.native
  
  /** @returns the line geometry of the object */
  def getLineGeometry(): PolyPolygonBezierCoords = js.native
  
  /** @returns the text bound of the shape */
  def getTextBounds(): Rectangle = js.native
  
  /** @returns a the shape that is representing the {@link CustomShape} */
  def render(): XShape = js.native
}
object XCustomShapeEngine {
  
  @scala.inline
  def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: () => Unit,
    getInteraction: () => SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: () => XShape
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], LineGeometry = LineGeometry.asInstanceOf[js.Any], TextBounds = TextBounds.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[XCustomShapeEngine]
  }
  
  @scala.inline
  implicit class XCustomShapeEngineMutableBuilder[Self <: XCustomShapeEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInteraction(value: () => SafeArray[XCustomShapeHandle]): Self = StObject.set(x, "getInteraction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineGeometry(value: () => PolyPolygonBezierCoords): Self = StObject.set(x, "getLineGeometry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextBounds(value: () => Rectangle): Self = StObject.set(x, "getTextBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInteraction(value: SafeArray[XCustomShapeHandle]): Self = StObject.set(x, "Interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineGeometry(value: PolyPolygonBezierCoords): Self = StObject.set(x, "LineGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: () => XShape): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextBounds(value: Rectangle): Self = StObject.set(x, "TextBounds", value.asInstanceOf[js.Any])
  }
}
