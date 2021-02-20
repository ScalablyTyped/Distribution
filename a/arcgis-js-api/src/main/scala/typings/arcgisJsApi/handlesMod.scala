package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Handles
import typings.arcgisJsApi.esri.HandlesConstructor
import typings.arcgisJsApi.esri.HandlesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlesMod extends Shortcut {
  
  @JSImport("esri/core/Handles", JSImport.Namespace)
  @js.native
  val ^ : HandlesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Handles", JSImport.Namespace)
  @js.native
  class Class () extends Handles {
    def this(properties: HandlesProperties) = this()
  }
  
  type _To = HandlesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `handlesMod.foo` */
  override def _to: HandlesConstructor = ^
}
