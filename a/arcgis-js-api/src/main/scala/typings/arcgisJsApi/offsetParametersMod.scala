package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OffsetParameters
import typings.arcgisJsApi.esri.OffsetParametersConstructor
import typings.arcgisJsApi.esri.OffsetParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/OffsetParameters", JSImport.Namespace)
  @js.native
  val ^ : OffsetParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/OffsetParameters", JSImport.Namespace)
  @js.native
  class Class () extends OffsetParameters {
    def this(properties: OffsetParametersProperties) = this()
  }
  
  type _To = OffsetParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `offsetParametersMod.foo` */
  override def _to: OffsetParametersConstructor = ^
}
