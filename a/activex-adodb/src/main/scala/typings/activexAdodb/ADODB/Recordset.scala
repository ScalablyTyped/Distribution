package typings.activexAdodb.ADODB

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordset extends js.Object {
  var AbsolutePage: PositionEnum = js.native
  var AbsolutePosition: PositionEnum = js.native
  val ActiveCommand: js.UndefOr[Command] = js.native
  /**
    * Sets or returns a String value that contains a definition for a connection if the connection is closed, or a Variant containing the current Connection object if the connection is open. Default is a null object reference.
    */
  var ActiveConnection: String | Connection | Null = js.native
  val BOF: Boolean = js.native
  var Bookmark: typings.activexAdodb.ADODB.Bookmark = js.native
  var CacheSize: Double = js.native
  var CursorLocation: CursorLocationEnum = js.native
  var CursorType: CursorTypeEnum = js.native
  var DataMember: String = js.native
  var DataSource: js.Any = js.native
  val EOF: Boolean = js.native
  val EditMode: EditModeEnum = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  /**
    * Sets or returns one of the following:
    * * Criteria string — a string made up of one or more individual clauses concatenated with AND or OR operators.
    * * Array of bookmarks — an array of unique bookmark values that point to records in the Recordset object.
    * * A FilterGroupEnum value
    */
  var Filter: String | SafeArray[Bookmark] | FilterGroupEnum = js.native
  var Index: String = js.native
  var LockType: LockTypeEnum = js.native
  var MarshalOptions: MarshalOptionsEnum = js.native
  var MaxRecords: Double = js.native
  val PageCount: Double = js.native
  var PageSize: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: Double = js.native
  var Sort: String = js.native
  var Source: String | Command = js.native
  val State: ObjectStateEnum = js.native
  val Status: Double = js.native
  var StayInSync: Boolean = js.native
  def apply(FieldIndex: String): Field = js.native
  def apply(FieldIndex: Double): Field = js.native
  def AddNew(): Unit = js.native
  def AddNew(Field: String, Value: js.Any): Unit = js.native
  def AddNew(Fields: SafeArray[String | Double], Values: SafeArray[_]): Unit = js.native
  def Cancel(): Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def CancelBatch(): Unit = js.native
  def CancelBatch(AffectRecords: AffectEnum): Unit = js.native
  def CancelUpdate(): Unit = js.native
  /** @param LockType [LockType=-1] */
  def Clone(): Recordset = js.native
  def Clone(LockType: LockTypeEnum): Recordset = js.native
  def Close(): Unit = js.native
  def Collect(Index: js.Any): js.Any = js.native
  def CompareBookmarks(Bookmark1: Bookmark, Bookmark2: Bookmark): CompareEnum = js.native
  /** @param AffectRecords [AffectRecords=1] */
  def Delete(): Unit = js.native
  def Delete(AffectRecords: AffectEnum): Unit = js.native
  def Fields(Index: String): Field = js.native
  def Fields(Index: Double): Field = js.native
  /**
    * @param SkipRecords [SkipRecords=0]
    * @param SearchDirection [SearchDirection=1]
    */
  def Find(Criteria: String): Unit = js.native
  def Find(
    Criteria: String,
    SkipRecords: js.UndefOr[scala.Nothing],
    SearchDirection: js.UndefOr[scala.Nothing],
    Start: Bookmark
  ): Unit = js.native
  def Find(Criteria: String, SkipRecords: js.UndefOr[scala.Nothing], SearchDirection: SearchDirectionEnum): Unit = js.native
  def Find(
    Criteria: String,
    SkipRecords: js.UndefOr[scala.Nothing],
    SearchDirection: SearchDirectionEnum,
    Start: Bookmark
  ): Unit = js.native
  def Find(Criteria: String, SkipRecords: Double): Unit = js.native
  def Find(Criteria: String, SkipRecords: Double, SearchDirection: js.UndefOr[scala.Nothing], Start: Bookmark): Unit = js.native
  def Find(Criteria: String, SkipRecords: Double, SearchDirection: SearchDirectionEnum): Unit = js.native
  def Find(Criteria: String, SkipRecords: Double, SearchDirection: SearchDirectionEnum, Start: Bookmark): Unit = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: js.UndefOr[scala.Nothing], Fields: String): SafeArray[_] = js.native
  def GetRows(
    Rows: js.UndefOr[scala.Nothing],
    Start: js.UndefOr[scala.Nothing],
    Fields: SafeArray[String | Double]
  ): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: String): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: String, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: String, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: Bookmark): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: BookmarkEnum): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: BookmarkEnum, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: BookmarkEnum, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: Bookmark, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: js.UndefOr[scala.Nothing], Start: Bookmark, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: Double): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: js.UndefOr[scala.Nothing], Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: js.UndefOr[scala.Nothing], Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: String): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: String, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: String, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: Bookmark): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: BookmarkEnum): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: BookmarkEnum, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: BookmarkEnum, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: Bookmark, Fields: String): SafeArray[_] = js.native
  def GetRows(Rows: Double, Start: Bookmark, Fields: SafeArray[String | Double]): SafeArray[_] = js.native
  /**
    * @param StringFormat [StringFormat=2]
    * @param NumRows [NumRows=-1]
    * @param ColumnDelimeter [ColumnDelimeter='']
    * @param RowDelimeter [RowDelimeter='']
    * @param NullExpr [NullExpr='']
    */
  def GetString(): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: js.UndefOr[scala.Nothing], NumRows: Double): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: js.UndefOr[scala.Nothing], NumRows: Double, ColumnDelimeter: String): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: String,
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: String,
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: js.UndefOr[scala.Nothing],
    NumRows: Double,
    ColumnDelimeter: String,
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: StringFormatEnum): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: StringFormatEnum, NumRows: js.UndefOr[scala.Nothing], ColumnDelimeter: String): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: js.UndefOr[scala.Nothing],
    ColumnDelimeter: String,
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: StringFormatEnum, NumRows: Double): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String
  ): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: Double,
    ColumnDelimeter: js.UndefOr[scala.Nothing],
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: StringFormatEnum, NumRows: Double, ColumnDelimeter: String): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: Double,
    ColumnDelimeter: String,
    RowDelimeter: js.UndefOr[scala.Nothing],
    NullExpr: String
  ): String = js.native
  def GetString(StringFormat: StringFormatEnum, NumRows: Double, ColumnDelimeter: String, RowDelimeter: String): String = js.native
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: Double,
    ColumnDelimeter: String,
    RowDelimeter: String,
    NullExpr: String
  ): String = js.native
  def Move(NumRecords: Double): Unit = js.native
  def Move(NumRecords: Double, Start: String): Unit = js.native
  def Move(NumRecords: Double, Start: Bookmark): Unit = js.native
  def Move(NumRecords: Double, Start: BookmarkEnum): Unit = js.native
  def MoveFirst(): Unit = js.native
  def MoveLast(): Unit = js.native
  def MoveNext(): Unit = js.native
  def MovePrevious(): Unit = js.native
  /** Since Javascript doesn't support byref parameters, the RecordsAffected parameter cannot be used */
  def NextRecordset(): Recordset = js.native
  def Open(): Unit = js.native
  /**
    * @param CursorType [CursorType=-1]
    * @param LockType [LockType=-1]
    * @param Options [Options=-1]
    */
  def Open(Source: String, ActiveConnection: String): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: String, ActiveConnection: String, CursorType: CursorTypeEnum): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: String, ActiveConnection: String, CursorType: CursorTypeEnum, LockType: LockTypeEnum): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: String,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: String, ActiveConnection: Connection): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: String, ActiveConnection: Connection, CursorType: CursorTypeEnum): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: String, ActiveConnection: Connection, CursorType: CursorTypeEnum, LockType: LockTypeEnum): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  /**
    * @param CursorType [CursorType=-1]
    * @param LockType [LockType=-1]
    * @param Options [Options=-1]
    */
  def Open(Source: Command): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: js.UndefOr[scala.Nothing],
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: Command, ActiveConnection: Null, CursorType: CursorTypeEnum): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: CursorTypeEnum,
    LockType: js.UndefOr[scala.Nothing],
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: Command, ActiveConnection: Null, CursorType: CursorTypeEnum, LockType: LockTypeEnum): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): Unit = js.native
  def Open(
    Source: Command,
    ActiveConnection: Null,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): Unit = js.native
  def Open(Source: Stream): Unit = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  /** @param Options [Options=-1] */
  def Requery(): Unit = js.native
  def Requery(Options: Double): Unit = js.native
  /**
    * @param AffectRecords [AffectRecords=3]
    * @param ResyncValues [ResyncValues=2]
    */
  def Resync(): Unit = js.native
  def Resync(AffectRecords: js.UndefOr[scala.Nothing], ResyncValues: ResyncEnum): Unit = js.native
  def Resync(AffectRecords: AffectEnum): Unit = js.native
  def Resync(AffectRecords: AffectEnum, ResyncValues: ResyncEnum): Unit = js.native
  /** @param PersistFormat [PersistFormat=0] */
  def Save(Destination: String): Unit = js.native
  def Save(Destination: String, PersistFormat: PersistFormatEnum): Unit = js.native
  def Save(Destination: Stream): Unit = js.native
  def Save(Destination: Stream, PersistFormat: PersistFormatEnum): Unit = js.native
  /**
    * @param SeekOption [SeekOption=1]
    *
    * For a single-column index, pass in a single value to seek in the column of the index
    *
    * For a multi-column index, pass in a SafeArray containing the multiple values to seek in the columns of the index.
    */
  def Seek(KeyValues: js.Any): Unit = js.native
  def Seek(KeyValues: js.Any, SeekOption: SeekEnum): Unit = js.native
  def Supports(CursorOptions: CursorOptionEnum): Boolean = js.native
  def Update(): Unit = js.native
  def Update(Field: String, Value: js.Any): Unit = js.native
  def Update(Fields: SafeArray[String | Double], Values: SafeArray[_]): Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def UpdateBatch(): Unit = js.native
  def UpdateBatch(AffectRecords: AffectEnum): Unit = js.native
  def _xClone(): Recordset = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def _xResync(): Unit = js.native
  def _xResync(AffectRecords: AffectEnum): Unit = js.native
  /**
    * @param FileName [FileName='']
    * @param PersistFormat [PersistFormat=0]
    */
  def _xSave(): Unit = js.native
  def _xSave(FileName: js.UndefOr[scala.Nothing], PersistFormat: PersistFormatEnum): Unit = js.native
  def _xSave(FileName: String): Unit = js.native
  def _xSave(FileName: String, PersistFormat: PersistFormatEnum): Unit = js.native
}

