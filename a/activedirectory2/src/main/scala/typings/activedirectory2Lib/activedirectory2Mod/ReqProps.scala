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

