package typings.activedirectory2

import typings.activedirectory2.mod.GroupAttributes
import typings.activedirectory2.mod.MembershipType
import typings.activedirectory2.mod.UserAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activedirectory2Strings {
  
  @js.native
  sealed trait all
    extends StObject
       with MembershipType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait cn
    extends StObject
       with GroupAttributes
       with UserAttributes
  inline def cn: cn = "cn".asInstanceOf[cn]
  
  @js.native
  sealed trait comment
    extends StObject
       with UserAttributes
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait description
    extends StObject
       with GroupAttributes
       with UserAttributes
  inline def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait displayName
    extends StObject
       with UserAttributes
  inline def displayName: displayName = "displayName".asInstanceOf[displayName]
  
  @js.native
  sealed trait distinguishedName
    extends StObject
       with GroupAttributes
       with UserAttributes
  inline def distinguishedName: distinguishedName = "distinguishedName".asInstanceOf[distinguishedName]
  
  @js.native
  sealed trait dn extends StObject
  inline def dn: dn = "dn".asInstanceOf[dn]
  
  @js.native
  sealed trait employeeID
    extends StObject
       with UserAttributes
  inline def employeeID: employeeID = "employeeID".asInstanceOf[employeeID]
  
  @js.native
  sealed trait givenName
    extends StObject
       with UserAttributes
  inline def givenName: givenName = "givenName".asInstanceOf[givenName]
  
  @js.native
  sealed trait group
    extends StObject
       with MembershipType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait initials
    extends StObject
       with UserAttributes
  inline def initials: initials = "initials".asInstanceOf[initials]
  
  @js.native
  sealed trait ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk extends StObject
  inline def ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk: ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk = "ldaps?://.*/CN=Configuration,.*".asInstanceOf[ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk]
  
  @js.native
  sealed trait lockoutTime
    extends StObject
       with UserAttributes
  inline def lockoutTime: lockoutTime = "lockoutTime".asInstanceOf[lockoutTime]
  
  @js.native
  sealed trait mail
    extends StObject
       with UserAttributes
  inline def mail: mail = "mail".asInstanceOf[mail]
  
  @js.native
  sealed trait objectCategory
    extends StObject
       with GroupAttributes
  inline def objectCategory: objectCategory = "objectCategory".asInstanceOf[objectCategory]
  
  @js.native
  sealed trait one extends StObject
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait pwdLastSet
    extends StObject
       with UserAttributes
  inline def pwdLastSet: pwdLastSet = "pwdLastSet".asInstanceOf[pwdLastSet]
  
  @js.native
  sealed trait sAMAccountName
    extends StObject
       with UserAttributes
  inline def sAMAccountName: sAMAccountName = "sAMAccountName".asInstanceOf[sAMAccountName]
  
  @js.native
  sealed trait sn
    extends StObject
       with UserAttributes
  inline def sn: sn = "sn".asInstanceOf[sn]
  
  @js.native
  sealed trait sub extends StObject
  inline def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait user
    extends StObject
       with MembershipType
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait userAccountControl
    extends StObject
       with UserAttributes
  inline def userAccountControl: userAccountControl = "userAccountControl".asInstanceOf[userAccountControl]
  
  @js.native
  sealed trait userPrincipalName
    extends StObject
       with UserAttributes
  inline def userPrincipalName: userPrincipalName = "userPrincipalName".asInstanceOf[userPrincipalName]
  
  @js.native
  sealed trait whenCreated
    extends StObject
       with UserAttributes
  inline def whenCreated: whenCreated = "whenCreated".asInstanceOf[whenCreated]
}
