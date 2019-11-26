package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var size: Double
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, size: Double): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Count]
  }
}

