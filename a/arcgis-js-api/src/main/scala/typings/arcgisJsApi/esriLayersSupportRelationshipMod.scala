package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelationshipConstructor
import typings.arcgisJsApi.esri.RelationshipProperties
import typings.arcgisJsApi.esri.Relationship_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportRelationshipMod extends Shortcut {
  
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RelationshipConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  /**
    * Describes a [layer's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) relationship with another layer or table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html)
    */
  open class Class ()
    extends StObject
       with Relationship_ {
    def this(properties: RelationshipProperties) = this()
  }
  
  type _To = js.Object & RelationshipConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportRelationshipMod.foo` */
  override def _to: js.Object & RelationshipConstructor = ^
}
