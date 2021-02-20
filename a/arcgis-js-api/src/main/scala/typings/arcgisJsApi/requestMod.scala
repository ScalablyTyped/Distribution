package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RequestOptions
import typings.arcgisJsApi.esri.RequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod extends Shortcut {
  
  @JSImport("esri/request", JSImport.Namespace)
  @js.native
  val ^ : js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ] = js.native
  
  type _To = js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `requestMod.foo` */
  override def _to: js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ] = ^
}
