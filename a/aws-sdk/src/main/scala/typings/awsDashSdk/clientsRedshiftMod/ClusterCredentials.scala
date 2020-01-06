package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCredentials extends js.Object {
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.native
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[TStamp] = js.native
}

object ClusterCredentials {
  @scala.inline
  def apply(DbPassword: SensitiveString = null, DbUser: String = null, Expiration: TStamp = null): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    if (DbPassword != null) __obj.updateDynamic("DbPassword")(DbPassword.asInstanceOf[js.Any])
    if (DbUser != null) __obj.updateDynamic("DbUser")(DbUser.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCredentials]
  }
}

