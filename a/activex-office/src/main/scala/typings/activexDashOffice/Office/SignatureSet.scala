package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureSet extends js.Object {
  val Application: js.Any = js.native
  val CanAddSignatureLine: Boolean = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val ShowSignaturesPane: Boolean = js.native
  var Subset: MsoSignatureSubset = js.native
  def apply(iSig: Double): Signature = js.native
  def Add(): Signature = js.native
  def AddNonVisibleSignature(): Signature = js.native
  def AddNonVisibleSignature(varSigProv: js.Any): Signature = js.native
  def AddSignatureLine(): Signature = js.native
  def AddSignatureLine(varSigProv: js.Any): Signature = js.native
  def Commit(): Unit = js.native
  def Item(iSig: Double): Signature = js.native
}

