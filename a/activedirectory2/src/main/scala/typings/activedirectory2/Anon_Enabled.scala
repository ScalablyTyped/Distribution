package typings.activedirectory2

import typings.activedirectory2.activedirectory2Booleans.`false`
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: `false`
  var exclude: js.Tuple3[
    ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
    ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
    ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
  ]
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: `false`,
    exclude: js.Tuple3[
      ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
      ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
      ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
    ]
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Enabled]
  }
}

