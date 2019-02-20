package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to receive notifications from an {@link XDynamicResultSet} . */
trait XDynamicResultSetListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * A method used to propagate changes of a result set.
    *
    * In the first notify-call the listener gets two(!) com::sun::star::sdbc::XResultSets and has to hold them. The com::sun::star::sdbc::XResultSets are
    * implementations of the service {@link ContentResultSet} .
    *
    * The notified new {@link com.sun.star.sdbc.XResultSet} will stay valid after returning from this method. The old one will become invalid after
    * returning.
    *
    * While in notify-call the listener is allowed to read from old and new result set, except in the first call, where only the new result set is valid.
    *
    * The Listener is allowed to stay (block) this call, until he really wants to use the new result set. The only situation, where the listener has to
    * return immediately is while he disposes his broadcaster or while he is removing himself as listener (otherwise you deadlock)!!!
    * @param Changes the changes to notify.
    */
  def notify(Changes: ListEvent): scala.Unit
}

