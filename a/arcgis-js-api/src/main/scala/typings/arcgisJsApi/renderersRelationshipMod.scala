package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.relationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersRelationshipMod extends Shortcut {
  
  @JSImport("esri/smartMapping/renderers/relationship", JSImport.Namespace)
  @js.native
  val ^ : relationship = js.native
  
  type _To = relationship
  
  /* This means you don't have to write `^`, but can instead just say `renderersRelationshipMod.foo` */
  override def _to: relationship = ^
}
