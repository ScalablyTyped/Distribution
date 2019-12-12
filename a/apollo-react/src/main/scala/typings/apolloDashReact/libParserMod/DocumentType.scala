package typings.apolloDashReact.libParserMod

import org.scalablytyped.runtime.TopLevel
import typings.apolloDashReact.libParserMod.DocumentType.Mutation
import typings.apolloDashReact.libParserMod.DocumentType.Query
import typings.apolloDashReact.libParserMod.DocumentType.Subscription
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
  /* 1 */ @js.native
  object Mutation extends TopLevel[Mutation with Double]
  
  /* 0 */ @js.native
  object Query extends TopLevel[Query with Double]
  
  /* 2 */ @js.native
  object Subscription extends TopLevel[Subscription with Double]
  
}

