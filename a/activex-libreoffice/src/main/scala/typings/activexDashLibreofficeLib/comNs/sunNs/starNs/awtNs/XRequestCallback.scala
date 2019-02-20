package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an interface which can be used to call back an implementation */
trait XRequestCallback extends js.Object {
  /**
    * adds a callback request to the implementation
    * @param aData any private data which will be provided to the callback implementation.
    * @param xCallback a reference to the callback which should be called by the implementation of this interface.
    */
  def addCallback(xCallback: XCallback, aData: js.Any): scala.Unit
}

