package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.DataTypeEnum
import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /* private */ @JSName("ADOX.Column_typekey")
  var ADOXDotColumn_typekey: Column
  
  var Attributes: ColumnAttributesEnum
  
  var DefinedSize: Double
  
  var Name: String
  
  var NumericScale: Double
  
  var ParentCatalog: Catalog
  
  var Precision: Double
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var RelatedColumn: String
  
  var SortOrder: SortOrderEnum
  
  var Type: DataTypeEnum
}
object Column {
  
  inline def apply(
    ADOXDotColumn_typekey: Column,
    Attributes: ColumnAttributesEnum,
    DefinedSize: Double,
    Name: String,
    NumericScale: Double,
    ParentCatalog: Catalog,
    Precision: Double,
    Properties: Properties,
    RelatedColumn: String,
    SortOrder: SortOrderEnum,
    Type: DataTypeEnum
  ): Column = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], DefinedSize = DefinedSize.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumericScale = NumericScale.asInstanceOf[js.Any], ParentCatalog = ParentCatalog.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RelatedColumn = RelatedColumn.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Column_typekey")(ADOXDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setADOXDotColumn_typekey(value: Column): Self = StObject.set(x, "ADOX.Column_typekey", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: ColumnAttributesEnum): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setDefinedSize(value: Double): Self = StObject.set(x, "DefinedSize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumericScale(value: Double): Self = StObject.set(x, "NumericScale", value.asInstanceOf[js.Any])
    
    inline def setParentCatalog(value: Catalog): Self = StObject.set(x, "ParentCatalog", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setRelatedColumn(value: String): Self = StObject.set(x, "RelatedColumn", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrderEnum): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
