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
    acquire: () => scala.Unit,
    addCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    close: scala.Boolean => scala.Unit,
    execute: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue] => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit
  ): Job = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), close = js.Any.fromFunction1(close), execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener))
  
    __obj.asInstanceOf[Job]
  }
}

