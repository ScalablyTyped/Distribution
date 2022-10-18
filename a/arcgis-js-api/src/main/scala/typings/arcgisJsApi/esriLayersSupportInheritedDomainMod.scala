package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.InheritedDomain
import typings.arcgisJsApi.esri.InheritedDomainConstructor
import typings.arcgisJsApi.esri.InheritedDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportInheritedDomainMod extends Shortcut {
  
  @JSImport("esri/layers/support/InheritedDomain", JSImport.Namespace)
  @js.native
  val ^ : js.Object & InheritedDomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/InheritedDomain", JSImport.Namespace)
  @js.native
  /**
    * This is a subclass of [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html)
    */
  open class Class ()
    extends StObject
       with InheritedDomain {
    def this(properties: InheritedDomainProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & InheritedDomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportInheritedDomainMod.foo` */
  override def _to: js.Object & InheritedDomainConstructor = ^
}
