package typings.arcgisDashJsDashApi

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.__esri.RequestOptions
import typings.arcgisDashJsDashApi.__esri.RequestResponse
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

