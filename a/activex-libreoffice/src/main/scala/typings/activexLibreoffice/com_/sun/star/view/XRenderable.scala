package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents something that can be rendered.
  * @since OOo 1.1.2
  */
trait XRenderable
  extends StObject
     with XInterface {
  
  /**
    * @returns a descriptor of the specific renderer.  returns the specific renderer properties based on the given selection.  If the selection contains a valid
    * @see RenderDescriptor
    * @see RenderOptions
    */
  def getRenderer(nRenderer: Double, aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): SafeArray[PropertyValue]
  
  /**
    * @returns the count of renderers (based on paper count of a document, for example).  If a selection is given, the count has to be calculated based on this
    * @see RenderOptions
    */
  def getRendererCount(aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): Double
  
  /**
    * renders the object.
    *
    * renders the object with the specific renderer based on the given selection.
    *
    * If the selection contains a valid XModel interface, it is assumed that the whole document should be rendered. If the selection is empty, nothing
    * should be rendered.
    * @see RenderOptions
    */
  def render(nRenderer: Double, aSelection: js.Any, xOptions: SeqEquiv[PropertyValue]): Unit
}
object XRenderable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getRenderer: (Double, js.Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue],
    getRendererCount: (js.Any, SeqEquiv[PropertyValue]) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: (Double, js.Any, SeqEquiv[PropertyValue]) => Unit
  ): XRenderable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRenderer = js.Any.fromFunction3(getRenderer), getRendererCount = js.Any.fromFunction2(getRendererCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction3(render))
    __obj.asInstanceOf[XRenderable]
  }
  
  @scala.inline
  implicit class XRenderableMutableBuilder[Self <: XRenderable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRenderer(value: (Double, js.Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue]): Self = StObject.set(x, "getRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRendererCount(value: (js.Any, SeqEquiv[PropertyValue]) => Double): Self = StObject.set(x, "getRendererCount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRender(value: (Double, js.Any, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
  }
}
