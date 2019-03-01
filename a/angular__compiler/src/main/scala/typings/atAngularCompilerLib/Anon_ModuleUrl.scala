package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModuleUrl extends js.Object {
  var moduleUrl: js.UndefOr[java.lang.String] = js.undefined
  var styleUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ModuleUrl {
  @scala.inline
  def apply(
    moduleUrl: java.lang.String = null,
    styleUrls: js.Array[java.lang.String] = null,
    styles: js.Array[java.lang.String] = null
  ): Anon_ModuleUrl = {
    val __obj = js.Dynamic.literal()
    if (moduleUrl != null) __obj.updateDynamic("moduleUrl")(moduleUrl)
    if (styleUrls != null) __obj.updateDynamic("styleUrls")(styleUrls)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[Anon_ModuleUrl]
  }
}

