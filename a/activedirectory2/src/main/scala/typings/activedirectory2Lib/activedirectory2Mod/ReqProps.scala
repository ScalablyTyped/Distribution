package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqProps extends LDAPjsReqProps {
  var attributes: AttributeSpec
  var baseDN: js.UndefOr[java.lang.String] = js.undefined
  var bindCredentials: js.UndefOr[java.lang.String] = js.undefined
  var bindDN: js.UndefOr[java.lang.String] = js.undefined
  var filter: java.lang.String | ldapjsLib.ldapjsMod.Filter
  var includeMembership: js.Array[activedirectory2Lib.MembershipType]
  var scope: js.UndefOr[
    activedirectory2Lib.activedirectory2LibStrings.base | activedirectory2Lib.activedirectory2LibStrings.one | activedirectory2Lib.activedirectory2LibStrings.sub
  ] = js.undefined
  var sizeLimit: activedirectory2Lib.activedirectory2LibNumbers.`0`
  var timeLimit: activedirectory2Lib.activedirectory2LibNumbers.`10`
}

object ReqProps {
  @scala.inline
  def apply(
    attributes: AttributeSpec,
    filter: java.lang.String | ldapjsLib.ldapjsMod.Filter,
    includeMembership: js.Array[activedirectory2Lib.MembershipType],
    sizeLimit: activedirectory2Lib.activedirectory2LibNumbers.`0`,
    timeLimit: activedirectory2Lib.activedirectory2LibNumbers.`10`,
    tlsOptions: activedirectory2Lib.Anon_Ca,
    url: java.lang.String,
    baseDN: java.lang.String = null,
    bindCredentials: java.lang.String = null,
    bindDN: java.lang.String = null,
    connectionTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    log: js.Any = null,
    scope: activedirectory2Lib.activedirectory2LibStrings.base | activedirectory2Lib.activedirectory2LibStrings.one | activedirectory2Lib.activedirectory2LibStrings.sub = null,
    socketPath: java.lang.String = null,
    strictDN: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): ReqProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.updateDynamic("includeMembership")(includeMembership)
    __obj.updateDynamic("sizeLimit")(sizeLimit)
    __obj.updateDynamic("timeLimit")(timeLimit)
    __obj.updateDynamic("tlsOptions")(tlsOptions)
    __obj.updateDynamic("url")(url)
    if (baseDN != null) __obj.updateDynamic("baseDN")(baseDN)
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials)
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqProps]
  }
}

