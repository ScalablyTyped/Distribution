package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticType extends StObject {
  
  /**
    * The semantic type falsey cell value.
    */
  var FalseyCellValue: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The other names or aliases for the false cell value.
    */
  var FalseyCellValueSynonyms: js.UndefOr[SensitiveStringList] = js.undefined
  
  /**
    * The semantic type sub type name.
    */
  var SubTypeName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The semantic type truthy cell value.
    */
  var TruthyCellValue: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The other names or aliases for the true cell value.
    */
  var TruthyCellValueSynonyms: js.UndefOr[SensitiveStringList] = js.undefined
  
  /**
    * The semantic type name.
    */
  var TypeName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The semantic type parameters.
    */
  var TypeParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TypeParameters] = js.undefined
}
object SemanticType {
  
  inline def apply(): SemanticType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticType] (val x: Self) extends AnyVal {
    
    inline def setFalseyCellValue(value: SensitiveString): Self = StObject.set(x, "FalseyCellValue", value.asInstanceOf[js.Any])
    
    inline def setFalseyCellValueSynonyms(value: SensitiveStringList): Self = StObject.set(x, "FalseyCellValueSynonyms", value.asInstanceOf[js.Any])
    
    inline def setFalseyCellValueSynonymsUndefined: Self = StObject.set(x, "FalseyCellValueSynonyms", js.undefined)
    
    inline def setFalseyCellValueSynonymsVarargs(value: SensitiveString*): Self = StObject.set(x, "FalseyCellValueSynonyms", js.Array(value*))
    
    inline def setFalseyCellValueUndefined: Self = StObject.set(x, "FalseyCellValue", js.undefined)
    
    inline def setSubTypeName(value: LimitedString): Self = StObject.set(x, "SubTypeName", value.asInstanceOf[js.Any])
    
    inline def setSubTypeNameUndefined: Self = StObject.set(x, "SubTypeName", js.undefined)
    
    inline def setTruthyCellValue(value: SensitiveString): Self = StObject.set(x, "TruthyCellValue", value.asInstanceOf[js.Any])
    
    inline def setTruthyCellValueSynonyms(value: SensitiveStringList): Self = StObject.set(x, "TruthyCellValueSynonyms", value.asInstanceOf[js.Any])
    
    inline def setTruthyCellValueSynonymsUndefined: Self = StObject.set(x, "TruthyCellValueSynonyms", js.undefined)
    
    inline def setTruthyCellValueSynonymsVarargs(value: SensitiveString*): Self = StObject.set(x, "TruthyCellValueSynonyms", js.Array(value*))
    
    inline def setTruthyCellValueUndefined: Self = StObject.set(x, "TruthyCellValue", js.undefined)
    
    inline def setTypeName(value: LimitedString): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeParameters(value: TypeParameters): Self = StObject.set(x, "TypeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "TypeParameters", js.undefined)
  }
}
