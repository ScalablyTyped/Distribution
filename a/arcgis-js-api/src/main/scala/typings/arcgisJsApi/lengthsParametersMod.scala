package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LengthsParameters
import typings.arcgisJsApi.esri.LengthsParametersConstructor
import typings.arcgisJsApi.esri.LengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthsParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/LengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : LengthsParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/LengthsParameters", JSImport.Namespace)
  @js.native
  class Class () extends LengthsParameters {
    def this(properties: LengthsParametersProperties) = this()
  }
  
  type _To = LengthsParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lengthsParametersMod.foo` */
  override def _to: LengthsParametersConstructor = ^
}
