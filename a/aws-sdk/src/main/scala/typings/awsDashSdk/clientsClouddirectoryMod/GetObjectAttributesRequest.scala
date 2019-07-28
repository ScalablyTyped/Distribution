package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectAttributesRequest extends js.Object {
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  /**
    * The consistency level at which to retrieve the attributes on an object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides.
    */
  var DirectoryArn: Arn
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet
}

object GetObjectAttributesRequest {
  @scala.inline
  def apply(
    AttributeNames: AttributeNameList,
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet,
    ConsistencyLevel: ConsistencyLevel = null
  ): GetObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames, DirectoryArn = DirectoryArn, ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAttributesRequest]
  }
}

