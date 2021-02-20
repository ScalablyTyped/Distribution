package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.IdentifyResult
import typings.arcgisJsApi.esri.IdentifyResultConstructor
import typings.arcgisJsApi.esri.IdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifyResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/IdentifyResult", JSImport.Namespace)
  @js.native
  val ^ : IdentifyResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/IdentifyResult", JSImport.Namespace)
  @js.native
  class Class () extends IdentifyResult {
    def this(properties: IdentifyResultProperties) = this()
  }
  
  type _To = IdentifyResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `identifyResultMod.foo` */
  override def _to: IdentifyResultConstructor = ^
}
