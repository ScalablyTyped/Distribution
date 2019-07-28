package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartCrawlerRequest extends js.Object {
  /**
    * Name of the crawler to start.
    */
  var Name: NameString
}

object StartCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): StartCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StartCrawlerRequest]
  }
}

