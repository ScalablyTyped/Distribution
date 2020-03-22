package typings.antvScale.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tick extends js.Object {
  /** 展示名 */
  var text: String
  /** 定义域值 */
  var tickValue: String | Double
  /** 值域值 */
  var value: Double
}

object Tick {
  @scala.inline
  def apply(text: String, tickValue: String | Double, value: Double): Tick = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], tickValue = tickValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tick]
  }
}

