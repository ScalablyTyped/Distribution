package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImportRequest extends js.Object {
  /**
    * The identifier of the import job information to return.
    */
  var importId: String
}

object GetImportRequest {
  @scala.inline
  def apply(importId: String): GetImportRequest = {
    val __obj = js.Dynamic.literal(importId = importId)
  
    __obj.asInstanceOf[GetImportRequest]
  }
}

