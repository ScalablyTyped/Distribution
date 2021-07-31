package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CodedValueDomain
import typings.arcgisJsApi.esri.CodedValueDomainConstructor
import typings.arcgisJsApi.esri.CodedValueDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codedValueDomainMod extends Shortcut {
  
  @JSImport("esri/layers/support/CodedValueDomain", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CodedValueDomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/CodedValueDomain", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with CodedValueDomain {
    def this(properties: CodedValueDomainProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & CodedValueDomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `codedValueDomainMod.foo` */
  override def _to: js.Object & CodedValueDomainConstructor = ^
}
