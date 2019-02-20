package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
}

