package typings
package activexDashIwshruntimelibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item(
    obj: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshEnvironment,
    propertyName: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Item,
    parameterTypes: js.Array[java.lang.String],
    newValue: java.lang.String
  ): scala.Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    set_Item: js.Function4[
      activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshEnvironment, 
      activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Item, 
      js.Array[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ]
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(set_Item)
    __obj.asInstanceOf[ActiveXObject]
  }
}

