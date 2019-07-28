package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.Anon_Instance
import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateLinkingFunctionOptions extends js.Object {
  var futureParentElement: js.UndefOr[JQuery] = js.undefined
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.undefined
  var transcludeControllers: js.UndefOr[StringDictionary[Anon_Instance]] = js.undefined
}

object ITemplateLinkingFunctionOptions {
  @scala.inline
  def apply(
    futureParentElement: JQuery = null,
    parentBoundTranscludeFn: ITranscludeFunction = null,
    transcludeControllers: StringDictionary[Anon_Instance] = null
  ): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (futureParentElement != null) __obj.updateDynamic("futureParentElement")(futureParentElement)
    if (parentBoundTranscludeFn != null) __obj.updateDynamic("parentBoundTranscludeFn")(parentBoundTranscludeFn)
    if (transcludeControllers != null) __obj.updateDynamic("transcludeControllers")(transcludeControllers)
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
}

