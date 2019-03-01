package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

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
trait XAsyncJob
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * executes the job asynchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @param Listener specifies a listener which should be notified on events. May be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    */
  def executeAsync(
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    Listener: XJobListener
  ): scala.Unit
}

object XAsyncJob {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    executeAsync: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XJobListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAsyncJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAsyncJob]
  }
}

