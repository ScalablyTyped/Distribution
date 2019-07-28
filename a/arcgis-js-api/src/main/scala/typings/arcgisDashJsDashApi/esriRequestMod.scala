package typings.arcgisDashJsDashApi

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.RequestOptions
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/request", JSImport.Namespace)
@js.native
object esriRequestMod
  extends TopLevel[
      js.Function2[
        /* url */ String, 
        /* options */ js.UndefOr[RequestOptions], 
        IPromise[RequestResponse]
      ]
    ]

