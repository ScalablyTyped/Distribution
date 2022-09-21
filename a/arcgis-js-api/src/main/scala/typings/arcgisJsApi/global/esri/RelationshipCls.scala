package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelationshipProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Relationship")
@js.native
/**
  * Describes a [layer's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) relationship with another layer or table.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html)
  */
open class RelationshipCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Relationship_ {
  def this(properties: RelationshipProperties) = this()
}
