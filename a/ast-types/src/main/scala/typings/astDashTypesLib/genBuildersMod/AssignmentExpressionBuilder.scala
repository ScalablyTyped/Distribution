package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpressionBuilder extends js.Object {
  def apply(
    operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`,
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNodesMod.AssignmentExpression = js.native
  def from(params: astDashTypesLib.Anon_CommentsLeft): astDashTypesLib.genNodesMod.AssignmentExpression = js.native
}

