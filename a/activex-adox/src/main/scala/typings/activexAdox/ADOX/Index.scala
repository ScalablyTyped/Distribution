package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  @JSName("ADOX.Index_typekey")
  var ADOXDotIndex_typekey: Index
  
  var Clustered: Boolean
  
  def Columns(Item: String): Column
  def Columns(Item: Double): Column
  @JSName("Columns")
  val Columns_Original: Columns
  
  var IndexNulls: AllowNullsEnum
  
  var Name: String
  
  var PrimaryKey: Boolean
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  var Unique: Boolean
}
object Index {
  
  @scala.inline
  def apply(
    ADOXDotIndex_typekey: Index,
    Clustered: Boolean,
    Columns: Columns,
    IndexNulls: AllowNullsEnum,
    Name: String,
    PrimaryKey: Boolean,
    Properties: Properties,
    Unique: Boolean
  ): Index = {
    val __obj = js.Dynamic.literal(Clustered = Clustered.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IndexNulls = IndexNulls.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrimaryKey = PrimaryKey.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Index_typekey")(ADOXDotIndex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADOXDotIndex_typekey(value: Index): Self = StObject.set(x, "ADOX.Index_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustered(value: Boolean): Self = StObject.set(x, "Clustered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: Columns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNulls(value: AllowNullsEnum): Self = StObject.set(x, "IndexNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = StObject.set(x, "PrimaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "Unique", value.asInstanceOf[js.Any])
  }
}
