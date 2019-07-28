package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The URL of the queue.
    */
  var URL: js.UndefOr[String] = js.undefined
}

object Queue {
  @scala.inline
  def apply(Name: String = null, URL: String = null): Queue = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (URL != null) __obj.updateDynamic("URL")(URL)
    __obj.asInstanceOf[Queue]
  }
}

