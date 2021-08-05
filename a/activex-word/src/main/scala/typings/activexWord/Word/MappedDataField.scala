package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappedDataField extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var DataFieldIndex: Double
  
  val DataFieldName: String
  
  val Index: Double
  
  val Name: String
  
  val Parent: js.Any
  
  val Value: String
  
  /* private */ @JSName("Word.MappedDataField_typekey")
  var WordDotMappedDataField_typekey: MappedDataField
}
object MappedDataField {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    DataFieldIndex: Double,
    DataFieldName: String,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotMappedDataField_typekey: MappedDataField
  ): MappedDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataFieldIndex = DataFieldIndex.asInstanceOf[js.Any], DataFieldName = DataFieldName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MappedDataField_typekey")(WordDotMappedDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataField]
  }
  
  extension [Self <: MappedDataField](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataFieldIndex(value: Double): Self = StObject.set(x, "DataFieldIndex", value.asInstanceOf[js.Any])
    
    inline def setDataFieldName(value: String): Self = StObject.set(x, "DataFieldName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordDotMappedDataField_typekey(value: MappedDataField): Self = StObject.set(x, "Word.MappedDataField_typekey", value.asInstanceOf[js.Any])
  }
}
