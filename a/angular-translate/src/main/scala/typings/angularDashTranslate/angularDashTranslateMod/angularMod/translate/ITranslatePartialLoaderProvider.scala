package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translate

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITranslatePartialLoaderProvider
  extends IServiceProvider
     with IPartialLoader[ITranslatePartialLoaderProvider] {
  def setPart(lang: String, part: String, table: ITranslationTable): ITranslatePartialLoaderProvider = js.native
}

