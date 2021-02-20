package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextContent
import typings.arcgisJsApi.esri.TextContentConstructor
import typings.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/TextContent", JSImport.Namespace)
  @js.native
  val ^ : TextContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/TextContent", JSImport.Namespace)
  @js.native
  /**
    * A `TextContent` popup element is used to define descriptive text as an element within the [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
    */
  class Class () extends TextContent {
    def this(properties: TextContentProperties) = this()
  }
  
  type _To = TextContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textContentMod.foo` */
  override def _to: TextContentConstructor = ^
}
