package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderToken extends js.Object {
  /**
    * The filename of the provider token key (as supplied by Apple) to load from disk, or a Buffer/String containing the key data.
    */
  var key: nodeLib.Buffer | java.lang.String
  /**
    * The ID of the key issued by Apple
    */
  var keyId: java.lang.String
  /**
    * ID of the team associated with the provider token key
    */
  var teamId: java.lang.String
}

object ProviderToken {
  @scala.inline
  def apply(key: nodeLib.Buffer | java.lang.String, keyId: java.lang.String, teamId: java.lang.String): ProviderToken = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId, teamId = teamId)
  
    __obj.asInstanceOf[ProviderToken]
  }
}

