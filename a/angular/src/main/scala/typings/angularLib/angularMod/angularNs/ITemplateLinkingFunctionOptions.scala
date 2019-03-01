package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateLinkingFunctionOptions extends js.Object {
  var futureParentElement: js.UndefOr[angularLib.JQuery] = js.undefined
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.undefined
  var transcludeControllers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[angularLib.Anon_Instance]] = js.undefined
}

object ITemplateLinkingFunctionOptions {
  @scala.inline
  def apply(
    futureParentElement: angularLib.JQuery = null,
    parentBoundTranscludeFn: ITranscludeFunction = null,
    transcludeControllers: org.scalablytyped.runtime.StringDictionary[angularLib.Anon_Instance] = null
  ): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (futureParentElement != null) __obj.updateDynamic("futureParentElement")(futureParentElement)
    if (parentBoundTranscludeFn != null) __obj.updateDynamic("parentBoundTranscludeFn")(parentBoundTranscludeFn)
    if (transcludeControllers != null) __obj.updateDynamic("transcludeControllers")(transcludeControllers)
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
}

