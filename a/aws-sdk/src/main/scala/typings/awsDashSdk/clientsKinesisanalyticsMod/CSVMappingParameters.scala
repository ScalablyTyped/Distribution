package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVMappingParameters extends js.Object {
  /**
    * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typings.awsDashSdk.clientsKinesisanalyticsMod.RecordColumnDelimiter
  /**
    * Row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typings.awsDashSdk.clientsKinesisanalyticsMod.RecordRowDelimiter
}

object CSVMappingParameters {
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter, RecordRowDelimiter = RecordRowDelimiter)
  
    __obj.asInstanceOf[CSVMappingParameters]
  }
}

