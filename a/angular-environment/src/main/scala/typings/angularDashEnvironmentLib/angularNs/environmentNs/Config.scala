package typings
package angularDashEnvironmentLib.angularNs.environmentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Map of domains to their environments
    */
  var domains: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /**
    * List of variables split by environment
    */
  var vars: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
}

object Config {
  @scala.inline
  def apply(
    domains: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    vars: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ): Config = {
    val __obj = js.Dynamic.literal(domains = domains, vars = vars)
  
    __obj.asInstanceOf[Config]
  }
}

