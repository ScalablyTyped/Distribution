package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInfoObject extends js.Object {
  @JSName("InfoPath.ViewInfoObject_typekey")
  var InfoPathDotViewInfoObject_typekey: ViewInfoObject
  var IsDefault: Boolean
  val Name: String
}

object ViewInfoObject {
  @scala.inline
  def apply(InfoPathDotViewInfoObject_typekey: ViewInfoObject, IsDefault: Boolean, Name: String): ViewInfoObject = {
    val __obj = js.Dynamic.literal(IsDefault = IsDefault.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ViewInfoObject_typekey")(InfoPathDotViewInfoObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfoObject]
  }
}

