package typings.appcacheWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 'additional assets to cache
    */
  var cache: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @default ''
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Assets in the compilation that match any of these patterns will be excluded from the manifest.
    * @default []
    */
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
    * Fallback assets
    */
  var fallback: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Assets that may be accessed via the network.
    * @default ['*']
    */
  var network: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The filename to write the appcache to
    * @default 'manifest.appcache'
    */
  var output: js.UndefOr[String] = js.undefined
  /**
    * Settings
    */
  var settings: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: js.Array[String] = null,
    comment: String = null,
    exclude: js.Array[String | RegExp] = null,
    fallback: js.Array[String] = null,
    network: js.UndefOr[Null | js.Array[String]] = js.undefined,
    output: String = null,
    settings: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(network)) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

