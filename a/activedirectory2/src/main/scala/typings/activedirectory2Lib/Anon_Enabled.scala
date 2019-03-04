package typings
package activedirectory2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: activedirectory2Lib.activedirectory2LibNumbers.`false`
  var exclude: js.Tuple3[
    activedirectory2Lib.activedirectory2LibStrings.`ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
    activedirectory2Lib.activedirectory2LibStrings.`ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
    activedirectory2Lib.activedirectory2LibStrings.`ldaps?://DOT*/CN=Configuration,DOT*`
  ]
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: activedirectory2Lib.activedirectory2LibNumbers.`false`,
    exclude: js.Tuple3[
      activedirectory2Lib.activedirectory2LibStrings.`ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
      activedirectory2Lib.activedirectory2LibStrings.`ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`, 
      activedirectory2Lib.activedirectory2LibStrings.`ldaps?://DOT*/CN=Configuration,DOT*`
    ]
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled, exclude = exclude)
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

