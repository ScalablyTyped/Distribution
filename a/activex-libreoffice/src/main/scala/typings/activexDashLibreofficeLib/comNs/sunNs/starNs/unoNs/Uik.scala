package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an universal interface key (globally unique).
  *
  * This struct is deprecated. Uiks are not used anymore.
  * @deprecated Deprecated
  */
trait Uik extends js.Object {
  /** specifies a 4 byte data block. */
  var Data1: scala.Double
  /** specifies a 2 byte data block. */
  var Data2: scala.Double
  /** specifies a 2 byte data block. */
  var Data3: scala.Double
  /** specifies a 4 byte data block. */
  var Data4: scala.Double
  /** specifies a 4 byte data block. */
  var Data5: scala.Double
}

object Uik {
  @scala.inline
  def apply(
    Data1: scala.Double,
    Data2: scala.Double,
    Data3: scala.Double,
    Data4: scala.Double,
    Data5: scala.Double
  ): Uik = {
    val __obj = js.Dynamic.literal(Data1 = Data1, Data2 = Data2, Data3 = Data3, Data4 = Data4, Data5 = Data5)
  
    __obj.asInstanceOf[Uik]
  }
}

