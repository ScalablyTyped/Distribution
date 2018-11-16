package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DynamicComponentGetViewStrategy extends js.Object {
  /**
        * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
        */
  def getViewStrategy(): java.lang.String | ViewStrategy
}

