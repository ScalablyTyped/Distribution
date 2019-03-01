package typings
package angularticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBasePath extends js.Object {
  var autoBasePath: scala.Boolean
  var autoTrackingFirstPage: scala.Boolean
  var autoTrackingVirtualPages: scala.Boolean
  var basePath: java.lang.String
  var excludedRoutes: js.Array[java.lang.String]
  var queryKeysBlacklisted: js.Array[java.lang.String]
  var queryKeysWhitelisted: js.Array[java.lang.String]
  var trackRelativePath: scala.Boolean
  var trackRoutes: scala.Boolean
  var trackStates: scala.Boolean
}

object Anon_AutoBasePath {
  @scala.inline
  def apply(
    autoBasePath: scala.Boolean,
    autoTrackingFirstPage: scala.Boolean,
    autoTrackingVirtualPages: scala.Boolean,
    basePath: java.lang.String,
    excludedRoutes: js.Array[java.lang.String],
    queryKeysBlacklisted: js.Array[java.lang.String],
    queryKeysWhitelisted: js.Array[java.lang.String],
    trackRelativePath: scala.Boolean,
    trackRoutes: scala.Boolean,
    trackStates: scala.Boolean
  ): Anon_AutoBasePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoBasePath")(autoBasePath)
    __obj.updateDynamic("autoTrackingFirstPage")(autoTrackingFirstPage)
    __obj.updateDynamic("autoTrackingVirtualPages")(autoTrackingVirtualPages)
    __obj.updateDynamic("basePath")(basePath)
    __obj.updateDynamic("excludedRoutes")(excludedRoutes)
    __obj.updateDynamic("queryKeysBlacklisted")(queryKeysBlacklisted)
    __obj.updateDynamic("queryKeysWhitelisted")(queryKeysWhitelisted)
    __obj.updateDynamic("trackRelativePath")(trackRelativePath)
    __obj.updateDynamic("trackRoutes")(trackRoutes)
    __obj.updateDynamic("trackStates")(trackStates)
    __obj.asInstanceOf[Anon_AutoBasePath]
  }
}

