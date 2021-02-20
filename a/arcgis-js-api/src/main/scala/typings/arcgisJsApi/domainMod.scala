package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Domain
import typings.arcgisJsApi.esri.DomainConstructor
import typings.arcgisJsApi.esri.DomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod extends Shortcut {
  
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  val ^ : DomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  class Class () extends Domain {
    def this(properties: DomainProperties) = this()
  }
  
  type _To = DomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `domainMod.foo` */
  override def _to: DomainConstructor = ^
}
