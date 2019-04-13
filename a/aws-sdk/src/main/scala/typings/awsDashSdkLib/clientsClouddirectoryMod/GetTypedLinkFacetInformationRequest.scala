package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTypedLinkFacetInformationRequest extends js.Object {
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object GetTypedLinkFacetInformationRequest {
  @scala.inline
  def apply(Name: TypedLinkName, SchemaArn: Arn): GetTypedLinkFacetInformationRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[GetTypedLinkFacetInformationRequest]
  }
}

