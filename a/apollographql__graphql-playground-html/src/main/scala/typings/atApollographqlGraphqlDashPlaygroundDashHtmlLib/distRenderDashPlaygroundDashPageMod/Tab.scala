package typings
package atApollographqlGraphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  var endpoint: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var query: java.lang.String
  var responses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var variables: js.UndefOr[java.lang.String] = js.undefined
}

object Tab {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    query: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    responses: js.Array[java.lang.String] = null,
    variables: java.lang.String = null
  ): Tab = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, query = query)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (responses != null) __obj.updateDynamic("responses")(responses)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Tab]
  }
}

