package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod extends Shortcut {
  
  @JSImport("esri/rest/query", JSImport.Namespace)
  @js.native
  val ^ : query = js.native
  
  type _To = query
  
  /* This means you don't have to write `^`, but can instead just say `queryMod.foo` */
  override def _to: query = ^
}
