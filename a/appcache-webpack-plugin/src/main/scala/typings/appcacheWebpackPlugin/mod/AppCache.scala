package typings.appcacheWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("appcache-webpack-plugin", "AppCache")
@js.native
class AppCache protected () extends js.Object {
  def this(
    cache: String,
    network: js.Array[String],
    fallback: js.Array[String],
    settings: js.Array[String],
    hash: String,
    comment: String
  ) = this()
  
  def addAsset(asset: String): Unit = js.native
  
  def getManifestBody(): String = js.native
  
  def size(): Double = js.native
  
  def source(): String = js.native
}
