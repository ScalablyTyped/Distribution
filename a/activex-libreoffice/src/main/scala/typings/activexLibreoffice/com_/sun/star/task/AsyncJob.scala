package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.util.XCloseListener
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an asynchronous job, which can be executed by the global {@link theJobExecutor} instance.
  * @see Job
  * @since OOo 1.1.2
  */
@js.native
trait AsyncJob
  extends XCloseable
     with XAsyncJob
object AsyncJob {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addCloseListener: XCloseListener => Unit,
    close: Boolean => Unit,
    executeAsync: (SeqEquiv[NamedValue], XJobListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCloseListener: XCloseListener => Unit
  ): AsyncJob = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), close = js.Any.fromFunction1(close), executeAsync = js.Any.fromFunction2(executeAsync), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener))
    __obj.asInstanceOf[AsyncJob]
  }
}
