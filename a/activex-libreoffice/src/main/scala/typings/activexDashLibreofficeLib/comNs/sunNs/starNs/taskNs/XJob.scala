package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a job which is to be executed synchronously
  *
  * Instead of {@link XAsyncJob} the implementation of this interface will be executed synchronously every time. That means: they can be sure that the
  * current stack context will be blocked till this job finish it's work.
  * @see XAsyncJob
  */
trait XJob
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * executes the job synchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @returns the result of the job. The concrete semantics is service-dependent. But it should be possible to deregister the joblet him registered although ex
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    * @throws com::sun::star::uno::Exception to notify the executor about failed operation; otherwise the return value indicates a successful finishing.
    */
  def execute(
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): js.Any
}

object XJob {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    execute: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XJob]
  }
}

