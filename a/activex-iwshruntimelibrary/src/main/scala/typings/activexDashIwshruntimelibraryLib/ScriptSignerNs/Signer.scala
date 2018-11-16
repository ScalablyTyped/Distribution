package typings
package activexDashIwshruntimelibraryLib.ScriptSignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ScriptSigner.Signer")
@js.native
class Signer protected () extends js.Object {
  var `ScriptSigner.Signer_typekey`: Signer = js.native
  /** @param Store [Store='my'] */
  def Sign(FileExtension: java.lang.String, Text: java.lang.String, Certificate: java.lang.String): java.lang.String = js.native
  /** @param Store [Store='my'] */
  def Sign(
    FileExtension: java.lang.String,
    Text: java.lang.String,
    Certificate: java.lang.String,
    Store: java.lang.String
  ): java.lang.String = js.native
  /** @param Store [Store='my'] */
  def SignFile(FileName: java.lang.String, Certificate: java.lang.String): scala.Unit = js.native
  /** @param Store [Store='my'] */
  def SignFile(FileName: java.lang.String, Certificate: java.lang.String, Store: java.lang.String): scala.Unit = js.native
  /** @param ShowUI [ShowUI=false] */
  def Verify(FileExtension: java.lang.String, Text: java.lang.String): scala.Boolean = js.native
  /** @param ShowUI [ShowUI=false] */
  def Verify(FileExtension: java.lang.String, Text: java.lang.String, ShowUI: scala.Boolean): scala.Boolean = js.native
  /** @param ShowUI [ShowUI=false] */
  def VerifyFile(FileName: java.lang.String): scala.Boolean = js.native
  /** @param ShowUI [ShowUI=false] */
  def VerifyFile(FileName: java.lang.String, ShowUI: scala.Boolean): scala.Boolean = js.native
}

