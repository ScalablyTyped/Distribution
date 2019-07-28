package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloseable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a synchronous job, which can be executed by the global {@link theJobExecutor} instance.
  * @see AsyncJob
  * @since OOo 1.1.2
  */
trait Job
  extends XCloseable
     with XJob

object Job {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addCloseListener: XCloseListener => Unit,
    close: Boolean => Unit,
    execute: SeqEquiv[NamedValue] => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCloseListener: XCloseListener => Unit
  ): Job = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), close = js.Any.fromFunction1(close), execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener))
  
    __obj.asInstanceOf[Job]
  }
}

