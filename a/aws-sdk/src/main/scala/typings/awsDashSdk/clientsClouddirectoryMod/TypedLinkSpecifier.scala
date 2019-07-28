package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedLinkSpecifier extends js.Object {
  /**
    * Identifies the attribute value to update.
    */
  var IdentityAttributeValues: AttributeNameAndValueList
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

object TypedLinkSpecifier {
  @scala.inline
  def apply(
    IdentityAttributeValues: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): TypedLinkSpecifier = {
    val __obj = js.Dynamic.literal(IdentityAttributeValues = IdentityAttributeValues, SourceObjectReference = SourceObjectReference, TargetObjectReference = TargetObjectReference, TypedLinkFacet = TypedLinkFacet)
  
    __obj.asInstanceOf[TypedLinkSpecifier]
  }
}

