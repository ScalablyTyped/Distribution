package typings.adone.adoneNs.dataNs.base32Ns.INs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var alphabet: String
  var charmap: StringDictionary[Double]
}

object Spec {
  @scala.inline
  def apply(alphabet: String, charmap: StringDictionary[Double]): Spec = {
    val __obj = js.Dynamic.literal(alphabet = alphabet, charmap = charmap)
  
    __obj.asInstanceOf[Spec]
  }
}

