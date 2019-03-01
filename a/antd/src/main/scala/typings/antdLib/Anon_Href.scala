package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object Anon_Href {
  @scala.inline
  def apply(href: java.lang.String, title: reactLib.reactMod.ReactNs.ReactNode): Anon_Href = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

