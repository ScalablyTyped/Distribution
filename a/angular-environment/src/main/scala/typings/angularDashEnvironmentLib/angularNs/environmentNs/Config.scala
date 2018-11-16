package typings
package angularDashEnvironmentLib.angularNs.environmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  /**
       * Map of domains to their environments
       */
  var domains: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /**
       * List of variables split by environment
       */
  var vars: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Any]]
}

