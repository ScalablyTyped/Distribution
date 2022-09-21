package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GPMessage
import typings.arcgisJsApi.esri.GPMessageConstructor
import typings.arcgisJsApi.esri.GPMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpmessageMod extends Shortcut {
  
  @JSImport("esri/rest/support/GPMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GPMessageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/GPMessage", JSImport.Namespace)
  @js.native
  /**
    * Represents a message generated during the execution of a module:esri/rest/Geoprocessor method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GPMessage.html)
    */
  open class Class ()
    extends StObject
       with GPMessage {
    def this(properties: GPMessageProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GPMessageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `gpmessageMod.foo` */
  override def _to: js.Object & GPMessageConstructor = ^
}
