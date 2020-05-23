package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.WindowsCollection_typekey")
  var InfoPathDotWindowsCollection_typekey: WindowsCollection
  def Item(varIndex: js.Any): Window
}

object WindowsCollection {
  @scala.inline
  def apply(Count: Double, InfoPathDotWindowsCollection_typekey: WindowsCollection, Item: js.Any => Window): WindowsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.WindowsCollection_typekey")(InfoPathDotWindowsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsCollection]
  }
}

