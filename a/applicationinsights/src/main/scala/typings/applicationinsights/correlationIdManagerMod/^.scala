package typings.applicationinsights.correlationIdManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/CorrelationIdManager", JSImport.Namespace)
@js.native
class ^ () extends CorrelationIdManager

@JSImport("applicationinsights/out/Library/CorrelationIdManager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var TAG: js.Any = js.native
  var completedLookups: js.Any = js.native
  var correlationIdPrefix: String = js.native
  var currentRootId: js.Any = js.native
  var pendingLookups: js.Any = js.native
  var requestIdMaxLength: js.Any = js.native
  var w3cEnabled: Boolean = js.native
  /* private */ def appendSuffix(parentId: js.Any, suffix: js.Any, delimiter: js.Any): js.Any = js.native
  def cancelCorrelationIdQuery(
    config: typings.applicationinsights.configMod.^,
    callback: js.Function1[/* correlationId */ String, Unit]
  ): Unit = js.native
  /**
    * Generate a request Id according to https://github.com/lmolkova/correlation/blob/master/hierarchical_request_id.md
    * @param parentId
    */
  def generateRequestId(parentId: String): String = js.native
  /* private */ def generateRootId(): js.Any = js.native
  /**
    * Given a hierarchical identifier of the form |X.*
    * return the root identifier X
    * @param id
    */
  def getRootId(id: String): String = js.native
  def queryCorrelationId(
    config: typings.applicationinsights.configMod.^,
    callback: js.Function1[/* correlationId */ String, Unit]
  ): Unit = js.native
}

