package typings.angularAnimate.mod.angularAugmentingMod

import typings.angularAnimate.mod.angularAugmentingMod.animate.IAnimateFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModule extends js.Object {
  def animation(name: String, animationFactory: IAnimateFactory): IModule = js.native
  def animation(name: String, inlineAnnotatedFunction: js.Array[_]): IModule = js.native
  def animation(`object`: js.Object): IModule = js.native
}

