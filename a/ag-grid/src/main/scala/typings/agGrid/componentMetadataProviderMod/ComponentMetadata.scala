package typings.agGrid.componentMetadataProviderMod

import typings.agGrid.AnonAny
import typings.agGrid.componentProviderMod.AgGridComponentFunctionInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentMetadata extends js.Object {
  var functionAdapter: js.UndefOr[js.Function1[/* callback */ AgGridComponentFunctionInput, AnonAny]] = js.undefined
  var mandatoryMethodList: js.Array[String]
  var optionalMethodList: js.Array[String]
}

object ComponentMetadata {
  @scala.inline
  def apply(
    mandatoryMethodList: js.Array[String],
    optionalMethodList: js.Array[String],
    functionAdapter: /* callback */ AgGridComponentFunctionInput => AnonAny = null
  ): ComponentMetadata = {
    val __obj = js.Dynamic.literal(mandatoryMethodList = mandatoryMethodList.asInstanceOf[js.Any], optionalMethodList = optionalMethodList.asInstanceOf[js.Any])
    if (functionAdapter != null) __obj.updateDynamic("functionAdapter")(js.Any.fromFunction1(functionAdapter))
    __obj.asInstanceOf[ComponentMetadata]
  }
}

