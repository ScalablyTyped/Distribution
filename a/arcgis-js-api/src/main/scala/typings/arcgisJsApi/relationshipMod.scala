package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelationshipConstructor
import typings.arcgisJsApi.esri.RelationshipProperties
import typings.arcgisJsApi.esri.Relationship_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipMod extends Shortcut {
  
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RelationshipConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Relationship_ {
    def this(properties: RelationshipProperties) = this()
  }
  
  type _To = js.Object & RelationshipConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relationshipMod.foo` */
  override def _to: js.Object & RelationshipConstructor = ^
}
