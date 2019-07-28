package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScriptRequest extends js.Object {
  /**
    * A list of the edges in the DAG.
    */
  var DagEdges: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagEdges] = js.undefined
  /**
    * A list of the nodes in the DAG.
    */
  var DagNodes: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DagNodes] = js.undefined
  /**
    * The programming language of the resulting code from the DAG.
    */
  var Language: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Language] = js.undefined
}

object CreateScriptRequest {
  @scala.inline
  def apply(DagEdges: DagEdges = null, DagNodes: DagNodes = null, Language: Language = null): CreateScriptRequest = {
    val __obj = js.Dynamic.literal()
    if (DagEdges != null) __obj.updateDynamic("DagEdges")(DagEdges)
    if (DagNodes != null) __obj.updateDynamic("DagNodes")(DagNodes)
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScriptRequest]
  }
}

