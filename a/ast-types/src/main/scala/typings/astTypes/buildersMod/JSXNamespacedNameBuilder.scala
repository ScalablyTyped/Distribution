package typings.astTypes.buildersMod

import typings.astTypes.anon.Namespace
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXNamespacedNameBuilder extends js.Object {
  
  def apply(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  
  def from(params: Namespace): JSXNamespacedName = js.native
}
