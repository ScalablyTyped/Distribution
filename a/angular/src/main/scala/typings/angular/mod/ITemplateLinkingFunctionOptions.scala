package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.AnonInstance
import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateLinkingFunctionOptions extends js.Object {
  var futureParentElement: js.UndefOr[JQuery] = js.undefined
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.undefined
  var transcludeControllers: js.UndefOr[StringDictionary[AnonInstance]] = js.undefined
}

object ITemplateLinkingFunctionOptions {
  @scala.inline
  def apply(
    futureParentElement: JQuery = null,
    parentBoundTranscludeFn: ITranscludeFunction = null,
    transcludeControllers: StringDictionary[AnonInstance] = null
  ): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (futureParentElement != null) __obj.updateDynamic("futureParentElement")(futureParentElement.asInstanceOf[js.Any])
    if (parentBoundTranscludeFn != null) __obj.updateDynamic("parentBoundTranscludeFn")(parentBoundTranscludeFn.asInstanceOf[js.Any])
    if (transcludeControllers != null) __obj.updateDynamic("transcludeControllers")(transcludeControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
}

