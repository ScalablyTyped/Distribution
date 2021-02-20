package typings.activexAdox

import typings.activexAdodb.ADODB.Command
import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.DataTypeEnum
import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import typings.activexAdox.activexAdoxNumbers.`-1`
import typings.activexAdox.activexAdoxNumbers.`-2147483648`
import typings.activexAdox.activexAdoxNumbers.`0`
import typings.activexAdox.activexAdoxNumbers.`1024`
import typings.activexAdox.activexAdoxNumbers.`1073741824`
import typings.activexAdox.activexAdoxNumbers.`131072`
import typings.activexAdox.activexAdoxNumbers.`16384`
import typings.activexAdox.activexAdoxNumbers.`1`
import typings.activexAdox.activexAdoxNumbers.`2048`
import typings.activexAdox.activexAdoxNumbers.`256`
import typings.activexAdox.activexAdoxNumbers.`262144`
import typings.activexAdox.activexAdoxNumbers.`268435456`
import typings.activexAdox.activexAdoxNumbers.`2`
import typings.activexAdox.activexAdoxNumbers.`32768`
import typings.activexAdox.activexAdoxNumbers.`33554432`
import typings.activexAdox.activexAdoxNumbers.`3`
import typings.activexAdox.activexAdoxNumbers.`4096`
import typings.activexAdox.activexAdoxNumbers.`4`
import typings.activexAdox.activexAdoxNumbers.`512`
import typings.activexAdox.activexAdoxNumbers.`524288`
import typings.activexAdox.activexAdoxNumbers.`536870912`
import typings.activexAdox.activexAdoxNumbers.`5`
import typings.activexAdox.activexAdoxNumbers.`65536`
import typings.activexAdox.activexAdoxNumbers.`8192`
import typings.std.SafeArray
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ADOX {
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`3`
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`4`
    - typings.activexAdox.activexAdoxNumbers.`2`
  */
  trait ActionEnum extends StObject
  object ActionEnum {
    
    @scala.inline
    def adAccessDeny: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def adAccessGrant: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adAccessRevoke: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def adAccessSet: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`0`
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`2`
    - typings.activexAdox.activexAdoxNumbers.`4`
  */
  trait AllowNullsEnum extends StObject
  object AllowNullsEnum {
    
    @scala.inline
    def adIndexNullsAllow: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def adIndexNullsDisallow: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adIndexNullsIgnore: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def adIndexNullsIgnoreAny: `4` = 4.asInstanceOf[`4`]
  }
  
  @js.native
  trait Catalog extends StObject {
    
    @JSName("ADOX.Catalog_typekey")
    var ADOXDotCatalog_typekey: Catalog = js.native
    
    /** Can be set to a Connection object or a string. Returns the active Connection object, or `null` */
    var ActiveConnection: String | Connection | Null = js.native
    
    /**
      * The **Create** method creates and opens a new ADO Connection to the data source specified in _ConnectString_. If successful, the new **Connection** object is assigned to the **ActiveConnection** property.
      *
      * An error will occur if the provider does not support creating new catalogs.
      *
      * @param ConnectString Connection string
      */
    def Create(ConnectString: String): Unit = js.native
    
    def GetObjectOwner(ObjectName: String, ObjectType: ObjectTypeEnum): String = js.native
    /**
      * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification
      */
    @JSName("GetObjectOwner")
    def GetObjectOwner_1(ObjectName: String, ObjectType: `-1`, ObjectTypeId: js.Any): String = js.native
    
    def Groups(Item: String): Group = js.native
    def Groups(Item: Double): Group = js.native
    @JSName("Groups")
    val Groups_Original: Groups = js.native
    
    def Procedures(Item: String): Procedure = js.native
    def Procedures(Item: Double): Procedure = js.native
    @JSName("Procedures")
    val Procedures_Original: Procedures = js.native
    
    def SetObjectOwner(ObjectName: String, ObjectType: ObjectTypeEnum, UserName: String): Unit = js.native
    /**
      * @param UserName Specifies the name of the **User** or **Group** to own the object
      * @param ObjectTypeId Specifies the GUID for a provider object type that is not defined by the OLE DB specification
      */
    @JSName("SetObjectOwner")
    def SetObjectOwner_1(ObjectName: String, ObjectType: `-1`, UserName: String, ObjectTypeId: js.Any): Unit = js.native
    
    def Tables(Item: String): Table = js.native
    def Tables(Item: Double): Table = js.native
    @JSName("Tables")
    val Tables_Original: Tables = js.native
    
    def Users(Item: String): User = js.native
    def Users(Item: Double): User = js.native
    @JSName("Users")
    val Users_Original: Users = js.native
    
    def Views(Item: String): View = js.native
    def Views(Item: Double): View = js.native
    @JSName("Views")
    val Views_Original: Views = js.native
  }
  
  @js.native
  trait Column extends StObject {
    
    @JSName("ADOX.Column_typekey")
    var ADOXDotColumn_typekey: Column = js.native
    
    var Attributes: ColumnAttributesEnum = js.native
    
    var DefinedSize: Double = js.native
    
    var Name: String = js.native
    
    var NumericScale: Double = js.native
    
    var ParentCatalog: Catalog = js.native
    
    var Precision: Double = js.native
    
    def Properties(Index: String): Property = js.native
    def Properties(Index: Double): Property = js.native
    @JSName("Properties")
    val Properties_Original: Properties = js.native
    
    var RelatedColumn: String = js.native
    
    var SortOrder: SortOrderEnum = js.native
    
    var Type: DataTypeEnum = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`2`
  */
  trait ColumnAttributesEnum extends StObject
  object ColumnAttributesEnum {
    
    @scala.inline
    def adColFixed: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adColNullable: `2` = 2.asInstanceOf[`2`]
  }
  
  @js.native
  trait Columns extends StObject {
    
    def apply(Item: String): Column = js.native
    def apply(Item: Double): Column = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(Item: String, Type: js.UndefOr[scala.Nothing], DefinedSize: Double): Unit = js.native
    def Append(Item: String, Type: DataTypeEnum): Unit = js.native
    def Append(Item: String, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
    /**
      * @param Type [Type=202]
      * @param DefinedSize [DefinedSize=0]
      */
    def Append(Item: Column): Unit = js.native
    def Append(Item: Column, Type: js.UndefOr[scala.Nothing], DefinedSize: Double): Unit = js.native
    def Append(Item: Column, Type: DataTypeEnum): Unit = js.native
    def Append(Item: Column, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Column = js.native
    def Item(Item: Double): Column = js.native
    
    def Refresh(): Unit = js.native
  }
  
  @js.native
  trait Group extends StObject {
    
    @JSName("ADOX.Group_typekey")
    var ADOXDotGroup_typekey: Group = js.native
    
    def GetPermissions(Name: String, ObjectType: ObjectTypeEnum): RightsEnum = js.native
    def GetPermissions(Name: Null, ObjectType: ObjectTypeEnum): RightsEnum = js.native
    /**
      * @param Name Specifies the name of the object for which to set permissions. Pass `null` if you want to get the permissions for the object container.
      * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
      */
    @JSName("GetPermissions")
    def GetPermissions_1(Name: String, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
    @JSName("GetPermissions")
    def GetPermissions_1(Name: Null, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
    
    var Name: String = js.native
    
    var ParentCatalog: Catalog = js.native
    
    def Properties(Index: String): Property = js.native
    def Properties(Index: Double): Property = js.native
    @JSName("Properties")
    val Properties_Original: Properties = js.native
    
    def SetPermissions(Name: String, ObjectType: ObjectTypeEnum, Action: ActionEnum, Rights: RightsEnum): Unit = js.native
    def SetPermissions(
      Name: String,
      ObjectType: ObjectTypeEnum,
      Action: ActionEnum,
      Rights: RightsEnum,
      Inherit: InheritTypeEnum
    ): Unit = js.native
    /**
      * @param Rights A bitmask of one or more of the **RightsEnum** constants, that indicates the rights to set.
      * @param Inherit [Inherit=0]
      * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
      */
    @JSName("SetPermissions")
    def SetPermissions_1(
      Name: String,
      ObjectType: `-1`,
      Action: ActionEnum,
      Rights: RightsEnum,
      Inherit: InheritTypeEnum,
      ObjectTypeId: js.Any
    ): Unit = js.native
    
    def Users(Item: String): User = js.native
    def Users(Item: Double): User = js.native
    @JSName("Users")
    val Users_Original: Users = js.native
  }
  
  @js.native
  trait Groups extends StObject {
    
    def apply(Item: String): Group = js.native
    def apply(Item: Double): Group = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(Item: Group): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Group = js.native
    def Item(Item: Double): Group = js.native
    
    def Refresh(): Unit = js.native
  }
  
  @js.native
  trait Index extends StObject {
    
    @JSName("ADOX.Index_typekey")
    var ADOXDotIndex_typekey: Index = js.native
    
    var Clustered: Boolean = js.native
    
    def Columns(Item: String): Column = js.native
    def Columns(Item: Double): Column = js.native
    @JSName("Columns")
    val Columns_Original: Columns = js.native
    
    var IndexNulls: AllowNullsEnum = js.native
    
    var Name: String = js.native
    
    var PrimaryKey: Boolean = js.native
    
    def Properties(Index: String): Property = js.native
    def Properties(Index: Double): Property = js.native
    @JSName("Properties")
    val Properties_Original: Properties = js.native
    
    var Unique: Boolean = js.native
  }
  
  @js.native
  trait Indexes extends StObject {
    
    def apply(Item: String): Index = js.native
    def apply(Item: Double): Index = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(Item: String, Columns: String): Unit = js.native
    def Append(Item: String, Columns: SafeArray[String]): Unit = js.native
    def Append(Item: Index): Unit = js.native
    def Append(Item: Index, Columns: String): Unit = js.native
    def Append(Item: Index, Columns: SafeArray[String]): Unit = js.native
    
    // is this actually two overloads, one with [Index] and one with [string,string | SafeArray<string>]?
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Index = js.native
    def Item(Item: Double): Index = js.native
    
    def Refresh(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`3`
    - typings.activexAdox.activexAdoxNumbers.`2`
    - typings.activexAdox.activexAdoxNumbers.`0`
    - typings.activexAdox.activexAdoxNumbers.`4`
    - typings.activexAdox.activexAdoxNumbers.`1`
  */
  trait InheritTypeEnum extends StObject
  object InheritTypeEnum {
    
    @scala.inline
    def adInheritBoth: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def adInheritContainers: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def adInheritNoPropogate: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def adInheritNone: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def adInheritObjects: `1` = 1.asInstanceOf[`1`]
  }
  
  @js.native
  trait Key extends StObject {
    
    @JSName("ADOX.Key_typekey")
    var ADOXDotKey_typekey: Key = js.native
    
    def Columns(Item: String): Column = js.native
    def Columns(Item: Double): Column = js.native
    @JSName("Columns")
    val Columns_Original: Columns = js.native
    
    var DeleteRule: RuleEnum = js.native
    
    var Name: String = js.native
    
    var RelatedTable: String = js.native
    
    var Type: KeyTypeEnum = js.native
    
    var UpdateRule: RuleEnum = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`2`
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`3`
  */
  trait KeyTypeEnum extends StObject
  object KeyTypeEnum {
    
    @scala.inline
    def adKeyForeign: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def adKeyPrimary: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adKeyUnique: `3` = 3.asInstanceOf[`3`]
  }
  
  @js.native
  trait Keys extends StObject {
    
    def apply(Item: String): Key = js.native
    def apply(Item: Double): Key = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String
    ): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: js.UndefOr[scala.Nothing], Column: String): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: String,
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: js.UndefOr[scala.Nothing], Column: String, RelatedTable: String): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: String,
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: js.UndefOr[scala.Nothing], Column: SafeArray[String]): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: SafeArray[String],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: js.UndefOr[scala.Nothing], Column: SafeArray[String], RelatedTable: String): Unit = js.native
    def Append(
      Item: String,
      Type: js.UndefOr[scala.Nothing],
      Column: SafeArray[String],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum): Unit = js.native
    def Append(
      Item: String,
      Type: KeyTypeEnum,
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: js.UndefOr[scala.Nothing], RelatedTable: String): Unit = js.native
    def Append(
      Item: String,
      Type: KeyTypeEnum,
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: String): Unit = js.native
    def Append(
      Item: String,
      Type: KeyTypeEnum,
      Column: String,
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
    def Append(
      Item: String,
      Type: KeyTypeEnum,
      Column: SafeArray[String],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
    def Append(
      Item: String,
      Type: KeyTypeEnum,
      Column: SafeArray[String],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    /**
      * @param Type [Type=1]
      * @param RelatedTable [RelatedTable='']
      * @param RelatedColumn [RelatedColumn='']
      */
    def Append(Item: Key): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String
    ): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: js.UndefOr[scala.Nothing], Column: String): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: String,
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: js.UndefOr[scala.Nothing], Column: String, RelatedTable: String): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: String,
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: js.UndefOr[scala.Nothing], Column: SafeArray[String]): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: SafeArray[String],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: js.UndefOr[scala.Nothing], Column: SafeArray[String], RelatedTable: String): Unit = js.native
    def Append(
      Item: Key,
      Type: js.UndefOr[scala.Nothing],
      Column: SafeArray[String],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum): Unit = js.native
    def Append(
      Item: Key,
      Type: KeyTypeEnum,
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: js.UndefOr[scala.Nothing], RelatedTable: String): Unit = js.native
    def Append(
      Item: Key,
      Type: KeyTypeEnum,
      Column: js.UndefOr[scala.Nothing],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: String): Unit = js.native
    def Append(
      Item: Key,
      Type: KeyTypeEnum,
      Column: String,
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
    def Append(
      Item: Key,
      Type: KeyTypeEnum,
      Column: SafeArray[String],
      RelatedTable: js.UndefOr[scala.Nothing],
      RelatedColumn: String
    ): Unit = js.native
    def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
    def Append(
      Item: Key,
      Type: KeyTypeEnum,
      Column: SafeArray[String],
      RelatedTable: String,
      RelatedColumn: String
    ): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Key = js.native
    def Item(Item: Double): Key = js.native
    
    def Refresh(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`2`
    - typings.activexAdox.activexAdoxNumbers.`3`
    - typings.activexAdox.activexAdoxNumbers.`4`
    - typings.activexAdox.activexAdoxNumbers.`-1`
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`5`
  */
  trait ObjectTypeEnum extends StObject
  object ObjectTypeEnum {
    
    @scala.inline
    def adPermObjColumn: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def adPermObjDatabase: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def adPermObjProcedure: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def adPermObjProviderSpecific: `-1` = -1.asInstanceOf[`-1`]
    
    @scala.inline
    def adPermObjTable: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adPermObjView: `5` = 5.asInstanceOf[`5`]
  }
  
  @js.native
  trait Procedure extends StObject {
    
    @JSName("ADOX.Procedure_typekey")
    var ADOXDotProcedure_typekey: Procedure = js.native
    
    var Command: typings.activexAdodb.ADODB.Command = js.native
    
    val DateCreated: VarDate | Null = js.native
    
    val DateModified: VarDate | Null = js.native
    
    val Name: String = js.native
  }
  object Procedure {
    
    @scala.inline
    def apply(ADOXDotProcedure_typekey: Procedure, Command: Command, Name: String): Procedure = {
      val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.updateDynamic("ADOX.Procedure_typekey")(ADOXDotProcedure_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Procedure]
    }
    
    @scala.inline
    implicit class ProcedureMutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADOXDotProcedure_typekey(value: Procedure): Self = StObject.set(x, "ADOX.Procedure_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreatedNull: Self = StObject.set(x, "DateCreated", null)
      
      @scala.inline
      def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateModifiedNull: Self = StObject.set(x, "DateModified", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Procedures extends StObject {
    
    def apply(Item: String): Procedure = js.native
    def apply(Item: Double): Procedure = js.native
    
    def Append(Name: String, Command: Command): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Procedure = js.native
    def Item(Item: Double): Procedure = js.native
    
    def Refresh(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`16384`
    - typings.activexAdox.activexAdoxNumbers.`65536`
    - typings.activexAdox.activexAdoxNumbers.`256`
    - typings.activexAdox.activexAdoxNumbers.`512`
    - typings.activexAdox.activexAdoxNumbers.`536870912`
    - typings.activexAdox.activexAdoxNumbers.`268435456`
    - typings.activexAdox.activexAdoxNumbers.`32768`
    - typings.activexAdox.activexAdoxNumbers.`33554432`
    - typings.activexAdox.activexAdoxNumbers.`0`
    - typings.activexAdox.activexAdoxNumbers.`-2147483648`
    - typings.activexAdox.activexAdoxNumbers.`1024`
    - typings.activexAdox.activexAdoxNumbers.`131072`
    - typings.activexAdox.activexAdoxNumbers.`8192`
    - typings.activexAdox.activexAdoxNumbers.`1073741824`
    - typings.activexAdox.activexAdoxNumbers.`4096`
    - typings.activexAdox.activexAdoxNumbers.`2048`
    - typings.activexAdox.activexAdoxNumbers.`524288`
    - typings.activexAdox.activexAdoxNumbers.`262144`
  */
  trait RightsEnum extends StObject
  object RightsEnum {
    
    @scala.inline
    def adRightCreate: `16384` = 16384.asInstanceOf[`16384`]
    
    @scala.inline
    def adRightDelete: `65536` = 65536.asInstanceOf[`65536`]
    
    @scala.inline
    def adRightDrop: `256` = 256.asInstanceOf[`256`]
    
    @scala.inline
    def adRightExclusive: `512` = 512.asInstanceOf[`512`]
    
    @scala.inline
    def adRightExecute: `536870912` = 536870912.asInstanceOf[`536870912`]
    
    @scala.inline
    def adRightFull: `268435456` = 268435456.asInstanceOf[`268435456`]
    
    @scala.inline
    def adRightInsert: `32768` = 32768.asInstanceOf[`32768`]
    
    @scala.inline
    def adRightMaximumAllowed: `33554432` = 33554432.asInstanceOf[`33554432`]
    
    @scala.inline
    def adRightNone: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def adRightRead: `-2147483648` = -2147483648.asInstanceOf[`-2147483648`]
    
    @scala.inline
    def adRightReadDesign: `1024` = 1024.asInstanceOf[`1024`]
    
    @scala.inline
    def adRightReadPermissions: `131072` = 131072.asInstanceOf[`131072`]
    
    @scala.inline
    def adRightReference: `8192` = 8192.asInstanceOf[`8192`]
    
    @scala.inline
    def adRightUpdate: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
    
    @scala.inline
    def adRightWithGrant: `4096` = 4096.asInstanceOf[`4096`]
    
    @scala.inline
    def adRightWriteDesign: `2048` = 2048.asInstanceOf[`2048`]
    
    @scala.inline
    def adRightWriteOwner: `524288` = 524288.asInstanceOf[`524288`]
    
    @scala.inline
    def adRightWritePermissions: `262144` = 262144.asInstanceOf[`262144`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`0`
    - typings.activexAdox.activexAdoxNumbers.`3`
    - typings.activexAdox.activexAdoxNumbers.`2`
  */
  trait RuleEnum extends StObject
  object RuleEnum {
    
    @scala.inline
    def adRICascade: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adRINone: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def adRISetDefault: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def adRISetNull: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAdox.activexAdoxNumbers.`1`
    - typings.activexAdox.activexAdoxNumbers.`2`
  */
  trait SortOrderEnum extends StObject
  object SortOrderEnum {
    
    @scala.inline
    def adSortAscending: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def adSortDescending: `2` = 2.asInstanceOf[`2`]
  }
  
  @js.native
  trait Table extends StObject {
    
    @JSName("ADOX.Table_typekey")
    var ADOXDotTable_typekey: Table = js.native
    
    def Columns(Item: String): Column = js.native
    def Columns(Item: Double): Column = js.native
    @JSName("Columns")
    val Columns_Original: Columns = js.native
    
    val DateCreated: VarDate = js.native
    
    val DateModified: VarDate = js.native
    
    def Indexes(Item: String): Index = js.native
    def Indexes(Item: Double): Index = js.native
    @JSName("Indexes")
    val Indexes_Original: Indexes = js.native
    
    def Keys(Item: String): Key = js.native
    def Keys(Item: Double): Key = js.native
    @JSName("Keys")
    val Keys_Original: Keys = js.native
    
    var Name: String = js.native
    
    var ParentCatalog: Catalog = js.native
    
    def Properties(Index: String): Property = js.native
    def Properties(Index: Double): Property = js.native
    @JSName("Properties")
    val Properties_Original: Properties = js.native
    
    val Type: String = js.native
  }
  
  @js.native
  trait Tables extends StObject {
    
    def apply(Item: String): Table = js.native
    def apply(Item: Double): Table = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(Item: Table): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): Table = js.native
    def Item(Item: Double): Table = js.native
    
    def Refresh(): Unit = js.native
  }
  
  @js.native
  trait User extends StObject {
    
    @JSName("ADOX.User_typekey")
    var ADOXDotUser_typekey: User = js.native
    
    def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
    
    def GetPermissions(Name: String, ObjectType: ObjectTypeEnum): RightsEnum = js.native
    def GetPermissions(Name: Null, ObjectType: ObjectTypeEnum): RightsEnum = js.native
    /**
      * @param Name Specifies the name of the object for which to set permissions. Pass `null` if you want to get the permissions for the object container.
      * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
      */
    @JSName("GetPermissions")
    def GetPermissions_1(Name: String, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
    @JSName("GetPermissions")
    def GetPermissions_1(Name: Null, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
    
    def Groups(Item: String): Group = js.native
    def Groups(Item: Double): Group = js.native
    @JSName("Groups")
    val Groups_Original: Groups = js.native
    
    var Name: String = js.native
    
    var ParentCatalog: Catalog = js.native
    
    def Properties(Index: String): Property = js.native
    def Properties(Index: Double): Property = js.native
    @JSName("Properties")
    val Properties_Original: Properties = js.native
    
    def SetPermissions(Name: String, ObjectType: ObjectTypeEnum, Action: ActionEnum, Rights: RightsEnum): Unit = js.native
    def SetPermissions(
      Name: String,
      ObjectType: ObjectTypeEnum,
      Action: ActionEnum,
      Rights: RightsEnum,
      Inherit: InheritTypeEnum
    ): Unit = js.native
    /**
      * @param Rights A bitmask of one or more of the **RightsEnum** constants, that indicates the rights to set.
      * @param Inherit [Inherit=0]
      * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
      */
    @JSName("SetPermissions")
    def SetPermissions_1(
      Name: String,
      ObjectType: `-1`,
      Action: ActionEnum,
      Rights: RightsEnum,
      Inherit: InheritTypeEnum,
      ObjectTypeId: js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait Users extends StObject {
    
    def apply(Item: String): User = js.native
    def apply(Item: Double): User = js.native
    
    def Append(Item: String): Unit = js.native
    def Append(Item: String, Password: String): Unit = js.native
    /** @param Password [Password=''] */
    def Append(Item: User): Unit = js.native
    def Append(Item: User, Password: String): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): User = js.native
    def Item(Item: Double): User = js.native
    
    def Refresh(): Unit = js.native
  }
  
  @js.native
  trait View extends StObject {
    
    @JSName("ADOX.View_typekey")
    var ADOXDotView_typekey: View = js.native
    
    var Command: typings.activexAdodb.ADODB.Command = js.native
    
    val DateCreated: VarDate = js.native
    
    val DateModified: VarDate = js.native
    
    val Name: String = js.native
  }
  object View {
    
    @scala.inline
    def apply(
      ADOXDotView_typekey: View,
      Command: Command,
      DateCreated: VarDate,
      DateModified: VarDate,
      Name: String
    ): View = {
      val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.updateDynamic("ADOX.View_typekey")(ADOXDotView_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[View]
    }
    
    @scala.inline
    implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADOXDotView_typekey(value: View): Self = StObject.set(x, "ADOX.View_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: VarDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateModified(value: VarDate): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Views extends StObject {
    
    def apply(Item: String): View = js.native
    def apply(Item: Double): View = js.native
    
    def Append(Name: String, Command: Command): Unit = js.native
    
    val Count: Double = js.native
    
    def Delete(Item: String): Unit = js.native
    def Delete(Item: Double): Unit = js.native
    
    def Item(Item: String): View = js.native
    def Item(Item: Double): View = js.native
    
    def Refresh(): Unit = js.native
  }
}
