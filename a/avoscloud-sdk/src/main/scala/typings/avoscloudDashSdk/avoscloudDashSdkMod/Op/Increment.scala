package typings.avoscloudDashSdk.avoscloudDashSdkMod.Op

import typings.avoscloudDashSdk.avoscloudDashSdkMod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends IBaseObject {
  var amount: Double
}

object Increment {
  @scala.inline
  def apply(amount: Double, toJSON: () => js.Any): Increment = {
    val __obj = js.Dynamic.literal(amount = amount, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Increment]
  }
}

