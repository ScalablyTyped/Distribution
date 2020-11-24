package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapViewBase extends js.Object {
  
  /**
    * Sets the view to a given target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  def goTo(target: GoToTarget2D): js.Promise[_] = js.native
  def goTo(target: GoToTarget2D, options: GoToOptions2D): js.Promise[_] = js.native
}
