package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recordset extends js.Object {
  var AbsolutePosition: scala.Double = js.native
  val BOF: scala.Boolean = js.native
  val BatchCollisionCount: scala.Double = js.native
  val BatchCollisions: activexDashInteropLib.SafeArray[Bookmark] = js.native
  var BatchSize: scala.Double = js.native
  var Bookmark: Bookmark = js.native
  val Bookmarkable: scala.Boolean = js.native
  var CacheSize: scala.Double = js.native
  var CacheStart: Bookmark = js.native
  var Connection: Connection = js.native
  val DateCreated: activexDashInteropLib.VarDate = js.native
  val EOF: scala.Boolean = js.native
  val EditMode: EditModeEnum = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  var Filter: java.lang.String = js.native
  var Index: java.lang.String = js.native
  val LastModified: Bookmark = js.native
  val LastUpdated: activexDashInteropLib.VarDate = js.native
  var LockEdits: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val NoMatch: scala.Boolean = js.native
  val ODBCFetchCount: scala.Double = js.native
  val ODBCFetchDelay: scala.Double = js.native
  val Parent: Database = js.native
  var PercentPosition: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val RecordCount: scala.Double = js.native
  val RecordStatus: scala.Double = js.native
  val Restartable: scala.Boolean = js.native
  var Sort: java.lang.String = js.native
  val StillExecuting: scala.Boolean = js.native
  val Transactions: scala.Boolean = js.native
  val Type: RecordsetTypeEnum = js.native
  val Updatable: scala.Boolean = js.native
  var UpdateOptions: UpdateCriteriaEnum = js.native
  val ValidationRule: java.lang.String = js.native
  val ValidationText: java.lang.String = js.native
  val hStmt: scala.Double = js.native
  def apply(FieldIndex: java.lang.String): Field = js.native
  def apply(FieldIndex: scala.Double): Field = js.native
  def AddNew(): scala.Unit = js.native
  def Cancel(): scala.Unit = js.native
  /** @param UpdateType [UpdateType=1] */
  def CancelUpdate(): scala.Unit = js.native
  def CancelUpdate(UpdateType: scala.Double): scala.Unit = js.native
  def Clone(): Recordset = js.native
  def Close(): scala.Unit = js.native
  def Collect(Item: js.Any): js.Any = js.native
  def CopyQueryDef(): QueryDef = js.native
  def Delete(): scala.Unit = js.native
  def Edit(): scala.Unit = js.native
  def Fields(Item: java.lang.String): Field = js.native
  def Fields(Item: scala.Double): Field = js.native
  def FillCache(): scala.Unit = js.native
  def FillCache(Rows: scala.Double): scala.Unit = js.native
  def FillCache(Rows: scala.Double, StartBookmark: java.lang.String): scala.Unit = js.native
  def FindFirst(Criteria: java.lang.String): scala.Unit = js.native
  def FindLast(Criteria: java.lang.String): scala.Unit = js.native
  def FindNext(Criteria: java.lang.String): scala.Unit = js.native
  def FindPrevious(Criteria: java.lang.String): scala.Unit = js.native
  def GetRows(): js.Any = js.native
  def GetRows(NumRows: scala.Double): js.Any = js.native
  def Move(Rows: scala.Double): scala.Unit = js.native
  def Move(Rows: scala.Double, StartBookmark: Bookmark): scala.Unit = js.native
  def MoveFirst(): scala.Unit = js.native
  /** @param Options [Options=0] */
  def MoveLast(): scala.Unit = js.native
  def MoveLast(Options: scala.Double): scala.Unit = js.native
  def MoveNext(): scala.Unit = js.native
  def MovePrevious(): scala.Unit = js.native
  def NextRecordset(): scala.Boolean = js.native
  def OpenRecordset(): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum): Recordset = js.native
  def OpenRecordset(Type: RecordsetTypeEnum, Options: RecordsetOptionEnum): Recordset = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
  def Requery(): scala.Unit = js.native
  def Requery(NewQueryDef: QueryDef): scala.Unit = js.native
  def Seek(
    Comparison: java.lang.String,
    Key1: js.Any,
    Key2: js.UndefOr[js.Any],
    Key3: js.UndefOr[js.Any],
    Key4: js.UndefOr[js.Any],
    Key5: js.UndefOr[js.Any],
    Key6: js.UndefOr[js.Any],
    Key7: js.UndefOr[js.Any],
    Key8: js.UndefOr[js.Any],
    Key9: js.UndefOr[js.Any],
    Key10: js.UndefOr[js.Any],
    Key11: js.UndefOr[js.Any],
    Key12: js.UndefOr[js.Any],
    Key13: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /**
    * @param UpdateType [UpdateType=1]
    * @param Force [Force=false]
    */
  def Update(): scala.Unit = js.native
  def Update(UpdateType: UpdateTypeEnum): scala.Unit = js.native
  def Update(UpdateType: UpdateTypeEnum, Force: scala.Boolean): scala.Unit = js.native
}

