package typings.assetsDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assetsDashWebpackDashPluginMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.webpack.webpackMod.Plugin

  type Assets = StringDictionary[StringDictionary[String]]
  type AssetsWebpackPlugin = Plugin
  type ProcessOutputFn = js.Function1[/* assets */ Assets, String]
}
