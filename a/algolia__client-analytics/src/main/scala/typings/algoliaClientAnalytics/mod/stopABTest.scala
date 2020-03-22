package typings.algoliaClientAnalytics.mod

import typings.algoliaClientAnalytics.ReadonlyPromiseStopABTest
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-analytics", "stopABTest")
@js.native
object stopABTest extends js.Object {
  def apply(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseStopABTest
  ] = js.native
}

