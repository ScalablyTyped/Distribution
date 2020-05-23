package typings.activedirectory2.mod

import typings.activedirectory2.activedirectory2Numbers.`0`
import typings.activedirectory2.activedirectory2Numbers.`10`
import typings.activedirectory2.activedirectory2Strings.base
import typings.activedirectory2.activedirectory2Strings.one
import typings.activedirectory2.activedirectory2Strings.sub
import typings.activedirectory2.anon.Ca
import typings.ldapjs.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqProps extends LDAPjsReqProps {
  var attributes: AttributeSpec
  var baseDN: js.UndefOr[String] = js.undefined
  var bindCredentials: js.UndefOr[String] = js.undefined
  var bindDN: js.UndefOr[String] = js.undefined
  var filter: String | Filter
  var includeMembership: js.Array[MembershipType]
  var scope: js.UndefOr[base | one | sub] = js.undefined
  var sizeLimit: `0`
  var timeLimit: `10`
}

object ReqProps {
  @scala.inline
  def apply(
    attributes: AttributeSpec,
    filter: String | Filter,
    includeMembership: js.Array[MembershipType],
    sizeLimit: `0`,
    timeLimit: `10`,
    tlsOptions: Ca,
    url: String,
    baseDN: String = null,
    bindCredentials: String = null,
    bindDN: String = null,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    log: js.Any = null,
    scope: base | one | sub = null,
    socketPath: String = null,
    strictDN: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ReqProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], includeMembership = includeMembership.asInstanceOf[js.Any], sizeLimit = sizeLimit.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (baseDN != null) __obj.updateDynamic("baseDN")(baseDN.asInstanceOf[js.Any])
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials.asInstanceOf[js.Any])
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqProps]
  }
}

