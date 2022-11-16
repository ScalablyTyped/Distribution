package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalConstructor
  extends StObject
     with Instantiable0[Portal]
     with Instantiable1[/* properties */ PortalProperties, Portal] {
  
  /**
    * A new `Portal` instance is created the first time this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#getDefault)
    */
  def getDefault(): Portal = js.native
}
