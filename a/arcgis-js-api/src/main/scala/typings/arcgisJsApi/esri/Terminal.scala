package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Terminal
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A unique numeric identifer for the terminal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html#id)
    */
  var id: Double = js.native
  
  /**
    * The name of the terminal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html#name)
    */
  var name: String = js.native
}
