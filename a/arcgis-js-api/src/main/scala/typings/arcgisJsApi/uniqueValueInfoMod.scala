package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UniqueValueInfo
import typings.arcgisJsApi.esri.UniqueValueInfoConstructor
import typings.arcgisJsApi.esri.UniqueValueInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueValueInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/UniqueValueInfo", JSImport.Namespace)
  @js.native
  val ^ : UniqueValueInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/UniqueValueInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines the symbols to use in a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html)
    */
  class Class () extends UniqueValueInfo {
    def this(properties: UniqueValueInfoProperties) = this()
  }
  
  type _To = UniqueValueInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uniqueValueInfoMod.foo` */
  override def _to: UniqueValueInfoConstructor = ^
}
