package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  var bs: java.lang.String
  var catchPhrase: java.lang.String
  var name: java.lang.String
}

object Company {
  @scala.inline
  def apply(bs: java.lang.String, catchPhrase: java.lang.String, name: java.lang.String): Company = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bs")(bs)
    __obj.updateDynamic("catchPhrase")(catchPhrase)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Company]
  }
}

