package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.MailMergeDataSource")
@js.native
class MailMergeDataSource protected () extends js.Object {
  var ActiveRecord: WdMailMergeActiveRecord = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  val ConnectString: java.lang.String = js.native
  val Creator: scala.Double = js.native
  val DataFields: MailMergeDataFields = js.native
  val FieldNames: MailMergeFieldNames = js.native
  var FirstRecord: scala.Double = js.native
  val HeaderSourceName: java.lang.String = js.native
  val HeaderSourceType: WdMailMergeDataSource = js.native
  var Included: scala.Boolean = js.native
  var InvalidAddress: scala.Boolean = js.native
  var InvalidComments: java.lang.String = js.native
  var LastRecord: scala.Double = js.native
  val MappedDataFields: activexDashWordLib.WordNs.MappedDataFields = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var QueryString: java.lang.String = js.native
  val RecordCount: scala.Double = js.native
  val TableName: java.lang.String = js.native
  val Type: WdMailMergeDataSource = js.native
  var `Word.MailMergeDataSource_typekey`: MailMergeDataSource = js.native
  def Close(): scala.Unit = js.native
  def FindRecord(FindText: java.lang.String): scala.Boolean = js.native
  def FindRecord(FindText: java.lang.String, Field: js.Any): scala.Boolean = js.native
  def FindRecord2000(FindText: java.lang.String, Field: java.lang.String): scala.Boolean = js.native
  def SetAllErrorFlags(Invalid: scala.Boolean, InvalidComment: java.lang.String): scala.Unit = js.native
  def SetAllIncludedFlags(Included: scala.Boolean): scala.Unit = js.native
}

