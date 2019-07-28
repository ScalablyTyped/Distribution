package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a job which must be executed asynchronously
  *
  * Instead of {@link XJob} the implementation of this interface must be aware, that execution can be made real asynchronous (e.g. by using threads).
  * Because the environment wish to have creation and using of threads under control, it's not allowed for a real job implementation to use such mechanism
  * by itself. The outside code decide, if it's possible and how it can be made asynchronous. In some special cases it can be, that asynchronous jobs will
  * be executed synchronously.
  * @see XJob
  */
trait XAsyncJob extends XInterface {
  /**
    * executes the job asynchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @param Listener specifies a listener which should be notified on events. May be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    */
  def executeAsync(Arguments: SeqEquiv[NamedValue], Listener: XJobListener): Unit
}

object XAsyncJob {
  @scala.inline
  def apply(
    acquire: () => Unit,
    executeAsync: (SeqEquiv[NamedValue], XJobListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAsyncJob = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), executeAsync = js.Any.fromFunction2(executeAsync), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAsyncJob]
  }
}

