package typings.awsKcl.mod

import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-kcl", "KCLManager")
@js.native
class KCLManager protected () extends js.Object {
  def this(kclManagerInput: KCLInput) = this()
  def this(kclManagerInput: KCLInput, inputFile: ReadStream) = this()
  def this(kclManagerInput: KCLInput, inputFile: js.UndefOr[scala.Nothing], outputFile: WriteStream) = this()
  def this(kclManagerInput: KCLInput, inputFile: ReadStream, outputFile: WriteStream) = this()
  def this(
    kclManagerInput: KCLInput,
    inputFile: js.UndefOr[scala.Nothing],
    outputFile: js.UndefOr[scala.Nothing],
    errorFile: WriteStream
  ) = this()
  def this(
    kclManagerInput: KCLInput,
    inputFile: js.UndefOr[scala.Nothing],
    outputFile: WriteStream,
    errorFile: WriteStream
  ) = this()
  def this(
    kclManagerInput: KCLInput,
    inputFile: ReadStream,
    outputFile: js.UndefOr[scala.Nothing],
    errorFile: WriteStream
  ) = this()
  def this(kclManagerInput: KCLInput, inputFile: ReadStream, outputFile: WriteStream, errorFile: WriteStream) = this()
  def checkpoint(sequenceNumber: String): Unit = js.native
  def run(): Unit = js.native
}

