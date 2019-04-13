package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameProperty extends js.Object {
  /**
    * Game property identifier.
    */
  var Key: GamePropertyKey
  /**
    * Game property value.
    */
  var Value: GamePropertyValue
}

object GameProperty {
  @scala.inline
  def apply(Key: GamePropertyKey, Value: GamePropertyValue): GameProperty = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[GameProperty]
  }
}

