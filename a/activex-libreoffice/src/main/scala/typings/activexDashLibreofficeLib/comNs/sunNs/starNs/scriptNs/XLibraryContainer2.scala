package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XLibraryContainer} to provide additional information about the libraries contained in a library container */
trait XLibraryContainer2 extends XLibraryContainer {
  /**
    * returns the location of the library link target. Should return the same URL that was passed to createLibraryLink in the StorageURL parameter.
    *
    * If the accessed library item exists but isn't a link, a IllegalArgumentException is thrown
    */
  def getLibraryLinkURL(Name: java.lang.String): java.lang.String
  /** returns true if the accessed library item is a link, e.g., created by createLibraryLink, otherwise false. */
  def isLibraryLink(Name: java.lang.String): scala.Boolean
  /**
    * returns true if the accessed library item (library or library link) is read only. A library can be read only because it was set to read only using the
    * methods provided by this interface or because of other reasons depending on the implementation (e.g., file system write protection)
    */
  def isLibraryReadOnly(Name: java.lang.String): scala.Boolean
  /**
    * renames the library item with the specified name. If the accessed library item is a link only the link is renamed, not the target library. If a
    * library with the new name exists already a {@link com.sun.star.container.ElementExistException} is thrown.
    */
  def renameLibrary(Name: java.lang.String, NewName: java.lang.String): scala.Unit
  /** Sets the accessed library item (library or library link) to read only according to the flag bReadOnly (true means read only) */
  def setLibraryReadOnly(Name: java.lang.String, bReadOnly: scala.Boolean): scala.Unit
}

