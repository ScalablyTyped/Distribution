package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a (form) component which is bound to a data source.
  *
  * The interface provides the possibility of committing its respective data to a data source it is bound to. A {@link commit()} will be performed by the
  * environment (usually, a {@link FormController} ). ;  For example, suppose you have a data-bound control that is connected to a database field. Each
  * time the control loses its focus, the model (component) of the control is triggered by the environment to store its value in the database field.
  *
  * A commit may fail if an {@link XUpdateListener} vetoes the it.
  * @see com.sun.star.form.XUpdateListener
  */
trait XBoundComponent extends XUpdateBroadcaster {
  /**
    * commits the content of the component into the data source it is bound to.
    * @returns `TRUE` when the commitment was successful, otherwise `FALSE` .
    */
  def commit(): scala.Boolean
}

