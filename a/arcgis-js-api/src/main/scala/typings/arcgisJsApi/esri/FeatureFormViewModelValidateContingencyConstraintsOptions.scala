package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormViewModelValidateContingencyConstraintsOptions
  extends StObject
     with Object {
  
  /**
    * If `true`, return contingency violations for field groups that are invalid because values have not yet been specified for all their fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#validateContingencyConstraints)
    */
  var includeIncompleteViolations: js.UndefOr[Boolean] = js.undefined
}
object FeatureFormViewModelValidateContingencyConstraintsOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureFormViewModelValidateContingencyConstraintsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureFormViewModelValidateContingencyConstraintsOptions]
  }
  
  extension [Self <: FeatureFormViewModelValidateContingencyConstraintsOptions](x: Self) {
    
    inline def setIncludeIncompleteViolations(value: Boolean): Self = StObject.set(x, "includeIncompleteViolations", value.asInstanceOf[js.Any])
    
    inline def setIncludeIncompleteViolationsUndefined: Self = StObject.set(x, "includeIncompleteViolations", js.undefined)
  }
}
