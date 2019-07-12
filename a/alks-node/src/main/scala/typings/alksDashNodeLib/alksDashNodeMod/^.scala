package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createIamKey(
    account: Account,
    auth: Auth,
    duration: scala.Double,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* key */ KeyData, scala.Unit]
  ): scala.Unit = js.native
  def createIamRole(
    account: Account,
    auth: Auth,
    roleName: java.lang.String,
    roleType: java.lang.String,
    includeDefaultPolicies: scala.Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createIamTrustRole(
    account: Account,
    auth: Auth,
    roleName: java.lang.String,
    roleType: java.lang.String,
    trustArn: java.lang.String,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createKey(
    account: Account,
    auth: Auth,
    duration: scala.Double,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* key */ KeyData, scala.Unit]
  ): scala.Unit = js.native
  def createLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: java.lang.String,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ LongTermKeyData, scala.Unit]
  ): scala.Unit = js.native
  def deleteIamRole(
    account: Account,
    auth: Auth,
    roleName: java.lang.String,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deleteLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: java.lang.String,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def generateConsoleUrl(
    key: AwsKey,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getAccounts(
    server: java.lang.String,
    userid: java.lang.String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* accounts */ js.Array[AlksAccount], scala.Unit]
  ): scala.Unit = js.native
  def getDurations(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* duration */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def getIamRoleTypes(
    server: java.lang.String,
    userid: java.lang.String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def refreshTokenToAccessToken(
    account: Account,
    token: java.lang.String,
    opts: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* body */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

