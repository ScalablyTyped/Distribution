package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Null
  def onAnimated(): Unit
}

object Anon_Count {
  @scala.inline
  def apply(count: Null, onAnimated: () => Unit): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, onAnimated = js.Any.fromFunction0(onAnimated))
  
    __obj.asInstanceOf[Anon_Count]
  }
}

