package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MediaInfo
import typings.arcgisJsApi.esri.MediaInfoConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/mixins/MediaInfo", JSImport.Namespace)
  @js.native
  val ^ : MediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/mixins/MediaInfo", JSImport.Namespace)
  @js.native
  class Class () extends MediaInfo
  
  type _To = MediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mediaInfoMod.foo` */
  override def _to: MediaInfoConstructor = ^
}
