package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema */
@JSGlobal("MSXML2.ISchema")
@js.native
class ISchema protected () extends js.Object {
  @JSName("MSXML2.ISchema_typekey")
  var MSXML2DotISchema_typekey: ISchema = js.native
  @JSName("attributeGroups")
  val attributeGroups_Original: ISchemaItemCollection = js.native
  @JSName("attributes")
  val attributes_Original: ISchemaItemCollection = js.native
  @JSName("elements")
  val elements_Original: ISchemaItemCollection = js.native
  val id: String = js.native
  val itemType: SOMITEMTYPE = js.native
  @JSName("modelGroups")
  val modelGroups_Original: ISchemaItemCollection = js.native
  val name: String = js.native
  val namespaceURI: String = js.native
  @JSName("notations")
  val notations_Original: ISchemaItemCollection = js.native
  val schema: ISchema = js.native
  @JSName("schemaLocations")
  val schemaLocations_Original: ISchemaStringCollection = js.native
  val targetNamespace: String = js.native
  @JSName("types")
  val types_Original: ISchemaItemCollection = js.native
  val unhandledAttributes: IVBSAXAttributes = js.native
  val version: String = js.native
  def attributeGroups(index: Double): ISchemaItem = js.native
  def attributes(index: Double): ISchemaItem = js.native
  def elements(index: Double): ISchemaItem = js.native
  def modelGroups(index: Double): ISchemaItem = js.native
  def notations(index: Double): ISchemaItem = js.native
  def schemaLocations(index: Double): String = js.native
  def types(index: Double): ISchemaItem = js.native
  def writeAnnotation(annotationSink: js.Any): Boolean = js.native
}

