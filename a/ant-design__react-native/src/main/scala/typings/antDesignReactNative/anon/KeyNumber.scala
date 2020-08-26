package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyNumber extends Operation {
  var key: Double = js.native
  var `type`: unmount = js.native
}

object KeyNumber {
  @scala.inline
  def apply(key: Double, `type`: unmount): KeyNumber = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNumber]
  }
  @scala.inline
  implicit class KeyNumberOps[Self <: KeyNumber] (val x: Self) extends AnyVal {
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
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: unmount): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

