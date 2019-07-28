package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionValue extends js.Object {
  var id: String
  var name: String
}

object ResolutionValue {
  @scala.inline
  def apply(id: String, name: String): ResolutionValue = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ResolutionValue]
  }
}

