package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Connection
import typings.arcgisJsApi.esri.ConnectionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod extends Shortcut {
  
  @JSImport("esri/core/workers/Connection", JSImport.Namespace)
  @js.native
  val ^ : ConnectionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/workers/Connection", JSImport.Namespace)
  @js.native
  /**
    * This class is used to execute remote methods located on the module loaded into a separate thread via the [workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html)
    */
  class Class () extends Connection
  
  type _To = ConnectionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `connectionMod.foo` */
  override def _to: ConnectionConstructor = ^
}
