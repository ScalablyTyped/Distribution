package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait decoratorsPropertyPropertyMetadata extends StObject {
  
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[String] = js.undefined
  
  /**
    * The function to use to [autocast](https://developers.arcgis.com/javascript/latest/programming-patterns/#autocasting) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var cast: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Indicates whether the property can be set during construction but is otherwise read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var constructOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Property names of dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the property is read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The constructor used to [autocast](https://developers.arcgis.com/javascript/latest/programming-patterns/#autocasting) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var `type`: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The default value for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var value: js.UndefOr[Any] = js.undefined
}
object decoratorsPropertyPropertyMetadata {
  
  inline def apply(): decoratorsPropertyPropertyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[decoratorsPropertyPropertyMetadata]
  }
  
  extension [Self <: decoratorsPropertyPropertyMetadata](x: Self) {
    
    inline def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
    
    inline def setAliasOfUndefined: Self = StObject.set(x, "aliasOf", js.undefined)
    
    inline def setCast(value: js.Function): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    inline def setConstructOnly(value: Boolean): Self = StObject.set(x, "constructOnly", value.asInstanceOf[js.Any])
    
    inline def setConstructOnlyUndefined: Self = StObject.set(x, "constructOnly", js.undefined)
    
    inline def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setType(value: js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
