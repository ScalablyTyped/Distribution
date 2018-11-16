package typings
package awsDashSdkLib.libConfigUnderscoreUseUnderscoreDualstackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UseDualstackConfigOptions extends js.Object {
  /**
       * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. 
       * In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. 
       * Note, however, that currently on Windows, the IPv4 address will be preferred.
       */
  var useDualStack: js.UndefOr[scala.Boolean] = js.undefined
}

