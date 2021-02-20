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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("activedirectory2", JSImport.Namespace)
  @js.native
  class ^ protected () extends ActiveDirectory {
    def this(props: ADProperties) = this()
  }
  
  @js.native
  trait ADProperties extends StObject {
    
    var attributes: js.UndefOr[Group] = js.native
    
    var baseDN: String = js.native
    
    var entryParser: js.UndefOr[
        js.Function3[
          /* entry */ js.Object, 
          /* raw */ String, 
          /* cb */ js.Function1[/* entry */ js.Object, Unit], 
          Unit
        ]
      ] = js.native
    
    var pageSize: js.UndefOr[`1000`] = js.native
    
    var password: String = js.native
    
    var referrals: js.UndefOr[Enabled] = js.native
    
    var url: String = js.native
    
    var username: String = js.native
  }
  object ADProperties {
    
    @scala.inline
    def apply(baseDN: String, password: String, url: String, username: String): ADProperties = {
      val __obj = js.Dynamic.literal(baseDN = baseDN.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ADProperties]
    }
    
    @scala.inline
    implicit class ADPropertiesMutableBuilder[Self <: ADProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Group): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setBaseDN(value: String): Self = StObject.set(x, "baseDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryParser(
        value: (/* entry */ js.Object, /* raw */ String, /* cb */ js.Function1[/* entry */ js.Object, Unit]) => Unit
      ): Self = StObject.set(x, "entryParser", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEntryParserUndefined: Self = StObject.set(x, "entryParser", js.undefined)
      
      @scala.inline
      def setPageSize(value: `1000`): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrals(value: Enabled): Self = StObject.set(x, "referrals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferralsUndefined: Self = StObject.set(x, "referrals", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait AttributeSpec extends StObject {
    
    var group: js.Array[GroupAttributes] = js.native
    
    var user: js.Array[UserAttributes] = js.native
  }
  object AttributeSpec {
    
    @scala.inline
    def apply(group: js.Array[GroupAttributes], user: js.Array[UserAttributes]): AttributeSpec = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeSpec]
    }
    
    @scala.inline
    implicit class AttributeSpecMutableBuilder[Self <: AttributeSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: js.Array[GroupAttributes]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupVarargs(value: GroupAttributes*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: js.Array[UserAttributes]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVarargs(value: UserAttributes*): Self = StObject.set(x, "user", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FindResult extends StObject {
    
    var groups: js.Array[js.Object] = js.native
    
    var other: js.Array[js.Object] = js.native
    
    var users: js.Array[js.Object] = js.native
  }
  object FindResult {
    
    @scala.inline
    def apply(groups: js.Array[js.Object], other: js.Array[js.Object], users: js.Array[js.Object]): FindResult = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult]
    }
    
    @scala.inline
    implicit class FindResultMutableBuilder[Self <: FindResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setOther(value: js.Array[js.Object]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherVarargs(value: js.Object*): Self = StObject.set(x, "other", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[js.Object]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: js.Object*): Self = StObject.set(x, "users", js.Array(value :_*))
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
    
    @scala.inline
    def cn: typings.activedirectory2.activedirectory2Strings.cn = "cn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.cn]
    
    @scala.inline
    def description: typings.activedirectory2.activedirectory2Strings.description = "description".asInstanceOf[typings.activedirectory2.activedirectory2Strings.description]
    
    @scala.inline
    def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = "distinguishedName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.distinguishedName]
    
    @scala.inline
    def objectCategory: typings.activedirectory2.activedirectory2Strings.objectCategory = "objectCategory".asInstanceOf[typings.activedirectory2.activedirectory2Strings.objectCategory]
  }
  
  @js.native
  trait LDAPjsReqProps extends StObject {
    
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var log: js.UndefOr[js.Any] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var strictDN: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var tlsOptions: Ca = js.native
    
    var url: String = js.native
  }
  object LDAPjsReqProps {
    
    @scala.inline
    def apply(tlsOptions: Ca, url: String): LDAPjsReqProps = {
      val __obj = js.Dynamic.literal(tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDAPjsReqProps]
    }
    
    @scala.inline
    implicit class LDAPjsReqPropsMutableBuilder[Self <: LDAPjsReqProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setStrictDN(value: Boolean): Self = StObject.set(x, "strictDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictDNUndefined: Self = StObject.set(x, "strictDN", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTlsOptions(value: Ca): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activedirectory2.activedirectory2Strings.all
    - typings.activedirectory2.activedirectory2Strings.user
    - typings.activedirectory2.activedirectory2Strings.group
  */
  trait MembershipType extends StObject
  object MembershipType {
    
    @scala.inline
    def all: typings.activedirectory2.activedirectory2Strings.all = "all".asInstanceOf[typings.activedirectory2.activedirectory2Strings.all]
    
    @scala.inline
    def group: typings.activedirectory2.activedirectory2Strings.group = "group".asInstanceOf[typings.activedirectory2.activedirectory2Strings.group]
    
    @scala.inline
    def user: typings.activedirectory2.activedirectory2Strings.user = "user".asInstanceOf[typings.activedirectory2.activedirectory2Strings.user]
  }
  
  @js.native
  trait ReqProps extends LDAPjsReqProps {
    
    var attributes: AttributeSpec = js.native
    
    var baseDN: js.UndefOr[String] = js.native
    
    var bindCredentials: js.UndefOr[String] = js.native
    
    var bindDN: js.UndefOr[String] = js.native
    
    var filter: String | Filter = js.native
    
    var includeMembership: js.Array[MembershipType] = js.native
    
    var scope: js.UndefOr[base | one | sub] = js.native
    
    var sizeLimit: `0` = js.native
    
    var timeLimit: `10` = js.native
  }
  object ReqProps {
    
    @scala.inline
    def apply(
      attributes: AttributeSpec,
      filter: String | Filter,
      includeMembership: js.Array[MembershipType],
      sizeLimit: `0`,
      timeLimit: `10`,
      tlsOptions: Ca,
      url: String
    ): ReqProps = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], includeMembership = includeMembership.asInstanceOf[js.Any], sizeLimit = sizeLimit.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqProps]
    }
    
    @scala.inline
    implicit class ReqPropsMutableBuilder[Self <: ReqProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributeSpec): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDN(value: String): Self = StObject.set(x, "baseDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDNUndefined: Self = StObject.set(x, "baseDN", js.undefined)
      
      @scala.inline
      def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
      
      @scala.inline
      def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
      
      @scala.inline
      def setFilter(value: String | Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMembership(value: js.Array[MembershipType]): Self = StObject.set(x, "includeMembership", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMembershipVarargs(value: MembershipType*): Self = StObject.set(x, "includeMembership", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: base | one | sub): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSizeLimit(value: `0`): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimit(value: `10`): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def cn: typings.activedirectory2.activedirectory2Strings.cn = "cn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.cn]
    
    @scala.inline
    def comment: typings.activedirectory2.activedirectory2Strings.comment = "comment".asInstanceOf[typings.activedirectory2.activedirectory2Strings.comment]
    
    @scala.inline
    def description: typings.activedirectory2.activedirectory2Strings.description = "description".asInstanceOf[typings.activedirectory2.activedirectory2Strings.description]
    
    @scala.inline
    def displayName: typings.activedirectory2.activedirectory2Strings.displayName = "displayName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.displayName]
    
    @scala.inline
    def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = "distinguishedName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.distinguishedName]
    
    @scala.inline
    def employeeID: typings.activedirectory2.activedirectory2Strings.employeeID = "employeeID".asInstanceOf[typings.activedirectory2.activedirectory2Strings.employeeID]
    
    @scala.inline
    def givenName: typings.activedirectory2.activedirectory2Strings.givenName = "givenName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.givenName]
    
    @scala.inline
    def initials: typings.activedirectory2.activedirectory2Strings.initials = "initials".asInstanceOf[typings.activedirectory2.activedirectory2Strings.initials]
    
    @scala.inline
    def lockoutTime: typings.activedirectory2.activedirectory2Strings.lockoutTime = "lockoutTime".asInstanceOf[typings.activedirectory2.activedirectory2Strings.lockoutTime]
    
    @scala.inline
    def mail: typings.activedirectory2.activedirectory2Strings.mail = "mail".asInstanceOf[typings.activedirectory2.activedirectory2Strings.mail]
    
    @scala.inline
    def pwdLastSet: typings.activedirectory2.activedirectory2Strings.pwdLastSet = "pwdLastSet".asInstanceOf[typings.activedirectory2.activedirectory2Strings.pwdLastSet]
    
    @scala.inline
    def sAMAccountName: typings.activedirectory2.activedirectory2Strings.sAMAccountName = "sAMAccountName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.sAMAccountName]
    
    @scala.inline
    def sn: typings.activedirectory2.activedirectory2Strings.sn = "sn".asInstanceOf[typings.activedirectory2.activedirectory2Strings.sn]
    
    @scala.inline
    def userAccountControl: typings.activedirectory2.activedirectory2Strings.userAccountControl = "userAccountControl".asInstanceOf[typings.activedirectory2.activedirectory2Strings.userAccountControl]
    
    @scala.inline
    def userPrincipalName: typings.activedirectory2.activedirectory2Strings.userPrincipalName = "userPrincipalName".asInstanceOf[typings.activedirectory2.activedirectory2Strings.userPrincipalName]
    
    @scala.inline
    def whenCreated: typings.activedirectory2.activedirectory2Strings.whenCreated = "whenCreated".asInstanceOf[typings.activedirectory2.activedirectory2Strings.whenCreated]
  }
}
