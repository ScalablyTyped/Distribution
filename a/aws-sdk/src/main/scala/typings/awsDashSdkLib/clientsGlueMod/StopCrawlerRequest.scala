package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopCrawlerRequest extends js.Object {
  /**
    * Name of the crawler to stop.
    */
  var Name: NameString
}

object StopCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): StopCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StopCrawlerRequest]
  }
}

