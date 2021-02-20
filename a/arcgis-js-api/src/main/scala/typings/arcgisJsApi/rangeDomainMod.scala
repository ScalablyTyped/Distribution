package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RangeDomain
import typings.arcgisJsApi.esri.RangeDomainConstructor
import typings.arcgisJsApi.esri.RangeDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeDomainMod extends Shortcut {
  
  @JSImport("esri/layers/support/RangeDomain", JSImport.Namespace)
  @js.native
  val ^ : RangeDomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RangeDomain", JSImport.Namespace)
  @js.native
  class Class () extends RangeDomain {
    def this(properties: RangeDomainProperties) = this()
  }
  
  type _To = RangeDomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rangeDomainMod.foo` */
  override def _to: RangeDomainConstructor = ^
}
