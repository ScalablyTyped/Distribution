package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XML Schema */
trait ISchema extends StObject {
  
  @JSName("MSXML2.ISchema_typekey")
  var MSXML2DotISchema_typekey: ISchema
  
  def attributeGroups(index: Double): ISchemaItem
  @JSName("attributeGroups")
  val attributeGroups_Original: ISchemaItemCollection
  
  def attributes(index: Double): ISchemaItem
  @JSName("attributes")
  val attributes_Original: ISchemaItemCollection
  
  def elements(index: Double): ISchemaItem
  @JSName("elements")
  val elements_Original: ISchemaItemCollection
  
  val id: String
  
  val itemType: SOMITEMTYPE
  
  def modelGroups(index: Double): ISchemaItem
  @JSName("modelGroups")
  val modelGroups_Original: ISchemaItemCollection
  
  val name: String
  
  val namespaceURI: String
  
  def notations(index: Double): ISchemaItem
  @JSName("notations")
  val notations_Original: ISchemaItemCollection
  
  val schema: ISchema
  
  def schemaLocations(index: Double): String
  @JSName("schemaLocations")
  val schemaLocations_Original: ISchemaStringCollection
  
  val targetNamespace: String
  
  def types(index: Double): ISchemaItem
  @JSName("types")
  val types_Original: ISchemaItemCollection
  
  val unhandledAttributes: IVBSAXAttributes
  
  val version: String
  
  def writeAnnotation(annotationSink: js.Any): Boolean
}
object ISchema {
  
  @scala.inline
  def apply(
    MSXML2DotISchema_typekey: ISchema,
    attributeGroups: ISchemaItemCollection,
    attributes: ISchemaItemCollection,
    elements: ISchemaItemCollection,
    id: String,
    itemType: SOMITEMTYPE,
    modelGroups: ISchemaItemCollection,
    name: String,
    namespaceURI: String,
    notations: ISchemaItemCollection,
    schema: ISchema,
    schemaLocations: ISchemaStringCollection,
    targetNamespace: String,
    types: ISchemaItemCollection,
    unhandledAttributes: IVBSAXAttributes,
    version: String,
    writeAnnotation: js.Any => Boolean
  ): ISchema = {
    val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], modelGroups = modelGroups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaLocations = schemaLocations.asInstanceOf[js.Any], targetNamespace = targetNamespace.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], unhandledAttributes = unhandledAttributes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], writeAnnotation = js.Any.fromFunction1(writeAnnotation))
    __obj.updateDynamic("MSXML2.ISchema_typekey")(MSXML2DotISchema_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
  
  @scala.inline
  implicit class ISchemaMutableBuilder[Self <: ISchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeGroups(value: ISchemaItemCollection): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: ISchemaItemCollection): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: ISchemaItemCollection): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemType(value: SOMITEMTYPE): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSXML2DotISchema_typekey(value: ISchema): Self = StObject.set(x, "MSXML2.ISchema_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelGroups(value: ISchemaItemCollection): Self = StObject.set(x, "modelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotations(value: ISchemaItemCollection): Self = StObject.set(x, "notations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaLocations(value: ISchemaStringCollection): Self = StObject.set(x, "schemaLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNamespace(value: String): Self = StObject.set(x, "targetNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: ISchemaItemCollection): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledAttributes(value: IVBSAXAttributes): Self = StObject.set(x, "unhandledAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteAnnotation(value: js.Any => Boolean): Self = StObject.set(x, "writeAnnotation", js.Any.fromFunction1(value))
  }
}
