package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMtfRenderer extends XInterface {
  
  def draw(fScaleX: Double, fScaleY: Double): Unit = js.native
  
  def setMetafile(aMtf: SeqEquiv[Double]): Unit = js.native
}
object XMtfRenderer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    draw: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMetafile: SeqEquiv[Double] => Unit
  ): XMtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), draw = js.Any.fromFunction2(draw), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMetafile = js.Any.fromFunction1(setMetafile))
    __obj.asInstanceOf[XMtfRenderer]
  }
  
  @scala.inline
  implicit class XMtfRendererMutableBuilder[Self <: XMtfRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: (Double, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMetafile(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "setMetafile", js.Any.fromFunction1(value))
  }
}
