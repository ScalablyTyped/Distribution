package typings
package activexDashStdoleLib.stdoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GUID extends js.Object {
  val Data1: scala.Double
  val Data2: scala.Double
  val Data3: scala.Double
  val Data4: stdLib.SafeArray[scala.Double]
}

object GUID {
  @scala.inline
  def apply(
    Data1: scala.Double,
    Data2: scala.Double,
    Data3: scala.Double,
    Data4: stdLib.SafeArray[scala.Double]
  ): GUID = {
    val __obj = js.Dynamic.literal(Data1 = Data1, Data2 = Data2, Data3 = Data3, Data4 = Data4)
  
    __obj.asInstanceOf[GUID]
  }
}

