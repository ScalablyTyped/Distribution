package typings.apolloCacheControl.mod

import typings.apolloCacheControl.apolloCacheControlNumbers.`1`
import typings.apolloCacheControl.pathArraystringnumberCach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlFormat extends js.Object {
  var hints: js.Array[pathArraystringnumberCach]
  var version: `1`
}

object CacheControlFormat {
  @scala.inline
  def apply(hints: js.Array[pathArraystringnumberCach], version: `1`): CacheControlFormat = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheControlFormat]
  }
}

