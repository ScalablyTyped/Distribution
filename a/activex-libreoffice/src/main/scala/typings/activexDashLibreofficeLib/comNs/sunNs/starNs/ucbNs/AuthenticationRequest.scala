package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error specifying lack of correct authentication data (e.g., to log into an account). */
trait AuthenticationRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /**
    * Any already specified account.
    *
    * If HasAccount is false, this member should be ignored.
    */
  var Account: java.lang.String
  /** Any diagnostic message about the failure to log in (if applicable; it will typically be an English phrase or sentence). */
  var Diagnostic: java.lang.String
  /** Specifies if the authentication involves an "account" (as can be the case for FTP). */
  var HasAccount: scala.Boolean
  /** Specifies if the authentication involves a "password" (as is almost always the case). */
  var HasPassword: scala.Boolean
  /** Specifies if the authentication involves a "realm" (as can be the case for HTTP). */
  var HasRealm: scala.Boolean
  /** Specifies if the authentication involves a "user name" (as is almost always the case). */
  var HasUserName: scala.Boolean
  /**
    * Any already specified password.
    *
    * If HasPassword is false, this member should be ignored.
    */
  var Password: java.lang.String
  /**
    * Any already specified realm.
    *
    * If HasRealm is false, this member should be ignored.
    */
  var Realm: java.lang.String
  /** The name of the server (if applicable). */
  var ServerName: java.lang.String
  /**
    * Any already specified user name.
    *
    * If HasUserName is false, this member should be ignored.
    */
  var UserName: java.lang.String
}

