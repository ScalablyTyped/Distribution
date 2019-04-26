package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScriptInput extends js.Object {
  /**
    * Unique identifier for a Realtime script to delete.
    */
  var ScriptId: awsDashSdkLib.clientsGameliftMod.ScriptId
}

object DeleteScriptInput {
  @scala.inline
  def apply(ScriptId: ScriptId): DeleteScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId)
  
    __obj.asInstanceOf[DeleteScriptInput]
  }
}

