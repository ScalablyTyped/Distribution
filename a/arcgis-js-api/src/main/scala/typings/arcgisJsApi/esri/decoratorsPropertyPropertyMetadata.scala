package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait decoratorsPropertyPropertyMetadata extends Object {
  
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[String] = js.native
  
  /**
    * The function to use to [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var cast: js.UndefOr[js.Function] = js.native
  
  /**
    * Indicates whether the property can be set during construction but is otherwise read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var constructOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Property names of dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var dependsOn: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the property is read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The constructor used to [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var `type`: js.UndefOr[js.Function] = js.native
  
  /**
    * The default value for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var value: js.UndefOr[js.Any] = js.native
}
object decoratorsPropertyPropertyMetadata {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): decoratorsPropertyPropertyMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[decoratorsPropertyPropertyMetadata]
  }
  
  @scala.inline
  implicit class decoratorsPropertyPropertyMetadataMutableBuilder[Self <: decoratorsPropertyPropertyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasOfUndefined: Self = StObject.set(x, "aliasOf", js.undefined)
    
    @scala.inline
    def setCast(value: js.Function): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    @scala.inline
    def setConstructOnly(value: Boolean): Self = StObject.set(x, "constructOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructOnlyUndefined: Self = StObject.set(x, "constructOnly", js.undefined)
    
    @scala.inline
    def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setType(value: js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
