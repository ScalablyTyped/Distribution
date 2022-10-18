package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LinearUnit
import typings.arcgisJsApi.esri.LinearUnitConstructor
import typings.arcgisJsApi.esri.LinearUnitProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportLinearUnitMod extends Shortcut {
  
  @JSImport("esri/rest/support/LinearUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LinearUnitConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/LinearUnit", JSImport.Namespace)
  @js.native
  /**
    * A data object containing a linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LinearUnit.html)
    */
  open class Class ()
    extends StObject
       with LinearUnit {
    def this(properties: LinearUnitProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LinearUnitConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportLinearUnitMod.foo` */
  override def _to: js.Object & LinearUnitConstructor = ^
}
