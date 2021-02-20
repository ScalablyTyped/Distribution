package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeInfo
import typings.arcgisJsApi.esri.TimeInfoConstructor
import typings.arcgisJsApi.esri.TimeInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/TimeInfo", JSImport.Namespace)
  @js.native
  val ^ : TimeInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TimeInfo", JSImport.Namespace)
  @js.native
  /**
    * Time info represents the temporal data of a time-aware layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html)
    */
  class Class () extends TimeInfo {
    def this(properties: TimeInfoProperties) = this()
  }
  
  type _To = TimeInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeInfoMod.foo` */
  override def _to: TimeInfoConstructor = ^
}
