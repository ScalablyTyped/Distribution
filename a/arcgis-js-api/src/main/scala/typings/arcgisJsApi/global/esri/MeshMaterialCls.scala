package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.MeshMaterial")
@js.native
/**
  * The material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
  */
open class MeshMaterialCls ()
  extends StObject
     with typings.arcgisJsApi.esri.MeshMaterial {
  def this(properties: MeshMaterialProperties) = this()
}
