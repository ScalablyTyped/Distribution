package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.RequestOptions
import typings.arcgisJsApi.esri.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.request")
@js.native
object request
  extends TopLevel[
      js.Function2[
        /* url */ String, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[RequestResponse]
      ]
    ]
