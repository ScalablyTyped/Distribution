package typings
package awsDashSdkLib.libPollyPresignerMod.PresignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresignerOptions extends js.Object {
  /**
    * An optional map of parameters to bind to every request sent by this service object. 
    */
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
    */
  var service: js.UndefOr[awsDashSdkLib.clientsPollyMod.namespaced] = js.undefined
}

object PresignerOptions {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    service: awsDashSdkLib.clientsPollyMod.namespaced = null
  ): PresignerOptions = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[PresignerOptions]
  }
}

