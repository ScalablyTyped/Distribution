package typings.antdMobile

import typings.antdMobile.anon.Close
import typings.antdMobile.anon.Text
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  def default(title: ReactNode, message: ReactNode): Close = js.native
  def default(title: ReactNode, message: ReactNode, actions: js.Array[Text]): Close = js.native
  def default(title: ReactNode, message: ReactNode, actions: js.Array[Text], platform: String): Close = js.native
}

