package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GPMessage
import typings.arcgisJsApi.esri.GPMessageConstructor
import typings.arcgisJsApi.esri.GPMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpmessageMod extends Shortcut {
  
  @JSImport("esri/tasks/support/GPMessage", JSImport.Namespace)
  @js.native
  val ^ : GPMessageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/GPMessage", JSImport.Namespace)
  @js.native
  class Class () extends GPMessage {
    def this(properties: GPMessageProperties) = this()
  }
  
  type _To = GPMessageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `gpmessageMod.foo` */
  override def _to: GPMessageConstructor = ^
}
