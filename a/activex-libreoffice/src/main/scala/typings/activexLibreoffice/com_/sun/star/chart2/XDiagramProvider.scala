package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
@js.native
trait XDiagramProvider extends XInterface {
  
  var Diagram: XDiagram = js.native
  
  def getDiagram(): XDiagram = js.native
  
  def setDiagram(xDiagram: XDiagram): Unit = js.native
}
object XDiagramProvider {
  
  @scala.inline
  def apply(
    Diagram: XDiagram,
    acquire: () => Unit,
    getDiagram: () => XDiagram,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDiagram: XDiagram => Unit
  ): XDiagramProvider = {
    val __obj = js.Dynamic.literal(Diagram = Diagram.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDiagram = js.Any.fromFunction0(getDiagram), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDiagram = js.Any.fromFunction1(setDiagram))
    __obj.asInstanceOf[XDiagramProvider]
  }
  
  @scala.inline
  implicit class XDiagramProviderMutableBuilder[Self <: XDiagramProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagram(value: XDiagram): Self = StObject.set(x, "Diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDiagram(value: () => XDiagram): Self = StObject.set(x, "getDiagram", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDiagram(value: XDiagram => Unit): Self = StObject.set(x, "setDiagram", js.Any.fromFunction1(value))
  }
}
