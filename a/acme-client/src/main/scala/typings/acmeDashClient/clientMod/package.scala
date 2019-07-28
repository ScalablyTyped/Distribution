package typings.acmeDashClient

import typings.acmeDashClient.cryptoForgeMod.PrivateKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type AccountKey = PrivateKey
  type Certificate = String | Buffer
  type CertificateChain = String
  type ChallengeKey = String
  type UpdateAccountRequest = AccountRequest
}
