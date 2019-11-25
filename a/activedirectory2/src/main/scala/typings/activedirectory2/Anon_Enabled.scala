package typings.activedirectory2

import typings.activedirectory2.activedirectory2Numbers.`false`
import typings.activedirectory2.activedirectory2Strings.`ldaps?://DOT*/CN=Configuration,DOT*`
import typings.activedirectory2.activedirectory2Strings.`ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`
import typings.activedirectory2.activedirectory2Strings.`ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: `false`
  var exclude: js.Tuple3[
    `ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
    `ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
    `ldaps?://DOT*/CN=Configuration,DOT*`
  ]
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: `false`,
    exclude: js.Tuple3[
      `ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
      `ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
      `ldaps?://DOT*/CN=Configuration,DOT*`
    ]
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

