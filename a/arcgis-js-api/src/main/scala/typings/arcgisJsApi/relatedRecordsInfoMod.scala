package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelatedRecordsInfo
import typings.arcgisJsApi.esri.RelatedRecordsInfoConstructor
import typings.arcgisJsApi.esri.RelatedRecordsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relatedRecordsInfoMod extends Shortcut {
  
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  val ^ : RelatedRecordsInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  class Class () extends RelatedRecordsInfo {
    def this(properties: RelatedRecordsInfoProperties) = this()
  }
  
  type _To = RelatedRecordsInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relatedRecordsInfoMod.foo` */
  override def _to: RelatedRecordsInfoConstructor = ^
}
