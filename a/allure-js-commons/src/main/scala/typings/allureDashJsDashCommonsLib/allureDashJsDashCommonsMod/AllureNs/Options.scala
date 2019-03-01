package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var targetDir: java.lang.String
}

object Options {
  @scala.inline
  def apply(targetDir: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetDir")(targetDir)
    __obj.asInstanceOf[Options]
  }
}

