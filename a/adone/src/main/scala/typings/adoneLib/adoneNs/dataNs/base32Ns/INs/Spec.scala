package typings
package adoneLib.adoneNs.dataNs.base32Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var alphabet: java.lang.String
  var charmap: /* import warning: ImportType.apply Failed type conversion: {[c: string] : number, [c: string] : number} */ js.Any
}

object Spec {
  @scala.inline
  def apply(
    alphabet: java.lang.String,
    charmap: /* import warning: ImportType.apply Failed type conversion: {[c: string] : number, [c: string] : number} */ js.Any
  ): Spec = {
    val __obj = js.Dynamic.literal(alphabet = alphabet, charmap = charmap)
  
    __obj.asInstanceOf[Spec]
  }
}

