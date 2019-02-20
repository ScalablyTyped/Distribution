package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface configuration manager which gives access to user interface configuration data of a module.
  *
  * A module user interface configuration manager supports two layers of configuration settings data: ;  1. Layer: A module default user interface
  * configuration which describe all user interface elements settings that are used by OpenOffice. It is not possible to insert, remove or change elements
  * settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which only contains customized user interface
  * elements and user-defined ones. All changes on user interface element settings are done on this layer.
  * @since OOo 2.0
  */
trait ModuleUIConfigurationManager extends XModuleUIConfigurationManager2 {
  /**
    * provides a function to initialize a module user interface configuration manager instance.
    *
    * A module user interface configuration manager instance needs the following arguments as {@link com.sun.star.beans.PropertyValue} to be in a working
    * state: **DefaultConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the default module user interface configuration
    * settings.**UserConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the user-defined module user interface configuration
    * settings.**ModuleIdentifier** string that provides the module identifier.**UserRootCommit** a reference to a {@link
    * com.sun.star.embed.XTransactedObject} which represents the customizable root storage. Every implementation must use this reference to commit its
    * changes also at the root storage. A non-initialized module user interface configuration manager cannot be used, it is treated as a read-only
    * container.
    */
  def createDefault(ModuleShortName: java.lang.String, ModuleIdentifier: java.lang.String): scala.Unit
}

