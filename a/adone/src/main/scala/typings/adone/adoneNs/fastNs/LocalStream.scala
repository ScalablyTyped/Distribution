package typings.adone.adoneNs.fastNs

import typings.adone.Anon_False
import typings.adone.adoneNs.fastNs.INs.CoreStreamSource
import typings.adone.adoneNs.fastNs.INs.LocalStreamConstructorOptions
import typings.adone.adoneNs.fastNs.INs.NullFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fast.LocalStream")
@js.native
class LocalStream protected ()
  extends typings.adone.adoneNs.fastNs.INs.LocalStream[NullFile] {
  def this(
    source: js.Array[typings.adone.adoneNs.fastNs.INs.File],
    options: LocalStreamConstructorOptions with Anon_False
  ) = this()
  def this(source: CoreStreamSource, options: LocalStreamConstructorOptions with Anon_False) = this()
}

