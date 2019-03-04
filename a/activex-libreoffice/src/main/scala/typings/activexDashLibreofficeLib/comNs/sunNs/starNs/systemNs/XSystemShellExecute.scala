package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for executing a system command. */
trait XSystemShellExecute
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Executes an arbitrary system command.
    * @param aCommand Specifies the command to execute. This may be an executable file or a document which is registered with an application on a specific pla
    * @param aParameter Specifies a list of space separated parameters. The method does not validate the given parameters, but only passes it as a parameter t
    * @param nFlags Specifies different flags to control the execution of this method, for example, avoid showing system error messages, in case of failures, etc.
    * @see com.sun.star.system.SystemShellExecuteFlags
    * @throws com::sun::star::lang::IllegalArgumentException when the specified flags are wrong or exclude each other; also thrown, with an ArgumentPosition of
    * @throws com::sun::star::system::SystemShellExecuteException in the case of errors when trying to executed the specified command.
    */
  def execute(aCommand: java.lang.String, aParameter: java.lang.String, nFlags: scala.Double): scala.Unit
}

object XSystemShellExecute {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    execute: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSystemShellExecute = {
    val __obj = js.Dynamic.literal(acquire = acquire, execute = execute, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSystemShellExecute]
  }
}

