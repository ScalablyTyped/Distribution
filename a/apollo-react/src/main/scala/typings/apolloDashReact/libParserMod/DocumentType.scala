package typings.apolloDashReact.libParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentType extends js.Object

@JSImport("apollo-react/lib/parser", "DocumentType")
@js.native
object DocumentType extends js.Object {
  @js.native
  sealed trait Mutation extends DocumentType
  
  @js.native
  sealed trait Query extends DocumentType
  
  @js.native
  sealed trait Subscription extends DocumentType
  
  /* 1 */ val Mutation: typings.apolloDashReact.libParserMod.DocumentType.Mutation with Double = js.native
  /* 0 */ val Query: typings.apolloDashReact.libParserMod.DocumentType.Query with Double = js.native
  /* 2 */ val Subscription: typings.apolloDashReact.libParserMod.DocumentType.Subscription with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
}

