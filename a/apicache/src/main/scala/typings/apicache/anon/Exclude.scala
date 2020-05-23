package typings.apicache.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclude extends js.Object {
  /** list status codes to specifically exclude (e.g. [404, 403] cache all responses unless they had a 404 or 403 status) */
  var exclude: js.UndefOr[js.Array[Double]] = js.undefined
  /** list status codes to require (e.g. [200] caches ONLY responses with a success/200 code) */
  var include: js.UndefOr[js.Array[Double]] = js.undefined
}

object Exclude {
  @scala.inline
  def apply(exclude: js.Array[Double] = null, include: js.Array[Double] = null): Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclude]
  }
}

