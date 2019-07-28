package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCredentials extends js.Object {
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.undefined
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[TStamp] = js.undefined
}

object ClusterCredentials {
  @scala.inline
  def apply(DbPassword: SensitiveString = null, DbUser: String = null, Expiration: TStamp = null): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    if (DbPassword != null) __obj.updateDynamic("DbPassword")(DbPassword)
    if (DbUser != null) __obj.updateDynamic("DbUser")(DbUser)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    __obj.asInstanceOf[ClusterCredentials]
  }
}

