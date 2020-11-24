package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistrictSearch extends js.Object {
  
  def search(keywords: String): Unit = js.native
  def search(keywords: String, callback: js.UndefOr[scala.Nothing], opts: DistrictSearchOptions): Unit = js.native
  def search(
    keywords: String,
    callback: js.Function2[/* status */ String, /* result */ String | DistrictSearchResult, Unit]
  ): Unit = js.native
  def search(
    keywords: String,
    callback: js.Function2[/* status */ String, /* result */ String | DistrictSearchResult, Unit],
    opts: DistrictSearchOptions
  ): Unit = js.native
  
  def setLevel(level: String): Unit = js.native
  
  def setSubdistrict(district: Double): Unit = js.native
}
