package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminologyData extends js.Object {
  /**
    * The file containing the custom terminology data.
    */
  var File: TerminologyFile
  /**
    * The data format of the custom terminology. Either CSV or TMX.
    */
  var Format: TerminologyDataFormat
}

object TerminologyData {
  @scala.inline
  def apply(File: TerminologyFile, Format: TerminologyDataFormat): TerminologyData = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TerminologyData]
  }
}

