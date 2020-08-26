package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is intended to provide result of creation of an embedded object by dialog. */
@js.native
trait InsertedObjectInfo extends js.Object {
  /** The new created embedded object. */
  var Object: XEmbeddedObject = js.native
  /**
    * Container related options selected by user.
    *
    * A dialog related to embedded object creation usually allows user to make some choices that can be container related. This information can be provided
    * by this member.
    */
  var Options: SafeArray[NamedValue] = js.native
}

object InsertedObjectInfo {
  @scala.inline
  def apply(Object: XEmbeddedObject, Options: SafeArray[NamedValue]): InsertedObjectInfo = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertedObjectInfo]
  }
  @scala.inline
  implicit class InsertedObjectInfoOps[Self <: InsertedObjectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObject(value: XEmbeddedObject): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: SafeArray[NamedValue]): Self = this.set("Options", value.asInstanceOf[js.Any])
  }
  
}

