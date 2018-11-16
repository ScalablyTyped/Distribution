package typings
package awsDashSdkLib.libPollyPresignerMod.PresignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PresignerOptions extends js.Object {
  /**
       * An optional map of parameters to bind to every request sent by this service object. 
       */
  var params: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
       * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
       */
  var service: js.UndefOr[awsDashSdkLib.clientsPollyMod.namespaced] = js.undefined
}

