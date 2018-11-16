package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema */
@JSGlobal("MSXML2.ISchema")
@js.native
class ISchema protected () extends js.Object {
  var `MSXML2.ISchema_typekey`: ISchema = js.native
  @JSName("attributeGroups")
  val attributeGroups_Original: ISchemaItemCollection = js.native
  @JSName("attributes")
  val attributes_Original: ISchemaItemCollection = js.native
  @JSName("elements")
  val elements_Original: ISchemaItemCollection = js.native
  val id: java.lang.String = js.native
  val itemType: SOMITEMTYPE = js.native
  @JSName("modelGroups")
  val modelGroups_Original: ISchemaItemCollection = js.native
  val name: java.lang.String = js.native
  val namespaceURI: java.lang.String = js.native
  @JSName("notations")
  val notations_Original: ISchemaItemCollection = js.native
  val schema: ISchema = js.native
  @JSName("schemaLocations")
  val schemaLocations_Original: ISchemaStringCollection = js.native
  val targetNamespace: java.lang.String = js.native
  @JSName("types")
  val types_Original: ISchemaItemCollection = js.native
  val unhandledAttributes: IVBSAXAttributes = js.native
  val version: java.lang.String = js.native
  def attributeGroups(index: scala.Double): ISchemaItem = js.native
  def attributes(index: scala.Double): ISchemaItem = js.native
  def elements(index: scala.Double): ISchemaItem = js.native
  def modelGroups(index: scala.Double): ISchemaItem = js.native
  def notations(index: scala.Double): ISchemaItem = js.native
  def schemaLocations(index: scala.Double): java.lang.String = js.native
  def types(index: scala.Double): ISchemaItem = js.native
  def writeAnnotation(annotationSink: js.Any): scala.Boolean = js.native
}

