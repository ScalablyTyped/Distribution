package typings.arcgisJsApi

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.esri.RequestOptions
import typings.arcgisJsApi.esri.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/request", JSImport.Namespace)
@js.native
object requestMod
  extends TopLevel[
      js.Function2[
        /* url */ String, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[RequestResponse]
      ]
    ]
