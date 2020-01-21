package typings.atmosphereJs.Atmosphere_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atmosphere extends js.Object {
  var AtmosphereRequest: js.UndefOr[typings.atmosphereJs.Atmosphere_.AtmosphereRequest] = js.undefined
  /**
    * The atmosphere API is a little bit special here: the first parameter can either be
    * a URL string or a Request object. If it is a URL string, then the additional parameters are expected.
    */
  var subscribe: js.UndefOr[
    js.Function3[
      /* requestOrUrl */ js.Any, 
      /* callback */ js.UndefOr[js.Function], 
      /* request */ js.UndefOr[Request], 
      Request
    ]
  ] = js.undefined
  var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Atmosphere {
  @scala.inline
  def apply(
    AtmosphereRequest: AtmosphereRequest = null,
    subscribe: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => Request = null,
    unsubscribe: () => Unit = null
  ): Atmosphere = {
    val __obj = js.Dynamic.literal()
    if (AtmosphereRequest != null) __obj.updateDynamic("AtmosphereRequest")(AtmosphereRequest.asInstanceOf[js.Any])
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction3(subscribe))
    if (unsubscribe != null) __obj.updateDynamic("unsubscribe")(js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Atmosphere]
  }
}

