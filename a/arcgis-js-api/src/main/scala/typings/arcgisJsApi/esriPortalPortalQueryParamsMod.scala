package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalQueryParams
import typings.arcgisJsApi.esri.PortalQueryParamsConstructor
import typings.arcgisJsApi.esri.PortalQueryParamsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalQueryParamsMod extends Shortcut {
  
  @JSImport("esri/portal/PortalQueryParams", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalQueryParamsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalQueryParams", JSImport.Namespace)
  @js.native
  /**
    * The parameters used to perform a query for Items, Groups, and Users within a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryParams.html)
    */
  open class Class ()
    extends StObject
       with PortalQueryParams {
    def this(properties: PortalQueryParamsProperties) = this()
  }
  
  type _To = js.Object & PortalQueryParamsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalQueryParamsMod.foo` */
  override def _to: js.Object & PortalQueryParamsConstructor = ^
}
