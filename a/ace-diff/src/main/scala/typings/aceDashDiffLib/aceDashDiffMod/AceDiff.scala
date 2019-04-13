package typings
package aceDashDiffLib.aceDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiff extends js.Object {
  def destroy(): scala.Unit
  def diff(): scala.Unit
  def getEditors(): aceDashDiffLib.Anon_Left
  def getNumDiffs(): scala.Double
  def setOptions(options: AceDiffOpts): scala.Unit
}

object AceDiff {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    diff: () => scala.Unit,
    getEditors: () => aceDashDiffLib.Anon_Left,
    getNumDiffs: () => scala.Double,
    setOptions: AceDiffOpts => scala.Unit
  ): AceDiff = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), diff = js.Any.fromFunction0(diff), getEditors = js.Any.fromFunction0(getEditors), getNumDiffs = js.Any.fromFunction0(getNumDiffs), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[AceDiff]
  }
}

