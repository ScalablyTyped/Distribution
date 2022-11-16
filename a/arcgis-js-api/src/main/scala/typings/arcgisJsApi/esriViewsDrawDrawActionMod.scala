package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DrawAction
import typings.arcgisJsApi.esri.DrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawDrawActionMod {
  
  @JSImport("esri/views/draw/DrawAction", JSImport.Namespace)
  @js.native
  /**
    * DrawAction is the base class for all draw actions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html)
    */
  open class ^ ()
    extends StObject
       with DrawAction {
    def this(properties: DrawActionProperties) = this()
  }
}
