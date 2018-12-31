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

