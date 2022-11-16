package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValueGroup
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specifies the classes (or unique categories) to group under a [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#heading).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#classes)
    */
  var classes: js.Array[UniqueValueClass] = js.native
  
  /**
    * The heading to be displayed for the group of unique classes in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#heading)
    */
  var heading: String = js.native
}
