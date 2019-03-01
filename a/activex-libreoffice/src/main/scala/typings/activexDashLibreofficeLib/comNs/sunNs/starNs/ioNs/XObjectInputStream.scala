package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** reads {@link XPersistObject} implementations from a stream */
trait XObjectInputStream extends XDataInputStream {
  /**
    * reads an object from the stream. In general, it reads the service name, instantiaties the object and calls read on the {@link XPersistObject}
    * interface with itself as argument.
    */
  def readObject(): XPersistObject
}

object XObjectInputStream {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBoolean: js.Function0[scala.Double],
    readByte: js.Function0[scala.Double],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readChar: js.Function0[java.lang.String],
    readDouble: js.Function0[scala.Double],
    readFloat: js.Function0[scala.Double],
    readHyper: js.Function0[scala.Double],
    readLong: js.Function0[scala.Double],
    readObject: js.Function0[XPersistObject],
    readShort: js.Function0[scala.Double],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readUTF: js.Function0[java.lang.String],
    release: js.Function0[scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): XObjectInputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("closeInput")(closeInput)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("readBoolean")(readBoolean)
    __obj.updateDynamic("readByte")(readByte)
    __obj.updateDynamic("readBytes")(readBytes)
    __obj.updateDynamic("readChar")(readChar)
    __obj.updateDynamic("readDouble")(readDouble)
    __obj.updateDynamic("readFloat")(readFloat)
    __obj.updateDynamic("readHyper")(readHyper)
    __obj.updateDynamic("readLong")(readLong)
    __obj.updateDynamic("readObject")(readObject)
    __obj.updateDynamic("readShort")(readShort)
    __obj.updateDynamic("readSomeBytes")(readSomeBytes)
    __obj.updateDynamic("readUTF")(readUTF)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("skipBytes")(skipBytes)
    __obj.asInstanceOf[XObjectInputStream]
  }
}

