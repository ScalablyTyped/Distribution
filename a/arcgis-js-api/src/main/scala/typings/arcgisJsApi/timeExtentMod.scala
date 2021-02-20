package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeExtent
import typings.arcgisJsApi.esri.TimeExtentConstructor
import typings.arcgisJsApi.esri.TimeExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeExtentMod extends Shortcut {
  
  @JSImport("esri/TimeExtent", JSImport.Namespace)
  @js.native
  val ^ : TimeExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/TimeExtent", JSImport.Namespace)
  @js.native
  /**
    * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
    */
  class Class () extends TimeExtent {
    def this(properties: TimeExtentProperties) = this()
  }
  
  type _To = TimeExtentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeExtentMod.foo` */
  override def _to: TimeExtentConstructor = ^
}
