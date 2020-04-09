package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KCLInput extends js.Object {
  var recordProcessor: RecordProcessor
  var version: js.Symbol
}

object KCLInput {
  @scala.inline
  def apply(recordProcessor: RecordProcessor, version: js.Symbol): KCLInput = {
    val __obj = js.Dynamic.literal(recordProcessor = recordProcessor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KCLInput]
  }
}

