package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Should be implemented by a clipboard factory that simplifies the creation of multiple clipboard instances.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
@js.native
trait XClipboardFactory extends XInterface {
  
  /**
    * Creates a new named clipboard instance.
    * @param aName The name the clipboard should have.
    * @returns A newly created instance of a {@link GenericClipboard} implementation.
    * @throws com::sun::star::lang::IllegalArgumentException If an empty string is passed as clipboard name.
    */
  def createClipboard(aName: String): XClipboard = js.native
}
object XClipboardFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createClipboard: String => XClipboard,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XClipboardFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClipboard = js.Any.fromFunction1(createClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XClipboardFactory]
  }
  
  @scala.inline
  implicit class XClipboardFactoryOps[Self <: XClipboardFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateClipboard(value: String => XClipboard): Self = this.set("createClipboard", js.Any.fromFunction1(value))
  }
}
