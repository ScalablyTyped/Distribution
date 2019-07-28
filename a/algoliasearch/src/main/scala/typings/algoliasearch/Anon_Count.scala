package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var highlighted: String
  var value: String
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, highlighted: String, value: String): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, highlighted = highlighted, value = value)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

