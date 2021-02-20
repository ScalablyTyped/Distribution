package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LinearUnit
import typings.arcgisJsApi.esri.LinearUnitConstructor
import typings.arcgisJsApi.esri.LinearUnitProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearUnitMod extends Shortcut {
  
  @JSImport("esri/tasks/support/LinearUnit", JSImport.Namespace)
  @js.native
  val ^ : LinearUnitConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/LinearUnit", JSImport.Namespace)
  @js.native
  class Class () extends LinearUnit {
    def this(properties: LinearUnitProperties) = this()
  }
  
  type _To = LinearUnitConstructor
  
  /* This means you don't have to write `^`, but can instead just say `linearUnitMod.foo` */
  override def _to: LinearUnitConstructor = ^
}
