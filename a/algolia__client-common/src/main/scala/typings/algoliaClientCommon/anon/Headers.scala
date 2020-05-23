package typings.algoliaClientCommon.anon

import typings.algoliaTransporter.mod.HostOptions
import typings.algoliaTransporter.mod.QueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  /**
    * The headers used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val headers: js.UndefOr[typings.algoliaTransporter.mod.Headers] = js.undefined
  /**
    * The hosts used by the requester.
    */
  val hosts: js.UndefOr[js.Array[HostOptions]] = js.undefined
  /**
    * The query parameters used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val queryParameters: js.UndefOr[QueryParameters] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    headers: typings.algoliaTransporter.mod.Headers = null,
    hosts: js.Array[HostOptions] = null,
    queryParameters: QueryParameters = null
  ): Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

