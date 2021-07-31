package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BufferParameters
import typings.arcgisJsApi.esri.BufferParametersConstructor
import typings.arcgisJsApi.esri.BufferParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/BufferParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BufferParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/BufferParameters", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BufferParameters {
    def this(properties: BufferParametersProperties) = this()
  }
  
  type _To = js.Object & BufferParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bufferParametersMod.foo` */
  override def _to: js.Object & BufferParametersConstructor = ^
}
