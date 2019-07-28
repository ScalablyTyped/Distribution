package typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  var endpoint: String
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var query: String
  var responses: js.UndefOr[js.Array[String]] = js.undefined
  var variables: js.UndefOr[String] = js.undefined
}

object Tab {
  @scala.inline
  def apply(
    endpoint: String,
    query: String,
    headers: StringDictionary[String] = null,
    name: String = null,
    responses: js.Array[String] = null,
    variables: String = null
  ): Tab = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, query = query)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (name != null) __obj.updateDynamic("name")(name)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Tab]
  }
}

