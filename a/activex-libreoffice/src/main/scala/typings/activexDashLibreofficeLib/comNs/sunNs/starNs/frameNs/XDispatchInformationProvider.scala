package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about supported commands
  *
  * This interface can be used to retrieve additional information about supported commands. This interface is normally used by configuration
  * implementations to retrieve all supported commands. A dispatch information provider is normally supported by a {@link Frame} service.
  * @see Frame
  * @since OOo 2.0
  */
trait XDispatchInformationProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  val SupportedCommandGroups: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * returns additional information about supported commands of a given command group.
    * @param CommandGroup specifies a command group.
    * @returns name and group name of every command supported. A group ID which is not supported returns an empty com::sun::star::uno::Sequence.
    */
  def getConfigurableDispatchInformation(CommandGroup: scala.Double): activexDashInteropLib.SafeArray[DispatchInformation]
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  def getSupportedCommandGroups(): activexDashInteropLib.SafeArray[scala.Double]
}

