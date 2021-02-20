package typings.alksNode

import typings.moment.mod.Moment
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alks-node", "createIamKey")
  @js.native
  def createIamKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "createIamRole")
  @js.native
  def createIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    includeDefaultPolicies: Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "createIamTrustRole")
  @js.native
  def createIamTrustRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    trustArn: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "createKey")
  @js.native
  def createKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "createLongTermKey")
  @js.native
  def createLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* data */ LongTermKeyData, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "deleteIamRole")
  @js.native
  def deleteIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "deleteLongTermKey")
  @js.native
  def deleteLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "generateConsoleUrl")
  @js.native
  def generateConsoleUrl(key: AwsKey, opts: js.Object, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = js.native
  
  @JSImport("alks-node", "getAccounts")
  @js.native
  def getAccounts(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* accounts */ js.Array[AlksAccount], Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "getDurations")
  @js.native
  def getDurations(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* duration */ js.Array[Double], Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "getIamRoleTypes")
  @js.native
  def getIamRoleTypes(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("alks-node", "refreshTokenToAccessToken")
  @js.native
  def refreshTokenToAccessToken(
    account: Account,
    token: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  
  @js.native
  trait Account extends StObject {
    
    var alksAccount: String = js.native
    
    var alksRole: String = js.native
    
    var server: String = js.native
    
    var userid: String = js.native
  }
  object Account {
    
    @scala.inline
    def apply(alksAccount: String, alksRole: String, server: String, userid: String): Account = {
      val __obj = js.Dynamic.literal(alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlksAccount extends StObject {
    
    var account: String = js.native
    
    var iam: js.UndefOr[Boolean] = js.native
    
    var role: String = js.native
  }
  object AlksAccount {
    
    @scala.inline
    def apply(account: String, role: String): AlksAccount = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlksAccount]
    }
    
    @scala.inline
    implicit class AlksAccountMutableBuilder[Self <: AlksAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIam(value: Boolean): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Auth extends StObject {
    
    var password: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(): Auth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait AwsKey extends StObject {
    
    var accessKey: String = js.native
    
    var secretKey: String = js.native
    
    var sessionToken: String = js.native
  }
  object AwsKey {
    
    @scala.inline
    def apply(accessKey: String, secretKey: String, sessionToken: String): AwsKey = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsKey]
    }
    
    @scala.inline
    implicit class AwsKeyMutableBuilder[Self <: AwsKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyData extends StObject {
    
    var accessKey: String = js.native
    
    var alksAccount: String = js.native
    
    var alksRole: String = js.native
    
    var expires: Moment = js.native
    
    var secretKey: String = js.native
    
    var sessionTime: String = js.native
    
    var sessionToken: String = js.native
  }
  object KeyData {
    
    @scala.inline
    def apply(
      accessKey: String,
      alksAccount: String,
      alksRole: String,
      expires: Moment,
      secretKey: String,
      sessionTime: String,
      sessionToken: String
    ): KeyData = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionTime = sessionTime.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyData]
    }
    
    @scala.inline
    implicit class KeyDataMutableBuilder[Self <: KeyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Moment): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTime(value: String): Self = StObject.set(x, "sessionTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LongTermKeyData extends StObject {
    
    var accessKey: String = js.native
    
    var alksAccount: String = js.native
    
    var alksRole: String = js.native
    
    var iamUserArn: String = js.native
    
    var iamUserName: String = js.native
    
    var secretKey: String = js.native
  }
  object LongTermKeyData {
    
    @scala.inline
    def apply(
      accessKey: String,
      alksAccount: String,
      alksRole: String,
      iamUserArn: String,
      iamUserName: String,
      secretKey: String
    ): LongTermKeyData = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], iamUserArn = iamUserArn.asInstanceOf[js.Any], iamUserName = iamUserName.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongTermKeyData]
    }
    
    @scala.inline
    implicit class LongTermKeyDataMutableBuilder[Self <: LongTermKeyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUserArn(value: String): Self = StObject.set(x, "iamUserArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamUserName(value: String): Self = StObject.set(x, "iamUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
