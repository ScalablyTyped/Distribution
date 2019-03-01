package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait decorators extends js.Object {
  /**
    * A property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#aliasOf)
    *
    * @param propertyName The aliased property name.
    *
    */
  def aliasOf(propertyName: java.lang.String): js.Function = js.native
  /**
    * This parameter decorator is used to define the function or class for a parameter of a method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#cast)
    *
    * @param classFunction The function or class to cast the parameter
    *
    */
  def cast(classFunction: js.Function): js.Function = js.native
  /**
    * This method decorator is used to define the method that will cast a property from a class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#cast)
    *
    * @param propertyName The property name the function will cast.
    *
    */
  def cast(propertyName: java.lang.String): js.Function = js.native
  /**
    * A function that can be used as a class. It extends [expression](https://www.typescriptlang.org/docs/handbook/release-notes/typescript-1-6.html#extending-expressions) and is used in conjunction with the `@subclass` decorator to create a class compatible to [dojo.declare](https://dojotoolkit.org/reference-guide/1.10/dojo/declare.html). Please refer to the `subclass` documentation for further information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#declared)
    *
    * @param baseClass The class to extend.
    * @param mixinClasses The mixin classes used to extend the base class.
    *
    */
  def declared[T](baseClass: T, mixinClasses: js.Any*): T = js.native
  /**
    * This convenience decorator is used to define an [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html) property. Any property defined with this decorator can now be `get` and `set`. In addition, you can [watch for any property changes](https://developers.arcgis.com/javascript/latest/guide/working-with-props/index.html). Many times this decorator is used in conjunction with the [@renderable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable) decorator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @param propertyMetadata An object describing the property.
    * @param propertyMetadata.dependsOn Property names of dependencies.
    * @param propertyMetadata.type The constructor used to [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html) the property.
    * @param propertyMetadata.cast The function to use to [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html) the property. Alternative to define the `type`. The function is called with the value set by the user and should return the cast value.
    * @param propertyMetadata.readOnly Indicates whether the property is read-only.
    * @param propertyMetadata.constructOnly Indicates whether the property can be set during construction but is otherwise read-only.
    * @param propertyMetadata.aliasOf The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    * @param propertyMetadata.value The default value for the property.
    *
    */
  def property(): js.Function = js.native
  def property(propertyMetadata: decoratorsPropertyPropertyMetadata): js.Function = js.native
  /**
    * A class decorator that must be used together with the `declared` function to create a class compatible to [dojo.declare](https://dojotoolkit.org/reference-guide/1.10/dojo/declare.html). It supports both single and multiple inheritance and can be considered the underlying functionality needed when creating 4.x classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#subclass)
    *
    * @param declaredClass The subclass name.
    *
    */
  def subclass(): js.Function = js.native
  def subclass(declaredClass: java.lang.String): js.Function = js.native
}

