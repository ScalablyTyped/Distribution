package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalRating
import typings.arcgisJsApi.esri.PortalRatingConstructor
import typings.arcgisJsApi.esri.PortalRatingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalRatingMod extends Shortcut {
  
  @JSImport("esri/portal/PortalRating", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalRatingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalRating", JSImport.Namespace)
  @js.native
  /**
    * PortalRating provides details about the rating associated with a [Portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html)
    */
  open class Class ()
    extends StObject
       with PortalRating {
    def this(properties: PortalRatingProperties) = this()
  }
  
  type _To = js.Object & PortalRatingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalRatingMod.foo` */
  override def _to: js.Object & PortalRatingConstructor = ^
}
