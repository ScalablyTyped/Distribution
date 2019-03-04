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
  def setOptions(options: aceDashDiffLib.aceDashDiffMod.AceDiffNs.AceDiffOpts): scala.Unit
}

object AceDiff {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    diff: js.Function0[scala.Unit],
    getEditors: js.Function0[aceDashDiffLib.Anon_Left],
    getNumDiffs: js.Function0[scala.Double],
    setOptions: js.Function1[aceDashDiffLib.aceDashDiffMod.AceDiffNs.AceDiffOpts, scala.Unit]
  ): AceDiff = {
    val __obj = js.Dynamic.literal(destroy = destroy, diff = diff, getEditors = getEditors, getNumDiffs = getNumDiffs, setOptions = setOptions)
  
    __obj.asInstanceOf[AceDiff]
  }
}

