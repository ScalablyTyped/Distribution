package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an interface for listening for changes in the validity constraints represented by an {@link XValidator} . */
trait XValidityConstraintListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * called when the validity constraint represented by an {@link XValidator} , at which the listener is registered, changed.
    * @param Source The event source. The member {@link com.sun.star.lang.EventObject.Source} represents the validator component whose validity constraint changed.
    */
  def validityConstraintChanged(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

