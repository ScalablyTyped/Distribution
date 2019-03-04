package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a synchronous job, which can be executed by the global {@link theJobExecutor} instance.
  * @see AsyncJob
  * @since OOo 1.1.2
  */
trait Job
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with XJob

object Job {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    close: js.Function1[scala.Boolean, scala.Unit],
    execute: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit]
  ): Job = {
    val __obj = js.Dynamic.literal(acquire = acquire, addCloseListener = addCloseListener, close = close, execute = execute, queryInterface = queryInterface, release = release, removeCloseListener = removeCloseListener)
  
    __obj.asInstanceOf[Job]
  }
}

