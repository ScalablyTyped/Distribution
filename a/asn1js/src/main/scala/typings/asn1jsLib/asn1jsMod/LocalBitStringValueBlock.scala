package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- asn1jsLib.asn1jsMod.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSImport("asn1js", "LocalBitStringValueBlock")
@js.native
class LocalBitStringValueBlock () extends LocalConstructedValueBlock {
  def this(params: LocalBitStringValueBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  var isHexOnly: scala.Boolean = js.native
  var unusedBits: scala.Double = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
}

