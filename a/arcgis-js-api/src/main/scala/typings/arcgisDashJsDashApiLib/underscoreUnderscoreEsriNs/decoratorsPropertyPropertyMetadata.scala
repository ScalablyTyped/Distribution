package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait decoratorsPropertyPropertyMetadata
  extends stdLib.Object {
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[java.lang.String] = js.undefined
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
  var constructOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Property names of dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var dependsOn: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates whether the property is read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @default false
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    aliasOf: java.lang.String = null,
    cast: js.Function = null,
    constructOnly: js.UndefOr[scala.Boolean] = js.undefined,
    dependsOn: js.Array[java.lang.String] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.Function = null,
    value: js.Any = null
  ): decoratorsPropertyPropertyMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
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

