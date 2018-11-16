package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExistingProvider extends ExistingSansProvider {
  /**
       * If true, then injector returns an array of instances. This is useful to allow multiple
       * providers spread across many files to provide configuration information to a common token.
       */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
       */
  var provide: js.Any
}

