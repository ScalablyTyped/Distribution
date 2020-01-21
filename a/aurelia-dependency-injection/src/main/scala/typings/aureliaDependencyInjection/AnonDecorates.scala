package typings.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecorates extends js.Object {
  var decorates: js.UndefOr[
    js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.Anon_Container */ Boolean]
  ] = js.undefined
}

object AnonDecorates {
  @scala.inline
  def apply(decorates: /* key */ js.Any => /* is aurelia-dependency-injection.Anon_Container */ Boolean = null): AnonDecorates = {
    val __obj = js.Dynamic.literal()
    if (decorates != null) __obj.updateDynamic("decorates")(js.Any.fromFunction1(decorates))
    __obj.asInstanceOf[AnonDecorates]
  }
}

