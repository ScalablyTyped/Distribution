package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependenciesParams extends ErrorParameters {
  var deps: java.lang.String
  var depsCount: scala.Double
  var missingProperty: java.lang.String
  var property: java.lang.String
}

object DependenciesParams {
  @scala.inline
  def apply(
    deps: java.lang.String,
    depsCount: scala.Double,
    missingProperty: java.lang.String,
    property: java.lang.String
  ): DependenciesParams = {
    val __obj = js.Dynamic.literal(deps = deps, depsCount = depsCount, missingProperty = missingProperty, property = property)
  
    __obj.asInstanceOf[DependenciesParams]
  }
}

