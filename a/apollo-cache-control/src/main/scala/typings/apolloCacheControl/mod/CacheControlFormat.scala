package typings.apolloCacheControl.mod

import typings.apolloCacheControl.AnonPath
import typings.apolloCacheControl.apolloCacheControlNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlFormat extends js.Object {
  var hints: js.Array[AnonPath with CacheHint]
  var version: `1`
}

object CacheControlFormat {
  @scala.inline
  def apply(hints: js.Array[AnonPath with CacheHint], version: `1`): CacheControlFormat = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheControlFormat]
  }
}

