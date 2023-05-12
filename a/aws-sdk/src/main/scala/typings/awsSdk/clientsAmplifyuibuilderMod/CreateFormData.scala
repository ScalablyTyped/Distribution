package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFormData extends StObject {
  
  /**
    * The FormCTA object that stores the call to action configuration for the form.
    */
  var cta: js.UndefOr[FormCTA] = js.undefined
  
  /**
    * The type of data source to use to create the form.
    */
  var dataType: FormDataTypeConfig
  
  /**
    * The configuration information for the form's fields.
    */
  var fields: FieldsMap
  
  /**
    * Specifies whether to perform a create or update action on the form.
    */
  var formActionType: FormActionType
  
  /**
    * Specifies an icon or decoration to display on the form.
    */
  var labelDecorator: js.UndefOr[LabelDecorator] = js.undefined
  
  /**
    * The name of the form.
    */
  var name: FormName
  
  /**
    * The schema version of the form.
    */
  var schemaVersion: String
  
  /**
    * The configuration information for the visual helper elements for the form. These elements are not associated with any data.
    */
  var sectionalElements: SectionalElementMap
  
  /**
    * The configuration for the form's style.
    */
  var style: FormStyle
  
  /**
    * One or more key-value pairs to use when tagging the form data.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateFormData {
  
  inline def apply(
    dataType: FormDataTypeConfig,
    fields: FieldsMap,
    formActionType: FormActionType,
    name: FormName,
    schemaVersion: String,
    sectionalElements: SectionalElementMap,
    style: FormStyle
  ): CreateFormData = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formActionType = formActionType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any], sectionalElements = sectionalElements.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFormData] (val x: Self) extends AnyVal {
    
    inline def setCta(value: FormCTA): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    inline def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    inline def setDataType(value: FormDataTypeConfig): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setFields(value: FieldsMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFormActionType(value: FormActionType): Self = StObject.set(x, "formActionType", value.asInstanceOf[js.Any])
    
    inline def setLabelDecorator(value: LabelDecorator): Self = StObject.set(x, "labelDecorator", value.asInstanceOf[js.Any])
    
    inline def setLabelDecoratorUndefined: Self = StObject.set(x, "labelDecorator", js.undefined)
    
    inline def setName(value: FormName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSectionalElements(value: SectionalElementMap): Self = StObject.set(x, "sectionalElements", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FormStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
