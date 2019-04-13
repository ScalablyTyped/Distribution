package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFileUriValue extends js.Object {
  /**
    * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
    */
  var fileName: OutputFileName
}

object OutputFileUriValue {
  @scala.inline
  def apply(fileName: OutputFileName): OutputFileUriValue = {
    val __obj = js.Dynamic.literal(fileName = fileName)
  
    __obj.asInstanceOf[OutputFileUriValue]
  }
}

