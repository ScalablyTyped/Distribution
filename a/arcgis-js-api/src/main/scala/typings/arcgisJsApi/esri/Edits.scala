package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edits
  extends StObject
     with Accessor {
  
  /**
    * The feature to be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html#feature)
    */
  val feature: Graphic = js.native
  
  /**
    * When true, the edited feature has been modified from its original state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html#modified)
    */
  val modified: Boolean = js.native
}
