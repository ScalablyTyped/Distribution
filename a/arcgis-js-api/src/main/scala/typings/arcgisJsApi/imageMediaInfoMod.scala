package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageMediaInfo
import typings.arcgisJsApi.esri.ImageMediaInfoConstructor
import typings.arcgisJsApi.esri.ImageMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/ImageMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : ImageMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/ImageMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * An `ImageMediaInfo` is a type of media element that represents images to display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html)
    */
  class Class () extends ImageMediaInfo {
    def this(properties: ImageMediaInfoProperties) = this()
  }
  
  type _To = ImageMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageMediaInfoMod.foo` */
  override def _to: ImageMediaInfoConstructor = ^
}
