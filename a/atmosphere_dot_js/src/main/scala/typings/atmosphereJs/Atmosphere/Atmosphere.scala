package typings.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atmosphere extends js.Object {
  var AtmosphereRequest: js.UndefOr[typings.atmosphereJs.Atmosphere.AtmosphereRequest] = js.native
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
  ] = js.native
  var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.native
}

object Atmosphere {
  @scala.inline
  def apply(): Atmosphere = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Atmosphere]
  }
  @scala.inline
  implicit class AtmosphereOps[Self <: typings.atmosphereJs.Atmosphere.Atmosphere] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtmosphereRequest(value: AtmosphereRequest): Self = this.set("AtmosphereRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtmosphereRequest: Self = this.set("AtmosphereRequest", js.undefined)
    @scala.inline
    def setSubscribe(
      value: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => Request
    ): Self = this.set("subscribe", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnsubscribe: Self = this.set("unsubscribe", js.undefined)
  }
  
}

