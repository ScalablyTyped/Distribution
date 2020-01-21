package typings.actionsOnGoogle.smarthomeSmarthomeMod

import typings.actionsOnGoogle.actionsOnGoogleStrings.service_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeJwt extends js.Object {
  var auth_provider_x509_cert_url: String
  var auth_uri: String
  var client_email: String
  var client_id: String
  var client_x509_cert_url: String
  var private_key: String
  var private_key_id: String
  var project_id: String
  var token_uri: String
  var `type`: service_account
}

object SmartHomeJwt {
  @scala.inline
  def apply(
    auth_provider_x509_cert_url: String,
    auth_uri: String,
    client_email: String,
    client_id: String,
    client_x509_cert_url: String,
    private_key: String,
    private_key_id: String,
    project_id: String,
    token_uri: String,
    `type`: service_account
  ): SmartHomeJwt = {
    val __obj = js.Dynamic.literal(auth_provider_x509_cert_url = auth_provider_x509_cert_url.asInstanceOf[js.Any], auth_uri = auth_uri.asInstanceOf[js.Any], client_email = client_email.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_x509_cert_url = client_x509_cert_url.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], private_key_id = private_key_id.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], token_uri = token_uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeJwt]
  }
}

