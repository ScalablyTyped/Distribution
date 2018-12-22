package typings
package activexDashAdodbLib.ADODBNs

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
  var ActiveConnection: java.lang.String | Connection | scala.Null = js.native
  val BOF: scala.Boolean = js.native
  var Bookmark: Bookmark = js.native
  var CacheSize: scala.Double = js.native
  var CursorLocation: CursorLocationEnum = js.native
  var CursorType: CursorTypeEnum = js.native
  var DataMember: java.lang.String = js.native
  var DataSource: js.Any = js.native
  val EOF: scala.Boolean = js.native
  val EditMode: EditModeEnum = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  /**
           * Sets or returns one of the following:
           * * Criteria string — a string made up of one or more individual clauses concatenated with AND or OR operators.
           * * Array of bookmarks — an array of unique bookmark values that point to records in the Recordset object.
           * * A FilterGroupEnum value
           */
  var Filter: java.lang.String | activexDashInteropLib.SafeArray[Bookmark] | FilterGroupEnum = js.native
  var Index: java.lang.String = js.native
  var LockType: LockTypeEnum = js.native
  var MarshalOptions: MarshalOptionsEnum = js.native
  var MaxRecords: scala.Double = js.native
  val PageCount: scala.Double = js.native
  var PageSize: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: scala.Double = js.native
  var Sort: java.lang.String = js.native
  var Source: java.lang.String | Command = js.native
  val State: ObjectStateEnum = js.native
  val Status: scala.Double = js.native
  var StayInSync: scala.Boolean = js.native
  def apply(FieldIndex: java.lang.String): Field = js.native
  def apply(FieldIndex: scala.Double): Field = js.native
  def AddNew(): scala.Unit = js.native
  def AddNew(Field: java.lang.String, Value: js.Any): scala.Unit = js.native
  def AddNew(
    Fields: activexDashInteropLib.SafeArray[java.lang.String | scala.Double],
    Values: activexDashInteropLib.SafeArray[_]
  ): scala.Unit = js.native
  def Cancel(): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def CancelBatch(): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def CancelBatch(AffectRecords: AffectEnum): scala.Unit = js.native
  def CancelUpdate(): scala.Unit = js.native
  /** @param LockType [LockType=-1] */
  def Clone(): Recordset = js.native
  /** @param LockType [LockType=-1] */
  def Clone(LockType: LockTypeEnum): Recordset = js.native
  def Close(): scala.Unit = js.native
  def Collect(Index: js.Any): js.Any = js.native
  def CompareBookmarks(Bookmark1: Bookmark, Bookmark2: Bookmark): CompareEnum = js.native
  /** @param AffectRecords [AffectRecords=1] */
  def Delete(): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=1] */
  def Delete(AffectRecords: AffectEnum): scala.Unit = js.native
  def Fields(Index: java.lang.String): Field = js.native
  def Fields(Index: scala.Double): Field = js.native
  /**
           * @param SkipRecords [SkipRecords=0]
           * @param SearchDirection [SearchDirection=1]
           */
  def Find(Criteria: java.lang.String): scala.Unit = js.native
  /**
           * @param SkipRecords [SkipRecords=0]
           * @param SearchDirection [SearchDirection=1]
           */
  def Find(Criteria: java.lang.String, SkipRecords: scala.Double): scala.Unit = js.native
  /**
           * @param SkipRecords [SkipRecords=0]
           * @param SearchDirection [SearchDirection=1]
           */
  def Find(Criteria: java.lang.String, SkipRecords: scala.Double, SearchDirection: SearchDirectionEnum): scala.Unit = js.native
  /**
           * @param SkipRecords [SkipRecords=0]
           * @param SearchDirection [SearchDirection=1]
           */
  def Find(
    Criteria: java.lang.String,
    SkipRecords: scala.Double,
    SearchDirection: SearchDirectionEnum,
    Start: Bookmark
  ): scala.Unit = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: Bookmark): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: BookmarkEnum): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(
    Rows: scala.Double,
    Start: BookmarkEnum,
    Fields: activexDashInteropLib.SafeArray[java.lang.String | scala.Double]
  ): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: BookmarkEnum, Fields: java.lang.String): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(
    Rows: scala.Double,
    Start: Bookmark,
    Fields: activexDashInteropLib.SafeArray[java.lang.String | scala.Double]
  ): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: Bookmark, Fields: java.lang.String): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: java.lang.String): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(
    Rows: scala.Double,
    Start: java.lang.String,
    Fields: activexDashInteropLib.SafeArray[java.lang.String | scala.Double]
  ): activexDashInteropLib.SafeArray[_] = js.native
  /** @param Rows [Rows=-1] */
  def GetRows(Rows: scala.Double, Start: java.lang.String, Fields: java.lang.String): activexDashInteropLib.SafeArray[_] = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(): java.lang.String = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(StringFormat: StringFormatEnum): java.lang.String = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(StringFormat: StringFormatEnum, NumRows: scala.Double): java.lang.String = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(StringFormat: StringFormatEnum, NumRows: scala.Double, ColumnDelimeter: java.lang.String): java.lang.String = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: scala.Double,
    ColumnDelimeter: java.lang.String,
    RowDelimeter: java.lang.String
  ): java.lang.String = js.native
  /**
           * @param StringFormat [StringFormat=2]
           * @param NumRows [NumRows=-1]
           * @param ColumnDelimeter [ColumnDelimeter='']
           * @param RowDelimeter [RowDelimeter='']
           * @param NullExpr [NullExpr='']
           */
  def GetString(
    StringFormat: StringFormatEnum,
    NumRows: scala.Double,
    ColumnDelimeter: java.lang.String,
    RowDelimeter: java.lang.String,
    NullExpr: java.lang.String
  ): java.lang.String = js.native
  def Move(NumRecords: scala.Double): scala.Unit = js.native
  def Move(NumRecords: scala.Double, Start: Bookmark): scala.Unit = js.native
  def Move(NumRecords: scala.Double, Start: BookmarkEnum): scala.Unit = js.native
  def Move(NumRecords: scala.Double, Start: java.lang.String): scala.Unit = js.native
  def MoveFirst(): scala.Unit = js.native
  def MoveLast(): scala.Unit = js.native
  def MoveNext(): scala.Unit = js.native
  def MovePrevious(): scala.Unit = js.native
  /** Since Javascript doesn't support byref parameters, the RecordsAffected parameter cannot be used */
  def NextRecordset(): Recordset = js.native
  def Open(): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: Command): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: Command, ActiveConnection: scala.Null, CursorType: CursorTypeEnum): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: Command, ActiveConnection: scala.Null, CursorType: CursorTypeEnum, LockType: LockTypeEnum): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: Command,
    ActiveConnection: scala.Null,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: Command,
    ActiveConnection: scala.Null,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): scala.Unit = js.native
  def Open(Source: Stream): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: java.lang.String, ActiveConnection: Connection): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: java.lang.String, ActiveConnection: Connection, CursorType: CursorTypeEnum): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: Connection,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: java.lang.String, ActiveConnection: java.lang.String): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(Source: java.lang.String, ActiveConnection: java.lang.String, CursorType: CursorTypeEnum): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: java.lang.String,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: java.lang.String,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: CommandTypeEnum
  ): scala.Unit = js.native
  /**
           * @param CursorType [CursorType=-1]
           * @param LockType [LockType=-1]
           * @param Options [Options=-1]
           */
  def Open(
    Source: java.lang.String,
    ActiveConnection: java.lang.String,
    CursorType: CursorTypeEnum,
    LockType: LockTypeEnum,
    Options: ExecuteOptionEnum
  ): scala.Unit = js.native
  def Properties(Index: java.lang.String): Property = js.native
  def Properties(Index: scala.Double): Property = js.native
  /** @param Options [Options=-1] */
  def Requery(): scala.Unit = js.native
  /** @param Options [Options=-1] */
  def Requery(Options: scala.Double): scala.Unit = js.native
  /**
           * @param AffectRecords [AffectRecords=3]
           * @param ResyncValues [ResyncValues=2]
           */
  def Resync(): scala.Unit = js.native
  /**
           * @param AffectRecords [AffectRecords=3]
           * @param ResyncValues [ResyncValues=2]
           */
  def Resync(AffectRecords: AffectEnum): scala.Unit = js.native
  /**
           * @param AffectRecords [AffectRecords=3]
           * @param ResyncValues [ResyncValues=2]
           */
  def Resync(AffectRecords: AffectEnum, ResyncValues: ResyncEnum): scala.Unit = js.native
  /** @param PersistFormat [PersistFormat=0] */
  def Save(Destination: Stream): scala.Unit = js.native
  /** @param PersistFormat [PersistFormat=0] */
  def Save(Destination: Stream, PersistFormat: PersistFormatEnum): scala.Unit = js.native
  /** @param PersistFormat [PersistFormat=0] */
  def Save(Destination: java.lang.String): scala.Unit = js.native
  /** @param PersistFormat [PersistFormat=0] */
  def Save(Destination: java.lang.String, PersistFormat: PersistFormatEnum): scala.Unit = js.native
  /**
           * @param SeekOption [SeekOption=1]
           *
           * For a single-column index, pass in a single value to seek in the column of the index
           *
           * For a multi-column index, pass in a SafeArray containing the multiple values to seek in the columns of the index.
           */
  def Seek(KeyValues: js.Any): scala.Unit = js.native
  /**
           * @param SeekOption [SeekOption=1]
           *
           * For a single-column index, pass in a single value to seek in the column of the index
           *
           * For a multi-column index, pass in a SafeArray containing the multiple values to seek in the columns of the index.
           */
  def Seek(KeyValues: js.Any, SeekOption: SeekEnum): scala.Unit = js.native
  def Supports(CursorOptions: CursorOptionEnum): scala.Boolean = js.native
  def Update(): scala.Unit = js.native
  def Update(Field: java.lang.String, Value: js.Any): scala.Unit = js.native
  def Update(
    Fields: activexDashInteropLib.SafeArray[java.lang.String | scala.Double],
    Values: activexDashInteropLib.SafeArray[_]
  ): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def UpdateBatch(): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def UpdateBatch(AffectRecords: AffectEnum): scala.Unit = js.native
  def _xClone(): Recordset = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def _xResync(): scala.Unit = js.native
  /** @param AffectRecords [AffectRecords=3] */
  def _xResync(AffectRecords: AffectEnum): scala.Unit = js.native
  /**
           * @param FileName [FileName='']
           * @param PersistFormat [PersistFormat=0]
           */
  def _xSave(): scala.Unit = js.native
  /**
           * @param FileName [FileName='']
           * @param PersistFormat [PersistFormat=0]
           */
  def _xSave(FileName: java.lang.String): scala.Unit = js.native
  /**
           * @param FileName [FileName='']
           * @param PersistFormat [PersistFormat=0]
           */
  def _xSave(FileName: java.lang.String, PersistFormat: PersistFormatEnum): scala.Unit = js.native
}

