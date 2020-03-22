package typings.algoliaClientAnalytics.mod

import org.scalablytyped.runtime.TopLevel
import typings.algoliaClientCommon.mod.ClientTransporterOptions
import typings.algoliaClientCommon.mod.CreateClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-analytics", "createAnalyticsClient")
@js.native
object createAnalyticsClient extends TopLevel[
      CreateClient[AnalyticsClient, AnalyticsClientOptions with ClientTransporterOptions]
    ]

