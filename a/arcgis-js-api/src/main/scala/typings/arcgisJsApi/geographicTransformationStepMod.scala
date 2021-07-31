package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeographicTransformationStep
import typings.arcgisJsApi.esri.GeographicTransformationStepConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geographicTransformationStepMod extends Shortcut {
  
  @JSImport("esri/geometry/support/GeographicTransformationStep", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeographicTransformationStepConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/GeographicTransformationStep", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with GeographicTransformationStep {
    def this(properties: js.Any) = this()
    
    /**
      * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
      */
    /* CompleteClass */
    override def getInverse(): GeographicTransformationStep = js.native
    
    /**
      * Indicates with the geographic transformation is inverted.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
      */
    /* CompleteClass */
    var isInverse: Boolean = js.native
    
    /**
      * The well-known id (wkid) hat represents a known geographic transformation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
      */
    /* CompleteClass */
    var wkid: Double = js.native
    
    /**
      * The well-known text (wkt) that represents a known geographic transformation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
      */
    /* CompleteClass */
    var wkt: String = js.native
  }
  
  type _To = js.Object & GeographicTransformationStepConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geographicTransformationStepMod.foo` */
  override def _to: js.Object & GeographicTransformationStepConstructor = ^
}
