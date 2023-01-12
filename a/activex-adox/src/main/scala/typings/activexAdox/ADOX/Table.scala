package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /* private */ @JSName("ADOX.Table_typekey")
  var ADOXDotTable_typekey: Table
  
  def Columns(Item: String): Column
  def Columns(Item: Double): Column
  @JSName("Columns")
  val Columns_Original: Columns
  
  val DateCreated: VarDate
  
  val DateModified: VarDate
  
  def Indexes(Item: String): Index
  def Indexes(Item: Double): Index
  @JSName("Indexes")
  val Indexes_Original: Indexes
  
  def Keys(Item: String): Key
  def Keys(Item: Double): Key
  @JSName("Keys")
  val Keys_Original: Keys
  
  var Name: String
  
  var ParentCatalog: Catalog
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  val Type: String
}
object Table {
  
  inline def apply(
    ADOXDotTable_typekey: Table,
    Columns: Columns,
    DateCreated: VarDate,
    DateModified: VarDate,
    Indexes: Indexes,
    Keys: Keys,
    Name: String,
    ParentCatalog: Catalog,
    Properties: Properties,
    Type: String
  ): Table = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Indexes = Indexes.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParentCatalog = ParentCatalog.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Table_typekey")(ADOXDotTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    inline def setADOXDotTable_typekey(value: Table): Self = StObject.set(x, "ADOX.Table_typekey", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: Columns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: Indexes): Self = StObject.set(x, "Indexes", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Keys): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParentCatalog(value: Catalog): Self = StObject.set(x, "ParentCatalog", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
