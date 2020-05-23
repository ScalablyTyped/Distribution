package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  val Count: Double
  val Page: Boolean
}

object Count {
  @scala.inline
  def apply(Count: Double, Page: Boolean): Count = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

