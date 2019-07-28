package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataSourceRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The name of the data source.
    */
  var name: ResourceName
}

object GetDataSourceRequest {
  @scala.inline
  def apply(apiId: String, name: ResourceName): GetDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, name = name)
  
    __obj.asInstanceOf[GetDataSourceRequest]
  }
}

