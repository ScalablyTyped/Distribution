package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeft
import typings.astDashTypes.astDashTypesStrings.`%=`
import typings.astDashTypes.astDashTypesStrings.`&=`
import typings.astDashTypes.astDashTypesStrings.`*=`
import typings.astDashTypes.astDashTypesStrings.`+=`
import typings.astDashTypes.astDashTypesStrings.`-=`
import typings.astDashTypes.astDashTypesStrings.`/=`
import typings.astDashTypes.astDashTypesStrings.`<<=`
import typings.astDashTypes.astDashTypesStrings.`=`
import typings.astDashTypes.astDashTypesStrings.`>>=`
import typings.astDashTypes.astDashTypesStrings.`>>>=`
import typings.astDashTypes.astDashTypesStrings.`^=`
import typings.astDashTypes.astDashTypesStrings.`|=`
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.MemberExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.AssignmentExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  def apply(
    operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def apply(
    operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def from(params: Anon_CommentsLeft): AssignmentExpression = js.native
}

