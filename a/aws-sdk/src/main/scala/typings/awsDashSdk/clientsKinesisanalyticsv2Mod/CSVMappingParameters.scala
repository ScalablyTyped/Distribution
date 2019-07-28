package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVMappingParameters extends js.Object {
  /**
    * The column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordColumnDelimiter
  /**
    * The row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordRowDelimiter
}

object CSVMappingParameters {
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter, RecordRowDelimiter = RecordRowDelimiter)
  
    __obj.asInstanceOf[CSVMappingParameters]
  }
}

