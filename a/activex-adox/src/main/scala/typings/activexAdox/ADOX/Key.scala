package typings.activexAdox.ADOX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  @JSName("ADOX.Key_typekey")
  var ADOXDotKey_typekey: Key
  
  def Columns(Item: String): Column
  def Columns(Item: Double): Column
  @JSName("Columns")
  val Columns_Original: Columns
  
  var DeleteRule: RuleEnum
  
  var Name: String
  
  var RelatedTable: String
  
  var Type: KeyTypeEnum
  
  var UpdateRule: RuleEnum
}
object Key {
  
  @scala.inline
  def apply(
    ADOXDotKey_typekey: Key,
    Columns: Columns,
    DeleteRule: RuleEnum,
    Name: String,
    RelatedTable: String,
    Type: KeyTypeEnum,
    UpdateRule: RuleEnum
  ): Key = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], DeleteRule = DeleteRule.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RelatedTable = RelatedTable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdateRule = UpdateRule.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Key_typekey")(ADOXDotKey_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADOXDotKey_typekey(value: Key): Self = StObject.set(x, "ADOX.Key_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: Columns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRule(value: RuleEnum): Self = StObject.set(x, "DeleteRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTable(value: String): Self = StObject.set(x, "RelatedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: KeyTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRule(value: RuleEnum): Self = StObject.set(x, "UpdateRule", value.asInstanceOf[js.Any])
  }
}
