package typings.apn.apnMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderToken extends js.Object {
  /**
    * The filename of the provider token key (as supplied by Apple) to load from disk, or a Buffer/String containing the key data.
    */
  var key: Buffer | String
  /**
    * The ID of the key issued by Apple
    */
  var keyId: String
  /**
    * ID of the team associated with the provider token key
    */
  var teamId: String
}

object ProviderToken {
  @scala.inline
  def apply(key: Buffer | String, keyId: String, teamId: String): ProviderToken = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId, teamId = teamId)
  
    __obj.asInstanceOf[ProviderToken]
  }
}

