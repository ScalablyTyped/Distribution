package typings.ariaDashQuery.ariaDashQueryMod

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aria-query", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val aria: Map[ARIAProperty, ARIAPropertyDefinition] = js.native
  val dom: Map[String, DOMDefinition] = js.native
  val elementRoles: Map[ARIARoleRelationConcept, Set[ARIARoleDefintionKey]] = js.native
  val roleElements: Map[ARIARoleDefintionKey, Set[ARIARoleRelationConcept]] = js.native
  val roles: Map[ARIARoleDefintionKey, ARIARoleDefinition] = js.native
}

