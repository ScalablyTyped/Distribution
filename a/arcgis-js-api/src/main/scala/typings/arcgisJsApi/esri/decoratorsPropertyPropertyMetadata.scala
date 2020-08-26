package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait decoratorsPropertyPropertyMetadata extends Object {
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[String] = js.native
  /**
    * The function to use to [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting) the property. Alternative to define the `type`. The function is called with the value set by the user and should return the cast value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var cast: js.UndefOr[js.Function] = js.native
  /**
    * Indicates whether the property can be set during construction but is otherwise read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @default false
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
    *
    * @default false
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
  implicit class decoratorsPropertyPropertyMetadataOps[Self <: decoratorsPropertyPropertyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasOf(value: String): Self = this.set("aliasOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasOf: Self = this.set("aliasOf", js.undefined)
    @scala.inline
    def setCast(value: js.Function): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setConstructOnly(value: Boolean): Self = this.set("constructOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstructOnly: Self = this.set("constructOnly", js.undefined)
    @scala.inline
    def setDependsOnVarargs(value: String*): Self = this.set("dependsOn", js.Array(value :_*))
    @scala.inline
    def setDependsOn(value: js.Array[String]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setType(value: js.Function): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

