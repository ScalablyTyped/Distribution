package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XLibraryContainer} to provide additional information about the libraries contained in a library container */
@js.native
trait XLibraryContainer2 extends XLibraryContainer {
  
  /**
    * returns the location of the library link target. Should return the same URL that was passed to createLibraryLink in the StorageURL parameter.
    *
    * If the accessed library item exists but isn't a link, a IllegalArgumentException is thrown
    */
  def getLibraryLinkURL(Name: String): String = js.native
  
  /** returns true if the accessed library item is a link, e.g., created by createLibraryLink, otherwise false. */
  def isLibraryLink(Name: String): Boolean = js.native
  
  /**
    * returns true if the accessed library item (library or library link) is read only. A library can be read only because it was set to read only using the
    * methods provided by this interface or because of other reasons depending on the implementation (e.g., file system write protection)
    */
  def isLibraryReadOnly(Name: String): Boolean = js.native
  
  /**
    * renames the library item with the specified name. If the accessed library item is a link only the link is renamed, not the target library. If a
    * library with the new name exists already a {@link com.sun.star.container.ElementExistException} is thrown.
    */
  def renameLibrary(Name: String, NewName: String): Unit = js.native
  
  /** Sets the accessed library item (library or library link) to read only according to the flag bReadOnly (true means read only) */
  def setLibraryReadOnly(Name: String, bReadOnly: Boolean): Unit = js.native
}
object XLibraryContainer2 {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    createLibrary: String => XNameContainer,
    createLibraryLink: (String, String, Boolean) => XNameAccess,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLibraryLinkURL: String => String,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isLibraryLink: String => Boolean,
    isLibraryLoaded: String => Boolean,
    isLibraryReadOnly: String => Boolean,
    loadLibrary: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLibrary: String => Unit,
    renameLibrary: (String, String) => Unit,
    setLibraryReadOnly: (String, Boolean) => Unit
  ): XLibraryContainer2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createLibrary = js.Any.fromFunction1(createLibrary), createLibraryLink = js.Any.fromFunction3(createLibraryLink), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLibraryLinkURL = js.Any.fromFunction1(getLibraryLinkURL), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isLibraryLink = js.Any.fromFunction1(isLibraryLink), isLibraryLoaded = js.Any.fromFunction1(isLibraryLoaded), isLibraryReadOnly = js.Any.fromFunction1(isLibraryReadOnly), loadLibrary = js.Any.fromFunction1(loadLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLibrary = js.Any.fromFunction1(removeLibrary), renameLibrary = js.Any.fromFunction2(renameLibrary), setLibraryReadOnly = js.Any.fromFunction2(setLibraryReadOnly))
    __obj.asInstanceOf[XLibraryContainer2]
  }
  
  @scala.inline
  implicit class XLibraryContainer2Ops[Self <: XLibraryContainer2] (val x: Self) extends AnyVal {
    
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
    def setGetLibraryLinkURL(value: String => String): Self = this.set("getLibraryLinkURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLibraryLink(value: String => Boolean): Self = this.set("isLibraryLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLibraryReadOnly(value: String => Boolean): Self = this.set("isLibraryReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameLibrary(value: (String, String) => Unit): Self = this.set("renameLibrary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLibraryReadOnly(value: (String, Boolean) => Unit): Self = this.set("setLibraryReadOnly", js.Any.fromFunction2(value))
  }
}
