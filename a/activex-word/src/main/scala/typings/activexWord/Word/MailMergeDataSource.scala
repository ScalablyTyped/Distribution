package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeDataSource extends StObject {
  
  var ActiveRecord: WdMailMergeActiveRecord = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Close(): Unit = js.native
  
  val ConnectString: String = js.native
  
  val Creator: Double = js.native
  
  val DataFields: MailMergeDataFields = js.native
  
  val FieldNames: MailMergeFieldNames = js.native
  
  def FindRecord(FindText: String): Boolean = js.native
  def FindRecord(FindText: String, Field: js.Any): Boolean = js.native
  
  def FindRecord2000(FindText: String, Field: String): Boolean = js.native
  
  var FirstRecord: Double = js.native
  
  val HeaderSourceName: String = js.native
  
  val HeaderSourceType: WdMailMergeDataSource = js.native
  
  var Included: Boolean = js.native
  
  var InvalidAddress: Boolean = js.native
  
  var InvalidComments: String = js.native
  
  var LastRecord: Double = js.native
  
  val MappedDataFields: typings.activexWord.Word.MappedDataFields = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  var QueryString: String = js.native
  
  val RecordCount: Double = js.native
  
  def SetAllErrorFlags(Invalid: Boolean, InvalidComment: String): Unit = js.native
  
  def SetAllIncludedFlags(Included: Boolean): Unit = js.native
  
  val TableName: String = js.native
  
  val Type: WdMailMergeDataSource = js.native
  
  @JSName("Word.MailMergeDataSource_typekey")
  var WordDotMailMergeDataSource_typekey: MailMergeDataSource = js.native
}
