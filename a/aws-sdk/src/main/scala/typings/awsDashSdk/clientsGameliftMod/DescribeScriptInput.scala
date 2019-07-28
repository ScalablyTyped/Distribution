package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScriptInput extends js.Object {
  /**
    * Unique identifier for a Realtime script to retrieve properties for.
    */
  var ScriptId: typings.awsDashSdk.clientsGameliftMod.ScriptId
}

object DescribeScriptInput {
  @scala.inline
  def apply(ScriptId: ScriptId): DescribeScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId)
  
    __obj.asInstanceOf[DescribeScriptInput]
  }
}

