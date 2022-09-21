package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Domain
import typings.arcgisJsApi.esri.DomainConstructor
import typings.arcgisJsApi.esri.DomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod extends Shortcut {
  
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  /**
    * Domains define constraints on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html)
    */
  open class Class ()
    extends StObject
       with Domain {
    def this(properties: DomainProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `domainMod.foo` */
  override def _to: js.Object & DomainConstructor = ^
}
