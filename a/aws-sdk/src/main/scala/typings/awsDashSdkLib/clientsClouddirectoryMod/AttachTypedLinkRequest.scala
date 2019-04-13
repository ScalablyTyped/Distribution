package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachTypedLinkRequest extends js.Object {
  /**
    * A set of attributes that are associated with the typed link.
    */
  var Attributes: AttributeNameAndValueList
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to attach the typed link.
    */
  var DirectoryArn: Arn
  /**
    * Identifies the source object that the typed link will attach to.
    */
  var SourceObjectReference: ObjectReference
  /**
    * Identifies the target object that the typed link will attach to.
    */
  var TargetObjectReference: ObjectReference
  /**
    * Identifies the typed link facet that is associated with the typed link.
    */
  var TypedLinkFacet: TypedLinkSchemaAndFacetName
}

object AttachTypedLinkRequest {
  @scala.inline
  def apply(
    Attributes: AttributeNameAndValueList,
    DirectoryArn: Arn,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): AttachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, DirectoryArn = DirectoryArn, SourceObjectReference = SourceObjectReference, TargetObjectReference = TargetObjectReference, TypedLinkFacet = TypedLinkFacet)
  
    __obj.asInstanceOf[AttachTypedLinkRequest]
  }
}

