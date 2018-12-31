package typings
package auth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0Mod {
  type ClientAppType = auth0Lib.auth0LibStrings.native | auth0Lib.auth0LibStrings.spa | auth0Lib.auth0LibStrings.regular_web | auth0Lib.auth0LibStrings.non_interactive | auth0Lib.auth0LibStrings.rms | auth0Lib.auth0LibStrings.box | auth0Lib.auth0LibStrings.cloudbees | auth0Lib.auth0LibStrings.concur | auth0Lib.auth0LibStrings.dropbox | auth0Lib.auth0LibStrings.mscrm | auth0Lib.auth0LibStrings.echosign | auth0Lib.auth0LibStrings.egnyte | auth0Lib.auth0LibStrings.newrelic | auth0Lib.auth0LibStrings.office365 | auth0Lib.auth0LibStrings.salesforce | auth0Lib.auth0LibStrings.sentry | auth0Lib.auth0LibStrings.sharepoint | auth0Lib.auth0LibStrings.slack | auth0Lib.auth0LibStrings.springcm | auth0Lib.auth0LibStrings.zendesk | auth0Lib.auth0LibStrings.zoom
  type ClientGrant = stdLib.Partial[CreateClientGrant] with auth0Lib.Anon_Id
  type DatabaseClientOptions = BaseClientOptions
  type DeleteDeleteMultifactorParamsProvider = auth0Lib.auth0LibStrings.duo | auth0Lib.auth0LibStrings.`google-authenticator`
  type PasswordLessClientOptions = BaseClientOptions
  type SendType = auth0Lib.auth0LibStrings.link | auth0Lib.auth0LibStrings.code
  type Strategy = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 59 */ java.lang.String
  type UnlinkAccountsParamsProvider = /* import warning: LimitUnionLength.enterTypeRef Was union type with length 58 */ java.lang.String
  type UpdateClientGrant = stdLib.Pick[stdLib.Partial[CreateClientGrant], auth0Lib.auth0LibStrings.scope]
}
