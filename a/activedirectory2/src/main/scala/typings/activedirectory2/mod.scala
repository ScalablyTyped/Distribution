package typings.activedirectory2

import typings.activedirectory2.activedirectory2Numbers.`0`
import typings.activedirectory2.activedirectory2Numbers.`1000`
import typings.activedirectory2.activedirectory2Numbers.`10`
import typings.activedirectory2.activedirectory2Strings.base
import typings.activedirectory2.activedirectory2Strings.one
import typings.activedirectory2.activedirectory2Strings.sub
import typings.activedirectory2.anon.Ca
import typings.activedirectory2.anon.Enabled
import typings.activedirectory2.anon.Group
import typings.ldapjs.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("activedirectory2", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ActiveDirectory {
    def this(props: ADProperties) = this()
  }
  
  trait ADProperties extends StObject {
    
    var attributes: js.UndefOr[Group] = js.undefined
    
    var baseDN: String
    
    var entryParser: js.UndefOr[
        js.Function3[
          /* entry */ js.Object, 
          /* raw */ String, 
          /* cb */ js.Function1[/* entry */ js.Object, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var pageSize: js.UndefOr[`1000`] = js.undefined
    
    var password: String
    
    var referrals: js.UndefOr[Enabled] = js.undefined
    
    var url: String
    
    var username: String
  }
  object ADProperties {
    
    inline def apply(baseDN: String, password: String, url: String, username: String): ADProperties = {
      val __obj = js.Dynamic.literal(baseDN = baseDN.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ADProperties]
    }
    
    extension [Self <: ADProperties](x: Self) {
      
      inline def setAttributes(value: Group): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBaseDN(value: String): Self = StObject.set(x, "baseDN", value.asInstanceOf[js.Any])
      
      inline def setEntryParser(
        value: (/* entry */ js.Object, /* raw */ String, /* cb */ js.Function1[/* entry */ js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "entryParser", js.Any.fromFunction3(value))
      
      inline def setEntryParserUndefined: Self = StObject.set(x, "entryParser", js.undefined)
      
      inline def setPageSize(value: `1000`): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setReferrals(value: Enabled): Self = StObject.set(x, "referrals", value.asInstanceOf[js.Any])
      
      inline def setReferralsUndefined: Self = StObject.set(x, "referrals", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ActiveDirectory extends StObject {
    
    def authenticate(username: String, password: String): Unit = js.native
    def authenticate(
      username: String,
      password: String,
      callback: js.Function2[/* err */ String, /* authenticated */ Boolean, Unit]
    ): Unit = js.native
    
    def find(): Unit = js.native
    def find(callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
    def find(opts: String): Unit = js.native
    def find(opts: String, callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
    def find(opts: ReqProps): Unit = js.native
    def find(opts: ReqProps, callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
    
    def findDeletedObjects(): Unit = js.native
    def findDeletedObjects(callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]): Unit = js.native
    def findDeletedObjects(opts: String): Unit = js.native
    def findDeletedObjects(opts: String, callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]): Unit = js.native
    def findDeletedObjects(opts: ReqProps): Unit = js.native
    def findDeletedObjects(
      opts: ReqProps,
      callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]
    ): Unit = js.native
    
    def findGroup(groupName: String): Unit = js.native
    def findGroup(groupName: String, callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]): Unit = js.native
    def findGroup(opts: String, groupName: String): Unit = js.native
    def findGroup(
      opts: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]
    ): Unit = js.native
    def findGroup(opts: ReqProps, groupName: String): Unit = js.native
    def findGroup(
      opts: ReqProps,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]
    ): Unit = js.native
    
    def findGroups(groupName: String): Unit = js.native
    def findGroups(
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def findGroups(opts: String, groupName: String): Unit = js.native
    def findGroups(
      opts: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def findGroups(opts: ReqProps, groupName: String): Unit = js.native
    def findGroups(
      opts: ReqProps,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    
    def findUser(opts: String, username: String): Unit = js.native
    def findUser(
      opts: String,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]
    ): Unit = js.native
    def findUser(opts: ReqProps, username: String): Unit = js.native
    def findUser(
      opts: ReqProps,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]
    ): Unit = js.native
    def findUser(username: String): Unit = js.native
    def findUser(username: String, callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]): Unit = js.native
    
    def findUsers(): Unit = js.native
    def findUsers(callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
    def findUsers(opts: String): Unit = js.native
    def findUsers(opts: String, callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
    def findUsers(opts: ReqProps): Unit = js.native
    def findUsers(opts: ReqProps, callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
    
    def getGroupMembershipForGroup(groupName: String): Unit = js.native
    def getGroupMembershipForGroup(
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getGroupMembershipForGroup(opts: String, groupName: String): Unit = js.native
    def getGroupMembershipForGroup(
      opts: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getGroupMembershipForGroup(opts: ReqProps, groupName: String): Unit = js.native
    def getGroupMembershipForGroup(
      opts: ReqProps,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    
    def getGroupMembershipForUser(opts: String, username: String): Unit = js.native
    def getGroupMembershipForUser(
      opts: String,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getGroupMembershipForUser(opts: ReqProps, username: String): Unit = js.native
    def getGroupMembershipForUser(
      opts: ReqProps,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getGroupMembershipForUser(username: String): Unit = js.native
    def getGroupMembershipForUser(
      username: String,
      callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
    ): Unit = js.native
    
    def getRootDSE(url: String, attributes: js.Array[String]): Unit = js.native
    def getRootDSE(
      url: String,
      attributes: js.Array[String],
      callback: js.Function2[/* err */ js.Object, /* result */ js.Object, Unit]
    ): Unit = js.native
    
    def getUsersForGroup(groupName: String): Unit = js.native
    def getUsersForGroup(
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getUsersForGroup(opts: String, groupName: String): Unit = js.native
    def getUsersForGroup(
      opts: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
    ): Unit = js.native
    def getUsersForGroup(opts: ReqProps, groupName: String): Unit = js.native
    def getUsersForGroup(
      opts: ReqProps,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
    ): Unit = js.native
    
    def groupExists(groupName: String): Unit = js.native
    def groupExists(groupName: String, callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]): Unit = js.native
    def groupExists(opts: String, groupName: String): Unit = js.native
    def groupExists(
      opts: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    def groupExists(opts: ReqProps, groupName: String): Unit = js.native
    def groupExists(
      opts: ReqProps,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    
    def isUserMemberOf(opts: ReqProps, username: String, groupName: String): Unit = js.native
    def isUserMemberOf(
      opts: ReqProps,
      username: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    def isUserMemberOf(username: String, groupName: String): Unit = js.native
    def isUserMemberOf(
      username: String,
      groupName: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    
    def userExists(opts: String, username: String): Unit = js.native
    def userExists(
      opts: String,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    def userExists(opts: ReqProps, username: String): Unit = js.native
    def userExists(
      opts: ReqProps,
      username: String,
      callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
    ): Unit = js.native
    def userExists(username: String): Unit = js.native
    def userExists(username: String, callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]): Unit = js.native
  }
  
  trait AttributeSpec extends StObject {
    
    var group: js.Array[GroupAttributes]
    
    var user: js.Array[UserAttributes]
  }
  object AttributeSpec {
    
    inline def apply(group: js.Array[GroupAttributes], user: js.Array[UserAttributes]): AttributeSpec = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeSpec]
    }
    
    extension [Self <: AttributeSpec](x: Self) {
      
      inline def setGroup(value: js.Array[GroupAttributes]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupVarargs(value: GroupAttributes*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      inline def setUser(value: js.Array[UserAttributes]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserVarargs(value: UserAttributes*): Self = StObject.set(x, "user", js.Array(value :_*))
    }
  }
  
  trait FindResult extends StObject {
    
    var groups: js.Array[js.Object]
    
    var other: js.Array[js.Object]
    
    var users: js.Array[js.Object]
  }
  object FindResult {
    
    inline def apply(groups: js.Array[js.Object], other: js.Array[js.Object], users: js.Array[js.Object]): FindResult = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult]
    }
    
    extension [Self <: FindResult](x: Self) {
      
      inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setOther(value: js.Array[js.Object]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherVarargs(value: js.Object*): Self = StObject.set(x, "other", js.Array(value :_*))
      
      inline def setUsers(value: js.Array[js.Object]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: js.Object*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activedirectory2.activedirectory2Strings.distinguishedName
    - typings.activedirectory2.activedirectory2Strings.objectCategory
    - typings.activedirectory2.activedirectory2Strings.cn
    - typings.activedirectory2.activedirectory2Strings.description
  */
  trait GroupAttributes extends StObject
  object GroupAttributes {
    
    inline def cn: typings.activedirectory2.activedirectory2Strings.cn = "cn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.cn]
    
    inline def description: typings.activedirectory2.activedirectory2Strings.description = "description".asInstanceOf[typings.activedirectory2.activedirectory2Strings.description]
    
    inline def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = "distinguishedName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.distinguishedName]
    
    inline def objectCategory: typings.activedirectory2.activedirectory2Strings.objectCategory = "objectCategory".asInstanceOf[typings.activedirectory2.activedirectory2Strings.objectCategory]
  }
  
  trait LDAPjsReqProps extends StObject {
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Any] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var strictDN: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var tlsOptions: Ca
    
    var url: String
  }
  object LDAPjsReqProps {
    
    inline def apply(tlsOptions: Ca, url: String): LDAPjsReqProps = {
      val __obj = js.Dynamic.literal(tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDAPjsReqProps]
    }
    
    extension [Self <: LDAPjsReqProps](x: Self) {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setStrictDN(value: Boolean): Self = StObject.set(x, "strictDN", value.asInstanceOf[js.Any])
      
      inline def setStrictDNUndefined: Self = StObject.set(x, "strictDN", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTlsOptions(value: Ca): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activedirectory2.activedirectory2Strings.all
    - typings.activedirectory2.activedirectory2Strings.user
    - typings.activedirectory2.activedirectory2Strings.group
  */
  trait MembershipType extends StObject
  object MembershipType {
    
    inline def all: typings.activedirectory2.activedirectory2Strings.all = "all".asInstanceOf[typings.activedirectory2.activedirectory2Strings.all]
    
    inline def group: typings.activedirectory2.activedirectory2Strings.group = "group".asInstanceOf[typings.activedirectory2.activedirectory2Strings.group]
    
    inline def user: typings.activedirectory2.activedirectory2Strings.user = "user".asInstanceOf[typings.activedirectory2.activedirectory2Strings.user]
  }
  
  trait ReqProps
    extends StObject
       with LDAPjsReqProps {
    
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
    
    inline def apply(
      attributes: AttributeSpec,
      filter: String | Filter,
      includeMembership: js.Array[MembershipType],
      tlsOptions: Ca,
      url: String
    ): ReqProps = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], includeMembership = includeMembership.asInstanceOf[js.Any], sizeLimit = 0, timeLimit = 10, tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqProps]
    }
    
    extension [Self <: ReqProps](x: Self) {
      
      inline def setAttributes(value: AttributeSpec): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBaseDN(value: String): Self = StObject.set(x, "baseDN", value.asInstanceOf[js.Any])
      
      inline def setBaseDNUndefined: Self = StObject.set(x, "baseDN", js.undefined)
      
      inline def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
      
      inline def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
      
      inline def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
      
      inline def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
      
      inline def setFilter(value: String | Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setIncludeMembership(value: js.Array[MembershipType]): Self = StObject.set(x, "includeMembership", value.asInstanceOf[js.Any])
      
      inline def setIncludeMembershipVarargs(value: MembershipType*): Self = StObject.set(x, "includeMembership", js.Array(value :_*))
      
      inline def setScope(value: base | one | sub): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSizeLimit(value: `0`): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimit(value: `10`): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activedirectory2.activedirectory2Strings.distinguishedName
    - typings.activedirectory2.activedirectory2Strings.userPrincipalName
    - typings.activedirectory2.activedirectory2Strings.sAMAccountName
    - typings.activedirectory2.activedirectory2Strings.mail
    - typings.activedirectory2.activedirectory2Strings.lockoutTime
    - typings.activedirectory2.activedirectory2Strings.whenCreated
    - typings.activedirectory2.activedirectory2Strings.pwdLastSet
    - typings.activedirectory2.activedirectory2Strings.userAccountControl
    - typings.activedirectory2.activedirectory2Strings.employeeID
    - typings.activedirectory2.activedirectory2Strings.sn
    - typings.activedirectory2.activedirectory2Strings.givenName
    - typings.activedirectory2.activedirectory2Strings.initials
    - typings.activedirectory2.activedirectory2Strings.cn
    - typings.activedirectory2.activedirectory2Strings.displayName
    - typings.activedirectory2.activedirectory2Strings.comment
    - typings.activedirectory2.activedirectory2Strings.description
  */
  trait UserAttributes extends StObject
  object UserAttributes {
    
    inline def cn: typings.activedirectory2.activedirectory2Strings.cn = "cn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.cn]
    
    inline def comment: typings.activedirectory2.activedirectory2Strings.comment = "comment".asInstanceOf[typings.activedirectory2.activedirectory2Strings.comment]
    
    inline def description: typings.activedirectory2.activedirectory2Strings.description = "description".asInstanceOf[typings.activedirectory2.activedirectory2Strings.description]
    
    inline def displayName: typings.activedirectory2.activedirectory2Strings.displayName = "displayName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.displayName]
    
    inline def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = "distinguishedName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.distinguishedName]
    
    inline def employeeID: typings.activedirectory2.activedirectory2Strings.employeeID = "employeeID".asInstanceOf[typings.activedirectory2.activedirectory2Strings.employeeID]
    
    inline def givenName: typings.activedirectory2.activedirectory2Strings.givenName = "givenName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.givenName]
    
    inline def initials: typings.activedirectory2.activedirectory2Strings.initials = "initials".asInstanceOf[typings.activedirectory2.activedirectory2Strings.initials]
    
    inline def lockoutTime: typings.activedirectory2.activedirectory2Strings.lockoutTime = "lockoutTime".asInstanceOf[typings.activedirectory2.activedirectory2Strings.lockoutTime]
    
    inline def mail: typings.activedirectory2.activedirectory2Strings.mail = "mail".asInstanceOf[typings.activedirectory2.activedirectory2Strings.mail]
    
    inline def pwdLastSet: typings.activedirectory2.activedirectory2Strings.pwdLastSet = "pwdLastSet".asInstanceOf[typings.activedirectory2.activedirectory2Strings.pwdLastSet]
    
    inline def sAMAccountName: typings.activedirectory2.activedirectory2Strings.sAMAccountName = "sAMAccountName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.sAMAccountName]
    
    inline def sn: typings.activedirectory2.activedirectory2Strings.sn = "sn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.sn]
    
    inline def userAccountControl: typings.activedirectory2.activedirectory2Strings.userAccountControl = "userAccountControl".asInstanceOf[typings.activedirectory2.activedirectory2Strings.userAccountControl]
    
    inline def userPrincipalName: typings.activedirectory2.activedirectory2Strings.userPrincipalName = "userPrincipalName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.userPrincipalName]
    
    inline def whenCreated: typings.activedirectory2.activedirectory2Strings.whenCreated = "whenCreated".asInstanceOf[typings.activedirectory2.activedirectory2Strings.whenCreated]
  }
}
