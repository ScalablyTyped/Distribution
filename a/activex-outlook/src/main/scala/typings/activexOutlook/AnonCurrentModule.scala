package typings.activexOutlook

import typings.activexOutlook.Outlook.NavigationModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentModule extends js.Object {
  val CurrentModule: NavigationModule
}

object AnonCurrentModule {
  @scala.inline
  def apply(CurrentModule: NavigationModule): AnonCurrentModule = {
    val __obj = js.Dynamic.literal(CurrentModule = CurrentModule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentModule]
  }
}

