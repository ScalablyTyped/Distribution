package typings.angularTranslate.mod.angularAugmentingMod.translate

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITranslatePartialLoaderProvider
  extends IServiceProvider
     with IPartialLoader[ITranslatePartialLoaderProvider] {
  
  def setPart(lang: String, part: String, table: ITranslationTable): ITranslatePartialLoaderProvider = js.native
}
