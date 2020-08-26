package typings.angulartics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBasePath extends js.Object {
  var autoBasePath: Boolean = js.native
  var autoTrackingFirstPage: Boolean = js.native
  var autoTrackingVirtualPages: Boolean = js.native
  var basePath: String = js.native
  var excludedRoutes: js.Array[String] = js.native
  var queryKeysBlacklisted: js.Array[String] = js.native
  var queryKeysWhitelisted: js.Array[String] = js.native
  var trackRelativePath: Boolean = js.native
  var trackRoutes: Boolean = js.native
  var trackStates: Boolean = js.native
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
  @scala.inline
  implicit class AutoBasePathOps[Self <: AutoBasePath] (val x: Self) extends AnyVal {
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
    def setAutoBasePath(value: Boolean): Self = this.set("autoBasePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoTrackingFirstPage(value: Boolean): Self = this.set("autoTrackingFirstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoTrackingVirtualPages(value: Boolean): Self = this.set("autoTrackingVirtualPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedRoutesVarargs(value: String*): Self = this.set("excludedRoutes", js.Array(value :_*))
    @scala.inline
    def setExcludedRoutes(value: js.Array[String]): Self = this.set("excludedRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryKeysBlacklistedVarargs(value: String*): Self = this.set("queryKeysBlacklisted", js.Array(value :_*))
    @scala.inline
    def setQueryKeysBlacklisted(value: js.Array[String]): Self = this.set("queryKeysBlacklisted", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryKeysWhitelistedVarargs(value: String*): Self = this.set("queryKeysWhitelisted", js.Array(value :_*))
    @scala.inline
    def setQueryKeysWhitelisted(value: js.Array[String]): Self = this.set("queryKeysWhitelisted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackRelativePath(value: Boolean): Self = this.set("trackRelativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackRoutes(value: Boolean): Self = this.set("trackRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackStates(value: Boolean): Self = this.set("trackStates", value.asInstanceOf[js.Any])
  }
  
}

