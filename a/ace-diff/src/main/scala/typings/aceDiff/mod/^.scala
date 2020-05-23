package typings.aceDiff.mod

import typings.aceDiff.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-diff", JSImport.Namespace)
@js.native
class ^ protected () extends AceDiff {
  def this(opts: AceDiffConstructorOpts) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def diff(): Unit = js.native
  /* CompleteClass */
  override def getEditors(): Left = js.native
  /* CompleteClass */
  override def getNumDiffs(): Double = js.native
  /* CompleteClass */
  override def setOptions(options: AceDiffOpts): Unit = js.native
}

