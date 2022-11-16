package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PortalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Portal")
@js.native
/**
  * The Portal class is part of the [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/) that provides a way to build applications that work with content from [ArcGIS Online](https://www.arcgis.com/home/) or an [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html)
  */
open class Portal ()
  extends StObject
     with typings.arcgisJsApi.esri.Portal {
  def this(properties: PortalProperties) = this()
}
/* static members */
object Portal {
  
  @JSGlobal("__esri.Portal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A new `Portal` instance is created the first time this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#getDefault)
    */
  inline def getDefault(): typings.arcgisJsApi.esri.Portal = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typings.arcgisJsApi.esri.Portal]
}
