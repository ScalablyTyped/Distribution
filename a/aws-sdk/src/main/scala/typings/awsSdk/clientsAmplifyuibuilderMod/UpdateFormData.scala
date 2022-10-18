package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFormData extends StObject {
  
  /**
    * The FormCTA object that stores the call to action configuration for the form.
    */
  var cta: js.UndefOr[FormCTA] = js.undefined
  
  /**
    * The type of data source to use to create the form.
    */
  var dataType: js.UndefOr[FormDataTypeConfig] = js.undefined
  
  /**
    * The configuration information for the form's fields.
    */
  var fields: js.UndefOr[FieldsMap] = js.undefined
  
  /**
    * Specifies whether to perform a create or update action on the form.
    */
  var formActionType: js.UndefOr[FormActionType] = js.undefined
  
  /**
    * The name of the form.
    */
  var name: js.UndefOr[FormName] = js.undefined
  
  /**
    * The schema version of the form.
    */
  var schemaVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration information for the visual helper elements for the form. These elements are not associated with any data.
    */
  var sectionalElements: js.UndefOr[SectionalElementMap] = js.undefined
  
  /**
    * The configuration for the form's style.
    */
  var style: js.UndefOr[FormStyle] = js.undefined
}
object UpdateFormData {
  
  inline def apply(): UpdateFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFormData]
  }
  
  extension [Self <: UpdateFormData](x: Self) {
    
    inline def setCta(value: FormCTA): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    inline def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    inline def setDataType(value: FormDataTypeConfig): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setFields(value: FieldsMap): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFormActionType(value: FormActionType): Self = StObject.set(x, "formActionType", value.asInstanceOf[js.Any])
    
    inline def setFormActionTypeUndefined: Self = StObject.set(x, "formActionType", js.undefined)
    
    inline def setName(value: FormName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    inline def setSectionalElements(value: SectionalElementMap): Self = StObject.set(x, "sectionalElements", value.asInstanceOf[js.Any])
    
    inline def setSectionalElementsUndefined: Self = StObject.set(x, "sectionalElements", js.undefined)
    
    inline def setStyle(value: FormStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
