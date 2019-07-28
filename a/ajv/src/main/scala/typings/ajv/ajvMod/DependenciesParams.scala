package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependenciesParams extends ErrorParameters {
  var deps: String
  var depsCount: Double
  var missingProperty: String
  var property: String
}

object DependenciesParams {
  @scala.inline
  def apply(deps: String, depsCount: Double, missingProperty: String, property: String): DependenciesParams = {
    val __obj = js.Dynamic.literal(deps = deps, depsCount = depsCount, missingProperty = missingProperty, property = property)
  
    __obj.asInstanceOf[DependenciesParams]
  }
}

