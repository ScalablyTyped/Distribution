package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait decoratorsPropertyPropertyMetadata extends Object {
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[String] = js.undefined
  /**
    * The function to use to [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html) the property. Alternative to define the `type`. The function is called with the value set by the user and should return the cast value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var cast: js.UndefOr[js.Function] = js.undefined
  /**
    * Indicates whether the property can be set during construction but is otherwise read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @default false
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
    *
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The constructor used to [autocast](https://developers.arcgis.com/javascript/latest/guide/autocasting/index.html) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var `type`: js.UndefOr[js.Function] = js.undefined
  /**
    * The default value for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object decoratorsPropertyPropertyMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    aliasOf: String = null,
    cast: js.Function = null,
    constructOnly: js.UndefOr[Boolean] = js.undefined,
    dependsOn: js.Array[String] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    `type`: js.Function = null,
    value: js.Any = null
  ): decoratorsPropertyPropertyMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (aliasOf != null) __obj.updateDynamic("aliasOf")(aliasOf)
    if (cast != null) __obj.updateDynamic("cast")(cast)
    if (!js.isUndefined(constructOnly)) __obj.updateDynamic("constructOnly")(constructOnly)
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[decoratorsPropertyPropertyMetadata]
  }
}

