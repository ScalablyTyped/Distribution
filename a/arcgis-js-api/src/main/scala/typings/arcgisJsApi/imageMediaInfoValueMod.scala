package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageMediaInfoValue
import typings.arcgisJsApi.esri.ImageMediaInfoValueConstructor
import typings.arcgisJsApi.esri.ImageMediaInfoValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMediaInfoValueMod extends Shortcut {
  
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  val ^ : ImageMediaInfoValueConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  class Class () extends ImageMediaInfoValue {
    def this(properties: ImageMediaInfoValueProperties) = this()
  }
  
  type _To = ImageMediaInfoValueConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageMediaInfoValueMod.foo` */
  override def _to: ImageMediaInfoValueConstructor = ^
}
