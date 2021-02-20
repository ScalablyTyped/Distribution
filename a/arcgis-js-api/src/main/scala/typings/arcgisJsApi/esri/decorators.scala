package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait decorators extends StObject {
  
  /**
    * A property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#aliasOf)
    */
  def aliasOf(propertyName: String): js.Function = js.native
  
  /**
    * This property decorator is used to define the function or class for a property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#cast)
    */
  def cast(functionOrClass: js.Function): js.Function = js.native
  /**
    * This method decorator is used to define the method that will cast a property from a class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#cast)
    */
  def cast(propertyName: String): js.Function = js.native
  
  /**
    * A function that can be used as a class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#declared)
    */
  def declared[T](baseClass: T, mixinClasses: js.Array[_]*): T = js.native
  
  /**
    * This convenience decorator is used to define an [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  def property(): js.Function = js.native
  def property(propertyMetadata: decoratorsPropertyPropertyMetadata): js.Function = js.native
  
  def subclass(): js.Function = js.native
  def subclass(declaredClass: String): js.Function = js.native
}
