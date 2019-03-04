package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionDelegate extends LexDialogAction {
  var slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  var `type`: awsDashLambdaLib.awsDashLambdaLibStrings.Delegate
}

object LexDialogActionDelegate {
  @scala.inline
  def apply(
    slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    `type`: awsDashLambdaLib.awsDashLambdaLibStrings.Delegate
  ): LexDialogActionDelegate = {
    val __obj = js.Dynamic.literal(slots = slots)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LexDialogActionDelegate]
  }
}

