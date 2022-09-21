package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ExpressionContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ExpressionContent")
@js.native
/**
  * An ExpressionContent element allows you to define a popup content element with an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html)
  */
open class ExpressionContentCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ExpressionContent {
  def this(properties: ExpressionContentProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
