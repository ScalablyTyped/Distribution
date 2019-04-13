package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntrospectionSchemaRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The schema format: SDL or JSON.
    */
  var format: OutputType
}

object GetIntrospectionSchemaRequest {
  @scala.inline
  def apply(apiId: String, format: OutputType): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
}

