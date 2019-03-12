package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Null
  def onAnimated(): scala.Unit
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Null, onAnimated: () => scala.Unit): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, onAnimated = js.Any.fromFunction0(onAnimated))
  
    __obj.asInstanceOf[Anon_Count]
  }
}

