package typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs

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
  var Data1: Double
  /** specifies a 2 byte data block. */
  var Data2: Double
  /** specifies a 2 byte data block. */
  var Data3: Double
  /** specifies a 4 byte data block. */
  var Data4: Double
  /** specifies a 4 byte data block. */
  var Data5: Double
}

object Uik {
  @scala.inline
  def apply(Data1: Double, Data2: Double, Data3: Double, Data4: Double, Data5: Double): Uik = {
    val __obj = js.Dynamic.literal(Data1 = Data1, Data2 = Data2, Data3 = Data3, Data4 = Data4, Data5 = Data5)
  
    __obj.asInstanceOf[Uik]
  }
}

