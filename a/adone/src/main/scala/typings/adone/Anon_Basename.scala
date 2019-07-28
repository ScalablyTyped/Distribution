package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basename extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var dirname: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Anon_Basename {
  @scala.inline
  def apply(basename: String = null, dirname: String = null, extname: String = null, prefix: String = null): Anon_Basename = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Basename]
  }
}

