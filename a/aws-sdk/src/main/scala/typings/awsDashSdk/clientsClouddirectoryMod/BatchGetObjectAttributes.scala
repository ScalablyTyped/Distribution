package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetObjectAttributes extends js.Object {
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typings.awsDashSdk.clientsClouddirectoryMod.SchemaFacet
}

object BatchGetObjectAttributes {
  @scala.inline
  def apply(AttributeNames: AttributeNameList, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchGetObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames, ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
  
    __obj.asInstanceOf[BatchGetObjectAttributes]
  }
}

