package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskTransitionName extends js.Object {
  var WrapComponent: String
  var maskTransitionName: String
  var transitionName: String
}

object MaskTransitionName {
  @scala.inline
  def apply(WrapComponent: String, maskTransitionName: String, transitionName: String): MaskTransitionName = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskTransitionName]
  }
}

