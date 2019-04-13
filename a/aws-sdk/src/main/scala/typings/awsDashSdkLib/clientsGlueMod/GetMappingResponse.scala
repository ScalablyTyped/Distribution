package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMappingResponse extends js.Object {
  /**
    * A list of mappings to the specified targets.
    */
  var Mapping: MappingList
}

object GetMappingResponse {
  @scala.inline
  def apply(Mapping: MappingList): GetMappingResponse = {
    val __obj = js.Dynamic.literal(Mapping = Mapping)
  
    __obj.asInstanceOf[GetMappingResponse]
  }
}

