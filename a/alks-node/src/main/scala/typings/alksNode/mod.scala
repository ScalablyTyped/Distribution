package typings.alksNode

import typings.moment.mod.Moment
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alks-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createIamKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    includeDefaultPolicies: Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], roleType.asInstanceOf[js.Any], includeDefaultPolicies.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createIamTrustRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    trustArn: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamTrustRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], roleType.asInstanceOf[js.Any], trustArn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* data */ LongTermKeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLongTermKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], iamUserName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deleteIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteIamRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deleteLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteLongTermKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], iamUserName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateConsoleUrl(key: AwsKey, opts: js.Object, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateConsoleUrl")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAccounts(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* accounts */ js.Array[AlksAccount], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")(server.asInstanceOf[js.Any], userid.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getDurations(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* duration */ js.Array[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDurations")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getIamRoleTypes(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIamRoleTypes")(server.asInstanceOf[js.Any], userid.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def refreshTokenToAccessToken(
    account: Account,
    token: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshTokenToAccessToken")(account.asInstanceOf[js.Any], token.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Account extends StObject {
    
    var alksAccount: String
    
    var alksRole: String
    
    var server: String
    
    var userid: String
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
  
  trait AlksAccount extends StObject {
    
    var account: String
    
    var iam: js.UndefOr[Boolean] = js.undefined
    
    var role: String
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
  
  trait Auth extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
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
  
  trait AwsKey extends StObject {
    
    var accessKey: String
    
    var secretKey: String
    
    var sessionToken: String
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
  
  trait KeyData extends StObject {
    
    var accessKey: String
    
    var alksAccount: String
    
    var alksRole: String
    
    var expires: Moment
    
    var secretKey: String
    
    var sessionTime: String
    
    var sessionToken: String
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
  
  trait LongTermKeyData extends StObject {
    
    var accessKey: String
    
    var alksAccount: String
    
    var alksRole: String
    
    var iamUserArn: String
    
    var iamUserName: String
    
    var secretKey: String
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
