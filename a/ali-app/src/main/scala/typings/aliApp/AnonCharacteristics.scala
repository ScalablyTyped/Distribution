package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacteristics extends js.Object {
  var characteristics: js.Array[AnonCharacteristicIdProperties]
}

object AnonCharacteristics {
  @scala.inline
  def apply(characteristics: js.Array[AnonCharacteristicIdProperties]): AnonCharacteristics = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharacteristics]
  }
}

