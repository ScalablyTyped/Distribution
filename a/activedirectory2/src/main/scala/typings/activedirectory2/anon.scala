package typings.activedirectory2

import typings.activedirectory2.activedirectory2Booleans.`false`
import typings.activedirectory2.activedirectory2Strings.cn
import typings.activedirectory2.activedirectory2Strings.comment
import typings.activedirectory2.activedirectory2Strings.description
import typings.activedirectory2.activedirectory2Strings.displayName
import typings.activedirectory2.activedirectory2Strings.distinguishedName
import typings.activedirectory2.activedirectory2Strings.dn
import typings.activedirectory2.activedirectory2Strings.employeeID
import typings.activedirectory2.activedirectory2Strings.givenName
import typings.activedirectory2.activedirectory2Strings.initials
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
import typings.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk
import typings.activedirectory2.activedirectory2Strings.lockoutTime
import typings.activedirectory2.activedirectory2Strings.mail
import typings.activedirectory2.activedirectory2Strings.objectCategory
import typings.activedirectory2.activedirectory2Strings.pwdLastSet
import typings.activedirectory2.activedirectory2Strings.sAMAccountName
import typings.activedirectory2.activedirectory2Strings.sn
import typings.activedirectory2.activedirectory2Strings.userAccountControl
import typings.activedirectory2.activedirectory2Strings.userPrincipalName
import typings.activedirectory2.activedirectory2Strings.whenCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ca extends StObject {
    
    var ca: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: Boolean
  }
  object Ca {
    
    @scala.inline
    def apply(rejectUnauthorized: Boolean): Ca = {
      val __obj = js.Dynamic.literal(rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ca]
    }
    
    @scala.inline
    implicit class CaMutableBuilder[Self <: Ca] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: `false`
    
    var exclude: js.Tuple3[
        ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
        ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
        ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
      ]
  }
  object Enabled {
    
    @scala.inline
    def apply(
      exclude: js.Tuple3[
          ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
          ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
        ]
    ): Enabled = {
      val __obj = js.Dynamic.literal(enabled = false, exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclude(
        value: js.Tuple3[
              ldapsQuestionmarkColonSlashSlashForestDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
              ldapsQuestionmarkColonSlashSlashDomainDnsZonesBackslashDotDotAsteriskSlashDotAsterisk, 
              ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
            ]
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]
    
    var user: js.Tuple17[
        dn, 
        distinguishedName, 
        userPrincipalName, 
        sAMAccountName, 
        mail, 
        lockoutTime, 
        whenCreated, 
        pwdLastSet, 
        userAccountControl, 
        employeeID, 
        sn, 
        givenName, 
        initials, 
        cn, 
        displayName, 
        comment, 
        description
      ]
  }
  object Group {
    
    @scala.inline
    def apply(
      group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory],
      user: js.Tuple17[
          dn, 
          distinguishedName, 
          userPrincipalName, 
          sAMAccountName, 
          mail, 
          lockoutTime, 
          whenCreated, 
          pwdLastSet, 
          userAccountControl, 
          employeeID, 
          sn, 
          givenName, 
          initials, 
          cn, 
          displayName, 
          comment, 
          description
        ]
    ): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(
        value: js.Tuple17[
              dn, 
              distinguishedName, 
              userPrincipalName, 
              sAMAccountName, 
              mail, 
              lockoutTime, 
              whenCreated, 
              pwdLastSet, 
              userAccountControl, 
              employeeID, 
              sn, 
              givenName, 
              initials, 
              cn, 
              displayName, 
              comment, 
              description
            ]
      ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
