package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderSource extends js.Object {
  var noCache: scala.Boolean
  var path: java.lang.String
  var src: java.lang.String
}

object LoaderSource {
  @scala.inline
  def apply(noCache: scala.Boolean, path: java.lang.String, src: java.lang.String): LoaderSource = {
    val __obj = js.Dynamic.literal(noCache = noCache, path = path, src = src)
  
    __obj.asInstanceOf[LoaderSource]
  }
}

