package typings.awsDashSdk.libPollyPresignerMod.PresignerNs

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.clientsPollyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresignerOptions extends js.Object {
  /**
    * An optional map of parameters to bind to every request sent by this service object. 
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
    */
  var service: js.UndefOr[^] = js.undefined
}

object PresignerOptions {
  @scala.inline
  def apply(params: StringDictionary[js.Any] = null, service: ^ = null): PresignerOptions = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[PresignerOptions]
  }
}

