package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var position: LngLat
}

object Anon_Name {
  @scala.inline
  def apply(name: String, position: LngLat): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

