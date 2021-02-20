package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to a multi-page drawing-layer. */
@js.native
trait XDrawPagesSupplier extends XInterface {
  
  /** @returns an indexed container with the service {@link DrawPages} . */
  val DrawPages: XDrawPages = js.native
  
  /** @returns an indexed container with the service {@link DrawPages} . */
  def getDrawPages(): XDrawPages = js.native
}
object XDrawPagesSupplier {
  
  @scala.inline
  def apply(
    DrawPages: XDrawPages,
    acquire: () => Unit,
    getDrawPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDrawPages = js.Any.fromFunction0(getDrawPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
  
  @scala.inline
  implicit class XDrawPagesSupplierMutableBuilder[Self <: XDrawPagesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawPages(value: XDrawPages): Self = StObject.set(x, "DrawPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDrawPages(value: () => XDrawPages): Self = StObject.set(x, "getDrawPages", js.Any.fromFunction0(value))
  }
}
