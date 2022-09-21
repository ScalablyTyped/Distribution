package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MtfRenderer
  extends StObject
     with XMtfRenderer {
  
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): Unit
}
object MtfRenderer {
  
  inline def apply(
    acquire: () => Unit,
    createWithBitmapCanvas: XBitmapCanvas => Unit,
    draw: (Double, Double) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setMetafile: SeqEquiv[Double] => Unit
  ): MtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithBitmapCanvas = js.Any.fromFunction1(createWithBitmapCanvas), draw = js.Any.fromFunction2(draw), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMetafile = js.Any.fromFunction1(setMetafile))
    __obj.asInstanceOf[MtfRenderer]
  }
  
  extension [Self <: MtfRenderer](x: Self) {
    
    inline def setCreateWithBitmapCanvas(value: XBitmapCanvas => Unit): Self = StObject.set(x, "createWithBitmapCanvas", js.Any.fromFunction1(value))
  }
}
