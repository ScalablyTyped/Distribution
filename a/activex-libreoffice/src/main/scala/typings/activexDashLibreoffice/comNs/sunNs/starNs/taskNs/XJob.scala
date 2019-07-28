package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XJob extends XInterface {
  /**
    * executes the job synchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @returns the result of the job. The concrete semantics is service-dependent. But it should be possible to deregister the joblet him registered although ex
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    * @throws com::sun::star::uno::Exception to notify the executor about failed operation; otherwise the return value indicates a successful finishing.
    */
  def execute(Arguments: SeqEquiv[NamedValue]): js.Any
}

object XJob {
  @scala.inline
  def apply(
    acquire: () => Unit,
    execute: SeqEquiv[NamedValue] => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XJob = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XJob]
  }
}

