package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModuleUrl extends js.Object {
  var moduleUrl: js.UndefOr[String] = js.undefined
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ModuleUrl {
  @scala.inline
  def apply(moduleUrl: String = null, styleUrls: js.Array[String] = null, styles: js.Array[String] = null): Anon_ModuleUrl = {
    val __obj = js.Dynamic.literal()
    if (moduleUrl != null) __obj.updateDynamic("moduleUrl")(moduleUrl.asInstanceOf[js.Any])
    if (styleUrls != null) __obj.updateDynamic("styleUrls")(styleUrls.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ModuleUrl]
  }
}

