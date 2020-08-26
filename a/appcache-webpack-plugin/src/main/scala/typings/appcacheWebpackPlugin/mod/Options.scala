package typings.appcacheWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 'additional assets to cache
    */
  var cache: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default ''
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Assets in the compilation that match any of these patterns will be excluded from the manifest.
    * @default []
    */
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
  /**
    * Fallback assets
    */
  var fallback: js.UndefOr[js.Array[String]] = js.native
  /**
    * Assets that may be accessed via the network.
    * @default ['*']
    */
  var network: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The filename to write the appcache to
    * @default 'manifest.appcache'
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Settings
    */
  var settings: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCacheVarargs(value: String*): Self = this.set("cache", js.Array(value :_*))
    @scala.inline
    def setCache(value: js.Array[String]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String | RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setFallbackVarargs(value: String*): Self = this.set("fallback", js.Array(value :_*))
    @scala.inline
    def setFallback(value: js.Array[String]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setNetworkVarargs(value: String*): Self = this.set("network", js.Array(value :_*))
    @scala.inline
    def setNetwork(value: js.Array[String]): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNetworkNull: Self = this.set("network", null)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: String*): Self = this.set("settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: js.Array[String]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

