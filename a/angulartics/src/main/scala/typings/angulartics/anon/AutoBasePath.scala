package typings.angulartics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoBasePath extends js.Object {
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

object AutoBasePath {
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
  ): AutoBasePath = {
    val __obj = js.Dynamic.literal(autoBasePath = autoBasePath.asInstanceOf[js.Any], autoTrackingFirstPage = autoTrackingFirstPage.asInstanceOf[js.Any], autoTrackingVirtualPages = autoTrackingVirtualPages.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], excludedRoutes = excludedRoutes.asInstanceOf[js.Any], queryKeysBlacklisted = queryKeysBlacklisted.asInstanceOf[js.Any], queryKeysWhitelisted = queryKeysWhitelisted.asInstanceOf[js.Any], trackRelativePath = trackRelativePath.asInstanceOf[js.Any], trackRoutes = trackRoutes.asInstanceOf[js.Any], trackStates = trackStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoBasePath]
  }
}

