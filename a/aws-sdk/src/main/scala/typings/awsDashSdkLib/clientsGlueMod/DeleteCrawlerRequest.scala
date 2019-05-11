package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCrawlerRequest extends js.Object {
  /**
    * The name of the crawler to remove.
    */
  var Name: NameString
}

object DeleteCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): DeleteCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteCrawlerRequest]
  }
}

