package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionInfo extends Object {
  /**
    * The level of access to the geodatabase version.  **Possible Values:** esriVersionAccessPrivate | esriVersionAccessPublic | esriVersionAccessProtected
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var access: String
  /**
    * The name of the geodatabase version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var name: String
  /**
    * The name of the parent version of the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#VersionInfo)
    */
  var parent: String
}

object VersionInfo {
  @scala.inline
  def apply(
    access: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    parent: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VersionInfo = {
    val __obj = js.Dynamic.literal(access = access, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, parent = parent, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[VersionInfo]
  }
}

