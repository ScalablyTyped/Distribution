package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interfaces exposes just one method to render a {@link XGraphic} container */
trait XGraphicRenderer
  extends StObject
     with XInterface {
  
  /**
    * Renders the {@link XGraphic} container
    * @param Graphic The graphic container to be rendered
    * @see XGraphic
    */
  def render(Graphic: XGraphic): Unit
}
object XGraphicRenderer {
  
  inline def apply(acquire: () => Unit, queryInterface: `type` => Any, release: () => Unit, render: XGraphic => Unit): XGraphicRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[XGraphicRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XGraphicRenderer] (val x: Self) extends AnyVal {
    
    inline def setRender(value: XGraphic => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
