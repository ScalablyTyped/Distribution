package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link TextFrame} instances in this context (e.g. document). */
trait XTextFramesSupplier
  extends StObject
     with XInterface {
  
  /** returns a collection of text frames. */
  val TextFrames: XNameAccess
  
  /** returns a collection of text frames. */
  def getTextFrames(): XNameAccess
}
object XTextFramesSupplier {
  
  @scala.inline
  def apply(
    TextFrames: XNameAccess,
    acquire: () => Unit,
    getTextFrames: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextFramesSupplier = {
    val __obj = js.Dynamic.literal(TextFrames = TextFrames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextFrames = js.Any.fromFunction0(getTextFrames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextFramesSupplier]
  }
  
  @scala.inline
  implicit class XTextFramesSupplierMutableBuilder[Self <: XTextFramesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTextFrames(value: () => XNameAccess): Self = StObject.set(x, "getTextFrames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextFrames(value: XNameAccess): Self = StObject.set(x, "TextFrames", value.asInstanceOf[js.Any])
  }
}
