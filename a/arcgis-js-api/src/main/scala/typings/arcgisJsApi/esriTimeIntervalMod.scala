package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeInterval
import typings.arcgisJsApi.esri.TimeIntervalConstructor
import typings.arcgisJsApi.esri.TimeIntervalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriTimeIntervalMod extends Shortcut {
  
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeIntervalConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  /**
    * TimeInterval is a class that describes a length of time in one of ten temporal units such as seconds, days, or years.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html)
    */
  open class Class ()
    extends StObject
       with TimeInterval {
    def this(properties: TimeIntervalProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TimeIntervalConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriTimeIntervalMod.foo` */
  override def _to: js.Object & TimeIntervalConstructor = ^
}
