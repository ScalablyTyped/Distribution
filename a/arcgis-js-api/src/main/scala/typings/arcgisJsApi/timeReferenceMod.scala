package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeReference
import typings.arcgisJsApi.esri.TimeReferenceConstructor
import typings.arcgisJsApi.esri.TimeReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeReferenceMod extends Shortcut {
  
  @JSImport("esri/layers/support/TimeReference", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeReferenceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TimeReference", JSImport.Namespace)
  @js.native
  /**
    * TimeReference contains information about how the time was captured when the data was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html)
    */
  open class Class ()
    extends StObject
       with TimeReference {
    def this(properties: TimeReferenceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TimeReferenceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeReferenceMod.foo` */
  override def _to: js.Object & TimeReferenceConstructor = ^
}
