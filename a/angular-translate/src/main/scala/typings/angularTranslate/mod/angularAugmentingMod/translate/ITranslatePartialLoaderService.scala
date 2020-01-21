package typings.angularTranslate.mod.angularAugmentingMod.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslatePartialLoaderService extends IPartialLoader[ITranslatePartialLoaderService] {
  def getRegisteredParts(): js.Array[String] = js.native
  def isPartLoaded(name: String, lang: String): Boolean = js.native
}

