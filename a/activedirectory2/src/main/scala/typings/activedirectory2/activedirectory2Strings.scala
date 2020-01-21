package typings.activedirectory2

import typings.activedirectory2.mod.GroupAttributes
import typings.activedirectory2.mod.MembershipType
import typings.activedirectory2.mod.UserAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object activedirectory2Strings {
  @js.native
  sealed trait all extends MembershipType
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait cn
    extends GroupAttributes
       with UserAttributes
  
  @js.native
  sealed trait comment extends UserAttributes
  
  @js.native
  sealed trait description
    extends GroupAttributes
       with UserAttributes
  
  @js.native
  sealed trait displayName extends UserAttributes
  
  @js.native
  sealed trait distinguishedName
    extends GroupAttributes
       with UserAttributes
  
  @js.native
  sealed trait dn extends js.Object
  
  @js.native
  sealed trait employeeID extends UserAttributes
  
  @js.native
  sealed trait givenName extends UserAttributes
  
  @js.native
  sealed trait group extends MembershipType
  
  @js.native
  sealed trait initials extends UserAttributes
  
  @js.native
  sealed trait ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk extends js.Object
  
  @js.native
  sealed trait ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk extends js.Object
  
  @js.native
  sealed trait ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk extends js.Object
  
  @js.native
  sealed trait lockoutTime extends UserAttributes
  
  @js.native
  sealed trait mail extends UserAttributes
  
  @js.native
  sealed trait objectCategory extends GroupAttributes
  
  @js.native
  sealed trait one extends js.Object
  
  @js.native
  sealed trait pwdLastSet extends UserAttributes
  
  @js.native
  sealed trait sAMAccountName extends UserAttributes
  
  @js.native
  sealed trait sn extends UserAttributes
  
  @js.native
  sealed trait sub extends js.Object
  
  @js.native
  sealed trait user extends MembershipType
  
  @js.native
  sealed trait userAccountControl extends UserAttributes
  
  @js.native
  sealed trait userPrincipalName extends UserAttributes
  
  @js.native
  sealed trait whenCreated extends UserAttributes
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def cn: cn = "cn".asInstanceOf[cn]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  @scala.inline
  def displayName: displayName = "displayName".asInstanceOf[displayName]
  @scala.inline
  def distinguishedName: distinguishedName = "distinguishedName".asInstanceOf[distinguishedName]
  @scala.inline
  def dn: dn = "dn".asInstanceOf[dn]
  @scala.inline
  def employeeID: employeeID = "employeeID".asInstanceOf[employeeID]
  @scala.inline
  def givenName: givenName = "givenName".asInstanceOf[givenName]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def initials: initials = "initials".asInstanceOf[initials]
  @scala.inline
  def ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk: ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk = "ldaps?://DomainDnsZones\\..*/.*".asInstanceOf[ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk]
  @scala.inline
  def ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk: ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk = "ldaps?://.*/CN=Configuration,.*".asInstanceOf[ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk]
  @scala.inline
  def ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk: ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk = "ldaps?://ForestDnsZones\\..*/.*".asInstanceOf[ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk]
  @scala.inline
  def lockoutTime: lockoutTime = "lockoutTime".asInstanceOf[lockoutTime]
  @scala.inline
  def mail: mail = "mail".asInstanceOf[mail]
  @scala.inline
  def objectCategory: objectCategory = "objectCategory".asInstanceOf[objectCategory]
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  @scala.inline
  def pwdLastSet: pwdLastSet = "pwdLastSet".asInstanceOf[pwdLastSet]
  @scala.inline
  def sAMAccountName: sAMAccountName = "sAMAccountName".asInstanceOf[sAMAccountName]
  @scala.inline
  def sn: sn = "sn".asInstanceOf[sn]
  @scala.inline
  def sub: sub = "sub".asInstanceOf[sub]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def userAccountControl: userAccountControl = "userAccountControl".asInstanceOf[userAccountControl]
  @scala.inline
  def userPrincipalName: userPrincipalName = "userPrincipalName".asInstanceOf[userPrincipalName]
  @scala.inline
  def whenCreated: whenCreated = "whenCreated".asInstanceOf[whenCreated]
}

