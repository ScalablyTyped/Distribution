package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container of script libraries which is persistent.
  *
  * The type of persistence of the container elements is not defined here, but in derived interfaces or services using `XPersistentLibraryContainer` .
  *
  * The actual libraries are stored in some object - a sub folder, or a sub storage, for example - below the root location.
  * @since OOo 2.3
  */
trait XPersistentLibraryContainer
  extends XLibraryContainer2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable {
  /**
    * denotes the name of the sub location where the container elements are actually stored.
    * @see RootLocation
    */
  var ContainerLocationName: java.lang.String
  /**
    * denotes the root location associated with the container.
    *
    * The type of this location - it might be a folder in a file system, a storage, or anything else - is not specified here, but in derived interfaces or
    * services implementing `XPersistentLibraryContainer` .
    *
    * All operations of the library container take place in a location below the root location, the so-called container location, whose name is exposed as
    * {@link ContainerLocationName} .
    * @see ContainerLocationName
    */
  var RootLocation: js.Any
  /**
    * stores the libraries to the current location.
    * @see RootLocation
    * @see ContainerLocationName
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing.
    */
  def storeLibraries(): scala.Unit
}

