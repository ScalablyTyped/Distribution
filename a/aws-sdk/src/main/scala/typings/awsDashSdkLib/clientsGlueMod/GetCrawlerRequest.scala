package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCrawlerRequest extends js.Object {
  /**
    * The name of the crawler to retrieve metadata for.
    */
  var Name: NameString
}

object GetCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): GetCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetCrawlerRequest]
  }
}

