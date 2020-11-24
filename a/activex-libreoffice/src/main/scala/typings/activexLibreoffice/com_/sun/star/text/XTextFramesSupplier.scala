package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link TextFrame} instances in this context (e.g. document). */
@js.native
trait XTextFramesSupplier extends XInterface {
  
  /** returns a collection of text frames. */
  val TextFrames: XNameAccess = js.native
  
  /** returns a collection of text frames. */
  def getTextFrames(): XNameAccess = js.native
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
  implicit class XTextFramesSupplierOps[Self <: XTextFramesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTextFrames(value: XNameAccess): Self = this.set("TextFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTextFrames(value: () => XNameAccess): Self = this.set("getTextFrames", js.Any.fromFunction0(value))
  }
}
