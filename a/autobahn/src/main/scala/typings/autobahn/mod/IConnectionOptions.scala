package typings.autobahn.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionOptions extends js.Object {
  var authid: js.UndefOr[String] = js.native
  var authmethods: js.UndefOr[js.Array[String]] = js.native
  var initial_retry_delay: js.UndefOr[Double] = js.native
  var max_retries: js.UndefOr[Double] = js.native
  var max_retry_delay: js.UndefOr[Double] = js.native
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.native
  var protocols: js.UndefOr[js.Array[String]] = js.native
  var realm: String = js.native
  var retry_delay_growth: js.UndefOr[Double] = js.native
  var retry_delay_jitter: js.UndefOr[Double] = js.native
  var retry_if_unreachable: js.UndefOr[Boolean] = js.native
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.native
  var url: js.UndefOr[String] = js.native
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.native
  var use_es6_promises: js.UndefOr[Boolean] = js.native
}

object IConnectionOptions {
  @scala.inline
  def apply(realm: String): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionOptions]
  }
  @scala.inline
  implicit class IConnectionOptionsOps[Self <: IConnectionOptions] (val x: Self) extends AnyVal {
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
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthid(value: String): Self = this.set("authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthid: Self = this.set("authid", js.undefined)
    @scala.inline
    def setAuthmethodsVarargs(value: String*): Self = this.set("authmethods", js.Array(value :_*))
    @scala.inline
    def setAuthmethods(value: js.Array[String]): Self = this.set("authmethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthmethods: Self = this.set("authmethods", js.undefined)
    @scala.inline
    def setInitial_retry_delay(value: Double): Self = this.set("initial_retry_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial_retry_delay: Self = this.set("initial_retry_delay", js.undefined)
    @scala.inline
    def setMax_retries(value: Double): Self = this.set("max_retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_retries: Self = this.set("max_retries", js.undefined)
    @scala.inline
    def setMax_retry_delay(value: Double): Self = this.set("max_retry_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_retry_delay: Self = this.set("max_retry_delay", js.undefined)
    @scala.inline
    def setOnchallenge(
      value: (/* session */ Session, /* method */ String, /* extra */ js.Any) => String | Promise[String]
    ): Self = this.set("onchallenge", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnchallenge: Self = this.set("onchallenge", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setRetry_delay_growth(value: Double): Self = this.set("retry_delay_growth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_delay_growth: Self = this.set("retry_delay_growth", js.undefined)
    @scala.inline
    def setRetry_delay_jitter(value: Double): Self = this.set("retry_delay_jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_delay_jitter: Self = this.set("retry_delay_jitter", js.undefined)
    @scala.inline
    def setRetry_if_unreachable(value: Boolean): Self = this.set("retry_if_unreachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_if_unreachable: Self = this.set("retry_if_unreachable", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: ITransportDefinition*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[ITransportDefinition]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUse_deferred(value: () => Promise[js.Any]): Self = this.set("use_deferred", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUse_deferred: Self = this.set("use_deferred", js.undefined)
    @scala.inline
    def setUse_es6_promises(value: Boolean): Self = this.set("use_es6_promises", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_es6_promises: Self = this.set("use_es6_promises", js.undefined)
  }
  
}

