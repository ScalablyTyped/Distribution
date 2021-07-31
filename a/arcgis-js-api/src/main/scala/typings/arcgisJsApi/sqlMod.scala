package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.sql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlMod extends Shortcut {
  
  @JSImport("esri/core/sql", JSImport.Namespace)
  @js.native
  val ^ : sql = js.native
  
  type _To = sql
  
  /* This means you don't have to write `^`, but can instead just say `sqlMod.foo` */
  override def _to: sql = ^
}
