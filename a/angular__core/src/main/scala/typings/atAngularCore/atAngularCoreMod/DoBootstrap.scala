package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoBootstrap extends js.Object {
  def ngDoBootstrap(appRef: ApplicationRef): Unit
}

object DoBootstrap {
  @scala.inline
  def apply(ngDoBootstrap: ApplicationRef => Unit): DoBootstrap = {
    val __obj = js.Dynamic.literal(ngDoBootstrap = js.Any.fromFunction1(ngDoBootstrap))
  
    __obj.asInstanceOf[DoBootstrap]
  }
}

