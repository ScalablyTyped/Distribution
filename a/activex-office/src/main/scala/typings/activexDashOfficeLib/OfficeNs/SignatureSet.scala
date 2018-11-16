package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureSet extends js.Object {
  val Application: js.Any = js.native
  val CanAddSignatureLine: scala.Boolean = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  val ShowSignaturesPane: scala.Boolean = js.native
  var Subset: MsoSignatureSubset = js.native
  def apply(iSig: scala.Double): Signature = js.native
  def Add(): Signature = js.native
  def AddNonVisibleSignature(): Signature = js.native
  def AddNonVisibleSignature(varSigProv: js.Any): Signature = js.native
  def AddSignatureLine(): Signature = js.native
  def AddSignatureLine(varSigProv: js.Any): Signature = js.native
  def Commit(): scala.Unit = js.native
  def Item(iSig: scala.Double): Signature = js.native
}

