package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * writes structured data to a chained {@link XOutputStream} .
  *
  * An implementation of this service in general does not need to buffer data itself.
  */
trait DataOutputStream
  extends XDataOutputStream
     with XActiveDataSource

object DataOutputStream {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
    writeBoolean: js.Function1[scala.Boolean, scala.Unit],
    writeByte: js.Function1[scala.Double, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    writeChar: js.Function1[java.lang.String, scala.Unit],
    writeDouble: js.Function1[scala.Double, scala.Unit],
    writeFloat: js.Function1[scala.Double, scala.Unit],
    writeHyper: js.Function1[scala.Double, scala.Unit],
    writeLong: js.Function1[scala.Double, scala.Unit],
    writeShort: js.Function1[scala.Double, scala.Unit],
    writeUTF: js.Function1[java.lang.String, scala.Unit]
  ): DataOutputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OutputStream")(OutputStream)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("closeOutput")(closeOutput)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("getOutputStream")(getOutputStream)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setOutputStream")(setOutputStream)
    __obj.updateDynamic("writeBoolean")(writeBoolean)
    __obj.updateDynamic("writeByte")(writeByte)
    __obj.updateDynamic("writeBytes")(writeBytes)
    __obj.updateDynamic("writeChar")(writeChar)
    __obj.updateDynamic("writeDouble")(writeDouble)
    __obj.updateDynamic("writeFloat")(writeFloat)
    __obj.updateDynamic("writeHyper")(writeHyper)
    __obj.updateDynamic("writeLong")(writeLong)
    __obj.updateDynamic("writeShort")(writeShort)
    __obj.updateDynamic("writeUTF")(writeUTF)
    __obj.asInstanceOf[DataOutputStream]
  }
}

