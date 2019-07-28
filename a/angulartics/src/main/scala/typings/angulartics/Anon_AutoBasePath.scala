package typings.angulartics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBasePath extends js.Object {
  var autoBasePath: Boolean
  var autoTrackingFirstPage: Boolean
  var autoTrackingVirtualPages: Boolean
  var basePath: String
  var excludedRoutes: js.Array[String]
  var queryKeysBlacklisted: js.Array[String]
  var queryKeysWhitelisted: js.Array[String]
  var trackRelativePath: Boolean
  var trackRoutes: Boolean
  var trackStates: Boolean
}

object Anon_AutoBasePath {
  @scala.inline
  def apply(
    autoBasePath: Boolean,
    autoTrackingFirstPage: Boolean,
    autoTrackingVirtualPages: Boolean,
    basePath: String,
    excludedRoutes: js.Array[String],
    queryKeysBlacklisted: js.Array[String],
    queryKeysWhitelisted: js.Array[String],
    trackRelativePath: Boolean,
    trackRoutes: Boolean,
    trackStates: Boolean
  ): Anon_AutoBasePath = {
    val __obj = js.Dynamic.literal(autoBasePath = autoBasePath, autoTrackingFirstPage = autoTrackingFirstPage, autoTrackingVirtualPages = autoTrackingVirtualPages, basePath = basePath, excludedRoutes = excludedRoutes, queryKeysBlacklisted = queryKeysBlacklisted, queryKeysWhitelisted = queryKeysWhitelisted, trackRelativePath = trackRelativePath, trackRoutes = trackRoutes, trackStates = trackStates)
  
    __obj.asInstanceOf[Anon_AutoBasePath]
  }
}

