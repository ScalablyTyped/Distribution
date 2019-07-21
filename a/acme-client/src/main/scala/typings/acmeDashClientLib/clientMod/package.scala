package typings
package acmeDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type AccountKey = acmeDashClientLib.cryptoForgeMod.PrivateKey
  type Certificate = java.lang.String | nodeLib.Buffer
  type CertificateChain = java.lang.String
  type ChallengeKey = java.lang.String
  type UpdateAccountRequest = AccountRequest
}
