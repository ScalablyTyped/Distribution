package typings.activexAdox

import typings.activexAdodb.ADODB.DataTypeEnum
import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import typings.activexAdox.ADOX.AllowNullsEnum
import typings.activexAdox.ADOX.ColumnAttributesEnum
import typings.activexAdox.ADOX.Columns
import typings.activexAdox.ADOX.Indexes
import typings.activexAdox.ADOX.KeyTypeEnum
import typings.activexAdox.ADOX.Keys
import typings.activexAdox.ADOX.RuleEnum
import typings.activexAdox.ADOX.SortOrderEnum
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ADOX {
    
    @JSGlobal("ADOX.Catalog")
    @js.native
    class Catalog protected ()
      extends StObject
         with typings.activexAdox.ADOX.Catalog
    
    @JSGlobal("ADOX.Column")
    @js.native
    class Column protected ()
      extends StObject
         with typings.activexAdox.ADOX.Column {
      
      /* CompleteClass */
      @JSName("ADOX.Column_typekey")
      var ADOXDotColumn_typekey: typings.activexAdox.ADOX.Column = js.native
      
      /* CompleteClass */
      var Attributes: ColumnAttributesEnum = js.native
      
      /* CompleteClass */
      var DefinedSize: Double = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var NumericScale: Double = js.native
      
      /* CompleteClass */
      var ParentCatalog: typings.activexAdox.ADOX.Catalog = js.native
      
      /* CompleteClass */
      var Precision: Double = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var RelatedColumn: String = js.native
      
      /* CompleteClass */
      var SortOrder: SortOrderEnum = js.native
      
      /* CompleteClass */
      var Type: DataTypeEnum = js.native
    }
    
    @JSGlobal("ADOX.Group")
    @js.native
    class Group protected ()
      extends StObject
         with typings.activexAdox.ADOX.Group
    
    @JSGlobal("ADOX.Index")
    @js.native
    class Index protected ()
      extends StObject
         with typings.activexAdox.ADOX.Index {
      
      /* CompleteClass */
      @JSName("ADOX.Index_typekey")
      var ADOXDotIndex_typekey: typings.activexAdox.ADOX.Index = js.native
      
      /* CompleteClass */
      var Clustered: Boolean = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      var IndexNulls: AllowNullsEnum = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var PrimaryKey: Boolean = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Unique: Boolean = js.native
    }
    
    @JSGlobal("ADOX.Key")
    @js.native
    class Key protected ()
      extends StObject
         with typings.activexAdox.ADOX.Key {
      
      /* CompleteClass */
      @JSName("ADOX.Key_typekey")
      var ADOXDotKey_typekey: typings.activexAdox.ADOX.Key = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      var DeleteRule: RuleEnum = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var RelatedTable: String = js.native
      
      /* CompleteClass */
      var Type: KeyTypeEnum = js.native
      
      /* CompleteClass */
      var UpdateRule: RuleEnum = js.native
    }
    
    @JSGlobal("ADOX.Procedure")
    @js.native
    class Procedure protected ()
      extends StObject
         with typings.activexAdox.ADOX.Procedure {
      
      /* CompleteClass */
      @JSName("ADOX.Procedure_typekey")
      var ADOXDotProcedure_typekey: typings.activexAdox.ADOX.Procedure = js.native
      
      /* CompleteClass */
      var Command: typings.activexAdodb.ADODB.Command = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate | Null = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate | Null = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
    }
    
    @JSGlobal("ADOX.Table")
    @js.native
    class Table protected ()
      extends StObject
         with typings.activexAdox.ADOX.Table {
      
      /* CompleteClass */
      @JSName("ADOX.Table_typekey")
      var ADOXDotTable_typekey: typings.activexAdox.ADOX.Table = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typings.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      
      /* CompleteClass */
      override def Indexes(Item: String): typings.activexAdox.ADOX.Index = js.native
      /* CompleteClass */
      override def Indexes(Item: Double): typings.activexAdox.ADOX.Index = js.native
      /* CompleteClass */
      @JSName("Indexes")
      override val Indexes_Original: Indexes = js.native
      
      /* CompleteClass */
      override def Keys(Item: String): typings.activexAdox.ADOX.Key = js.native
      /* CompleteClass */
      override def Keys(Item: Double): typings.activexAdox.ADOX.Key = js.native
      /* CompleteClass */
      @JSName("Keys")
      override val Keys_Original: Keys = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var ParentCatalog: typings.activexAdox.ADOX.Catalog = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      override val Type: String = js.native
    }
    
    @JSGlobal("ADOX.User")
    @js.native
    class User protected ()
      extends StObject
         with typings.activexAdox.ADOX.User
    
    @JSGlobal("ADOX.View")
    @js.native
    class View protected ()
      extends StObject
         with typings.activexAdox.ADOX.View {
      
      /* CompleteClass */
      @JSName("ADOX.View_typekey")
      var ADOXDotView_typekey: typings.activexAdox.ADOX.View = js.native
      
      /* CompleteClass */
      var Command: typings.activexAdodb.ADODB.Command = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
    }
  }
}
