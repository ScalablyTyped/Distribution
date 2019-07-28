package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.utilNs.Editor
import typings.adone.adoneNs.utilNs.INs.EditorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEditor
  extends Instantiable0[Editor]
     with Instantiable1[/* options */ EditorOptions, Editor] {
  var DEFAULT: String = js.native
  def edit(): js.Promise[String] = js.native
  def edit(options: EditorOptions): js.Promise[String] = js.native
}

