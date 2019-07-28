package typings.activexDashStdole.stdoleNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GUID extends js.Object {
  val Data1: Double
  val Data2: Double
  val Data3: Double
  val Data4: SafeArray[Double]
}

object GUID {
  @scala.inline
  def apply(Data1: Double, Data2: Double, Data3: Double, Data4: SafeArray[Double]): GUID = {
    val __obj = js.Dynamic.literal(Data1 = Data1, Data2 = Data2, Data3 = Data3, Data4 = Data4)
  
    __obj.asInstanceOf[GUID]
  }
}

