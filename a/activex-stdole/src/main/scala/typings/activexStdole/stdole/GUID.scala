package typings.activexStdole.stdole

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
    val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GUID]
  }
}

