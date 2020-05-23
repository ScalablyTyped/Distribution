package typings.antDesignReactNative.anon

import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyNumber extends Operation {
  var key: Double
  var `type`: unmount
}

object KeyNumber {
  @scala.inline
  def apply(key: Double, `type`: unmount): KeyNumber = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyNumber]
  }
}

