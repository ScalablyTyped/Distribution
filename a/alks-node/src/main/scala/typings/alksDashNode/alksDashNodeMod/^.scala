package typings.alksDashNode.alksDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createIamKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = js.native
  def createIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    includeDefaultPolicies: Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  def createIamTrustRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    trustArn: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  def createKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = js.native
  def createLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* data */ LongTermKeyData, Unit]
  ): Unit = js.native
  def deleteIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  def deleteLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  def generateConsoleUrl(key: AwsKey, opts: js.Object, callback: js.Function2[/* err */ Error, /* url */ String, Unit]): Unit = js.native
  def getAccounts(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* accounts */ js.Array[AlksAccount], Unit]
  ): Unit = js.native
  def getDurations(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* duration */ js.Array[Double], Unit]
  ): Unit = js.native
  def getIamRoleTypes(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
  def refreshTokenToAccessToken(
    account: Account,
    token: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

