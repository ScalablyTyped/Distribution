package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a library system. */
trait XLibraryContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** Creates a new library */
  def createLibrary(Name: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * Creates a link to an "external" library that then can be accessed using this library manager. The format of the StorageURL is a matter of the
    * implementation. If the read only flag is set, the linked library cannot be modified. In this case, the returned interface really is only an
    * XNameAccess. If ReadOnly is false (and the referenced storage allows write access) the returned interface also can be a {@link
    * com.sun.star.container.XNameContainer} .
    */
  def createLibraryLink(Name: java.lang.String, StorageURL: java.lang.String, ReadOnly: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** returns true if the accessed library is already loaded from the storage, otherwise false. */
  def isLibraryLoaded(Name: java.lang.String): scala.Boolean
  /** Causes the accessed library to be loaded from its storage if it hasn't already been loaded. */
  def loadLibrary(Name: java.lang.String): scala.Unit
  /** removes the library item with the specified name. If the accessed library item is a link only the link is removed, not the target library. */
  def removeLibrary(Name: java.lang.String): scala.Unit
}

