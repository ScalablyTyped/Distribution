package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAttachTypedLink extends js.Object {
  /**
    * A set of attributes that are associated with the typed link.
    */
  var Attributes: AttributeNameAndValueList
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

object BatchAttachTypedLink {
  @scala.inline
  def apply(
    Attributes: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): BatchAttachTypedLink = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, SourceObjectReference = SourceObjectReference, TargetObjectReference = TargetObjectReference, TypedLinkFacet = TypedLinkFacet)
  
    __obj.asInstanceOf[BatchAttachTypedLink]
  }
}

