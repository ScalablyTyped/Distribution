package typings.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsrDomains extends js.Object {
  var altNames: js.Array[String]
  var commonName: String
}

object CsrDomains {
  @scala.inline
  def apply(altNames: js.Array[String], commonName: String): CsrDomains = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CsrDomains]
  }
}

