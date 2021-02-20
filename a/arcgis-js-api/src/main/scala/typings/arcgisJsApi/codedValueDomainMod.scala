package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CodedValueDomain
import typings.arcgisJsApi.esri.CodedValueDomainConstructor
import typings.arcgisJsApi.esri.CodedValueDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codedValueDomainMod extends Shortcut {
  
  @JSImport("esri/layers/support/CodedValueDomain", JSImport.Namespace)
  @js.native
  val ^ : CodedValueDomainConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/CodedValueDomain", JSImport.Namespace)
  @js.native
  class Class () extends CodedValueDomain {
    def this(properties: CodedValueDomainProperties) = this()
  }
  
  type _To = CodedValueDomainConstructor
  
  /* This means you don't have to write `^`, but can instead just say `codedValueDomainMod.foo` */
  override def _to: CodedValueDomainConstructor = ^
}
