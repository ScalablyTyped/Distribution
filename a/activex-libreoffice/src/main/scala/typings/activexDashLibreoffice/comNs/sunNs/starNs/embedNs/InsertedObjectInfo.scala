package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is intended to provide result of creation of an embedded object by dialog. */
trait InsertedObjectInfo extends js.Object {
  /** The new created embedded object. */
  var Object: XEmbeddedObject
  /**
    * Container related options selected by user.
    *
    * A dialog related to embedded object creation usually allows user to make some choices that can be container related. This information can be provided
    * by this member.
    */
  var Options: SafeArray[NamedValue]
}

object InsertedObjectInfo {
  @scala.inline
  def apply(Object: XEmbeddedObject, Options: SafeArray[NamedValue]): InsertedObjectInfo = {
    val __obj = js.Dynamic.literal(Object = Object, Options = Options)
  
    __obj.asInstanceOf[InsertedObjectInfo]
  }
}

