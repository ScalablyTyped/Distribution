package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.DistrictSearch")
@js.native
class DistrictSearch protected () extends js.Object {
  def this(opts: DistrictSearchOptions) = this()
  def search(keywords: java.lang.String): scala.Unit = js.native
  def search(
    keywords: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | DistrictSearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    keywords: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | DistrictSearchResult, 
      scala.Unit
    ],
    opts: DistrictSearchOptions
  ): scala.Unit = js.native
  def setLevel(level: java.lang.String): scala.Unit = js.native
  def setSubdistrict(district: scala.Double): scala.Unit = js.native
}

